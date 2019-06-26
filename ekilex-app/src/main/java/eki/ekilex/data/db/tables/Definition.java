/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.DefinitionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Definition extends TableImpl<DefinitionRecord> {

    private static final long serialVersionUID = -1753286592;

    /**
     * The reference instance of <code>public.definition</code>
     */
    public static final Definition DEFINITION = new Definition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DefinitionRecord> getRecordType() {
        return DefinitionRecord.class;
    }

    /**
     * The column <code>public.definition.id</code>.
     */
    public final TableField<DefinitionRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('definition_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.definition.meaning_id</code>.
     */
    public final TableField<DefinitionRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.definition.definition_type_code</code>.
     */
    public final TableField<DefinitionRecord, String> DEFINITION_TYPE_CODE = createField("definition_type_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.definition.value</code>.
     */
    public final TableField<DefinitionRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.definition.value_prese</code>.
     */
    public final TableField<DefinitionRecord, String> VALUE_PRESE = createField("value_prese", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.definition.lang</code>.
     */
    public final TableField<DefinitionRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.definition.complexity</code>.
     */
    public final TableField<DefinitionRecord, String> COMPLEXITY = createField("complexity", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.definition.order_by</code>.
     */
    public final TableField<DefinitionRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('definition_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.definition</code> table reference
     */
    public Definition() {
        this(DSL.name("definition"), null);
    }

    /**
     * Create an aliased <code>public.definition</code> table reference
     */
    public Definition(String alias) {
        this(DSL.name(alias), DEFINITION);
    }

    /**
     * Create an aliased <code>public.definition</code> table reference
     */
    public Definition(Name alias) {
        this(alias, DEFINITION);
    }

    private Definition(Name alias, Table<DefinitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Definition(Name alias, Table<DefinitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Definition(Table<O> child, ForeignKey<O, DefinitionRecord> key) {
        super(child, key, DEFINITION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DEFINITION_MEANING_ID_IDX, Indexes.DEFINITION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DefinitionRecord, Long> getIdentity() {
        return Keys.IDENTITY_DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DefinitionRecord> getPrimaryKey() {
        return Keys.DEFINITION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DefinitionRecord>> getKeys() {
        return Arrays.<UniqueKey<DefinitionRecord>>asList(Keys.DEFINITION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DefinitionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DefinitionRecord, ?>>asList(Keys.DEFINITION__DEFINITION_MEANING_ID_FKEY, Keys.DEFINITION__DEFINITION_DEFINITION_TYPE_CODE_FKEY, Keys.DEFINITION__DEFINITION_LANG_FKEY);
    }

    public Meaning meaning() {
        return new Meaning(this, Keys.DEFINITION__DEFINITION_MEANING_ID_FKEY);
    }

    public DefinitionType definitionType() {
        return new DefinitionType(this, Keys.DEFINITION__DEFINITION_DEFINITION_TYPE_CODE_FKEY);
    }

    public Language language() {
        return new Language(this, Keys.DEFINITION__DEFINITION_LANG_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Definition as(String alias) {
        return new Definition(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Definition as(Name alias) {
        return new Definition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Definition rename(String name) {
        return new Definition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Definition rename(Name name) {
        return new Definition(name, null);
    }
}
