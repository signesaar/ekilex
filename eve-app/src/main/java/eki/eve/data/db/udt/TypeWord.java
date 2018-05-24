/*
 * This file is generated by jOOQ.
*/
package eki.eve.data.db.udt;


import eki.eve.data.db.Public;
import eki.eve.data.db.udt.records.TypeWordRecord;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;


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
public class TypeWord extends UDTImpl<TypeWordRecord> {

    private static final long serialVersionUID = -152988830;

    /**
     * The reference instance of <code>public.type_word</code>
     */
    public static final TypeWord TYPE_WORD = new TypeWord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeWordRecord> getRecordType() {
        return TypeWordRecord.class;
    }

    /**
     * The attribute <code>public.type_word.value</code>.
     */
    public static final UDTField<TypeWordRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, TYPE_WORD, "");

    /**
     * The attribute <code>public.type_word.lang</code>.
     */
    public static final UDTField<TypeWordRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3), TYPE_WORD, "");

    /**
     * No further instances allowed
     */
    private TypeWord() {
        super("type_word", null, null, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }
}
