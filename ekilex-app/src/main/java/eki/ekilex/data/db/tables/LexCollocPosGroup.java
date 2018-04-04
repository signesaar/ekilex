/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexCollocPosGroupRecord;

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
public class LexCollocPosGroup extends TableImpl<LexCollocPosGroupRecord> {

    private static final long serialVersionUID = -352014503;

    /**
     * The reference instance of <code>public.lex_colloc_pos_group</code>
     */
    public static final LexCollocPosGroup LEX_COLLOC_POS_GROUP = new LexCollocPosGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexCollocPosGroupRecord> getRecordType() {
        return LexCollocPosGroupRecord.class;
    }

    /**
     * The column <code>public.lex_colloc_pos_group.id</code>.
     */
    public final TableField<LexCollocPosGroupRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lex_colloc_pos_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lex_colloc_pos_group.lexeme_id</code>.
     */
    public final TableField<LexCollocPosGroupRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lex_colloc_pos_group.name</code>.
     */
    public final TableField<LexCollocPosGroupRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.lex_colloc_pos_group.order_by</code>.
     */
    public final TableField<LexCollocPosGroupRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lex_colloc_pos_group_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.lex_colloc_pos_group</code> table reference
     */
    public LexCollocPosGroup() {
        this(DSL.name("lex_colloc_pos_group"), null);
    }

    /**
     * Create an aliased <code>public.lex_colloc_pos_group</code> table reference
     */
    public LexCollocPosGroup(String alias) {
        this(DSL.name(alias), LEX_COLLOC_POS_GROUP);
    }

    /**
     * Create an aliased <code>public.lex_colloc_pos_group</code> table reference
     */
    public LexCollocPosGroup(Name alias) {
        this(alias, LEX_COLLOC_POS_GROUP);
    }

    private LexCollocPosGroup(Name alias, Table<LexCollocPosGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexCollocPosGroup(Name alias, Table<LexCollocPosGroupRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LEX_COLLOC_POS_GROUP_LEXEME_ID_IDX, Indexes.LEX_COLLOC_POS_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexCollocPosGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEX_COLLOC_POS_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexCollocPosGroupRecord> getPrimaryKey() {
        return Keys.LEX_COLLOC_POS_GROUP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexCollocPosGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<LexCollocPosGroupRecord>>asList(Keys.LEX_COLLOC_POS_GROUP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexCollocPosGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexCollocPosGroupRecord, ?>>asList(Keys.LEX_COLLOC_POS_GROUP__LEX_COLLOC_POS_GROUP_LEXEME_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocPosGroup as(String alias) {
        return new LexCollocPosGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexCollocPosGroup as(Name alias) {
        return new LexCollocPosGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexCollocPosGroup rename(String name) {
        return new LexCollocPosGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexCollocPosGroup rename(Name name) {
        return new LexCollocPosGroup(name, null);
    }
}