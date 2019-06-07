/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A KTextArea object is a multi-line region that displays text. It can be set to allow editing or to be read-only.
 *
 * Serialization of this class is not supported in this version.
 */
public class KTextArea extends com.amazon.kindle.kindlet.ui.KTextComponent {

    /**
     * Constructs a new empty text Area. that is platform-dependent.
     * @see {@link java.awt.TextArea}
     */
    public KTextArea() {
    // TODO codavaj!!
    }

    /**
     * Constructs a new empty TextArea with the specified number of rows and columns with the initial string is null.
     * @param rows the number of rows &gt;= 0
     * @param columns the number of columns &gt;= 0
     * @throws java.lang.IllegalArgumentException if the rows or columns arguments are negative.
     */
    public KTextArea(int rows, int columns) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be displayed.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @see {@link java.awt.TextArea}
     */
    public KTextArea(java.lang.String text) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be displayed.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param rows the number of rows &gt;= 0
     * @param columns the number of columns &gt;= 0
     * @throws java.lang.IllegalArgumentException if the rows or columns arguments are negative.
     * @see {@link java.awt.TextArea}
     */
    public KTextArea(java.lang.String text, int rows, int columns) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be displayed.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param hint the text to be displayed when the component is empty. If text is null, the empty string "" will be displayed.
     * @see {@link java.awt.TextArea}
     */
    public KTextArea(java.lang.String text, java.lang.String hint) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text area initialized with the specified text to be displayed.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param hint the text to be displayed when the component is empty. If text is null, the empty string "" will be displayed.
     * @param rows the number of rows &gt;= 0
     * @param columns the number of columns &gt;= 0
     * @throws java.lang.IllegalArgumentException if the rows or columns arguments are negative.
     * @see {@link java.awt.TextArea}
     */
    public KTextArea(java.lang.String text, java.lang.String hint, int rows, int columns) {
    // TODO codavaj!!
    }

    /**
     * Append the given text at the current caret position for this text area component.
     * @param text input text to be appended at the current caret position.
     */
    public void append(java.lang.String text) {
        // TODO codavaj!!
        return;
    }

