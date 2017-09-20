/*
 * This file is generated by jOOQ.
*/
package eki.eve.db.tables;


import eki.eve.db.Keys;
import eki.eve.db.Public;
import eki.eve.db.tables.records.DerivRecord;

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
public class Deriv extends TableImpl<DerivRecord> {

    private static final long serialVersionUID = -1054942856;

    /**
     * The reference instance of <code>public.deriv</code>
     */
    public static final Deriv DERIV = new Deriv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DerivRecord> getRecordType() {
        return DerivRecord.class;
    }

    /**
     * The column <code>public.deriv.code</code>.
     */
    public final TableField<DerivRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>public.deriv.dataset</code>.
     */
    public final TableField<DerivRecord, String[]> DATASET = createField("dataset", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.deriv</code> table reference
     */
    public Deriv() {
        this("deriv", null);
    }

    /**
     * Create an aliased <code>public.deriv</code> table reference
     */
    public Deriv(String alias) {
        this(alias, DERIV);
    }

    private Deriv(String alias, Table<DerivRecord> aliased) {
        this(alias, aliased, null);
    }

    private Deriv(String alias, Table<DerivRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<DerivRecord> getPrimaryKey() {
        return Keys.DERIV_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DerivRecord>> getKeys() {
        return Arrays.<UniqueKey<DerivRecord>>asList(Keys.DERIV_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Deriv as(String alias) {
        return new Deriv(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Deriv rename(String name) {
        return new Deriv(name, null);
    }
}
