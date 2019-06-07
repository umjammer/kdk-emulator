/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Displays a single line text. Labels can be used to display short textual information
 * to the user and are often used to "label" other components that have no label of their
 * own.
 *
 * Java's layout mechanism does not provide a way to compute constrained sizes, so the
 * preferred size of the label attempts to take into account the sizes that might be allocated
 * to its parent. Note that if a label is given exactly the amount of space it requests alignment
 * within that space is meaningless.
 *
 * If the full text of the label will not fit in the size allocated to the label, it will be truncated
 * and an ellipsis added. For instance, the text "Too big for a label" might be shown as "Too big for ...".
 *
 * Serialization of this class is not supported in this version.
 */
public class KLabel extends com.amazon.kindle.kindlet.ui.KTextComponent {

    /**
     * Construct a label with empty text and the default alignment.
     */
    public KLabel() {
    // TODO codavaj!!
    }

    /**
     * Construct a label with the supplied text and default alignment.
     * @param text text to display
     */
    public KLabel(java.lang.String text) {
    // TODO codavaj!!
    }

    /**
     * Construct a label with the supplied text and a specific horizontal
     * alignment.
     * @param text text to display
     * @param horizontalAlignment horizontal alignment of the label within its bounds
     * @throws java.lang.IllegalArgumentException if the horizontal alignment is not valid
     * @see {@link com.amazon.kindle.kindlet.ui.KLabel#setVerticalAlignment(int)}
     */
    public KLabel(java.lang.String text, int horizontalAlignment) {
    // TODO codavaj!!
    }

    /**
     * Method to validate a "horizontalAlignment" property set on this object.
     * @param key The value to validate.
     * @param message The message to set on the IllegalArgumentException thrown
     *                   if key is not valid.
     * @return The value of key as a convenience. This value is not
     *          justified or modified in any way.
     * @throws java.lang.IllegalArgumentException Thrown if key is not a legal
     *          value.
     */
    protected int checkHorizontalKey(int key, java.lang.String message) {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Method to validate a "verticalAlignment" property set on this object.
     * @param key The value to validate.
     * @param message The message to set on the IllegalArgumentException thrown
     *                   if key is not valid.
     * @return The value of key as a convenience. This value is not
     *          justified or modified in any way.
     * @throws java.lang.IllegalArgumentException Thrown if key is not a legal
     *          value.
     */
    protected int checkVerticalKey(int key, java.lang.String message) {
        // TODO codavaj!!
        return 0;
    }

    public float getAlignmentX() {
        // TODO codavaj!!
        return 0.0f;
    }

    public float getAlignmentY() {
        // TODO codavaj!!
        return 0.0f;
    }

    /**
     * Returns the y coordinate of this label's baseline relative to its own
     * coordinate space.
     * @param width This argument is currently ignored although for future
     *                 implementations it may provide additional control over
     *                 baseline query behavior for some languages. Note that to
     *                 maintain parity with the Java 1.6 getBaseline method values
     *                 less then 0 will still cause an IllegalArgumentException
     *                 to be thrown.
     * @param height The height within which to get the baseline. If greater then
     *                 or equal to the text area's size then this will return the
     *                 baseline of the bottom most line in the label (considering
     *                 that some derivations of KLabel may support multiline text).
     *                 If 0 or a value less then the height of at least one line
     *                 of text (see {@link java.awt.FontMetrics#getHeight()}) then this
     *                 method will return 0.
     * @return local y coordinate of the baseline within the text that fits inside
     *                 the supplied height
     * @throws java.lang.IllegalArgumentException if width or height argument is less then zero.
     */
    public int getBaseline(int width, int height) {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the current horizontal alignment value for the text in this component.
     * @return one of {@link com.amazon.kindle.kindlet.ui.KTextComponent#CENTER}, {@link com.amazon.kindle.kindlet.ui.KTextComponent#LEADING}, or
     *          {@link com.amazon.kindle.kindlet.ui.KTextComponent#TRAILING}
     */
    public int getHorizontalAlignment() {
        // TODO codavaj!!
        return 0;
    }

    public java.awt.Dimension getMaximumSize() {
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

    /**
     * Returns the current vertical alignment value for the text in this component.
     * @return one of {@link com.amazon.kindle.kindlet.ui.KTextComponent#CENTER}, {@link com.amazon.kindle.kindlet.ui.KTextComponent#TOP}, or
     *          {@link com.amazon.kindle.kindlet.ui.KTextComponent#BOTTOM}
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
     * KLabel is never editable. This method will always return false.
     * @return false
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

    public void setBackground(java.awt.Color background) {
        // TODO codavaj!!
        return;
    }

    /**
     * KLabel is never editable and setting true via this
     * method has no effect.
     * @param b ignored
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#isEditable()}
     */
    public void setEditable(boolean b) {
        // TODO codavaj!!
        return;
    }

    public void setFont(java.awt.Font font) {
        // TODO codavaj!!
        return;
    }

    public void setForeground(java.awt.Color foreground) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the horizontal alignment for the text in this component.
     * @param alignment one of {@link com.amazon.kindle.kindlet.ui.KTextComponent#CENTER}, {@link com.amazon.kindle.kindlet.ui.KTextComponent#LEADING}, or
     *                    {@link com.amazon.kindle.kindlet.ui.KTextComponent#TRAILING}
     * @throws java.lang.IllegalArgumentException if the alignment argument is not
     *          a valid horizontal alignment value
     */
    public void setHorizontalAlignment(int alignment) {
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
     * Set the vertical alignment for this text component.
     * @param alignment one of {@link com.amazon.kindle.kindlet.ui.KTextComponent#CENTER}, {@link com.amazon.kindle.kindlet.ui.KTextComponent#TOP}, or
     *                    {@link com.amazon.kindle.kindlet.ui.KTextComponent#BOTTOM}
     * @throws java.lang.IllegalArgumentException if the alignment argument is not
     *          a valid vertical alignment value
     */
    public void setVerticalAlignment(int alignment) {
        // TODO codavaj!!
        return;
    }

    public void validateTree() {
        // TODO codavaj!!
        return;
    }
}
