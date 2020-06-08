/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ProcessStateRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class ProcessState extends TableImpl<ProcessStateRecord> {

    private static final long serialVersionUID = 410735130;

    /**
     * The reference instance of <code>public.process_state</code>
     */
    public static final ProcessState PROCESS_STATE = new ProcessState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcessStateRecord> getRecordType() {
        return ProcessStateRecord.class;
    }

    /**
     * The column <code>public.process_state.code</code>.
     */
    public final TableField<ProcessStateRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.process_state.datasets</code>.
     */
    public final TableField<ProcessStateRecord, String[]> DATASETS = createField(DSL.name("datasets"), org.jooq.impl.SQLDataType.VARCHAR(10).getArrayDataType(), this, "");

    /**
     * The column <code>public.process_state.order_by</code>.
     */
    public final TableField<ProcessStateRecord, Long> ORDER_BY = createField(DSL.name("order_by"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('process_state_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.process_state</code> table reference
     */
    public ProcessState() {
        this(DSL.name("process_state"), null);
    }

    /**
     * Create an aliased <code>public.process_state</code> table reference
     */
    public ProcessState(String alias) {
        this(DSL.name(alias), PROCESS_STATE);
    }

    /**
     * Create an aliased <code>public.process_state</code> table reference
     */
    public ProcessState(Name alias) {
        this(alias, PROCESS_STATE);
    }

    private ProcessState(Name alias, Table<ProcessStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProcessState(Name alias, Table<ProcessStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ProcessState(Table<O> child, ForeignKey<O, ProcessStateRecord> key) {
        super(child, key, PROCESS_STATE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<ProcessStateRecord, Long> getIdentity() {
        return Keys.IDENTITY_PROCESS_STATE;
    }

    @Override
    public UniqueKey<ProcessStateRecord> getPrimaryKey() {
        return Keys.PROCESS_STATE_PKEY;
    }

    @Override
    public List<UniqueKey<ProcessStateRecord>> getKeys() {
        return Arrays.<UniqueKey<ProcessStateRecord>>asList(Keys.PROCESS_STATE_PKEY);
    }

    @Override
    public ProcessState as(String alias) {
        return new ProcessState(DSL.name(alias), this);
    }

    @Override
    public ProcessState as(Name alias) {
        return new ProcessState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProcessState rename(String name) {
        return new ProcessState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProcessState rename(Name name) {
        return new ProcessState(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String[], Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
