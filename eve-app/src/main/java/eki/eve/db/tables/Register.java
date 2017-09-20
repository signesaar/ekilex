/*
 * This file is generated by jOOQ.
*/
package eki.eve.db.tables;


import eki.eve.db.Keys;
import eki.eve.db.Public;
import eki.eve.db.tables.records.RegisterRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Register extends TableImpl<RegisterRecord> {

    private static final long serialVersionUID = -1894864924;

    /**
     * The reference instance of <code>public.register</code>
     */
    public static final Register REGISTER = new Register();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegisterRecord> getRecordType() {
        return RegisterRecord.class;
    }

    /**
     * The column <code>public.register.code</code>.
     */
    public final TableField<RegisterRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>public.register.dataset</code>.
     */
    public final TableField<RegisterRecord, String[]> DATASET = createField("dataset", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.register</code> table reference
     */
    public Register() {
        this("register", null);
    }

    /**
     * Create an aliased <code>public.register</code> table reference
     */
    public Register(String alias) {
        this(alias, REGISTER);
    }

    private Register(String alias, Table<RegisterRecord> aliased) {
        this(alias, aliased, null);
    }

    private Register(String alias, Table<RegisterRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<RegisterRecord> getPrimaryKey() {
        return Keys.REGISTER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RegisterRecord>> getKeys() {
        return Arrays.<UniqueKey<RegisterRecord>>asList(Keys.REGISTER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Register as(String alias) {
        return new Register(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Register rename(String name) {
        return new Register(name, null);
    }
}
