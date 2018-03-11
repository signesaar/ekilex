/*
 * This file is generated by jOOQ.
*/
package eki.eve.data.db.tables;


import eki.eve.data.db.Indexes;
import eki.eve.data.db.Keys;
import eki.eve.data.db.Public;
import eki.eve.data.db.tables.records.CollocationPosGroupRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class CollocationPosGroup extends TableImpl<CollocationPosGroupRecord> {

    private static final long serialVersionUID = 1790391239;

    /**
     * The reference instance of <code>public.collocation_pos_group</code>
     */
    public static final CollocationPosGroup COLLOCATION_POS_GROUP = new CollocationPosGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollocationPosGroupRecord> getRecordType() {
        return CollocationPosGroupRecord.class;
    }

    /**
     * The column <code>public.collocation_pos_group.id</code>.
     */
    public final TableField<CollocationPosGroupRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('collocation_pos_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.collocation_pos_group.lexeme_id</code>.
     */
    public final TableField<CollocationPosGroupRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.collocation_pos_group.name</code>.
     */
    public final TableField<CollocationPosGroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.collocation_pos_group</code> table reference
     */
    public CollocationPosGroup() {
        this(DSL.name("collocation_pos_group"), null);
    }

    /**
     * Create an aliased <code>public.collocation_pos_group</code> table reference
     */
    public CollocationPosGroup(String alias) {
        this(DSL.name(alias), COLLOCATION_POS_GROUP);
    }

    /**
     * Create an aliased <code>public.collocation_pos_group</code> table reference
     */
    public CollocationPosGroup(Name alias) {
        this(alias, COLLOCATION_POS_GROUP);
    }

    private CollocationPosGroup(Name alias, Table<CollocationPosGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private CollocationPosGroup(Name alias, Table<CollocationPosGroupRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.COLLOCATION_POS_GROUP_LEXEME_ID_IDX, Indexes.COLLOCATION_POS_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CollocationPosGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_COLLOCATION_POS_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CollocationPosGroupRecord> getPrimaryKey() {
        return Keys.COLLOCATION_POS_GROUP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CollocationPosGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<CollocationPosGroupRecord>>asList(Keys.COLLOCATION_POS_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CollocationPosGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CollocationPosGroupRecord, ?>>asList(Keys.COLLOCATION_POS_GROUP__COLLOCATION_POS_GROUP_LEXEME_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationPosGroup as(String alias) {
        return new CollocationPosGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollocationPosGroup as(Name alias) {
        return new CollocationPosGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CollocationPosGroup rename(String name) {
        return new CollocationPosGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CollocationPosGroup rename(Name name) {
        return new CollocationPosGroup(name, null);
    }
}
