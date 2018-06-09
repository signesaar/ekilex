package eki.ekilex.service.db;

import static eki.ekilex.data.db.Tables.DATASET;
import static eki.ekilex.data.db.Tables.DEFINITION;
import static eki.ekilex.data.db.Tables.DEFINITION_REF_LINK;
import static eki.ekilex.data.db.Tables.DERIV_LABEL;
import static eki.ekilex.data.db.Tables.DOMAIN_LABEL;
import static eki.ekilex.data.db.Tables.FORM;
import static eki.ekilex.data.db.Tables.FREEFORM;
import static eki.ekilex.data.db.Tables.FREEFORM_REF_LINK;
import static eki.ekilex.data.db.Tables.GENDER_LABEL;
import static eki.ekilex.data.db.Tables.LANG;
import static eki.ekilex.data.db.Tables.LEXEME;
import static eki.ekilex.data.db.Tables.LEXEME_DERIV;
import static eki.ekilex.data.db.Tables.LEXEME_FREEFORM;
import static eki.ekilex.data.db.Tables.LEXEME_FREQUENCY;
import static eki.ekilex.data.db.Tables.LEXEME_POS;
import static eki.ekilex.data.db.Tables.LEXEME_REF_LINK;
import static eki.ekilex.data.db.Tables.LEXEME_REGISTER;
import static eki.ekilex.data.db.Tables.MEANING;
import static eki.ekilex.data.db.Tables.MEANING_DOMAIN;
import static eki.ekilex.data.db.Tables.MEANING_FREEFORM;
import static eki.ekilex.data.db.Tables.MEANING_RELATION;
import static eki.ekilex.data.db.Tables.MEANING_REL_TYPE_LABEL;
import static eki.ekilex.data.db.Tables.MORPH_LABEL;
import static eki.ekilex.data.db.Tables.PARADIGM;
import static eki.ekilex.data.db.Tables.PERSON;
import static eki.ekilex.data.db.Tables.POS_LABEL;
import static eki.ekilex.data.db.Tables.REGISTER_LABEL;
import static eki.ekilex.data.db.Tables.USAGE_TYPE_LABEL;
import static eki.ekilex.data.db.Tables.WORD;
import static org.jooq.impl.DSL.row;
import static org.jooq.impl.DSL.selectDistinct;

import java.sql.Timestamp;
import java.util.Map;

import org.jooq.DSLContext;
import org.jooq.Record16;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Record7;
import org.jooq.Record9;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eki.common.constant.FreeformType;
import eki.common.constant.ReferenceType;
import eki.ekilex.constant.DbConstant;
import eki.ekilex.data.db.tables.Freeform;
import eki.ekilex.data.db.tables.FreeformRefLink;
import eki.ekilex.data.db.tables.LexemeFreeform;
import eki.ekilex.data.db.tables.Person;
import eki.ekilex.data.db.tables.UsageTypeLabel;

@Component
public class CommonDataDbService implements DbConstant {

	@Autowired
	private DSLContext create;

	public Map<String, String> getDatasetNameMap() {
		return create.select().from(DATASET).fetchMap(DATASET.CODE, DATASET.NAME);
	}

	public Result<Record2<String, String>> getDatasets() {
		return create.select(DATASET.CODE, DATASET.NAME).from(DATASET).fetch();
	}

	public Map<String, String> getLanguagesMap() {
		return create.select().from(LANG).fetchMap(LANG.CODE, LANG.VALUE);
	}

	public Result<Record2<String, String>> getLanguages() {
		return create.select(LANG.CODE, LANG.VALUE).from(LANG).fetch();
	}

	public Result<Record2<String, String>> getLexemeFrequencyGroups() {
		return create.select(LEXEME_FREQUENCY.CODE, LEXEME_FREQUENCY.CODE.as("value")).from(LEXEME_FREQUENCY).fetch();
	}

	public Result<Record2<String, String>> getAllLexemePos(String classifierLabelLang, String classifierLabelTypeCode) {
		return create
				.select(POS_LABEL.CODE, POS_LABEL.VALUE)
				.from(POS_LABEL)
				.where(POS_LABEL.LANG.eq(classifierLabelLang).and(POS_LABEL.TYPE.eq(classifierLabelTypeCode)))
				.fetch();
	}

