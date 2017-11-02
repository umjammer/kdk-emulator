/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A KTextArea object is a multi-line region that displays text. It can be set
 * to allow editing or to be read-only. Serialization of this class is not
 * supported in this version.
 * 
 * @see KTextField, Serialized Form
 */
public class KTextArea extends com.amazon.kindle.kindlet.ui.KTextComponent {
    /**
     * Constructs a new empty text Area. that is platform-dependent.
     * 
     * @see TextArea
     */
    public KTextArea() {
        // TODO codavaj!!
    }

    /**
     * Constructs a new empty TextArea with the specified number of rows and
     * columns with the initial string is null.
     * 
     * @param rows - the number of rows >= 0columns - the number of columns >= 0
     *            Throws: IllegalArgumentException - if the rows or columns
     *            arguments are negative.
     */
    public KTextArea(int rows, int columns) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be
     * displayed.
     * 
     * @param text - the text to be displayed. If text is null, the empty string
     *            "" will be displayed.See Also:TextArea
     */
    public KTextArea(java.lang.String text) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be
     * displayed.
     * 
     * @param text - the text to be displayed. If text is null, the empty string
     *            "" will be displayed.rows - the number of rows >= 0columns -
     *            the number of columns >= 0 Throws: IllegalArgumentException -
     *            if the rows or columns arguments are negative.See
     *            Also:TextArea
     */
    public KTextArea(java.lang.String text, int rows, int columns) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be
     * displayed.
     * 
     * @param text - the text to be displayed. If text is null, the empty string
     *            "" will be displayed.hint - the text to be displayed when the
     *            component is empty. If text is null, the empty string "" will
     *            be displayed.See Also:TextArea
     */
    public KTextArea(java.lang.String text, java.lang.String hint) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be
     * displayed.
     * 
     * @param text - the text to be displayed. If text is null, the empty string
     *            "" will be displayed.hint - the text to be displayed when the
     *            component is empty. If text is null, the empty string "" will
     *            be displayed.rows - the number of rows >= 0columns - the
     *            number of columns >= 0 Throws: IllegalArgumentException - if
     *            the rows or columns arguments are negative.See Also:TextArea
     */
    public KTextArea(java.lang.String text, java.lang.String hint, int rows, int columns) {
        // TODO codavaj!!
    }

    /**
     * Append the given text at the current caret position for this text area
     * component.
     */
    public void append(java.lang.String text) {
        return; // TODO codavaj!!
    }

    /**
     * Paints the component's border. If you override this in a subclass you
     * should not make permanent changes to the passed in Graphics. For example,
     * you should not alter the clip Rectangle or modify the transform. If you
     * need to do these operations you may find it easier to create a new
     * Graphics from the passed in Graphics and manipulate it.
     */
    protected void drawBorder(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

    public int getAlignment() {
        return 0; // TODO codavaj!!
    }

    public java.awt.Color getBackground() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the position of the caret for the text component.
     */
    public int getCaretPosition() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the number of columns in this text area.
     */
    public int getColumns() {
        return 0; // TODO codavaj!!
    }

    public java.awt.Font getFont() {
        return null; // TODO codavaj!!
    }

    public java.awt.Color getForeground() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns that are the distance in pixels between the inside of a border
     * and the outside of the interior text.
     */
    public java.awt.Insets getMargin() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMinimumSize() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getPreferredSize() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the number of rows in the text area.
     */
    public int getRows() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the text of the Component.
     */
    public java.lang.String getText() {
        return null; // TODO codavaj!!
    }

    public int getVerticalAlignment() {
        return 0; // TODO codavaj!!
    }

    public void invalidate() {
        return; // TODO codavaj!!
    }

    /**
     * Returns the boolean indicating whether this KTextArea is editable or not.
     */
    public boolean isEditable() {
        return false; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

    protected void processComponentEvent(java.awt.event.ComponentEvent e) {
        return; // TODO codavaj!!
    }

    protected void processFocusEvent(java.awt.event.FocusEvent e) {
        return; // TODO codavaj!!
    }

    protected void processKeyEvent(java.awt.event.KeyEvent e) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the horizontal alignment of the text for this component.
     */
    public void setAlignment(int alignment) {
        return; // TODO codavaj!!
    }

    public void setBackground(java.awt.Color color) {
        return; // TODO codavaj!!
    }

    public void setBounds(int x, int y, int width, int height) {
        return; // TODO codavaj!!
    }

    public void setBounds(java.awt.Rectangle rect) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the cursor for the component to the input column of the text.
     */
    public void setCaretPosition(int position) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the number of columns in this text area.
     */
    public void setColumns(int columns) {
        return; // TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setCursor(java.awt.Cursor cur) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the boolean to indicate whether or not this KTextArea should be
     * editable.
     */
    public void setEditable(boolean b) {
        return; // TODO codavaj!!
    }

    /**
     * The expected font is set when the text component is not editable or
     * anti-alias check is enabled else it finds a corresponding cannoical font
     * name for the the expected font's family, font style and font size.
     */
    public void setFont(java.awt.Font f) {
        return; // TODO codavaj!!
    }

    public void setForeground(java.awt.Color color) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the hint text for the component. If non-null, the hint get displays
     * only if there is no visible text in the component.
     */
    public void setHint(java.lang.String hint) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the width in pixels between the inside of a border and the outside
     * of interior text.
     */
    public void setMargin(java.awt.Insets insets) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the number of rows for this text area.
     */
    public void setRows(int rows) {
        return; // TODO codavaj!!
    }

    /**
     * Set whether the indicators should be drawn if there are more text than
     * those that are shown in the area. If set to true, the left and right
     * margin will be adjusted to allow enough room to draw the indicators.
     */
    public void setShowMoreTextIndicators(boolean showMoreTextIndicators) {
        return; // TODO codavaj!!
    }

    /**
     * Set the text of the Component.
     */
    public void setText(java.lang.String text) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the vertical alignment of the text for this component.
     */
    public void setVerticalAlignment(int alignment) {
        return; // TODO codavaj!!
    }

    public void setVisible(boolean value) {
        return; // TODO codavaj!!
    }

}
