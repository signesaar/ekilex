/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables.records;


import eki.ekilex.data.db.tables.Word;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WordRecord extends UpdatableRecordImpl<WordRecord> implements Record10<Long, String, Integer, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 2087858226;

    /**
     * Setter for <code>public.word.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.word.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.word.lang</code>.
     */
    public void setLang(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.word.lang</code>.
     */
    public String getLang() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.word.homonym_nr</code>.
     */
    public void setHomonymNr(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.word.homonym_nr</code>.
     */
    public Integer getHomonymNr() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.word.word_class</code>.
     */
    public void setWordClass(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.word.word_class</code>.
     */
    public String getWordClass() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.word.display_morph_code</code>.
     */
    public void setDisplayMorphCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.word.display_morph_code</code>.
     */
    public String getDisplayMorphCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.word.gender_code</code>.
     */
    public void setGenderCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.word.gender_code</code>.
     */
    public String getGenderCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.word.aspect_code</code>.
     */
    public void setAspectCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.word.aspect_code</code>.
     */
    public String getAspectCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.word.value</code>.
     */
    public void setValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.word.value</code>.
     */
    public String getValue() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.word.value_prese</code>.
     */
    public void setValuePrese(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.word.value_prese</code>.
     */
    public String getValuePrese() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.word.value_as_word</code>.
     */
    public void setValueAsWord(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.word.value_as_word</code>.
     */
    public String getValueAsWord() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, Integer, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, Integer, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Word.WORD.ID;
    }

    @Override
    public Field<String> field2() {
        return Word.WORD.LANG;
    }

    @Override
    public Field<Integer> field3() {
        return Word.WORD.HOMONYM_NR;
    }

    @Override
    public Field<String> field4() {
        return Word.WORD.WORD_CLASS;
    }

    @Override
    public Field<String> field5() {
        return Word.WORD.DISPLAY_MORPH_CODE;
    }

    @Override
    public Field<String> field6() {
        return Word.WORD.GENDER_CODE;
    }

    @Override
    public Field<String> field7() {
        return Word.WORD.ASPECT_CODE;
    }

    @Override
    public Field<String> field8() {
        return Word.WORD.VALUE;
    }

    @Override
    public Field<String> field9() {
        return Word.WORD.VALUE_PRESE;
    }

    @Override
    public Field<String> field10() {
        return Word.WORD.VALUE_AS_WORD;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getLang();
    }

    @Override
    public Integer component3() {
        return getHomonymNr();
    }

    @Override
    public String component4() {
        return getWordClass();
    }

    @Override
    public String component5() {
        return getDisplayMorphCode();
    }

    @Override
    public String component6() {
        return getGenderCode();
    }

    @Override
    public String component7() {
        return getAspectCode();
    }

    @Override
    public String component8() {
        return getValue();
    }

    @Override
    public String component9() {
        return getValuePrese();
    }

    @Override
    public String component10() {
        return getValueAsWord();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getLang();
    }

    @Override
    public Integer value3() {
        return getHomonymNr();
    }

    @Override
    public String value4() {
        return getWordClass();
    }

    @Override
    public String value5() {
        return getDisplayMorphCode();
    }

    @Override
    public String value6() {
        return getGenderCode();
    }

    @Override
    public String value7() {
        return getAspectCode();
    }

    @Override
    public String value8() {
        return getValue();
    }

    @Override
    public String value9() {
        return getValuePrese();
    }

    @Override
    public String value10() {
        return getValueAsWord();
    }

    @Override
    public WordRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public WordRecord value2(String value) {
        setLang(value);
        return this;
    }

    @Override
    public WordRecord value3(Integer value) {
        setHomonymNr(value);
        return this;
    }

    @Override
    public WordRecord value4(String value) {
        setWordClass(value);
        return this;
    }

    @Override
    public WordRecord value5(String value) {
        setDisplayMorphCode(value);
        return this;
    }

    @Override
    public WordRecord value6(String value) {
        setGenderCode(value);
        return this;
    }

    @Override
    public WordRecord value7(String value) {
        setAspectCode(value);
        return this;
    }

    @Override
    public WordRecord value8(String value) {
        setValue(value);
        return this;
    }

    @Override
    public WordRecord value9(String value) {
        setValuePrese(value);
        return this;
    }

    @Override
    public WordRecord value10(String value) {
        setValueAsWord(value);
        return this;
    }

    @Override
    public WordRecord values(Long value1, String value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WordRecord
     */
    public WordRecord() {
        super(Word.WORD);
    }

    /**
     * Create a detached, initialised WordRecord
     */
    public WordRecord(Long id, String lang, Integer homonymNr, String wordClass, String displayMorphCode, String genderCode, String aspectCode, String value, String valuePrese, String valueAsWord) {
        super(Word.WORD);

        set(0, id);
        set(1, lang);
        set(2, homonymNr);
        set(3, wordClass);
        set(4, displayMorphCode);
        set(5, genderCode);
        set(6, aspectCode);
        set(7, value);
        set(8, valuePrese);
        set(9, valueAsWord);
    }
}
