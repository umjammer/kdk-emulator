/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.border;

/**
 * An empty border that is transparent and draws nothing. The insets of the
 * border can be specified at the construction time.
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
     * 
     * @param borderInsets - the border's insets
     */
    public KEmptyBorder(java.awt.Insets borderInsets) {
        // TODO codavaj!!
    }

    /**
     * Creates an empty border with the requested insets.
     * 
     * @param top - the top insetleft - the left insetbottom - the bottom
     *            insetright - the right inset
     */
    public KEmptyBorder(int top, int left, int bottom, int right) {
        // TODO codavaj!!
    }

    /**
     * Returns this border's insets.
     */
    public java.awt.Insets getBorderInsets() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns all zero insets.
     */
    public java.awt.Insets getBorderInsets(java.awt.Component c) {
        return null; // TODO codavaj!!
    }

    /**
     * Updates an existing instance of Insets with the border insets. After
     * executing the value of insets should be equal to the result of .
     */
    public java.awt.Insets getBorderInsets(java.awt.Component c, java.awt.Insets insets) {
        return null; // TODO codavaj!!
    }

    /**
     * Paint nothing.
     */
    public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
        return; // TODO codavaj!!
    }
}
