/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.Freeform;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FreeformRecord extends UpdatableRecordImpl<FreeformRecord> implements Record11<Long, Long, String, String, Timestamp, BigDecimal, String[], String, String, String, Long> {

    private static final long serialVersionUID = 2116645400;

    /**
     * Setter for <code>public.freeform.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.freeform.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.freeform.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.freeform.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.freeform.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.freeform.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.freeform.value_text</code>.
     */
    public void setValueText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.freeform.value_text</code>.
     */
    public String getValueText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.freeform.value_date</code>.
     */
    public void setValueDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.freeform.value_date</code>.
     */
    public Timestamp getValueDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.freeform.value_number</code>.
     */
    public void setValueNumber(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.freeform.value_number</code>.
     */
    public BigDecimal getValueNumber() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>public.freeform.value_array</code>.
     */
    public void setValueArray(String... value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.freeform.value_array</code>.
     */
    public String[] getValueArray() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>public.freeform.classif_name</code>.
     */
    public void setClassifName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.freeform.classif_name</code>.
     */
    public String getClassifName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.freeform.classif_code</code>.
     */
    public void setClassifCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.freeform.classif_code</code>.
     */
    public String getClassifCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.freeform.lang</code>.
     */
    public void setLang(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.freeform.lang</code>.
     */
    public String getLang() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.freeform.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.freeform.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, String, Timestamp, BigDecimal, String[], String, String, String, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, String, String, Timestamp, BigDecimal, String[], String, String, String, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Freeform.FREEFORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Freeform.FREEFORM.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Freeform.FREEFORM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Freeform.FREEFORM.VALUE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Freeform.FREEFORM.VALUE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Freeform.FREEFORM.VALUE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field7() {
        return Freeform.FREEFORM.VALUE_ARRAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Freeform.FREEFORM.CLASSIF_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Freeform.FREEFORM.CLASSIF_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Freeform.FREEFORM.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return Freeform.FREEFORM.ORDER_BY;
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getValueText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getValueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getValueNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component7() {
        return getValueArray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getClassifName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getClassifCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValueText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getValueDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getValueNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value7() {
        return getValueArray();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getClassifName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getClassifCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getOrderBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value2(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value4(String value) {
        setValueText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value5(Timestamp value) {
        setValueDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value6(BigDecimal value) {
        setValueNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value7(String... value) {
        setValueArray(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value8(String value) {
        setClassifName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value9(String value) {
        setClassifCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value10(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord value11(Long value) {
        setOrderBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeformRecord values(Long value1, Long value2, String value3, String value4, Timestamp value5, BigDecimal value6, String[] value7, String value8, String value9, String value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FreeformRecord
     */
    public FreeformRecord() {
        super(Freeform.FREEFORM);
    }

    /**
     * Create a detached, initialised FreeformRecord
     */
    public FreeformRecord(Long id, Long parentId, String type, String valueText, Timestamp valueDate, BigDecimal valueNumber, String[] valueArray, String classifName, String classifCode, String lang, Long orderBy) {
        super(Freeform.FREEFORM);

        set(0, id);
        set(1, parentId);
        set(2, type);
        set(3, valueText);
        set(4, valueDate);
        set(5, valueNumber);
        set(6, valueArray);
        set(7, classifName);
        set(8, classifCode);
        set(9, lang);
        set(10, orderBy);
    }
}
