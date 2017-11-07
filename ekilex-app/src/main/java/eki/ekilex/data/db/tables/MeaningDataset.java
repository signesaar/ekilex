/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MeaningDatasetRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeaningDataset extends TableImpl<MeaningDatasetRecord> {

    private static final long serialVersionUID = 595414610;

    /**
     * The reference instance of <code>public.meaning_dataset</code>
     */
    public static final MeaningDataset MEANING_DATASET = new MeaningDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeaningDatasetRecord> getRecordType() {
        return MeaningDatasetRecord.class;
    }

    /**
     * The column <code>public.meaning_dataset.meaning_id</code>.
     */
    public final TableField<MeaningDatasetRecord, Long> MEANING_ID = createField("meaning_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.meaning_dataset.dataset_code</code>.
     */
    public final TableField<MeaningDatasetRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.meaning_dataset</code> table reference
     */
    public MeaningDataset() {
        this(DSL.name("meaning_dataset"), null);
    }

    /**
     * Create an aliased <code>public.meaning_dataset</code> table reference
     */
    public MeaningDataset(String alias) {
        this(DSL.name(alias), MEANING_DATASET);
    }

    /**
     * Create an aliased <code>public.meaning_dataset</code> table reference
     */
    public MeaningDataset(Name alias) {
        this(alias, MEANING_DATASET);
    }

    private MeaningDataset(Name alias, Table<MeaningDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeaningDataset(Name alias, Table<MeaningDatasetRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEANING_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MeaningDatasetRecord> getPrimaryKey() {
        return Keys.MEANING_DATASET_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeaningDatasetRecord>> getKeys() {
        return Arrays.<UniqueKey<MeaningDatasetRecord>>asList(Keys.MEANING_DATASET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MeaningDatasetRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MeaningDatasetRecord, ?>>asList(Keys.MEANING_DATASET__MEANING_DATASET_MEANING_ID_FKEY, Keys.MEANING_DATASET__MEANING_DATASET_DATASET_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningDataset as(String alias) {
        return new MeaningDataset(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningDataset as(Name alias) {
        return new MeaningDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningDataset rename(String name) {
        return new MeaningDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningDataset rename(Name name) {
        return new MeaningDataset(name, null);
    }
}
