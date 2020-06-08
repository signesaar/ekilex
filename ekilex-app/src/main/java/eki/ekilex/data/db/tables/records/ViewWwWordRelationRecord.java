/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwWordRelation;
import eki.ekilex.data.db.udt.records.TypeWordRelationRecord;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwWordRelationRecord extends TableRecordImpl<ViewWwWordRelationRecord> implements Record3<Long, TypeWordRelationRecord[], TypeWordRelationRecord[]> {

    private static final long serialVersionUID = 1796691050;

    /**
     * Setter for <code>public.view_ww_word_relation.word_id</code>.
     */
    public void setWordId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_word_relation.word_id</code>.
     */
    public Long getWordId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_word_relation.related_words</code>.
     */
    public void setRelatedWords(TypeWordRelationRecord[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_word_relation.related_words</code>.
     */
    public TypeWordRelationRecord[] getRelatedWords() {
        return (TypeWordRelationRecord[]) get(1);
    }

    /**
     * Setter for <code>public.view_ww_word_relation.word_group_members</code>.
     */
    public void setWordGroupMembers(TypeWordRelationRecord[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.view_ww_word_relation.word_group_members</code>.
     */
    public TypeWordRelationRecord[] getWordGroupMembers() {
        return (TypeWordRelationRecord[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, TypeWordRelationRecord[], TypeWordRelationRecord[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, TypeWordRelationRecord[], TypeWordRelationRecord[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewWwWordRelation.VIEW_WW_WORD_RELATION.WORD_ID;
    }

    @Override
    public Field<TypeWordRelationRecord[]> field2() {
        return ViewWwWordRelation.VIEW_WW_WORD_RELATION.RELATED_WORDS;
    }

    @Override
    public Field<TypeWordRelationRecord[]> field3() {
        return ViewWwWordRelation.VIEW_WW_WORD_RELATION.WORD_GROUP_MEMBERS;
    }

    @Override
    public Long component1() {
        return getWordId();
    }

    @Override
    public TypeWordRelationRecord[] component2() {
        return getRelatedWords();
    }

    @Override
    public TypeWordRelationRecord[] component3() {
        return getWordGroupMembers();
    }

    @Override
    public Long value1() {
        return getWordId();
    }

    @Override
    public TypeWordRelationRecord[] value2() {
        return getRelatedWords();
    }

    @Override
    public TypeWordRelationRecord[] value3() {
        return getWordGroupMembers();
    }

    @Override
    public ViewWwWordRelationRecord value1(Long value) {
        setWordId(value);
        return this;
    }

    @Override
    public ViewWwWordRelationRecord value2(TypeWordRelationRecord[] value) {
        setRelatedWords(value);
        return this;
    }

    @Override
    public ViewWwWordRelationRecord value3(TypeWordRelationRecord[] value) {
        setWordGroupMembers(value);
        return this;
    }

    @Override
    public ViewWwWordRelationRecord values(Long value1, TypeWordRelationRecord[] value2, TypeWordRelationRecord[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwWordRelationRecord
     */
    public ViewWwWordRelationRecord() {
        super(ViewWwWordRelation.VIEW_WW_WORD_RELATION);
    }

    /**
     * Create a detached, initialised ViewWwWordRelationRecord
     */
    public ViewWwWordRelationRecord(Long wordId, TypeWordRelationRecord[] relatedWords, TypeWordRelationRecord[] wordGroupMembers) {
        super(ViewWwWordRelation.VIEW_WW_WORD_RELATION);

        set(0, wordId);
        set(1, relatedWords);
        set(2, wordGroupMembers);
    }
}
