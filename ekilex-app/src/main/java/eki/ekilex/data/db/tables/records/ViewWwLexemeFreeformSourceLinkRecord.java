/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwLexemeFreeformSourceLink;
import eki.ekilex.data.db.udt.records.TypeSourceLinkRecord;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwLexemeFreeformSourceLinkRecord extends TableRecordImpl<ViewWwLexemeFreeformSourceLinkRecord> implements Record2<Long, TypeSourceLinkRecord[]> {

    private static final long serialVersionUID = 1327606542;

    /**
     * Setter for <code>public.view_ww_lexeme_freeform_source_link.lexeme_id</code>.
     */
    public void setLexemeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme_freeform_source_link.lexeme_id</code>.
     */
    public Long getLexemeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_lexeme_freeform_source_link.source_links</code>.
     */
    public void setSourceLinks(TypeSourceLinkRecord[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_lexeme_freeform_source_link.source_links</code>.
     */
    public TypeSourceLinkRecord[] getSourceLinks() {
        return (TypeSourceLinkRecord[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, TypeSourceLinkRecord[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, TypeSourceLinkRecord[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK.LEXEME_ID;
    }

    @Override
    public Field<TypeSourceLinkRecord[]> field2() {
        return ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK.SOURCE_LINKS;
    }

    @Override
    public Long component1() {
        return getLexemeId();
    }

    @Override
    public TypeSourceLinkRecord[] component2() {
        return getSourceLinks();
    }

    @Override
    public Long value1() {
        return getLexemeId();
    }

    @Override
    public TypeSourceLinkRecord[] value2() {
        return getSourceLinks();
    }

    @Override
    public ViewWwLexemeFreeformSourceLinkRecord value1(Long value) {
        setLexemeId(value);
        return this;
    }

    @Override
    public ViewWwLexemeFreeformSourceLinkRecord value2(TypeSourceLinkRecord[] value) {
        setSourceLinks(value);
        return this;
    }

    @Override
    public ViewWwLexemeFreeformSourceLinkRecord values(Long value1, TypeSourceLinkRecord[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwLexemeFreeformSourceLinkRecord
     */
    public ViewWwLexemeFreeformSourceLinkRecord() {
        super(ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK);
    }

    /**
     * Create a detached, initialised ViewWwLexemeFreeformSourceLinkRecord
     */
    public ViewWwLexemeFreeformSourceLinkRecord(Long lexemeId, TypeSourceLinkRecord[] sourceLinks) {
        super(ViewWwLexemeFreeformSourceLink.VIEW_WW_LEXEME_FREEFORM_SOURCE_LINK);

        set(0, lexemeId);
        set(1, sourceLinks);
    }
}
