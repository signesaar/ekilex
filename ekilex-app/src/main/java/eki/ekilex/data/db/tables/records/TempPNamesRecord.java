/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.TempPNames;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TempPNamesRecord extends UpdatableRecordImpl<TempPNamesRecord> implements Record1<String> {

    private static final long serialVersionUID = -45343979;

    /**
     * Setter for <code>public.temp_p_names.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.temp_p_names.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TempPNames.TEMP_P_NAMES.NAME;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public TempPNamesRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public TempPNamesRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TempPNamesRecord
     */
    public TempPNamesRecord() {
        super(TempPNames.TEMP_P_NAMES);
    }

    /**
     * Create a detached, initialised TempPNamesRecord
     */
    public TempPNamesRecord(String name) {
        super(TempPNames.TEMP_P_NAMES);

        set(0, name);
    }
}