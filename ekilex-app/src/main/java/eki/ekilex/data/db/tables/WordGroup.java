/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.WordGroupRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class WordGroup extends TableImpl<WordGroupRecord> {

    private static final long serialVersionUID = 2067692983;

    /**
     * The reference instance of <code>public.word_group</code>
     */
    public static final WordGroup WORD_GROUP = new WordGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WordGroupRecord> getRecordType() {
        return WordGroupRecord.class;
    }

    /**
     * The column <code>public.word_group.id</code>.
     */
    public final TableField<WordGroupRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('word_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.word_group.word_rel_type_code</code>.
     */
    public final TableField<WordGroupRecord, String> WORD_REL_TYPE_CODE = createField(DSL.name("word_rel_type_code"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.word_group</code> table reference
     */
    public WordGroup() {
        this(DSL.name("word_group"), null);
    }

    /**
     * Create an aliased <code>public.word_group</code> table reference
     */
    public WordGroup(String alias) {
        this(DSL.name(alias), WORD_GROUP);
    }

    /**
     * Create an aliased <code>public.word_group</code> table reference
     */
    public WordGroup(Name alias) {
        this(alias, WORD_GROUP);
    }

    private WordGroup(Name alias, Table<WordGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private WordGroup(Name alias, Table<WordGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WordGroup(Table<O> child, ForeignKey<O, WordGroupRecord> key) {
        super(child, key, WORD_GROUP);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<WordGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_WORD_GROUP;
    }

    @Override
    public UniqueKey<WordGroupRecord> getPrimaryKey() {
        return Keys.WORD_GROUP_PKEY;
    }

    @Override
    public List<UniqueKey<WordGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<WordGroupRecord>>asList(Keys.WORD_GROUP_PKEY);
    }

    @Override
    public List<ForeignKey<WordGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WordGroupRecord, ?>>asList(Keys.WORD_GROUP__WORD_GROUP_WORD_REL_TYPE_CODE_FKEY);
    }

    public WordRelType wordRelType() {
        return new WordRelType(this, Keys.WORD_GROUP__WORD_GROUP_WORD_REL_TYPE_CODE_FKEY);
    }

    @Override
    public WordGroup as(String alias) {
        return new WordGroup(DSL.name(alias), this);
    }

    @Override
    public WordGroup as(Name alias) {
        return new WordGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WordGroup rename(String name) {
        return new WordGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WordGroup rename(Name name) {
        return new WordGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
