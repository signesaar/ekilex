/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.CollocationRelGroup;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CollocationRelGroupRecord extends UpdatableRecordImpl<CollocationRelGroupRecord> implements Record5<Long, Long, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 256695568;

    /**
     * Setter for <code>public.collocation_rel_group.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.collocation_rel_group.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.collocation_rel_group.collocation_pos_group_id</code>.
     */
    public void setCollocationPosGroupId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.collocation_rel_group.collocation_pos_group_id</code>.
     */
    public Long getCollocationPosGroupId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.collocation_rel_group.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.collocation_rel_group.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.collocation_rel_group.frequency</code>.
     */
    public void setFrequency(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.collocation_rel_group.frequency</code>.
     */
    public BigDecimal getFrequency() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.collocation_rel_group.score</code>.
     */
    public void setScore(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.collocation_rel_group.score</code>.
     */
    public BigDecimal getScore() {
        return (BigDecimal) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CollocationRelGroup.COLLOCATION_REL_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return CollocationRelGroup.COLLOCATION_REL_GROUP.COLLOCATION_POS_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CollocationRelGroup.COLLOCATION_REL_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return CollocationRelGroup.COLLOCATION_REL_GROUP.FREQUENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return CollocationRelGroup.COLLOCATION_REL_GROUP.SCORE;
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
        return getCollocationPosGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getScore();
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
        return getCollocationPosGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationRelGroupRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationRelGroupRecord value2(Long value) {
        setCollocationPosGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationRelGroupRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationRelGroupRecord value4(BigDecimal value) {
        setFrequency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationRelGroupRecord value5(BigDecimal value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationRelGroupRecord values(Long value1, Long value2, String value3, BigDecimal value4, BigDecimal value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollocationRelGroupRecord
     */
    public CollocationRelGroupRecord() {
        super(CollocationRelGroup.COLLOCATION_REL_GROUP);
    }

    /**
     * Create a detached, initialised CollocationRelGroupRecord
     */
    public CollocationRelGroupRecord(Long id, Long collocationPosGroupId, String name, BigDecimal frequency, BigDecimal score) {
        super(CollocationRelGroup.COLLOCATION_REL_GROUP);

        set(0, id);
        set(1, collocationPosGroupId);
        set(2, name);
        set(3, frequency);
        set(4, score);
    }
}
