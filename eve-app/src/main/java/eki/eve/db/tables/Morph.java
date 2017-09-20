/*
 * This file is generated by jOOQ.
*/
package eki.eve.db.tables;


import eki.eve.db.Keys;
import eki.eve.db.Public;
import eki.eve.db.tables.records.MorphRecord;

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
public class Morph extends TableImpl<MorphRecord> {

    private static final long serialVersionUID = 1574848032;

    /**
     * The reference instance of <code>public.morph</code>
     */
    public static final Morph MORPH = new Morph();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MorphRecord> getRecordType() {
        return MorphRecord.class;
    }

    /**
     * The column <code>public.morph.code</code>.
     */
    public final TableField<MorphRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>public.morph.dataset</code>.
     */
    public final TableField<MorphRecord, String[]> DATASET = createField("dataset", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.morph</code> table reference
     */
    public Morph() {
        this("morph", null);
    }

    /**
     * Create an aliased <code>public.morph</code> table reference
     */
    public Morph(String alias) {
        this(alias, MORPH);
    }

    private Morph(String alias, Table<MorphRecord> aliased) {
        this(alias, aliased, null);
    }

    private Morph(String alias, Table<MorphRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<MorphRecord> getPrimaryKey() {
        return Keys.MORPH_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MorphRecord>> getKeys() {
        return Arrays.<UniqueKey<MorphRecord>>asList(Keys.MORPH_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Morph as(String alias) {
        return new Morph(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Morph rename(String name) {
        return new Morph(name, null);
    }
}