	public Result<Record2<String, String>> getLexemeRegisters(String classifierLabelLang, String classifierLabelTypeCode) {
		return create
				.select(REGISTER_LABEL.CODE, REGISTER_LABEL.VALUE)
				.from(REGISTER_LABEL)
				.where(REGISTER_LABEL.LANG.eq(classifierLabelLang).and(REGISTER_LABEL.TYPE.eq(classifierLabelTypeCode)))
				.fetch();
	}

	public Result<Record2<String, String>> getLexemeDerivs(String classifierLabelLang, String classifierLabelTypeCode) {
		return create
				.select(DERIV_LABEL.CODE, DERIV_LABEL.VALUE)
				.from(DERIV_LABEL)
				.where(DERIV_LABEL.LANG.eq(classifierLabelLang).and(DERIV_LABEL.TYPE.eq(classifierLabelTypeCode)))
				.fetch();
	}

	public Result<Record2<String, String>> getLexemeGenders(String classifierLabelLang, String classifierLabelTypeCode) {
		return create
				.select(GENDER_LABEL.CODE, GENDER_LABEL.VALUE)
				.from(GENDER_LABEL)
				.where(GENDER_LABEL.LANG.eq(classifierLabelLang).and(GENDER_LABEL.TYPE.eq(classifierLabelTypeCode)))
				.fetch();
	}

	public Result<Record3<String, String, String>> getDomains() {
		return create
				.select(DOMAIN_LABEL.ORIGIN, DOMAIN_LABEL.CODE, DOMAIN_LABEL.VALUE)
				.from(DOMAIN_LABEL)
				.orderBy(DOMAIN_LABEL.ORIGIN, DOMAIN_LABEL.VALUE)
				.fetch();
	}

	public Result<Record3<String, String, String>> getDomainsInUse() {
		return create
				.select(DOMAIN_LABEL.ORIGIN, DOMAIN_LABEL.CODE, DOMAIN_LABEL.VALUE)
				.from(DOMAIN_LABEL)
				.where(row(DOMAIN_LABEL.CODE, DOMAIN_LABEL.ORIGIN)
						.in(selectDistinct(MEANING_DOMAIN.DOMAIN_CODE, MEANING_DOMAIN.DOMAIN_ORIGIN)
								.from(MEANING_DOMAIN)))
				.orderBy(DOMAIN_LABEL.ORIGIN, DOMAIN_LABEL.VALUE)
				.fetch();
	}

	public Result<Record4<Long, String, String, Timestamp>> findLexemeFreeforms(Long lexemeId) {
		return create
				.select(FREEFORM.ID, FREEFORM.TYPE, FREEFORM.VALUE_TEXT, FREEFORM.VALUE_DATE)
				.from(FREEFORM, LEXEME_FREEFORM)
				.where(LEXEME_FREEFORM.LEXEME_ID.eq(lexemeId).and(FREEFORM.ID.eq(LEXEME_FREEFORM.FREEFORM_ID))
						.and(FREEFORM.TYPE.notIn(FreeformType.GOVERNMENT.name(), FreeformType.GRAMMAR.name(), FreeformType.USAGE.name())))
				.fetch();
	}

	public Result<Record2<Long, String>> findLexemeGrammars(Long lexemeId) {
		return create
				.select(FREEFORM.ID, FREEFORM.VALUE_TEXT)
				.from(FREEFORM, LEXEME_FREEFORM)
				.where(LEXEME_FREEFORM.LEXEME_ID.eq(lexemeId)
						.and(FREEFORM.ID.eq(LEXEME_FREEFORM.FREEFORM_ID))
						.and(FREEFORM.TYPE.eq(FreeformType.GRAMMAR.name())))
				.fetch();
	}

