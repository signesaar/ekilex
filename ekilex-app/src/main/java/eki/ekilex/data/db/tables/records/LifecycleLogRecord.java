/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.LifecycleLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LifecycleLogRecord extends UpdatableRecordImpl<LifecycleLogRecord> implements Record6<Long, Long, String, String, String, Timestamp> {

    private static final long serialVersionUID = -1158977046;

    /**
     * Setter for <code>public.lifecycle_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.lifecycle_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.lifecycle_log.owner_id</code>.
     */
    public void setOwnerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.lifecycle_log.owner_id</code>.
     */
    public Long getOwnerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.lifecycle_log.owner_name</code>.
     */
    public void setOwnerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.lifecycle_log.owner_name</code>.
     */
    public String getOwnerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.lifecycle_log.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.lifecycle_log.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.lifecycle_log.event_by</code>.
     */
    public void setEventBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.lifecycle_log.event_by</code>.
     */
    public String getEventBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.lifecycle_log.event_on</code>.
     */
    public void setEventOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.lifecycle_log.event_on</code>.
     */
    public Timestamp getEventOn() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LifecycleLog.LIFECYCLE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LifecycleLog.LIFECYCLE_LOG.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LifecycleLog.LIFECYCLE_LOG.OWNER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LifecycleLog.LIFECYCLE_LOG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LifecycleLog.LIFECYCLE_LOG.EVENT_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return LifecycleLog.LIFECYCLE_LOG.EVENT_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOwnerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEventBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getEventOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOwnerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEventBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getEventOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord value2(Long value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord value3(String value) {
        setOwnerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord value5(String value) {
        setEventBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord value6(Timestamp value) {
        setEventOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LifecycleLogRecord values(Long value1, Long value2, String value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LifecycleLogRecord
     */
    public LifecycleLogRecord() {
        super(LifecycleLog.LIFECYCLE_LOG);
    }

    /**
     * Create a detached, initialised LifecycleLogRecord
     */
    public LifecycleLogRecord(Long id, Long ownerId, String ownerName, String type, String eventBy, Timestamp eventOn) {
        super(LifecycleLog.LIFECYCLE_LOG);

        set(0, id);
        set(1, ownerId);
        set(2, ownerName);
        set(3, type);
        set(4, eventBy);
        set(5, eventOn);
    }
}
