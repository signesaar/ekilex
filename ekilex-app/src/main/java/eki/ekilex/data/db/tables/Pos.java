/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.PosRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Pos extends TableImpl<PosRecord> {

    private static final long serialVersionUID = 593169484;

    /**
     * The reference instance of <code>public.pos</code>
     */
    public static final Pos POS = new Pos();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PosRecord> getRecordType() {
        return PosRecord.class;
    }

    /**
     * The column <code>public.pos.code</code>.
     */
    public final TableField<PosRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.pos.datasets</code>.
     */
    public final TableField<PosRecord, String[]> DATASETS = createField("datasets", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.pos</code> table reference
     */
    public Pos() {
        this(DSL.name("pos"), null);
    }

    /**
     * Create an aliased <code>public.pos</code> table reference
     */
    public Pos(String alias) {
        this(DSL.name(alias), POS);
    }

    /**
     * Create an aliased <code>public.pos</code> table reference
     */
    public Pos(Name alias) {
        this(alias, POS);
    }

    private Pos(Name alias, Table<PosRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pos(Name alias, Table<PosRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.POS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PosRecord> getPrimaryKey() {
        return Keys.POS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PosRecord>> getKeys() {
        return Arrays.<UniqueKey<PosRecord>>asList(Keys.POS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pos as(String alias) {
        return new Pos(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pos as(Name alias) {
        return new Pos(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pos rename(String name) {
        return new Pos(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pos rename(Name name) {
        return new Pos(name, null);
    }
}
