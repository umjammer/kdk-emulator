/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.border;

/**
 * A convenience class for other border implementations to extend.
 *
 * The default border is transparent, has zero size and draws nothing.
 *
 * This is inspired from the JavaSE javax.swing.AbstractBorder class.
 */
public abstract class KAbstractBorder implements com.amazon.kindle.kindlet.ui.border.KBorder {

    public KAbstractBorder() {
    // TODO codavaj!!
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
     * Calls the static
     * {@link com.amazon.kindle.kindlet.ui.border.KAbstractBorder#getInteriorRectangle(java.awt.Component, com.amazon.kindle.kindlet.ui.border.KBorder, int, int, int, int)}
     * with
     * this as the border.
     * @param c the component
     * @param x the x location of the border
     * @param y the y location of the border
     * @param width the width of the border
     * @param height the height of the border
     */
    public java.awt.Rectangle getInteriorRectangle(java.awt.Component c, int x, int y, int width, int height) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Computes a rectangle representing the drawable area of the component.  The border insets are
     * removed from rectangle provided by the integer arguments.
     * @param c the component
     * @param b the border
     * @param x the x location of the border
     * @param y the y location of the border
     * @param width the width of the border
     * @param height the height of the border
     */
    public static java.awt.Rectangle getInteriorRectangle(java.awt.Component c, com.amazon.kindle.kindlet.ui.border.KBorder b, int x, int y, int width, int height) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns false, though subclasses may change this - the abstract border is always transparent.
     * @return false
     */
    public boolean isBorderOpaque() {
        // TODO codavaj!!
        return false;
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
