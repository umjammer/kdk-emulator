/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.border;

/**
 * An empty border that is transparent and draws nothing. The insets of the border
 * can be specified at the construction time.
 */
public class KEmptyBorder extends com.amazon.kindle.kindlet.ui.border.KAbstractBorder {

    /**
     * The border inset from the bottom.
     */
    protected int m_bottom;

    /**
     * The border inset from the left.
     */
    protected int m_left;

    /**
     * The border inset from the right.
     */
    protected int m_right;

    /**
     * The border inset from the top.
     */
    protected int m_top;

    /**
     * Creates an empty border with no size.
     */
    public KEmptyBorder() {
    // TODO codavaj!!
    }

    /**
     * Creates an empty border with the requested insets.
     * @param borderInsets the border's insets
     */
    public KEmptyBorder(java.awt.Insets borderInsets) {
    // TODO codavaj!!
    }

    /**
     * Creates an empty border with the requested insets.
     * @param top the top inset
     * @param left the left inset
     * @param bottom the bottom inset
     * @param right the right inset
     */
    public KEmptyBorder(int top, int left, int bottom, int right) {
    // TODO codavaj!!
    }

    /**
     * Returns this border's insets.
     * @return this border's insets
     */
    public java.awt.Insets getBorderInsets() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns all zero insets.
     * @param c the component to obtain insets for
     * @return a new copy of this borders insets for the supplied component
     */
    public java.awt.Insets getBorderInsets(java.awt.Component c) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Updates an existing instance of Insets with the border insets.
     * After executing the value of insets should be equal to
     * the result of
     * {@link com.amazon.kindle.kindlet.ui.border.KAbstractBorder#getBorderInsets(java.awt.Component)}
     * .
     * @param c the component to obtain insets for
     * @param insets the insets object to fill with the current insets
     * @return the updated insets
     */
    public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Paint nothing.
     * @param c the component
     * @param g the graphics to use for painting
     * @param x the x position of the border
     * @param y the y position of the border
     * @param width the width of the border
     * @param height the height of the border
     */
    public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
        // TODO codavaj!!
        return;
    }
}