	public Result<Record4<Long,String,String,String>> findLexemeRefLinks(Long lexemeId) {
		return create
				.select(
						LEXEME_REF_LINK.ID,
						LEXEME_REF_LINK.NAME,
						LEXEME_REF_LINK.VALUE,
						LEXEME_REF_LINK.REF_TYPE
				)
				.from(LEXEME_REF_LINK)
				.where(LEXEME_REF_LINK.LEXEME_ID.eq(lexemeId).and(LEXEME_REF_LINK.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
				.orderBy(LEXEME_REF_LINK.ORDER_BY)
				.fetch();
	}

	public Result<Record4<Long, String, String, Timestamp>> findMeaningFreeforms(Long meaningId) {
		return create
				.select(
						FREEFORM.ID,
						FREEFORM.TYPE,
						FREEFORM.VALUE_TEXT,
						FREEFORM.VALUE_DATE)
				.from(FREEFORM, MEANING_FREEFORM)
				.where(
						MEANING_FREEFORM.MEANING_ID.eq(meaningId)
						.and(FREEFORM.ID.eq(MEANING_FREEFORM.FREEFORM_ID)))
				.orderBy(FREEFORM.ORDER_BY)
				.fetch();
	}

	public Result<Record7<Long,String,String,Long,Long,String,String>> findMeaningDefinitionRefTuples(Long meaningId) {

		return create
				.select(
						DEFINITION.ID.as("definition_id"),
						DEFINITION.VALUE.as("definition_value"),
						DEFINITION.LANG.as("definition_lang"),
						DEFINITION.ORDER_BY.as("definition_order_by"),
						DEFINITION_REF_LINK.ID.as("ref_link_id"),
						DEFINITION_REF_LINK.NAME.as("ref_link_name"),
						DEFINITION_REF_LINK.VALUE.as("ref_link_value")
						)
				.from(DEFINITION.leftOuterJoin(DEFINITION_REF_LINK)
						.on(DEFINITION_REF_LINK.DEFINITION_ID.eq(DEFINITION.ID))
						.and(DEFINITION_REF_LINK.REF_TYPE.eq(ReferenceType.SOURCE.name()))
						.and(DEFINITION_REF_LINK.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
				.where(DEFINITION.MEANING_ID.eq(meaningId).and(DEFINITION.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
				.orderBy(DEFINITION.ORDER_BY)
				.fetch();
	}

	public Result<Record3<Long,String,String>> findGovernments(Long lexemeId) {

		LexemeFreeform glff = LEXEME_FREEFORM.as("glff");
		Freeform g = FREEFORM.as("g");
		Freeform gt = FREEFORM.as("gt");

		return create
				.select(
						g.ID,
						g.VALUE_TEXT.as("value"),
						gt.CLASSIF_CODE.as("type_code")
						)
				.from(
						glff.innerJoin(g).on(glff.FREEFORM_ID.eq(g.ID).and(g.TYPE.eq(FreeformType.GOVERNMENT.name())).and(g.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
						.leftOuterJoin(gt).on(gt.PARENT_ID.eq(g.ID).and(gt.TYPE.eq(FreeformType.GOVERNMENT_TYPE.name())))
						)
				.where(glff.LEXEME_ID.eq(lexemeId))
				.orderBy(g.ORDER_BY)
				.fetch();
	}

	public Result<Record16<Long,String,String,String,String,Long,String,String,Long,String,String,String,String,Long,String,String>>
				findUsageTranslationDefinitionTuples(Long lexemeId, String classifierLabelLang, String classifierLabelTypeCode) {

	LexemeFreeform ulff = LEXEME_FREEFORM.as("ulff");
	Freeform u = FREEFORM.as("u");
	Freeform ut = FREEFORM.as("ut");
	Freeform ud = FREEFORM.as("ud");
	Freeform uauth = FREEFORM.as("uauth");
	Freeform utrans = FREEFORM.as("utrans");
	Freeform utype = FREEFORM.as("utype");
	UsageTypeLabel utypelbl = USAGE_TYPE_LABEL.as("utypelbl");
	FreeformRefLink uauthl = FREEFORM_REF_LINK.as("uauthl");
	FreeformRefLink utransl = FREEFORM_REF_LINK.as("utransl");
	FreeformRefLink usrcl = FREEFORM_REF_LINK.as("usrcl");
	Person auth = PERSON.as("auth");
	Person trans = PERSON.as("trans");

	return create
			.select(
					u.ID.as("usage_id"),
					u.VALUE_TEXT.as("usage_value"),
					u.LANG.as("usage_lang"),
					utype.CLASSIF_CODE.as("usage_type_code"),
					utypelbl.VALUE.as("usage_type_value"),
					ut.ID.as("usage_translation_id"),
					ut.VALUE_TEXT.as("usage_translation_value"),
					ut.LANG.as("usage_translation_lang"),
					ud.ID.as("usage_definition_id"),
					ud.VALUE_TEXT.as("usage_definition_value"),
					ud.LANG.as("usage_definition_lang"),
					auth.NAME.as("usage_author"),
					trans.NAME.as("usage_translator"),
					usrcl.ID.as("usage_source_ref_link_id"),
					usrcl.NAME.as("usage_source_ref_link_name"),
					usrcl.VALUE.as("usage_source_ref_link_value")
					)
			.from(
					ulff.innerJoin(u).on(ulff.FREEFORM_ID.eq(u.ID).and(u.TYPE.eq(FreeformType.USAGE.name())).and(u.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(ut).on(ut.PARENT_ID.eq(u.ID).and(ut.TYPE.eq(FreeformType.USAGE_TRANSLATION.name())).and(ut.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(ud).on(ud.PARENT_ID.eq(u.ID).and(ud.TYPE.eq(FreeformType.USAGE_DEFINITION.name())).and(ud.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(uauth).on(uauth.PARENT_ID.eq(u.ID).and(uauth.TYPE.eq(FreeformType.USAGE_AUTHOR.name())).and(uauth.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(uauthl).on(uauthl.FREEFORM_ID.eq(uauth.ID).and(uauthl.REF_TYPE.eq(ReferenceType.PERSON.name())).and(uauthl.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(auth).on(auth.ID.eq(uauthl.REF_ID))
					.leftOuterJoin(utrans).on(utrans.PARENT_ID.eq(u.ID).and(utrans.TYPE.eq(FreeformType.USAGE_TRANSLATOR.name())).and(utrans.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(utransl).on(utransl.FREEFORM_ID.eq(utrans.ID).and(utransl.REF_TYPE.eq(ReferenceType.PERSON.name())).and(utransl.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(trans).on(trans.ID.eq(utransl.REF_ID))
					.leftOuterJoin(usrcl).on(usrcl.FREEFORM_ID.eq(u.ID).and(usrcl.REF_TYPE.eq(ReferenceType.SOURCE.name())).and(usrcl.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(utype).on(utype.PARENT_ID.eq(u.ID).and(utype.TYPE.eq(FreeformType.USAGE_TYPE.name())).and(utype.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
					.leftOuterJoin(utypelbl).on(utypelbl.CODE.eq(utype.CLASSIF_CODE).and(utypelbl.LANG.eq(classifierLabelLang).and(utypelbl.TYPE.eq(classifierLabelTypeCode))))
					)
			.where(ulff.LEXEME_ID.eq(lexemeId))
			.orderBy(u.ORDER_BY, ut.ORDER_BY, ud.ORDER_BY, usrcl.ORDER_BY)
			.fetch();
	}

	public Result<Record9<Long,Long,Long,Long,Long,String,String,String,Long>> findMeaningRelations(Long meaningId, String classifierLabelLang, String classifierLabelTypeCode) {

		return create
				.select(
						MEANING_RELATION.ID.as("id"),
						MEANING.ID.as("meaning_id"),
						LEXEME.ID.as("lexeme_id"),
						WORD.ID.as("word_id"),
						FORM.ID.as("form_id"),
						FORM.VALUE.as("word"),
						WORD.LANG.as("word_lang"),
						MEANING_REL_TYPE_LABEL.VALUE.as("rel_type_label"),
						MEANING_RELATION.ORDER_BY.as("order_by")
				)
				.from(
						MEANING_RELATION.leftOuterJoin(MEANING_REL_TYPE_LABEL).on(
								MEANING_RELATION.MEANING_REL_TYPE_CODE.eq(MEANING_REL_TYPE_LABEL.CODE)
								.and(MEANING_REL_TYPE_LABEL.LANG.eq(classifierLabelLang)
								.and(MEANING_REL_TYPE_LABEL.TYPE.eq(classifierLabelTypeCode)))),
						MEANING,
						LEXEME,
						WORD,
						PARADIGM,
						FORM
				)
				.where(
						MEANING_RELATION.MEANING1_ID.eq(meaningId)
								.and(MEANING_RELATION.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED))
								.and(MEANING_RELATION.MEANING2_ID.eq(MEANING.ID))
								.and(LEXEME.MEANING_ID.eq(MEANING.ID))
								.and(LEXEME.WORD_ID.eq(WORD.ID))
								.and(PARADIGM.WORD_ID.eq(WORD.ID))
								.and(FORM.PARADIGM_ID.eq(PARADIGM.ID))
								.and(FORM.IS_WORD.eq(Boolean.TRUE))
				)
				.orderBy(MEANING_RELATION.ORDER_BY)
				.fetch();
	}

	public Result<Record3<String, String, String>> findMeaningDomains(Long meaningId) {

		return create
				.select(DOMAIN_LABEL.CODE, DOMAIN_LABEL.ORIGIN, DOMAIN_LABEL.VALUE)
				.from(
						MEANING_DOMAIN.leftOuterJoin(DOMAIN_LABEL).on(
								MEANING_DOMAIN.DOMAIN_CODE.eq(DOMAIN_LABEL.CODE)
								.and(MEANING_DOMAIN.DOMAIN_ORIGIN.eq(DOMAIN_LABEL.ORIGIN))
								)
						)
				.where(MEANING_DOMAIN.MEANING_ID.eq(meaningId).and(MEANING_DOMAIN.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED)))
				.fetch();
	}

	public Result<Record2<String, String>> findLexemePos(Long lexemeId, String classifierLabelLang, String classifierLabelTypeCode) {

		return create
				.select(POS_LABEL.CODE, POS_LABEL.VALUE)
				.from(LEXEME_POS, POS_LABEL)
				.where(
						LEXEME_POS.LEXEME_ID.eq(lexemeId)
						.and(LEXEME_POS.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED))
						.and(POS_LABEL.CODE.eq(LEXEME_POS.POS_CODE))
						.and(POS_LABEL.LANG.eq(classifierLabelLang))
						.and(POS_LABEL.TYPE.eq(classifierLabelTypeCode))
						)
				.fetch();
	}

	public Result<Record2<String, String>> findLexemeDerivs(Long lexemeId, String classifierLabelLang, String classifierLabelTypeCode) {

		return create
				.select(DERIV_LABEL.CODE, DERIV_LABEL.VALUE)
				.from(LEXEME_DERIV, DERIV_LABEL)
				.where(
						LEXEME_DERIV.LEXEME_ID.eq(lexemeId)
						.and(LEXEME_DERIV.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED))
						.and(DERIV_LABEL.CODE.eq(LEXEME_DERIV.DERIV_CODE))
						.and(DERIV_LABEL.LANG.eq(classifierLabelLang))
						.and(DERIV_LABEL.TYPE.eq(classifierLabelTypeCode))
						)
				.fetch();
	}

	public Result<Record2<String, String>> findLexemeRegisters(Long lexemeId, String classifierLabelLang, String classifierLabelTypeCode) {

		return create
				.select(REGISTER_LABEL.CODE, REGISTER_LABEL.VALUE)
				.from(LEXEME_REGISTER, REGISTER_LABEL)
				.where(
						LEXEME_REGISTER.LEXEME_ID.eq(lexemeId)
						.and(LEXEME_REGISTER.PROCESS_STATE_CODE.isDistinctFrom(PROCESS_STATE_DELETED))
						.and(REGISTER_LABEL.CODE.eq(LEXEME_REGISTER.REGISTER_CODE))
						.and(REGISTER_LABEL.LANG.eq(classifierLabelLang))
						.and(REGISTER_LABEL.TYPE.eq(classifierLabelTypeCode))
						)
				.fetch();
	}

	public Result<Record2<String, String>> getWordMorphCodes(String classifierLabelLang, String classifierLabelTypeCode) {
		return create
				.select(MORPH_LABEL.CODE, MORPH_LABEL.VALUE)
				.from(MORPH_LABEL)
				.where(MORPH_LABEL.LANG.eq(classifierLabelLang).and(MORPH_LABEL.TYPE.eq(classifierLabelTypeCode)))
				.fetch();
	}

	public Record4<Long, String, Integer, String> getWord(Long wordId) {
		return create.select(PARADIGM.WORD_ID, FORM.VALUE.as("word"), WORD.HOMONYM_NR, WORD.LANG).from(PARADIGM, FORM, WORD)
				.where(PARADIGM.WORD_ID.eq(wordId)
						.and(FORM.PARADIGM_ID.eq(PARADIGM.ID))
						.and(FORM.IS_WORD.isTrue())
						.and(WORD.ID.eq(wordId)))
				.fetchOne();
	}

}
