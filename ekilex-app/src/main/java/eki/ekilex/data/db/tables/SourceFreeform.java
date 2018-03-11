/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.SourceFreeformRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SourceFreeform extends TableImpl<SourceFreeformRecord> {

    private static final long serialVersionUID = -1873859158;

    /**
     * The reference instance of <code>public.source_freeform</code>
     */
    public static final SourceFreeform SOURCE_FREEFORM = new SourceFreeform();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SourceFreeformRecord> getRecordType() {
        return SourceFreeformRecord.class;
    }

    /**
     * The column <code>public.source_freeform.id</code>.
     */
    public final TableField<SourceFreeformRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('source_freeform_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.source_freeform.source_id</code>.
     */
    public final TableField<SourceFreeformRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.source_freeform.freeform_id</code>.
     */
    public final TableField<SourceFreeformRecord, Long> FREEFORM_ID = createField("freeform_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.source_freeform</code> table reference
     */
    public SourceFreeform() {
        this(DSL.name("source_freeform"), null);
    }

    /**
     * Create an aliased <code>public.source_freeform</code> table reference
     */
    public SourceFreeform(String alias) {
        this(DSL.name(alias), SOURCE_FREEFORM);
    }

    /**
     * Create an aliased <code>public.source_freeform</code> table reference
     */
    public SourceFreeform(Name alias) {
        this(alias, SOURCE_FREEFORM);
    }

    private SourceFreeform(Name alias, Table<SourceFreeformRecord> aliased) {
        this(alias, aliased, null);
    }

    private SourceFreeform(Name alias, Table<SourceFreeformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.SOURCE_FREEFORM_FREEFORM_ID_IDX, Indexes.SOURCE_FREEFORM_PKEY, Indexes.SOURCE_FREEFORM_SOURCE_ID_FREEFORM_ID_KEY, Indexes.SOURCE_FREEFORM_SOURCE_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SourceFreeformRecord, Long> getIdentity() {
        return Keys.IDENTITY_SOURCE_FREEFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SourceFreeformRecord> getPrimaryKey() {
        return Keys.SOURCE_FREEFORM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SourceFreeformRecord>> getKeys() {
        return Arrays.<UniqueKey<SourceFreeformRecord>>asList(Keys.SOURCE_FREEFORM_PKEY, Keys.SOURCE_FREEFORM_SOURCE_ID_FREEFORM_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SourceFreeformRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SourceFreeformRecord, ?>>asList(Keys.SOURCE_FREEFORM__SOURCE_FREEFORM_SOURCE_ID_FKEY, Keys.SOURCE_FREEFORM__SOURCE_FREEFORM_FREEFORM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SourceFreeform as(String alias) {
        return new SourceFreeform(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SourceFreeform as(Name alias) {
        return new SourceFreeform(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SourceFreeform rename(String name) {
        return new SourceFreeform(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SourceFreeform rename(Name name) {
        return new SourceFreeform(name, null);
    }
}
