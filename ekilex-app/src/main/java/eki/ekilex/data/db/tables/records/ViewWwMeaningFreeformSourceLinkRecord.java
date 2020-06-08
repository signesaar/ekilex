/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.ViewWwMeaningFreeformSourceLink;
import eki.ekilex.data.db.udt.records.TypeSourceLinkRecord;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwMeaningFreeformSourceLinkRecord extends TableRecordImpl<ViewWwMeaningFreeformSourceLinkRecord> implements Record2<Long, TypeSourceLinkRecord[]> {

    private static final long serialVersionUID = -1759992530;

    /**
     * Setter for <code>public.view_ww_meaning_freeform_source_link.meaning_id</code>.
     */
    public void setMeaningId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning_freeform_source_link.meaning_id</code>.
     */
    public Long getMeaningId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.view_ww_meaning_freeform_source_link.source_links</code>.
     */
    public void setSourceLinks(TypeSourceLinkRecord[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.view_ww_meaning_freeform_source_link.source_links</code>.
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
        return ViewWwMeaningFreeformSourceLink.VIEW_WW_MEANING_FREEFORM_SOURCE_LINK.MEANING_ID;
    }

    @Override
    public Field<TypeSourceLinkRecord[]> field2() {
        return ViewWwMeaningFreeformSourceLink.VIEW_WW_MEANING_FREEFORM_SOURCE_LINK.SOURCE_LINKS;
    }

    @Override
    public Long component1() {
        return getMeaningId();
    }

    @Override
    public TypeSourceLinkRecord[] component2() {
        return getSourceLinks();
    }

    @Override
    public Long value1() {
        return getMeaningId();
    }

    @Override
    public TypeSourceLinkRecord[] value2() {
        return getSourceLinks();
    }

    @Override
    public ViewWwMeaningFreeformSourceLinkRecord value1(Long value) {
        setMeaningId(value);
        return this;
    }

    @Override
    public ViewWwMeaningFreeformSourceLinkRecord value2(TypeSourceLinkRecord[] value) {
        setSourceLinks(value);
        return this;
    }

    @Override
    public ViewWwMeaningFreeformSourceLinkRecord values(Long value1, TypeSourceLinkRecord[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewWwMeaningFreeformSourceLinkRecord
     */
    public ViewWwMeaningFreeformSourceLinkRecord() {
        super(ViewWwMeaningFreeformSourceLink.VIEW_WW_MEANING_FREEFORM_SOURCE_LINK);
    }

    /**
     * Create a detached, initialised ViewWwMeaningFreeformSourceLinkRecord
     */
    public ViewWwMeaningFreeformSourceLinkRecord(Long meaningId, TypeSourceLinkRecord[] sourceLinks) {
        super(ViewWwMeaningFreeformSourceLink.VIEW_WW_MEANING_FREEFORM_SOURCE_LINK);

        set(0, meaningId);
        set(1, sourceLinks);
    }
}
