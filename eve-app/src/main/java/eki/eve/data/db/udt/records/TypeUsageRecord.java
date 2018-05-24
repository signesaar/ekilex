/*
 * This file is generated by jOOQ.
*/
package eki.eve.data.db.udt.records;


import eki.eve.data.db.udt.TypeUsage;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UDTRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeUsageRecord extends UDTRecordImpl<TypeUsageRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -2118083496;

    /**
     * Setter for <code>public.type_usage.usage</code>.
     */
    public void setUsage(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_usage.usage</code>.
     */
    public String getUsage() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.type_usage.usage_author</code>.
     */
    public void setUsageAuthor(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_author</code>.
     */
    public String getUsageAuthor() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.type_usage.usage_translator</code>.
     */
    public void setUsageTranslator(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_usage.usage_translator</code>.
     */
    public String getUsageTranslator() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TypeUsage.USAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TypeUsage.USAGE_AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TypeUsage.USAGE_TRANSLATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUsage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsageAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsageTranslator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsageAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsageTranslator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value1(String value) {
        setUsage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value2(String value) {
        setUsageAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord value3(String value) {
        setUsageTranslator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeUsageRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypeUsageRecord
     */
    public TypeUsageRecord() {
        super(TypeUsage.TYPE_USAGE);
    }

    /**
     * Create a detached, initialised TypeUsageRecord
     */
    public TypeUsageRecord(String usage, String usageAuthor, String usageTranslator) {
        super(TypeUsage.TYPE_USAGE);

        set(0, usage);
        set(1, usageAuthor);
        set(2, usageTranslator);
    }
}
