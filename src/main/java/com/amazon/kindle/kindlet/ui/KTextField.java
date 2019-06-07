/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * KTextField permits the editing of a single line of text.
 *
 * KTextField is inspired by java.awt.TextField and javax.swing.JTextField.
 *
 * To provide password-like services a separate class KPasswordField extends KTextField to provide the
 * functionality.
 *
 * Serialization of this class is not supported in this version.
 */
public class KTextField extends com.amazon.kindle.kindlet.ui.KTextComponent {

    /**
     * The number of columns in the text field. A column is an approximate average character width that is platform-dependent.
     * Guaranteed to be non-negative.
     * @see {@link com.amazon.kindle.kindlet.ui.KTextField#getColumns()}
     */
    protected int m_columns;

    /**
     * Constructs a new empty text field. that is platform-dependent.
     * @see {@link java.awt.TextField}
     */
    public KTextField() {
    // TODO codavaj!!
    }

    /**
     * Constructs a new empty text field with the specified number of columns. A column is an approximate average character width
     * that is platform-dependent.
     * @param columns the number of columns. If columns is less than 0, columns is set to 0
     *
     *             .
     * @see {@link java.awt.TextField}
     */
    public KTextField(int columns) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new empty text field prefilled with the specified text.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed. .
     * @see {@link java.awt.TextField}
     */
    public KTextField(java.lang.String text) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be displayed, and wide enough to hold the specified number
     * of columns. A column is an approximate average character width that is platform-dependent.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param columns the number of columns. If columns is less than 0, an IllegalArgumentException
     *              is thrown.
     * @see {@link java.awt.TextField}
     */
    public KTextField(java.lang.String text, int columns) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be displayed, and wide enough to hold the specified number
     * of columns. A column is an approximate average character width that is platform-dependent.
     *
     * This is made package level so as the KPasswordField can re-use it without re-initializing the peer.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param columns the number of columns. If columns is less than 0 or more than
     *             java.lang.Integer.MAX_VALUE, an UnsupportedOperationException
     *              is thrown.
     * @param hint the text to be displayed when the component is empty. If text is null, the empty string "" will be displayed.
     * @see {@link java.awt.TextField},
     * {@link com.amazon.kindle.kindlet.ui.KTextField#setColumns(int)}
     */
    public KTextField(java.lang.String text, int columns, java.lang.String hint) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be displayed, and wide enough to hold the specified number
     * of columns. A column is an approximate average character width that is platform-dependent.
     *
     * This is protected to allow extension of this Component without re-initializing the peer.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param columns the number of columns. If columns is less than 0 or more than
     *             java.lang.Integer.MAX_VALUE, an UnsupportedOperationException
     *              is thrown.
     * @param hint the text to be displayed when the component is empty. If text is null, the empty string "" will be displayed.
     * @param isPassword If true then the text field will behave as a password field.
     * @see {@link java.awt.TextField},
     * {@link com.amazon.kindle.kindlet.ui.KTextField#setColumns(int)}
     */
    protected KTextField(java.lang.String text, int columns, java.lang.String hint, boolean isPassword) {
    // TODO codavaj!!
    }

    /**
     * Constructs a new empty text field prefilled with the specified text and an alternate text which gets displayed when the
     * actual text content of this text field is empty.
     * @param text the text to be displayed. If text is null, the empty string "" will be displayed.
     * @param hint the text to be displayed when the textual content component is empty. If hint is null, the empty
     *             string "" will be displayed by default.
     * @see {@link java.awt.TextField}
     */
    public KTextField(java.lang.String text, java.lang.String hint) {
    // TODO codavaj!!
    }

    /**
     * Paints the component's border.
     *
     * If you override this in a subclass you should not make permanent changes to the passed in Graphics. For example,
     * you should not alter the clip Rectangle or modify the transform. If you need to do these operations you may find
     * it easier to create a new Graphics from the passed in Graphics and manipulate it.
     * @param g the Graphics context in which to paint
     * @see {@link com.amazon.kindle.kindlet.ui.KTextField#paint(java.awt.Graphics)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#setBorder(com.amazon.kindle.kindlet.ui.border.KBorder)}
     */
    protected void drawBorder(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    public java.awt.Color getBackground() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the position of the cursor/caret in the text component.
     * @return column integer value
     */
    public int getCaretPosition() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Gets the number of columns in this text field.
     * @return the number of columns.
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

    public java.awt.Dimension getMaximumSize() {
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
     * Returns the text of the Component.
     * @return the Components text. null is not
     *          returned. "no text" set on the Component will cause
     *          the empty String "" to be returned.
     */
    public java.lang.String getText() {
        // TODO codavaj!!
        return null;
    }

    public boolean hasFocus() {
        // TODO codavaj!!
        return false;
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

    public boolean isVisible() {
        // TODO codavaj!!
        return false;
    }

    public void paint(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    public void paintAll(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    /**
     * Once the component gains focus, the text content will be highlighted to
     * add visual effect on gain focus. If the user has not selected the text
     * explicitly, then upon leaving focus the highlighting will be removed.
     */
    protected void processFocusEvent(java.awt.event.FocusEvent e) {
        // TODO codavaj!!
        return;
    }

    protected void processKeyEvent(java.awt.event.KeyEvent e) {
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
     * Sets the cursor/caret for the component to the input column of the text.
     * @param column integer value. If it is less than 0 or the cursor value is more than the length of the string, throws an
     *             IllegalArgumentException.
     */
    public void setCaretPosition(int column) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the number of columns in this text field. This column value is just a recommendation for the
     *
     * {@link com.amazon.kindle.kindlet.ui.KTextField#getMaximumSize()}
     * of the component to respect that. The component's
     * {@link com.amazon.kindle.kindlet.ui.KTextField#getPreferredSize()}
     * will calculate
     * the width based on the
     * {@link com.amazon.kindle.kindlet.ui.KTextField#getText()}
     * and its column width.
     * @param columns the number of columns.
     * @throws java.lang.UnsupportedOperationException if the value supplied for columns is less than 0 or more than
     *              java.lang.Integer.MAX_VALUE.
     * @see {@link java.awt.TextField#getColumns}
     */
    public void setColumns(int columns) {
        // TODO codavaj!!
        return;
    }

    /**
     * Deprecated.
     * <I>Use {@link com.amazon.kindle.kindlet.ui.KTextField#setCaretPosition(int)} instead.</I>
     */
    public void setCursor(java.awt.Cursor cur) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the boolean to indicate whether or not this KTextArea should be editable.
     *
     * This object does not support false values and this method
     * has no effect for it.
     * @param b the boolean to be set
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#isEditable()}
     */
    public void setEditable(boolean b) {
        // TODO codavaj!!
        return;
    }

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
     * @param hint sets this string when the text component does not have any visible text.
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
     * Set the text of the Component.
     * @param text to display in the Component. null is
     *             converted into "".
     */
    public void setText(java.lang.String text) {
        // TODO codavaj!!
        return;
    }

    public void setVisible(boolean value) {
        // TODO codavaj!!
        return;
    }
}
