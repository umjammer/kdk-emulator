/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;

/**
 * KTextField permits the editing of a single line of text. KTextField is
 * inspired by java.awt.TextField and javax.swing.JTextField. To provide
 * password-like services a separate class KPasswordField extends KTextField to
 * provide the functionality. Serialization of this class is not supported in
 * this version.
 * 
 * @see Component.addKeyListener(java.awt.event.KeyListener)
 * @see KeyEvent,
 * @see KeyAdapter
 * @see KeyListener
 */
public class KTextField extends com.amazon.kindle.kindlet.ui.KTextComponent {
    /**
     * The number of columns in the text field. A column is an approximate
     * average character width that is platform-dependent. Guaranteed to be
     * non-negative.
     * 
     * @see getColumns()
     */
    protected int m_columns;

    /**
     * Constructs a new empty text field. that is platform-dependent.
     * 
     * @see TextField
     */
    public KTextField() {
        // TODO codavaj!!
    }

    /**
     * Constructs a new empty text field with the specified number of columns. A
     * column is an approximate average character width that is
     * platform-dependent.
     * 
     * @param columns the number of columns. If columns is less than 0, columns
     *            is set to 0
     * @see TextField
     */
    public KTextField(int columns) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new empty text field prefilled with the specified text.
     * 
     * @param text the text to be displayed. If text is null, the empty string
     *            "" will be displayed.
     * @see TextField
     */
    public KTextField(java.lang.String text) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be
     * displayed, and wide enough to hold the specified number of columns. A
     * column is an approximate average character width that is
     * platform-dependent.
     * 
     * @param text the text to be displayed. If text is null, the empty string
     *            "" will be displayed.
     * @param columns the number of columns. If columns is less than 0, an
     *            IllegalArgumentException is thrown.
     * @see TextField
     */
    public KTextField(java.lang.String text, int columns) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be
     * displayed, and wide enough to hold the specified number of columns. A
     * column is an approximate average character width that is
     * platform-dependent. This is made package level so as the KPasswordField
     * can re-use it without re-initializing the peer.
     * 
     * @param text the text to be displayed. If text is null, the empty string
     *            "" will be displayed.
     * @param columns the number of columns. If columns is less than 0 or more
     *            than java.lang.Integer.MAX_VALUE, an
     *            UnsupportedOperationException is thrown.
     * @param hint the text to be displayed when the component is empty. If text
     *            is null, the empty string "" will be displayed.
     * @see TextField
     * @see setColumns(int)
     */
    public KTextField(java.lang.String text, int columns, java.lang.String hint) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be
     * displayed, and wide enough to hold the specified number of columns. A
     * column is an approximate average character width that is
     * platform-dependent. This is protected to allow extension of this
     * Component without re-initializing the peer.
     * 
     * @param text the text to be displayed. If text is null, the empty string
     *            "" will be displayed.
     * @param columns the number of columns. If columns is less than 0 or more
     *            than java.lang.Integer.MAX_VALUE, an
     *            UnsupportedOperationException is thrown.
     * @param hint the text to be displayed when the component is empty. If text
     *            is null, the empty string "" will be displayed.
     * @param isPassword If true then the text field will behave as a password
     *            field.
     * @see TextField
     * @see setColumns(int)
     */
    protected KTextField(java.lang.String text, int columns, java.lang.String hint, boolean isPassword) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new empty text field prefilled with the specified text and
     * an alternate text which gets displayed when the actual text content of
     * this text field is empty.
     * 
     * @param text the text to be displayed. If text is null, the empty string
     *            "" will be displayed.
     * @param hint the text to be displayed when the textual content component
     *            is empty. If hint is null, the empty string "" will be
     *            displayed by default.
     * @see TextField
     */
    public KTextField(java.lang.String text, java.lang.String hint) {
        // TODO codavaj!!
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

    public java.awt.Color getBackground() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the position of the cursor/caret in the text component.
     */
    public int getCaretPosition() {
        return 0; // TODO codavaj!!
    }

    /**
     * Gets the number of columns in this text field.
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

    public java.awt.Dimension getMaximumSize() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMinimumSize() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getPreferredSize() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the text of the Component.
     */
    public java.lang.String getText() {
        return null; // TODO codavaj!!
    }

    public boolean hasFocus() {
        return false; // TODO codavaj!!
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

    public boolean isVisible() {
        return false; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

    public void paintAll(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

    /**
     * Once the component gains focus, the text content will be highlighted to
     * add visual effect on gain focus. If the user has not selected the text
     * explicitly, then upon leaving focus the highlighting will be removed.
     */
    protected void processFocusEvent(java.awt.event.FocusEvent e) {
        return; // TODO codavaj!!
    }

    protected void processKeyEvent(java.awt.event.KeyEvent e) {
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
     * Sets the cursor/caret for the component to the input column of the text.
     */
    public void setCaretPosition(int column) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the number of columns in this text field. This column value is just
     * a recommendation for the of the component to respect that. The
     * component's will calculate the width based on the and its column width.
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
     * editable. This object does not support false values and this method has
     * no effect for it.
     */
    public void setEditable(boolean b) {
        return; // TODO codavaj!!
    }

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
     * Set the text of the Component.
     */
    public void setText(java.lang.String text) {
        return; // TODO codavaj!!
    }

    public void setVisible(boolean value) {
        return; // TODO codavaj!!
    }
}
