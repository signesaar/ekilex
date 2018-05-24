/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexemeRefLinkRecord;

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
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexemeRefLink extends TableImpl<LexemeRefLinkRecord> {

    private static final long serialVersionUID = -607846832;

    /**
     * The reference instance of <code>public.lexeme_ref_link</code>
     */
    public static final LexemeRefLink LEXEME_REF_LINK = new LexemeRefLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexemeRefLinkRecord> getRecordType() {
        return LexemeRefLinkRecord.class;
    }

    /**
     * The column <code>public.lexeme_ref_link.id</code>.
     */
    public final TableField<LexemeRefLinkRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_ref_link_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lexeme_ref_link.lexeme_id</code>.
     */
    public final TableField<LexemeRefLinkRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lexeme_ref_link.ref_type</code>.
     */
    public final TableField<LexemeRefLinkRecord, String> REF_TYPE = createField("ref_type", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.lexeme_ref_link.ref_id</code>.
     */
    public final TableField<LexemeRefLinkRecord, Long> REF_ID = createField("ref_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.lexeme_ref_link.name</code>.
     */
    public final TableField<LexemeRefLinkRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.lexeme_ref_link.value</code>.
     */
    public final TableField<LexemeRefLinkRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.lexeme_ref_link.process_state_code</code>.
     */
    public final TableField<LexemeRefLinkRecord, String> PROCESS_STATE_CODE = createField("process_state_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.lexeme_ref_link.order_by</code>.
     */
    public final TableField<LexemeRefLinkRecord, Long> ORDER_BY = createField("order_by", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lexeme_ref_link_order_by_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.lexeme_ref_link</code> table reference
     */
    public LexemeRefLink() {
        this(DSL.name("lexeme_ref_link"), null);
    }

    /**
     * Create an aliased <code>public.lexeme_ref_link</code> table reference
     */
    public LexemeRefLink(String alias) {
        this(DSL.name(alias), LEXEME_REF_LINK);
    }

    /**
     * Create an aliased <code>public.lexeme_ref_link</code> table reference
     */
    public LexemeRefLink(Name alias) {
        this(alias, LEXEME_REF_LINK);
    }

    private LexemeRefLink(Name alias, Table<LexemeRefLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexemeRefLink(Name alias, Table<LexemeRefLinkRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LEXEME_REF_LINK_LEXEME_ID_IDX, Indexes.LEXEME_REF_LINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexemeRefLinkRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEXEME_REF_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexemeRefLinkRecord> getPrimaryKey() {
        return Keys.LEXEME_REF_LINK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexemeRefLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<LexemeRefLinkRecord>>asList(Keys.LEXEME_REF_LINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexemeRefLinkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexemeRefLinkRecord, ?>>asList(Keys.LEXEME_REF_LINK__LEXEME_REF_LINK_LEXEME_ID_FKEY, Keys.LEXEME_REF_LINK__LEXEME_REF_LINK_PROCESS_STATE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeRefLink as(String alias) {
        return new LexemeRefLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexemeRefLink as(Name alias) {
        return new LexemeRefLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeRefLink rename(String name) {
        return new LexemeRefLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexemeRefLink rename(Name name) {
        return new LexemeRefLink(name, null);
    }
}
