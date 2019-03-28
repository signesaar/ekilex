insert into eki_user (name, email, password) values ('Test Test', 'test@test.com', '$2a$10$d5ZhfCgg2S2Fp4FUTGPpCOGarlPIE4Nt/pqxXmPuN0rBN5MonHxlm');

insert into dataset (code, name) values ('eos', 'Õigekeelsussõnaraamat ÕS 2013');
insert into dataset (code, name) values ('ss_', 'Eesti keele seletav sõnaraamat');
insert into dataset (code, name) values ('sys', 'Sünonüümisõnastik');
insert into dataset (code, name) values ('evs', 'Eesti-vene sõnaraamat');

insert into word (id, lang, morph_code, homonym_nr) values (1001, 'est', 'SgN', 1);
insert into word (id, lang, morph_code, homonym_nr) values (1002, 'est', 'SgN', 2);
insert into word (id, lang, morph_code) values (1003, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1004, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1005, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1006, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1007, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1008, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1009, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1010, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1011, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1012, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1013, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1014, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1015, 'est', 'SgN');
insert into word (id, lang, morph_code) values (1016, 'rus', 'PlN');
insert into word (id, lang, morph_code) values (1017, 'rus', 'SgN');
insert into word (id, lang, morph_code) values (1018, 'rus', 'SgN');

insert into meaning (id) values (2001);
insert into meaning (id) values (2002);
insert into meaning (id) values (2003);
insert into meaning (id) values (2004);
insert into meaning (id) values (2005);
insert into meaning (id) values (2006);
insert into meaning (id) values (2007);
insert into meaning (id) values (2008);
insert into meaning (id) values (2009);
insert into meaning (id) values (2010);
insert into meaning (id) values (2011);
insert into meaning (id) values (2012);
insert into meaning (id) values (2013);
insert into meaning (id) values (2014);
insert into meaning (id) values (2015);
insert into meaning (id) values (2016);
insert into meaning (id) values (2017);
insert into meaning (id) values (2018);
insert into meaning (id) values (2019);
insert into meaning (id) values (2020);
insert into meaning (id) values (2021);
insert into meaning (id) values (2022);
insert into meaning (id) values (2023);
insert into meaning (id) values (2024);
insert into meaning (id) values (2025);
insert into meaning (id) values (2026);
insert into meaning (id) values (2027);

insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1001, 2001, 'külmunud kaste maas', 'külmunud kaste maas', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1002, 2002, 'avar üldkasutatav hoone v ruum', 'avar üldkasutatav hoone v ruum', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1003, 2002, 'suur esinduslik ruum elamus, kodasaal', 'suur esinduslik ruum elamus, kodasaal', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1004, 2004, 'temperatuuri langemisel alla 0 °C õhus olevast veeaurust tekkinud ebaühtlane jääkristallide kiht maapinnal, taimedel ja esemetel (hrl. kevadel ja sügisel)', 'temperatuuri langemisel alla 0 °C õhus olevast veeaurust tekkinud ebaühtlane jääkristallide kiht maapinnal, taimedel ja esemetel (hrl. kevadel ja sügisel)', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1005, 2005, 'värvuselt musta ja valge vahepealne', 'värvuselt musta ja valge vahepealne', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1006, 2006, 'valge ja pimeda vahepealne, hämar; sombune', 'valge ja pimeda vahepealne, hämar; sombune', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1007, 2007, 'kaugesse minevikku ulatuv, ajaloo hämarusse kaduv', 'kaugesse minevikku ulatuv, ajaloo hämarusse kaduv', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1008, 2008, 'üksluine, ühetooniline, vaheldusetu, tuim, igav', 'üksluine, ühetooniline, vaheldusetu, tuim, igav', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1009, 2009, 'see, kes v. mis on hall (1. täh.)', 'see, kes v. mis on hall (1. täh.)', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1010, 2010, 'kodasaal, elamu suurem siseruum; suur köetav esik (esimesel korrusel)', 'kodasaal, elamu suurem siseruum; suur köetav esik (esimesel korrusel)', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1011, 2011, 'rohkearvulisele publikule mõeldud suur saal v. hoone; suur tootmisruum v. hoone', 'rohkearvulisele publikule mõeldud suur saal v. hoone; suur tootmisruum v. hoone', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1012, 2016, 'suur esik; saal; tootmishoone', 'suur esik; saal; tootmishoone', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1013, 2021, 'suur selvekauplus, kus peale toiduainete müüakse ka muid igapäevakaupu', 'suur selvekauplus, kus peale toiduainete müüakse ka muid igapäevakaupu', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1014, 2025, 'hiirekarva hall', 'hiirekarva hall', 'est', 'määramata');
insert into definition (id, meaning_id, value, value_prese, lang, definition_type_code) values (1015, 2026, 'rõdu, eriti kirikus', 'rõdu, eriti kirikus', 'est', 'määramata');

