/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Extension to
 * {@link com.amazon.kindle.kindlet.ui.KLabel}
 * permitting display of multiple lines of text.
 *
 * For non-editable text this provides faster layout times and a smaller memory
 * footprint when compared to
 * {@link com.amazon.kindle.kindlet.ui.KTextArea}
 * .
 *
 * Serialization of this class is not supported in this version.
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
     * @param rows The value to validate.
     * @param message The message to set on the IllegalArgumentException thrown
     *                   if rows is not valid.
     * @return the value of rows as a convenience. This value is not
     *          justified or modified in any way.
     * @exception java.lang.IllegalArgumentException thrown if rows is not a legal
     *          value
     */
    protected int checkRows(int rows, java.lang.String message) {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the number of rows set for this multi-line label.
     * @return The number of rows (i.e. lines) set for this label or
     *          <A href="../../../../../com/amazon/kindle/kindlet/ui/KTextComponent.html#SHOW_ALL_LINES">KTextComponent.SHOW_ALL_LINES</A> if the number of rows is
     *          unbounded (the default).
     */
    public int getRows() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Set the maximum number of rows (i.e. lines) this label will allow when
     * laying out multi-line text.
     * @param rows The number of rows to limit this label to or {@link com.amazon.kindle.kindlet.ui.KTextComponent#SHOW_ALL_LINES}
     *               to leave the maximum number of lines unbounded.
     * @exception java.lang.IllegalArgumentException if rows &amp;lte; 0 (and not equal to SHOW_ALL_LINES).
     */
    public void setRows(int rows) {
        // TODO codavaj!!
        return;
    }
}
