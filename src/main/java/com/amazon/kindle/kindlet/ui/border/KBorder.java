/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.border;

/**
 * Interface for classes that render borders around the edges of a Component. This is inspired
 * from the JavaSE javax.swing.Border interface.
 *
 * Not all components in the Kindle Development Kit support borders. For components that do not support borders, it
 * is possible to create an empty border by overriding
 * {@link java.awt.Container#getInsets()}
 * .
 * @see {@link java.awt.Container#getInsets()},
 * {@link com.amazon.kindle.kindlet.ui.border.KAbstractBorder}
 */
public interface KBorder {

    /**
     * Returns the insets of the border.
     * @param c the component to obtain insets fora
     * @return a new copy of this borders insets for the supplied component
     */
    abstract java.awt.Insets getBorderInsets(java.awt.Component c);

    /**
     * Returns whether or not the border is opaque.
     * If the border is opaque, it is responsible for filling in it's own background
     * when painting.
     * @return true if the component fills its own background when background
     */
    abstract boolean isBorderOpaque();

    /**
     * Paints the border for the supplied component with the specified position and size.
     * @param c the component
     * @param g the graphics to use for painting
     * @param x the x position of the border
     * @param y the y position of the border
     * @param width the width of the border
     * @param height the height of the border
     */
    abstract void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height);
}