insert into definition_dataset (definition_id, dataset_code) values (1001, 'qq2');
insert into definition_dataset (definition_id, dataset_code) values (1002, 'qq2');
insert into definition_dataset (definition_id, dataset_code) values (1003, 'qq2');
insert into definition_dataset (definition_id, dataset_code) values (1004, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1005, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1006, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1007, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1008, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1009, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1010, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1011, 'ss_');
insert into definition_dataset (definition_id, dataset_code) values (1012, 'evs');
insert into definition_dataset (definition_id, dataset_code) values (1013, 'qq2');
insert into definition_dataset (definition_id, dataset_code) values (1014, 'qq2');
insert into definition_dataset (definition_id, dataset_code) values (1015, 'qq2');

insert into paradigm (id, word_id) values (1001, 1001);
insert into paradigm (id, word_id) values (1002, 1002);
insert into paradigm (id, word_id) values (1003, 1003);
insert into paradigm (id, word_id) values (1004, 1004);
insert into paradigm (id, word_id) values (1005, 1005);
insert into paradigm (id, word_id) values (1006, 1006);
insert into paradigm (id, word_id) values (1007, 1007);
insert into paradigm (id, word_id) values (1008, 1008);
insert into paradigm (id, word_id) values (1009, 1009);
insert into paradigm (id, word_id) values (1010, 1010);
insert into paradigm (id, word_id) values (1011, 1011);
insert into paradigm (id, word_id) values (1012, 1012);
insert into paradigm (id, word_id) values (1013, 1013);
insert into paradigm (id, word_id) values (1014, 1014);
insert into paradigm (id, word_id) values (1015, 1015);
insert into paradigm (id, word_id) values (1016, 1015);
insert into paradigm (id, word_id) values (1017, 1016);
insert into paradigm (id, word_id) values (1018, 1017);
insert into paradigm (id, word_id) values (1019, 1018);

insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1001, 'WORD', 'SgN', true, 'hall', 'hall', '{hall}', 'hall');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1001, 'FORM', 'SgG', true, 'halla', 'halla', '{hall}', 'halla');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1001, 'FORM', 'SgP', true, 'halla', 'halla', '{hall}', 'h`alla');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1001, 'FORM', 'Neg', false, '-', '-', null, null);
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1002, 'WORD', 'SgN', true, 'hall', 'hall', '{hall}', 'hall');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1002, 'FORM', 'SgG', true, 'halli', 'halli', '{hall}', 'halli');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1002, 'FORM', 'SgP', true, 'halli', 'halli', '{hall}', 'h`alli');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1002, 'FORM', 'Neg', false, '-', '-', null, null);
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1003, 'WORD', 'SgN', true, 'hallakord', 'hallakord', '{halla, kord}', 'halla+k`ord');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1004, 'WORD', 'SgN', true, 'hallaudu', 'hallaudu', '{halla, udu}', 'halla+udu');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1005, 'WORD', 'SgN', true, 'hallaöö', 'hallaöö', '{halla, öö}', 'halla+`öö');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1006, 'WORD', 'SgN', true, 'hallasääsk', 'hallasääsk', '{halla, sääsk}', 'halla+s`ääsk');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1007, 'WORD', 'SgN', true, 'kaubahall', 'kaubahall', '{kauba, hall}', 'kauba+h`al''l');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1008, 'WORD', 'SgN', true, 'linnahall', 'linnahall', '{linna, hall}', 'linna+h`al''l');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1009, 'WORD', 'SgN', true, 'helehall', 'helehall', '{hele, hall}', 'hele+h`al''l');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1010, 'WORD', 'SgN', true, 'tumehall', 'tumehall', '{tume, hall}', 'tume+h`al''l');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1011, 'WORD', 'SgN', true, 'hiirhall', 'hiirhall', '{hiir, hall}', 'h`iir+h`al''l');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1012, 'WORD', 'SgN', true, 'hiirjas', 'hiirjas', '{hiirjas}', 'h`iirjas');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1013, 'WORD', 'SgN', true, 'hiirukas', 'hiirukas', '{hiirukas}', 'hiirukas');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1014, 'WORD', 'SgN', true, 'väär', 'väär', '{väär}', 'v`äär');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1014, 'FORM', 'SgG', true, 'vääri', 'vääri', '{väär}', 'vääri');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1014, 'FORM', 'SgP', true, 'vääri', 'vääri', '{väär}', 'v`ääri');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1015, 'WORD', 'SgN', true, 'väär', 'väär', '{väär}', 'v`äär');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1015, 'FORM', 'SgG', true, 'väära', 'väära', '{väär}', 'väära');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1015, 'FORM', 'SgP', true, 'väära', 'väära', '{väär}', 'v`äära');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1016, 'WORD', 'SgN', true, 'väär', 'väär', '{väär}', 'v`äär');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1016, 'FORM', 'SgG', true, 'väära', 'väära', '{väär}', 'v`äära');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1016, 'FORM', 'SgP', true, 'väärat', 'väärat', '{väär}', 'v`äärat');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1017, 'WORD', 'PlN', true, 'заморозки', 'заморозки', '{заморозки}', 'заморозки');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1018, 'WORD', 'SgN', true, 'серый', 'серый', '{серый}', 'серый');
insert into form (paradigm_id, mode, morph_code, morph_exists, value, value_prese, components, display_form) values (1019, 'WORD', 'SgN', true, 'холл', 'холл', '{холл}', 'холл');

insert into lexeme (id, word_id, meaning_id, dataset_code) values (4001, 1001, 2001, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4002, 1002, 2002, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4003, 1002, 2003, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4004, 1001, 2004, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4005, 1002, 2005, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4006, 1002, 2006, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4007, 1002, 2007, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4008, 1002, 2008, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4009, 1002, 2009, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4010, 1002, 2010, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4011, 1002, 2011, 'ss_');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4012, 1001, 2012, 'sys');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4013, 1002, 2013, 'sys');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4014, 1001, 2014, 'evs');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4015, 1002, 2015, 'evs');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4016, 1002, 2016, 'evs');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4017, 1003, 2017, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4018, 1004, 2018, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4019, 1005, 2019, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4020, 1006, 2020, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4021, 1007, 2021, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4022, 1008, 2022, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4023, 1009, 2023, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4024, 1010, 2024, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4025, 1011, 2025, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4026, 1012, 2025, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4027, 1013, 2025, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4028, 1014, 2026, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4029, 1015, 2027, 'qq2');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4031, 1016, 2014, 'evs');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4032, 1017, 2015, 'evs');
insert into lexeme (id, word_id, meaning_id, dataset_code) values (4033, 1018, 2016, 'evs');

insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1001, 4001, 4017, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1002, 4001, 4018, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1003, 4001, 4019, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1004, 4001, 4020, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1005, 4002, 4021, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1006, 4002, 4022, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1007, 4003, 4023, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1008, 4003, 4024, 'comp');
insert into lex_relation (id, lexeme1_id, lexeme2_id, lex_rel_type_code) values (1009, 4003, 4025, 'comp');

insert into freeform (id, parent_id, type, value_text) values (1001, null, 'CONCEPT_ID', '123456');
insert into freeform (id, parent_id, type, value_text) values (1002, null, 'GOVERNMENT', 'keda mida');
insert into freeform (id, parent_id, type, value_text) values (1003, null, 'USAGE', 'Hommikul oli hall maas');
insert into freeform (id, parent_id, type, value_text) values (1004, null, 'USAGE', 'Haned lähevad, hallad taga');

insert into meaning_freeform (id, meaning_id, freeform_id) values (1001, 2024, 1001);
insert into lexeme_freeform (id, lexeme_id, freeform_id) values (1002, 4001, 1003);
insert into lexeme_freeform (id, lexeme_id, freeform_id) values (1003, 4001, 1004);
