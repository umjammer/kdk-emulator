/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Displays a single line text. Labels can be used to display short textual
 * information to the user and are often used to "label" other components that
 * have no label of their own. Java's layout mechanism does not provide a way to
 * compute constrained sizes, so the preferred size of the label attempts to
 * take into account the sizes that might be allocated to its parent. Note that
 * if a label is given exactly the amount of space it requests alignment within
 * that space is meaningless. If the full text of the label will not fit in the
 * size allocated to the label, it will be truncated and an ellipsis added. For
 * instance, the text "Too big for a label" might be shown as "Too big for ...".
 * Serialization of this class is not supported in this version.
 * 
 * @see KTextField, KLabelMultiline, java.awt.Label, javax.swing.JLabel,
 *      Serialized Form
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
     * 
     * @param text - text to display
     */
    public KLabel(java.lang.String text) {
        // TODO codavaj!!
    }

    /**
     * Construct a label with the supplied text and a specific horizontal
     * alignment.
     * 
     * @param text - text to displayhorizontalAlignment - horizontal alignment
     *            of the label within its bounds Throws:
     *            IllegalArgumentException - if the horizontal alignment is not
     *            validSee Also:setVerticalAlignment(int)
     */
    public KLabel(java.lang.String text, int horizontalAlignment) {
        // TODO codavaj!!
    }

    /**
     * Method to validate a "horizontalAlignment" property set on this object.
     */
    protected int checkHorizontalKey(int key, java.lang.String message) {
        return 0; // TODO codavaj!!
    }

    /**
     * Method to validate a "verticalAlignment" property set on this object.
     */
    protected int checkVerticalKey(int key, java.lang.String message) {
        return 0; // TODO codavaj!!
    }

    public float getAlignmentX() {
        return 0.0f; // TODO codavaj!!
    }

    public float getAlignmentY() {
        return 0.0f; // TODO codavaj!!
    }

    /**
     * Returns the y coordinate of this label's baseline relative to its own
     * coordinate space.
     */
    public int getBaseline(int width, int height) {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the current horizontal alignment value for the text in this
     * component.
     */
    public int getHorizontalAlignment() {
        return 0; // TODO codavaj!!
    }

    public java.awt.Dimension getMaximumSize() {
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

    /**
     * Returns the current vertical alignment value for the text in this
     * component.
     */
    public int getVerticalAlignment() {
        return 0; // TODO codavaj!!
    }

    public void invalidate() {
        return; // TODO codavaj!!
    }

    /**
     * KLabel is never editable. This method will always return false.
     */
    public boolean isEditable() {
        return false; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

    public void setBackground(java.awt.Color background) {
        return; // TODO codavaj!!
    }

    /**
     * KLabel is never editable and setting true via this method has no effect.
     */
    public void setEditable(boolean b) {
        return; // TODO codavaj!!
    }

    public void setFont(java.awt.Font font) {
        return; // TODO codavaj!!
    }

    public void setForeground(java.awt.Color foreground) {
        return; // TODO codavaj!!
    }

    /**
     * Set the horizontal alignment for the text in this component.
     */
    public void setHorizontalAlignment(int alignment) {
        return; // TODO codavaj!!
    }

    /**
     * Set the text of the Component.
     */
    public void setText(java.lang.String text) {
        return; // TODO codavaj!!
    }

    /**
     * Set the vertical alignment for this text component.
     */
    public void setVerticalAlignment(int alignment) {
        return; // TODO codavaj!!
    }

    public void validateTree() {
        return; // TODO codavaj!!
    }

}
