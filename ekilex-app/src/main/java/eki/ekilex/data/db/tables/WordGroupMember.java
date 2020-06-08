/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.WordGroupMemberRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordGroupMember extends TableImpl<WordGroupMemberRecord> {

    private static final long serialVersionUID = 610508442;

    /**
     * The reference instance of <code>public.word_group_member</code>
     */
    public static final WordGroupMember WORD_GROUP_MEMBER = new WordGroupMember();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordGroupMemberRecord> getRecordType() {
        return WordGroupMemberRecord.class;
    }

    /**
     * The column <code>public.word_group_member.id</code>.
     */
    public final TableField<WordGroupMemberRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_group_member_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.word_group_member.word_group_id</code>.
     */
    public final TableField<WordGroupMemberRecord, Long> WORD_GROUP_ID = createField(DSL.name("word_group_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_group_member.word_id</code>.
     */
    public final TableField<WordGroupMemberRecord, Long> WORD_ID = createField(DSL.name("word_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.word_group_member.order_by</code>.
     */
    public final TableField<WordGroupMemberRecord, Long> ORDER_BY = createField(DSL.name("order_by"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_group_member_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.word_group_member</code> table reference
     */
    public WordGroupMember() {
        this(DSL.name("word_group_member"), null);
    }

    /**
     * Create an aliased <code>public.word_group_member</code> table reference
     */
    public WordGroupMember(String alias) {
        this(DSL.name(alias), WORD_GROUP_MEMBER);
    }

    /**
     * Create an aliased <code>public.word_group_member</code> table reference
     */
    public WordGroupMember(Name alias) {
        this(alias, WORD_GROUP_MEMBER);
    }

    private WordGroupMember(Name alias, Table<WordGroupMemberRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordGroupMember(Name alias, Table<WordGroupMemberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WordGroupMember(Table<O> child, ForeignKey<O, WordGroupMemberRecord> key) {
        super(child, key, WORD_GROUP_MEMBER);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WORD_GROUP_MEMBER_GROUP_ID_IDX, Indexes.WORD_GROUP_MEMBER_WORD_ID_IDX);
    }

    @Override
    public Identity<WordGroupMemberRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORD_GROUP_MEMBER;
    }

    @Override
    public UniqueKey<WordGroupMemberRecord> getPrimaryKey() {
        return Keys.WORD_GROUP_MEMBER_PKEY;
    }

    @Override
    public List<UniqueKey<WordGroupMemberRecord>> getKeys() {
        return Arrays.<UniqueKey<WordGroupMemberRecord>>asList(Keys.WORD_GROUP_MEMBER_PKEY, Keys.WORD_GROUP_MEMBER_WORD_GROUP_ID_WORD_ID_KEY);
    }

    @Override
    public List<ForeignKey<WordGroupMemberRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WordGroupMemberRecord, ?>>asList(Keys.WORD_GROUP_MEMBER__WORD_GROUP_MEMBER_WORD_GROUP_ID_FKEY, Keys.WORD_GROUP_MEMBER__WORD_GROUP_MEMBER_WORD_ID_FKEY);
    }

    public WordGroup wordGroup() {
        return new WordGroup(this, Keys.WORD_GROUP_MEMBER__WORD_GROUP_MEMBER_WORD_GROUP_ID_FKEY);
    }

    public Word word() {
        return new Word(this, Keys.WORD_GROUP_MEMBER__WORD_GROUP_MEMBER_WORD_ID_FKEY);
    }

    @Override
    public WordGroupMember as(String alias) {
        return new WordGroupMember(DSL.name(alias), this);
    }

    @Override
    public WordGroupMember as(Name alias) {
        return new WordGroupMember(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WordGroupMember rename(String name) {
        return new WordGroupMember(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WordGroupMember rename(Name name) {
        return new WordGroupMember(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
