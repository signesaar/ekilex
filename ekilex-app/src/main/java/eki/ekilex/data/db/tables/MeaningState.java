/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MeaningStateRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class MeaningState extends TableImpl<MeaningStateRecord> {

    private static final long serialVersionUID = 542522087;

    /**
     * The reference instance of <code>public.meaning_state</code>
     */
    public static final MeaningState MEANING_STATE = new MeaningState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeaningStateRecord> getRecordType() {
        return MeaningStateRecord.class;
    }

    /**
     * The column <code>public.meaning_state.code</code>.
     */
    public final TableField<MeaningStateRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.meaning_state.datasets</code>.
     */
    public final TableField<MeaningStateRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.meaning_state</code> table reference
     */
    public MeaningState() {
        this(DSL.name("meaning_state"), null);
    }

    /**
     * Create an aliased <code>public.meaning_state</code> table reference
     */
    public MeaningState(String alias) {
        this(DSL.name(alias), MEANING_STATE);
    }

    /**
     * Create an aliased <code>public.meaning_state</code> table reference
     */
    public MeaningState(Name alias) {
        this(alias, MEANING_STATE);
    }

    private MeaningState(Name alias, Table<MeaningStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeaningState(Name alias, Table<MeaningStateRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEANING_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeaningStateRecord> getPrimaryKey() {
        return Keys.MEANING_STATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeaningStateRecord>> getKeys() {
        return Arrays.<UniqueKey<MeaningStateRecord>>asList(Keys.MEANING_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningState as(String alias) {
        return new MeaningState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningState as(Name alias) {
        return new MeaningState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningState rename(String name) {
        return new MeaningState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningState rename(Name name) {
        return new MeaningState(name, null);
    }
}
