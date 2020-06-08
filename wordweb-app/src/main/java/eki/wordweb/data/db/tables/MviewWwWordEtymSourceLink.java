/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwWordEtymSourceLinkRecord;
import eki.wordweb.data.db.udt.records.TypeSourceLinkRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class MviewWwWordEtymSourceLink extends TableImpl<MviewWwWordEtymSourceLinkRecord> {

    private static final long serialVersionUID = 700350687;

    /**
     * The reference instance of <code>public.mview_ww_word_etym_source_link</code>
     */
    public static final MviewWwWordEtymSourceLink MVIEW_WW_WORD_ETYM_SOURCE_LINK = new MviewWwWordEtymSourceLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwWordEtymSourceLinkRecord> getRecordType() {
        return MviewWwWordEtymSourceLinkRecord.class;
    }

    /**
     * The column <code>public.mview_ww_word_etym_source_link.word_id</code>.
     */
    public final TableField<MviewWwWordEtymSourceLinkRecord, Long> WORD_ID = createField(DSL.name("word_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_word_etym_source_link.source_links</code>.
     */
    public final TableField<MviewWwWordEtymSourceLinkRecord, TypeSourceLinkRecord[]> SOURCE_LINKS = createField(DSL.name("source_links"), eki.wordweb.data.db.udt.TypeSourceLink.TYPE_SOURCE_LINK.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.mview_ww_word_etym_source_link</code> table reference
     */
    public MviewWwWordEtymSourceLink() {
        this(DSL.name("mview_ww_word_etym_source_link"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_word_etym_source_link</code> table reference
     */
    public MviewWwWordEtymSourceLink(String alias) {
        this(DSL.name(alias), MVIEW_WW_WORD_ETYM_SOURCE_LINK);
    }

    /**
     * Create an aliased <code>public.mview_ww_word_etym_source_link</code> table reference
     */
    public MviewWwWordEtymSourceLink(Name alias) {
        this(alias, MVIEW_WW_WORD_ETYM_SOURCE_LINK);
    }

    private MviewWwWordEtymSourceLink(Name alias, Table<MviewWwWordEtymSourceLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwWordEtymSourceLink(Name alias, Table<MviewWwWordEtymSourceLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.materializedView());
    }

    public <O extends Record> MviewWwWordEtymSourceLink(Table<O> child, ForeignKey<O, MviewWwWordEtymSourceLinkRecord> key) {
        super(child, key, MVIEW_WW_WORD_ETYM_SOURCE_LINK);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MVIEW_WW_WORD_ETYM_SOURCE_LINK_WORD_ID_IDX);
    }

    @Override
    public MviewWwWordEtymSourceLink as(String alias) {
        return new MviewWwWordEtymSourceLink(DSL.name(alias), this);
    }

    @Override
    public MviewWwWordEtymSourceLink as(Name alias) {
        return new MviewWwWordEtymSourceLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWordEtymSourceLink rename(String name) {
        return new MviewWwWordEtymSourceLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwWordEtymSourceLink rename(Name name) {
        return new MviewWwWordEtymSourceLink(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, TypeSourceLinkRecord[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