    /**
     * Paints the component's border.
     *
     * If you override this in a subclass you should not make permanent changes to the passed in Graphics. For example,
     * you should not alter the clip Rectangle or modify the transform. If you need to do these operations you may find
     * it easier to create a new Graphics from the passed in Graphics and manipulate it.
     * @param g the Graphics context in which to paint
     * @see {@link com.amazon.kindle.kindlet.ui.KTextArea#paint(java.awt.Graphics)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#setBorder(com.amazon.kindle.kindlet.ui.border.KBorder)}
     */
    protected void drawBorder(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    /**
     * @return Returns the horizontal alignment of the text.
     */
    public int getAlignment() {
        // TODO codavaj!!
        return 0;
    }

    public java.awt.Color getBackground() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the position of the caret for the text component.
     * @return the position of the text caret for the text component. This value will be &gt;= 0.
     */
    public int getCaretPosition() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the number of columns in this text area.
     * @return the number of columns in the text area
     * @see {@link com.amazon.kindle.kindlet.ui.KTextArea#setColumns(int)},
     * {@link com.amazon.kindle.kindlet.ui.KTextArea#getRows()}
     */
    public int getColumns() {
        // TODO codavaj!!
        return 0;
    }

    public java.awt.Font getFont() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Color getForeground() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns
     * {@link java.awt.Insets}
     * that are the distance in pixels between the inside
     * of a border and the outside of the interior text.
     * @return Width of margins for this text component or null if
     *          no margins have been set for this component.
     */
    public java.awt.Insets getMargin() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMinimumSize() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getPreferredSize() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the number of rows in the text area.
     * @return the number of rows in the text area
     * @see {@link com.amazon.kindle.kindlet.ui.KTextArea#setRows(int)},
     * {@link com.amazon.kindle.kindlet.ui.KTextArea#getColumns()}
     */
    public int getRows() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the text of the Component.
     * @return the Components text. null is not
     *          returned. "no text" set on the Component will cause
     *          the empty String "" to be returned.
     */
    public java.lang.String getText() {
        // TODO codavaj!!
        return null;
    }

    /**
     * @return Returns the vertical alignment.
     */
    public int getVerticalAlignment() {
        // TODO codavaj!!
        return 0;
    }

    public void invalidate() {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the boolean indicating whether this KTextArea is editable or not.
     * @return the boolean value
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#setEditable(boolean)}
     */
    public boolean isEditable() {
        // TODO codavaj!!
        return false;
    }

    public void paint(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    protected void processComponentEvent(java.awt.event.ComponentEvent e) {
        // TODO codavaj!!
        return;
    }

    protected void processFocusEvent(java.awt.event.FocusEvent e) {
        // TODO codavaj!!
        return;
    }

    protected void processKeyEvent(java.awt.event.KeyEvent e) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the horizontal alignment of the text for this component.
     * @param alignment The alignment to set.
     */
    public void setAlignment(int alignment) {
        // TODO codavaj!!
        return;
    }

    public void setBackground(java.awt.Color color) {
        // TODO codavaj!!
        return;
    }

    public void setBounds(int x, int y, int width, int height) {
        // TODO codavaj!!
        return;
    }

    public void setBounds(java.awt.Rectangle rect) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the cursor for the component to the input column of the text.
     * @param position integer value. If it is less than 0 or the cursor value is more than the length of the string, throws an
     *             IllegalArgumentException.
     */
    public void setCaretPosition(int position) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the number of columns in this text area.
     * @param columns the number of columns.
     * @throws java.lang.IllegalArgumentException if the value supplied for columns is less than 0.
     * @see {@link com.amazon.kindle.kindlet.ui.KTextArea#getColumns()},
     * {@link java.awt.TextArea#getColumns}
     */
    public void setColumns(int columns) {
        // TODO codavaj!!
        return;
    }

    /**
     * Deprecated.
     * <I>Use {@link com.amazon.kindle.kindlet.ui.KTextArea#setCaretPosition(int)} instead.</I>
     */
    public void setCursor(java.awt.Cursor cur) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the boolean to indicate whether or not this KTextArea should be editable.
     * @param b the boolean to be set
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#isEditable()}
     */
    public void setEditable(boolean b) {
        // TODO codavaj!!
        return;
    }

    /**
     * The expected font is set when the text component is not editable or anti-alias check is enabled else it finds a corresponding
     * cannoical font name for the the expected font's family, font style and font size.
     */
    public void setFont(java.awt.Font f) {
        // TODO codavaj!!
        return;
    }

    public void setForeground(java.awt.Color color) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the hint text for the component. If non-null, the hint get displays only if there is no visible text in the component.
     * @param hint text to be displayed when there is no visible text in this component.
     */
    public void setHint(java.lang.String hint) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the width in pixels between the inside of a border and the outside
     * of interior text.
     * @param insets The margins for the text component.
     */
    public void setMargin(java.awt.Insets insets) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the number of rows for this text area.
     * @param rows the number of rows
     * @throws java.lang.IllegalArgumentException if the value supplied for rows is less than 0
     * @see {@link com.amazon.kindle.kindlet.ui.KTextArea#getRows()},
     * {@link java.awt.TextArea#getRows}
     */
    public void setRows(int rows) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set whether the indicators should be drawn if there are more text than those that are shown in the area. If set to true, the
     * left and right margin will be adjusted to allow enough room to draw the indicators.
     * @param showMoreTextIndicators boolean set indicators when there is more text than the allocated area in the component.
     */
    public void setShowMoreTextIndicators(boolean showMoreTextIndicators) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the text of the Component.
     * @param text to display in the Component. null is
     *             converted into "".
     */
    public void setText(java.lang.String text) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the vertical alignment of the text for this component.
     * @param alignment The alignment to set.
     */
    public void setVerticalAlignment(int alignment) {
        // TODO codavaj!!
        return;
    }

    public void setVisible(boolean value) {
        // TODO codavaj!!
        return;
    }
}
