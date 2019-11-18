/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.MeaningSemanticType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MeaningSemanticTypeRecord extends UpdatableRecordImpl<MeaningSemanticTypeRecord> implements Record4<Long, Long, String, Long> {

    private static final long serialVersionUID = -1952196287;

    /**
     * Setter for <code>public.meaning_semantic_type.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.meaning_semantic_type.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.meaning_semantic_type.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.meaning_semantic_type.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.meaning_semantic_type.semantic_type_code</code>.
     */
    public void setSemanticTypeCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.meaning_semantic_type.semantic_type_code</code>.
     */
    public String getSemanticTypeCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.meaning_semantic_type.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.meaning_semantic_type.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MeaningSemanticType.MEANING_SEMANTIC_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return MeaningSemanticType.MEANING_SEMANTIC_TYPE.MEANING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MeaningSemanticType.MEANING_SEMANTIC_TYPE.SEMANTIC_TYPE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return MeaningSemanticType.MEANING_SEMANTIC_TYPE.ORDER_BY;
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
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSemanticTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getOrderBy();
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
        return getMeaningId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSemanticTypeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningSemanticTypeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningSemanticTypeRecord value2(Long value) {
        setMeaningId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningSemanticTypeRecord value3(String value) {
        setSemanticTypeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningSemanticTypeRecord value4(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningSemanticTypeRecord values(Long value1, Long value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MeaningSemanticTypeRecord
     */
    public MeaningSemanticTypeRecord() {
        super(MeaningSemanticType.MEANING_SEMANTIC_TYPE);
    }

    /**
     * Create a detached, initialised MeaningSemanticTypeRecord
     */
    public MeaningSemanticTypeRecord(Long id, Long meaningId, String semanticTypeCode, Long orderBy) {
        super(MeaningSemanticType.MEANING_SEMANTIC_TYPE);

        set(0, id);
        set(1, meaningId);
        set(2, semanticTypeCode);
        set(3, orderBy);
    }
}