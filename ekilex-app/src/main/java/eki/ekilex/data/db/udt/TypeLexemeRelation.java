/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.udt;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.udt.records.TypeLexemeRelationRecord;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeLexemeRelation extends UDTImpl<TypeLexemeRelationRecord> {

    private static final long serialVersionUID = -375364483;

    /**
     * The reference instance of <code>public.type_lexeme_relation</code>
     */
    public static final TypeLexemeRelation TYPE_LEXEME_RELATION = new TypeLexemeRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeLexemeRelationRecord> getRecordType() {
        return TypeLexemeRelationRecord.class;
    }

    /**
     * The attribute <code>public.type_lexeme_relation.lexeme_id</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, Long> LEXEME_ID = createField(DSL.name("lexeme_id"), org.jooq.impl.SQLDataType.BIGINT, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word_id</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, Long> WORD_ID = createField(DSL.name("word_id"), org.jooq.impl.SQLDataType.BIGINT, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> WORD = createField(DSL.name("word"), org.jooq.impl.SQLDataType.CLOB, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word_prese</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> WORD_PRESE = createField(DSL.name("word_prese"), org.jooq.impl.SQLDataType.CLOB, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.homonym_nr</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, Integer> HOMONYM_NR = createField(DSL.name("homonym_nr"), org.jooq.impl.SQLDataType.INTEGER, TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.lang</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> LANG = createField(DSL.name("lang"), org.jooq.impl.SQLDataType.CHAR(3), TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.word_type_codes</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String[]> WORD_TYPE_CODES = createField(DSL.name("word_type_codes"), org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.complexity</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> COMPLEXITY = createField(DSL.name("complexity"), org.jooq.impl.SQLDataType.VARCHAR(100), TYPE_LEXEME_RELATION, "");

    /**
     * The attribute <code>public.type_lexeme_relation.lex_rel_type_code</code>.
     */
    public static final UDTField<TypeLexemeRelationRecord, String> LEX_REL_TYPE_CODE = createField(DSL.name("lex_rel_type_code"), org.jooq.impl.SQLDataType.VARCHAR(100), TYPE_LEXEME_RELATION, "");

    /**
     * No further instances allowed
     */
    private TypeLexemeRelation() {
        super("type_lexeme_relation", null, null, false);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}
