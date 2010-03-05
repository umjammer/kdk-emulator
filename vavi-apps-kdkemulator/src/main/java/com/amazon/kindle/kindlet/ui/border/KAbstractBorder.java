/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.border;

/**
 * A convenience class for other border implementations to extend. The default
 * border is transparent, has zero size and draws nothing. This is inspired from
 * the JavaSE javax.swing.AbstractBorder class.
 */
public abstract class KAbstractBorder implements com.amazon.kindle.kindlet.ui.border.KBorder {

    public KAbstractBorder() {
        // TODO codavaj!!
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
     * Calls the static with this as the border.
     */
    public java.awt.Rectangle getInteriorRectangle(java.awt.Component c, int x, int y, int width, int height) {
        return null; // TODO codavaj!!
    }

    /**
     * Computes a rectangle representing the drawable area of the component. The
     * border insets are removed from rectangle provided by the integer
     * arguments.
     */
    public static java.awt.Rectangle getInteriorRectangle(java.awt.Component c, com.amazon.kindle.kindlet.ui.border.KBorder b, int x, int y, int width, int height) {
        return null; // TODO codavaj!!
    }

    /**
     * Returns false, though subclasses may change this - the abstract border is
     * always transparent.
     */
    public boolean isBorderOpaque() {
        return false; // TODO codavaj!!
    }

    /**
     * Paint nothing.
     */
    public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
        return; // TODO codavaj!!
    }
}
