/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.LexColloc;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexCollocRecord extends UpdatableRecordImpl<LexCollocRecord> implements Record9<Long, Long, Long, Long, String, String, BigDecimal, Integer, Integer> {

    private static final long serialVersionUID = 742742559;

    /**
     * Setter for <code>public.lex_colloc.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.lex_colloc.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.lex_colloc.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.lex_colloc.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.lex_colloc.rel_group_id</code>.
     */
    public void setRelGroupId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.lex_colloc.rel_group_id</code>.
     */
    public Long getRelGroupId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.lex_colloc.collocation_id</code>.
     */
    public void setCollocationId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.lex_colloc.collocation_id</code>.
     */
    public Long getCollocationId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.lex_colloc.member_form</code>.
     */
    public void setMemberForm(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.lex_colloc.member_form</code>.
     */
    public String getMemberForm() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.lex_colloc.conjunct</code>.
     */
    public void setConjunct(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.lex_colloc.conjunct</code>.
     */
    public String getConjunct() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.lex_colloc.weight</code>.
     */
    public void setWeight(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.lex_colloc.weight</code>.
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>public.lex_colloc.member_order</code>.
     */
    public void setMemberOrder(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.lex_colloc.member_order</code>.
     */
    public Integer getMemberOrder() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.lex_colloc.group_order</code>.
     */
    public void setGroupOrder(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.lex_colloc.group_order</code>.
     */
    public Integer getGroupOrder() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, String, String, BigDecimal, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, Long, String, String, BigDecimal, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return LexColloc.LEX_COLLOC.ID;
    }

    @Override
    public Field<Long> field2() {
        return LexColloc.LEX_COLLOC.LEXEME_ID;
    }

    @Override
    public Field<Long> field3() {
        return LexColloc.LEX_COLLOC.REL_GROUP_ID;
    }

    @Override
    public Field<Long> field4() {
        return LexColloc.LEX_COLLOC.COLLOCATION_ID;
    }

    @Override
    public Field<String> field5() {
        return LexColloc.LEX_COLLOC.MEMBER_FORM;
    }

    @Override
    public Field<String> field6() {
        return LexColloc.LEX_COLLOC.CONJUNCT;
    }

    @Override
    public Field<BigDecimal> field7() {
        return LexColloc.LEX_COLLOC.WEIGHT;
    }

    @Override
    public Field<Integer> field8() {
        return LexColloc.LEX_COLLOC.MEMBER_ORDER;
    }

    @Override
    public Field<Integer> field9() {
        return LexColloc.LEX_COLLOC.GROUP_ORDER;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getLexemeId();
    }

    @Override
    public Long component3() {
        return getRelGroupId();
    }

    @Override
    public Long component4() {
        return getCollocationId();
    }

    @Override
    public String component5() {
        return getMemberForm();
    }

    @Override
    public String component6() {
        return getConjunct();
    }

    @Override
    public BigDecimal component7() {
        return getWeight();
    }

    @Override
    public Integer component8() {
        return getMemberOrder();
    }

    @Override
    public Integer component9() {
        return getGroupOrder();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getLexemeId();
    }

    @Override
    public Long value3() {
        return getRelGroupId();
    }

    @Override
    public Long value4() {
        return getCollocationId();
    }

    @Override
    public String value5() {
        return getMemberForm();
    }

    @Override
    public String value6() {
        return getConjunct();
    }

    @Override
    public BigDecimal value7() {
        return getWeight();
    }

    @Override
    public Integer value8() {
        return getMemberOrder();
    }

    @Override
    public Integer value9() {
        return getGroupOrder();
    }

    @Override
    public LexCollocRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public LexCollocRecord value2(Long value) {
        setLexemeId(value);
        return this;
    }

    @Override
    public LexCollocRecord value3(Long value) {
        setRelGroupId(value);
        return this;
    }

    @Override
    public LexCollocRecord value4(Long value) {
        setCollocationId(value);
        return this;
    }

    @Override
    public LexCollocRecord value5(String value) {
        setMemberForm(value);
        return this;
    }

    @Override
    public LexCollocRecord value6(String value) {
        setConjunct(value);
        return this;
    }

    @Override
    public LexCollocRecord value7(BigDecimal value) {
        setWeight(value);
        return this;
    }

    @Override
    public LexCollocRecord value8(Integer value) {
        setMemberOrder(value);
        return this;
    }

    @Override
    public LexCollocRecord value9(Integer value) {
        setGroupOrder(value);
        return this;
    }

    @Override
    public LexCollocRecord values(Long value1, Long value2, Long value3, Long value4, String value5, String value6, BigDecimal value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LexCollocRecord
     */
    public LexCollocRecord() {
        super(LexColloc.LEX_COLLOC);
    }

    /**
     * Create a detached, initialised LexCollocRecord
     */
    public LexCollocRecord(Long id, Long lexemeId, Long relGroupId, Long collocationId, String memberForm, String conjunct, BigDecimal weight, Integer memberOrder, Integer groupOrder) {
        super(LexColloc.LEX_COLLOC);

        set(0, id);
        set(1, lexemeId);
        set(2, relGroupId);
        set(3, collocationId);
        set(4, memberForm);
        set(5, conjunct);
        set(6, weight);
        set(7, memberOrder);
        set(8, groupOrder);
    }
}
