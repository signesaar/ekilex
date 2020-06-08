/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ProcessLog;

import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcessLogRecord extends UpdatableRecordImpl<ProcessLogRecord> implements Record8<Long, String, Timestamp, String, String, String, String, String> {

    private static final long serialVersionUID = -1280241677;

    /**
     * Setter for <code>public.process_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.process_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.process_log.event_by</code>.
     */
    public void setEventBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.process_log.event_by</code>.
     */
    public String getEventBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.process_log.event_on</code>.
     */
    public void setEventOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.process_log.event_on</code>.
     */
    public Timestamp getEventOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.process_log.comment</code>.
     */
    public void setComment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.process_log.comment</code>.
     */
    public String getComment() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.process_log.comment_prese</code>.
     */
    public void setCommentPrese(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.process_log.comment_prese</code>.
     */
    public String getCommentPrese() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.process_log.process_state_code</code>.
     */
    public void setProcessStateCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.process_log.process_state_code</code>.
     */
    public String getProcessStateCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.process_log.dataset_code</code>.
     */
    public void setDatasetCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.process_log.dataset_code</code>.
     */
    public String getDatasetCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.process_log.layer_name</code>.
     */
    public void setLayerName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.process_log.layer_name</code>.
     */
    public String getLayerName() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Timestamp, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, Timestamp, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ProcessLog.PROCESS_LOG.ID;
    }

    @Override
    public Field<String> field2() {
        return ProcessLog.PROCESS_LOG.EVENT_BY;
    }

    @Override
    public Field<Timestamp> field3() {
        return ProcessLog.PROCESS_LOG.EVENT_ON;
    }

    @Override
    public Field<String> field4() {
        return ProcessLog.PROCESS_LOG.COMMENT;
    }

    @Override
    public Field<String> field5() {
        return ProcessLog.PROCESS_LOG.COMMENT_PRESE;
    }

    @Override
    public Field<String> field6() {
        return ProcessLog.PROCESS_LOG.PROCESS_STATE_CODE;
    }

    @Override
    public Field<String> field7() {
        return ProcessLog.PROCESS_LOG.DATASET_CODE;
    }

    @Override
    public Field<String> field8() {
        return ProcessLog.PROCESS_LOG.LAYER_NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEventBy();
    }

    @Override
    public Timestamp component3() {
        return getEventOn();
    }

    @Override
    public String component4() {
        return getComment();
    }

    @Override
    public String component5() {
        return getCommentPrese();
    }

    @Override
    public String component6() {
        return getProcessStateCode();
    }

    @Override
    public String component7() {
        return getDatasetCode();
    }

    @Override
    public String component8() {
        return getLayerName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEventBy();
    }

    @Override
    public Timestamp value3() {
        return getEventOn();
    }

    @Override
    public String value4() {
        return getComment();
    }

    @Override
    public String value5() {
        return getCommentPrese();
    }

    @Override
    public String value6() {
        return getProcessStateCode();
    }

    @Override
    public String value7() {
        return getDatasetCode();
    }

    @Override
    public String value8() {
        return getLayerName();
    }

    @Override
    public ProcessLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ProcessLogRecord value2(String value) {
        setEventBy(value);
        return this;
    }

    @Override
    public ProcessLogRecord value3(Timestamp value) {
        setEventOn(value);
        return this;
    }

    @Override
    public ProcessLogRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public ProcessLogRecord value5(String value) {
        setCommentPrese(value);
        return this;
    }

    @Override
    public ProcessLogRecord value6(String value) {
        setProcessStateCode(value);
        return this;
    }

    @Override
    public ProcessLogRecord value7(String value) {
        setDatasetCode(value);
        return this;
    }

    @Override
    public ProcessLogRecord value8(String value) {
        setLayerName(value);
        return this;
    }

    @Override
    public ProcessLogRecord values(Long value1, String value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcessLogRecord
     */
    public ProcessLogRecord() {
        super(ProcessLog.PROCESS_LOG);
    }

    /**
     * Create a detached, initialised ProcessLogRecord
     */
    public ProcessLogRecord(Long id, String eventBy, Timestamp eventOn, String comment, String commentPrese, String processStateCode, String datasetCode, String layerName) {
        super(ProcessLog.PROCESS_LOG);

        set(0, id);
        set(1, eventBy);
        set(2, eventOn);
        set(3, comment);
        set(4, commentPrese);
        set(5, processStateCode);
        set(6, datasetCode);
        set(7, layerName);
    }
}
