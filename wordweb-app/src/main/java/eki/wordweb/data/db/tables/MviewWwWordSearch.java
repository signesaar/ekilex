/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwWordSearchRecord;
import eki.wordweb.data.db.udt.records.TypeLangComplexityRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwWordSearch extends TableImpl<MviewWwWordSearchRecord> {

    private static final long serialVersionUID = 1214943408;

    /**
     * The reference instance of <code>public.mview_ww_word_search</code>
     */
    public static final MviewWwWordSearch MVIEW_WW_WORD_SEARCH = new MviewWwWordSearch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwWordSearchRecord> getRecordType() {
        return MviewWwWordSearchRecord.class;
    }

    /**
     * The column <code>public.mview_ww_word_search.sgroup</code>.
     */
    public final TableField<MviewWwWordSearchRecord, String> SGROUP = createField(DSL.name("sgroup"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.mview_ww_word_search.word</code>.
     */
    public final TableField<MviewWwWordSearchRecord, String> WORD = createField(DSL.name("word"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_word_search.crit</code>.
     */
    public final TableField<MviewWwWordSearchRecord, String> CRIT = createField(DSL.name("crit"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_word_search.unacrit</code>.
     */
    public final TableField<MviewWwWordSearchRecord, String> UNACRIT = createField(DSL.name("unacrit"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_word_search.lang_order_by</code>.
     */
    public final TableField<MviewWwWordSearchRecord, Long> LANG_ORDER_BY = createField(DSL.name("lang_order_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_word_search.lang_complexities</code>.
     */
    public final TableField<MviewWwWordSearchRecord, TypeLangComplexityRecord[]> LANG_COMPLEXITIES = createField(DSL.name("lang_complexities"), eki.wordweb.data.db.udt.TypeLangComplexity.TYPE_LANG_COMPLEXITY.getDataType().getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_word_search.simple_exists</code>.
     */
    public final TableField<MviewWwWordSearchRecord, Boolean> SIMPLE_EXISTS = createField(DSL.name("simple_exists"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>public.mview_ww_word_search</code> table reference
     */
    public MviewWwWordSearch() {
        this(DSL.name("mview_ww_word_search"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_word_search</code> table reference
     */
    public MviewWwWordSearch(String alias) {
        this(DSL.name(alias), MVIEW_WW_WORD_SEARCH);
    }

    /**
     * Create an aliased <code>public.mview_ww_word_search</code> table reference
     */
    public MviewWwWordSearch(Name alias) {
        this(alias, MVIEW_WW_WORD_SEARCH);
    }

    private MviewWwWordSearch(Name alias, Table<MviewWwWordSearchRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwWordSearch(Name alias, Table<MviewWwWordSearchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.materializedView());
    }

    public <O extends Record> MviewWwWordSearch(Table<O> child, ForeignKey<O, MviewWwWordSearchRecord> key) {
        super(child, key, MVIEW_WW_WORD_SEARCH);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MVIEW_WW_WORD_SEARCH_CRIT_IDX, Indexes.MVIEW_WW_WORD_SEARCH_CRIT_PREFIX_IDX, Indexes.MVIEW_WW_WORD_SEARCH_SGROUP_IDX, Indexes.MVIEW_WW_WORD_SEARCH_SIMPLE_EXISTS_IDX, Indexes.MVIEW_WW_WORD_SEARCH_UNACRIT_TRI_IDX);
    }

    @Override
    public MviewWwWordSearch as(String alias) {
        return new MviewWwWordSearch(DSL.name(alias), this);
    }

    @Override
    public MviewWwWordSearch as(Name alias) {
        return new MviewWwWordSearch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWordSearch rename(String name) {
        return new MviewWwWordSearch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWordSearch rename(Name name) {
        return new MviewWwWordSearch(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, Long, TypeLangComplexityRecord[], Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
