/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.DomainLabelRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainLabel extends TableImpl<DomainLabelRecord> {

    private static final long serialVersionUID = -2086337166;

    /**
     * The reference instance of <code>public.domain_label</code>
     */
    public static final DomainLabel DOMAIN_LABEL = new DomainLabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainLabelRecord> getRecordType() {
        return DomainLabelRecord.class;
    }

    /**
     * The column <code>public.domain_label.code</code>.
     */
    public final TableField<DomainLabelRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.domain_label.origin</code>.
     */
    public final TableField<DomainLabelRecord, String> ORIGIN = createField(DSL.name("origin"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.domain_label.value</code>.
     */
    public final TableField<DomainLabelRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.domain_label.lang</code>.
     */
    public final TableField<DomainLabelRecord, String> LANG = createField(DSL.name("lang"), org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.domain_label.type</code>.
     */
    public final TableField<DomainLabelRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.domain_label</code> table reference
     */
    public DomainLabel() {
        this(DSL.name("domain_label"), null);
    }

    /**
     * Create an aliased <code>public.domain_label</code> table reference
     */
    public DomainLabel(String alias) {
        this(DSL.name(alias), DOMAIN_LABEL);
    }

    /**
     * Create an aliased <code>public.domain_label</code> table reference
     */
    public DomainLabel(Name alias) {
        this(alias, DOMAIN_LABEL);
    }

    private DomainLabel(Name alias, Table<DomainLabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainLabel(Name alias, Table<DomainLabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DomainLabel(Table<O> child, ForeignKey<O, DomainLabelRecord> key) {
        super(child, key, DOMAIN_LABEL);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DOMAIN_LABEL_CODE_ORIGIN_IDX);
    }

    @Override
    public List<UniqueKey<DomainLabelRecord>> getKeys() {
        return Arrays.<UniqueKey<DomainLabelRecord>>asList(Keys.DOMAIN_LABEL_CODE_ORIGIN_LANG_TYPE_KEY);
    }

    @Override
    public List<ForeignKey<DomainLabelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DomainLabelRecord, ?>>asList(Keys.DOMAIN_LABEL__DOMAIN_LABEL_CODE_FKEY, Keys.DOMAIN_LABEL__DOMAIN_LABEL_LANG_FKEY, Keys.DOMAIN_LABEL__DOMAIN_LABEL_TYPE_FKEY);
    }

    public Domain domain() {
        return new Domain(this, Keys.DOMAIN_LABEL__DOMAIN_LABEL_CODE_FKEY);
    }

    public Language language() {
        return new Language(this, Keys.DOMAIN_LABEL__DOMAIN_LABEL_LANG_FKEY);
    }

    public LabelType labelType() {
        return new LabelType(this, Keys.DOMAIN_LABEL__DOMAIN_LABEL_TYPE_FKEY);
    }

    @Override
    public DomainLabel as(String alias) {
        return new DomainLabel(DSL.name(alias), this);
    }

    @Override
    public DomainLabel as(Name alias) {
        return new DomainLabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainLabel rename(String name) {
        return new DomainLabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainLabel rename(Name name) {
        return new DomainLabel(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
