/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Extension to KLabel permitting display of multiple lines of text. For
 * non-editable text this provides faster layout times and a smaller memory
 * footprint when compared to KTextArea. Serialization of this class is not
 * supported in this version.
 * 
 * @see Serialized Form
 */
public class KLabelMultiline extends com.amazon.kindle.kindlet.ui.KLabel {
    /**
     * Constructs a multi-line label with empty text, a LEADING horizontal
     * alignment, and a TOP vertical alignment.
     */
    public KLabelMultiline() {
        // TODO codavaj!!
    }

    /**
     * Constructs a multi-line label with the supplied text, a LEADING
     * horizontal alignment, and a TOP vertical alignment.
     * 
     * @param text - text to display
     */
    public KLabelMultiline(java.lang.String text) {
        // TODO codavaj!!
    }

    /**
     * Constructs a multi-line label with text, the specified horizontal
     * alignment, and a TOP vertical alignment.
     * 
     * @param text - text to displayhorizontalAlignment - horizontal alignment
     *            of the label within its bounds.
     */
    public KLabelMultiline(java.lang.String text, int horizontalAlignment) {
        // TODO codavaj!!
    }

    /**
     * Constructs a multi-line label with text and the specified horizontal and
     * vertical alignments.
     * 
     * @param text - text to displayhorizontalAlignment - horizontal alignment
     *            of the label within its bounds.verticalAlignment - vertical
     *            alignment of the label within its bounds.
     */
    public KLabelMultiline(java.lang.String text, int horizontalAlignment, int verticalAlignment) {
        // TODO codavaj!!
    }

    /**
     * Method to validate a "rows" property set on this object.
     */
    protected int checkRows(int rows, java.lang.String message) {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the number of rows set for this multi-line label.
     */
    public int getRows() {
        return 0; // TODO codavaj!!
    }

    /**
     * Set the maximum number of rows (i.e. lines) this label will allow when
     * laying out multi-line text.
     */
    public void setRows(int rows) {
        return; // TODO codavaj!!
    }

}
