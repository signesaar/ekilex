/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.Dataset;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetRecord extends UpdatableRecordImpl<DatasetRecord> implements Record8<String, String, String, String, Boolean, Boolean, Long, Boolean> {

    private static final long serialVersionUID = 2127101961;

    /**
     * Setter for <code>public.dataset.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dataset.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.dataset.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dataset.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.dataset.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dataset.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.dataset.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dataset.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.dataset.is_visible</code>.
     */
    public void setIsVisible(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.dataset.is_visible</code>.
     */
    public Boolean getIsVisible() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.dataset.is_public</code>.
     */
    public void setIsPublic(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.dataset.is_public</code>.
     */
    public Boolean getIsPublic() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.dataset.order_by</code>.
     */
    public void setOrderBy(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.dataset.order_by</code>.
     */
    public Long getOrderBy() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.dataset.is_superior</code>.
     */
    public void setIsSuperior(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.dataset.is_superior</code>.
     */
    public Boolean getIsSuperior() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, Boolean, Boolean, Long, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, Boolean, Boolean, Long, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Dataset.DATASET.CODE;
    }

    @Override
    public Field<String> field2() {
        return Dataset.DATASET.TYPE;
    }

    @Override
    public Field<String> field3() {
        return Dataset.DATASET.NAME;
    }

    @Override
    public Field<String> field4() {
        return Dataset.DATASET.DESCRIPTION;
    }

    @Override
    public Field<Boolean> field5() {
        return Dataset.DATASET.IS_VISIBLE;
    }

    @Override
    public Field<Boolean> field6() {
        return Dataset.DATASET.IS_PUBLIC;
    }

    @Override
    public Field<Long> field7() {
        return Dataset.DATASET.ORDER_BY;
    }

    @Override
    public Field<Boolean> field8() {
        return Dataset.DATASET.IS_SUPERIOR;
    }

    @Override
    public String component1() {
        return getCode();
    }

    @Override
    public String component2() {
        return getType();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Boolean component5() {
        return getIsVisible();
    }

    @Override
    public Boolean component6() {
        return getIsPublic();
    }

    @Override
    public Long component7() {
        return getOrderBy();
    }

    @Override
    public Boolean component8() {
        return getIsSuperior();
    }

    @Override
    public String value1() {
        return getCode();
    }

    @Override
    public String value2() {
        return getType();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Boolean value5() {
        return getIsVisible();
    }

    @Override
    public Boolean value6() {
        return getIsPublic();
    }

    @Override
    public Long value7() {
        return getOrderBy();
    }

    @Override
    public Boolean value8() {
        return getIsSuperior();
    }

    @Override
    public DatasetRecord value1(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DatasetRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public DatasetRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public DatasetRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public DatasetRecord value5(Boolean value) {
        setIsVisible(value);
        return this;
    }

    @Override
    public DatasetRecord value6(Boolean value) {
        setIsPublic(value);
        return this;
    }

    @Override
    public DatasetRecord value7(Long value) {
        setOrderBy(value);
        return this;
    }

    @Override
    public DatasetRecord value8(Boolean value) {
        setIsSuperior(value);
        return this;
    }

    @Override
    public DatasetRecord values(String value1, String value2, String value3, String value4, Boolean value5, Boolean value6, Long value7, Boolean value8) {
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
     * Create a detached DatasetRecord
     */
    public DatasetRecord() {
        super(Dataset.DATASET);
    }

    /**
     * Create a detached, initialised DatasetRecord
     */
    public DatasetRecord(String code, String type, String name, String description, Boolean isVisible, Boolean isPublic, Long orderBy, Boolean isSuperior) {
        super(Dataset.DATASET);

        set(0, code);
        set(1, type);
        set(2, name);
        set(3, description);
        set(4, isVisible);
        set(5, isPublic);
        set(6, orderBy);
        set(7, isSuperior);
    }
}
