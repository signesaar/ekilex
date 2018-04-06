/*
 * This file is generated by jOOQ.
*/
package eki.wordweb.data.db;


import eki.wordweb.data.db.tables.MviewWwClassifier;
import eki.wordweb.data.db.tables.MviewWwDataset;
import eki.wordweb.data.db.tables.MviewWwForm;
import eki.wordweb.data.db.tables.MviewWwLexeme;
import eki.wordweb.data.db.tables.MviewWwMeaning;
import eki.wordweb.data.db.tables.MviewWwWord;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.mview_ww_classifier</code>.
     */
    public static final MviewWwClassifier MVIEW_WW_CLASSIFIER = eki.wordweb.data.db.tables.MviewWwClassifier.MVIEW_WW_CLASSIFIER;

    /**
     * The table <code>public.mview_ww_dataset</code>.
     */
    public static final MviewWwDataset MVIEW_WW_DATASET = eki.wordweb.data.db.tables.MviewWwDataset.MVIEW_WW_DATASET;

    /**
     * The table <code>public.mview_ww_form</code>.
     */
    public static final MviewWwForm MVIEW_WW_FORM = eki.wordweb.data.db.tables.MviewWwForm.MVIEW_WW_FORM;

    /**
     * The table <code>public.mview_ww_lexeme</code>.
     */
    public static final MviewWwLexeme MVIEW_WW_LEXEME = eki.wordweb.data.db.tables.MviewWwLexeme.MVIEW_WW_LEXEME;

    /**
     * The table <code>public.mview_ww_meaning</code>.
     */
    public static final MviewWwMeaning MVIEW_WW_MEANING = eki.wordweb.data.db.tables.MviewWwMeaning.MVIEW_WW_MEANING;

    /**
     * The table <code>public.mview_ww_word</code>.
     */
    public static final MviewWwWord MVIEW_WW_WORD = eki.wordweb.data.db.tables.MviewWwWord.MVIEW_WW_WORD;
}
