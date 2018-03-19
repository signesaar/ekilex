drop materialized view if exists mview_ww_word cascade;
drop materialized view if exists mview_ww_form cascade;
drop materialized view if exists mview_ww_meaning cascade;
drop materialized view if exists mview_ww_classifier cascade;
drop type if exists type_domain;

create materialized view mview_ww_word
as
select w.word_id,
       w.word,
       w.homonym_nr,
       w.lang,
       w.morph_code,
       w.display_morph_code,
       (select array_agg(distinct ld.dataset_code)
        from lexeme ld
        where ld.word_id = w.word_id
        group by w.word_id) as dataset_codes,
       mc.meaning_count,
       mw.meaning_words
from (select w.id as word_id,
             array_to_string(array_agg(distinct f.value),',','*') as word,
             w.homonym_nr,
             w.lang,
             w.morph_code,
             w.display_morph_code
      from word as w
        join paradigm as p on p.word_id = w.id
        join form as f on f.paradigm_id = p.id and f.is_word = true
      where exists (select ld.id
                    from lexeme as ld
                    where (ld.word_id = w.id and ld.dataset_code in ('qq2', 'psv', 'ss1', 'kol')))
      group by w.id) as w
  inner join (select mc.word_id,
                     count(mc.meaning_id) meaning_count
              from (select l.word_id,
                           l.meaning_id
                    from lexeme l
                    where l.dataset_code in ('qq2', 'psv', 'ss1', 'kol')
                    group by l.word_id,
                             l.meaning_id) mc
              group by mc.word_id) mc on mc.word_id = w.word_id
  left outer join (select l1.word_id,
                          array_agg(distinct f2.value) meaning_words
                   from lexeme l1,
                        lexeme l2,
                        form f2,
                        paradigm p2,
                        meaning m
                   where l1.dataset_code in ('qq2', 'psv', 'ss1', 'kol')
                   and   l1.meaning_id = m.id
                   and   l2.meaning_id = m.id
                   and   l1.word_id != l2.word_id
                   and   p2.word_id = l2.word_id
                   and   f2.paradigm_id = p2.id
                   and   f2.is_word = true
                   group by l1.word_id) mw on mw.word_id = w.word_id;

create materialized view mview_ww_form
as
select p.word_id,
       p.id paradigm_id,
       f.id form_id,
       f.value form,
       f.morph_code,
       f.components,
       f.display_form,
       f.vocal_form,
       f.sound_file,
       f.is_word
from paradigm p,
     form f
where f.paradigm_id = p.id
and   exists (select ld.id
              from lexeme as ld
              where (ld.word_id = p.word_id and ld.dataset_code in ('qq2', 'psv', 'ss1', 'kol')))
order by f.id;

create type type_domain as (origin varchar(100), code varchar(100));

create materialized view mview_ww_meaning
as
select l.word_id,
       l.meaning_id,
       l.id lexeme_id,
       d.id definition_id,
       l.dataset_code,
       l.level1,
       l.level2,
       l.level3,
       l.type_code lexeme_type_code,
       (select array_agg(l_reg.register_code order by l_reg.order_by)
        from lexeme_register l_reg
        where l_reg.lexeme_id = l.id
        group by l_reg.lexeme_id) register_codes,
       (select array_agg(l_pos.pos_code order by l_pos.order_by)
        from lexeme_pos l_pos
        where l_pos.lexeme_id = l.id
        group by l_pos.lexeme_id) pos_codes,
       (select array_agg(l_der.deriv_code)
        from lexeme_deriv l_der
        where l_der.lexeme_id = l.id
        group by l_der.lexeme_id) deriv_codes,
       (select array_agg(row (m_dom.domain_origin,m_dom.domain_code)::type_domain order by m_dom.order_by)
        from meaning_domain m_dom
        where m_dom.meaning_id = m.id
        group by m_dom.meaning_id) domain_codes,
       d.value definition,
       d.lang definition_lang
from lexeme l
  left outer join lexeme_deriv l_der on l_der.lexeme_id = l.id
  inner join meaning m on l.meaning_id = m.id
  left outer join definition d on d.meaning_id = m.id
where l.dataset_code in ('qq2', 'psv', 'ss1', 'kol')
order by l.word_id,
         l.meaning_id,
         d.id,
         l.id;

create materialized view mview_ww_classifier
as
(select 'MORPH' as name,
       null as origin,
       code,
       value,
       lang
from morph_label
union all
select 'POS' as name,
       null as origin,
       code,
       value,
       lang
from pos_label
union all
select 'LEXEME_TYPE' as name,
       null as origin,
       code,
       value,
       lang
from lexeme_type_label
union all
select 'REGISTER' as name,
       null as origin,
       code,
       value,
       lang
from register_label
union all
select 'DERIV' as name,
       null as origin,
       code,
       value,
       lang
from deriv_label
union all
select 'DOMAIN' as name,
       origin,
       code,
       value,
       lang
from domain_label);

-- not really required at ekilex
create index mview_ww_word_word_id_idx on mview_ww_word (word_id);
create index mview_ww_word_lang_idx on mview_ww_word (lang);
create index mview_ww_form_word_id_idx on mview_ww_form (word_id);
create index mview_ww_form_value_idx on mview_ww_form (form);
create index mview_ww_form_value_lower_idx on mview_ww_form (lower(form));
create index mview_ww_meaning_word_id_idx on mview_ww_meaning (word_id);
create index mview_ww_meaning_meaning_id_idx on mview_ww_meaning (meaning_id);
create index mview_ww_meaning_lexeme_id_idx on mview_ww_meaning (lexeme_id);
create index mview_ww_meaning_definition_lang_idx on mview_ww_meaning (definition_lang);
create index mview_ww_classifier_name_code_lang_idx on mview_ww_classifier (name, code, lang);
create index mview_ww_classifier_name_origin_code_lang_idx on mview_ww_classifier (name, origin, code, lang);
