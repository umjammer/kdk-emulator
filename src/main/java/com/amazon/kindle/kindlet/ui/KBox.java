/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A simple container that uses
 * {@link com.amazon.kindle.kindlet.ui.KBoxLayout}
 * to layout its children.  This class
 * also provides a number of helper methods to create components of fixed or
 * variable size.
 *
 * Glue components do not want to take up any space, but will expand to fill as much as possible. Struts
 * desire a certain amount of fixed space along a single axis. A rigid area is like a strut in both
 * directions.
 *
 * This class is intended to be API compatible with javax.swing.Box.
 */
public class KBox extends com.amazon.kindle.kindlet.ui.KComponent {

    /**
     * Create a new container for components that are aligned along the
     * indicated axis.
     *
     * @param axis - one of the constants from KBoxLayout
     */
    public KBox(int axis) {
    // TODO codavaj!!
    }

    /**
     * Creates a component that expands as necessary along the both axises, but desires no space.
     * @return glue, a filler component
     */
    public static java.awt.Component createGlue() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a box along the horizontal axis.
     * @return a KBox with a horizontal axis.
     */
    public static com.amazon.kindle.kindlet.ui.KBox createHorizontalBox() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a component that expands as necessary along the horizontal axis, but desires no space.
     * @return horizontal glue
     */
    public static java.awt.Component createHorizontalGlue() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a component of fixed size along the horizontal axis, but expands
     * as necessary along the vertical.
     * @param width the component's width
     * @return a horizontal strut of the specified size
     */
    public static java.awt.Component createHorizontalStrut(int width) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a component that is a fixed size.
     * @param size the size of the component
     */
    public static java.awt.Component createRigidArea(java.awt.Dimension size) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a box along a vertical axis.
     * @return a KBox with a vertical axis.
     */
    public static com.amazon.kindle.kindlet.ui.KBox createVerticalBox() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a component that expands as necessary along the vertical axis, but desires no space.
     * @return vertical glue
     */
    public static java.awt.Component createVerticalGlue() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a component of fixed size along the vertical axis, but expands
     * as necessary along the horizontal.
     * @param height the component's height
     * @return a vertical strut of the specified size
     */
    public static java.awt.Component createVerticalStrut(int height) {
        // TODO codavaj!!
        return null;
    }

    public void paint(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    /**
     * KBox does not permit alternate layouts.  This method always throws
     * an exception.
     * @param layout ignored
     * @exception java.awt.AWTError always
     */
    public void setLayout(java.awt.LayoutManager layout) {
        // TODO codavaj!!
        return;
    }

    /**
     * A helper component which implements a simple component with fixed size requests.
     *
     * The JavaDoc for javax.swing.Box was unclear on if this is invisible space or not.
     * This component draws its background if
     * {@link com.amazon.kindle.kindlet.ui.KBox$Filler#isOpaque()}
     * is true.  The opacity can
     * be changed via
     * {@link com.amazon.kindle.kindlet.ui.KBox$Filler#setOpaque(boolean)}
     * .
     */
    public static class Filler extends com.amazon.kindle.kindlet.ui.KComponent {

        /**
         * Creates a filler which advertises the provided sizes.
         *
         * @param minimum - the minimum size for this fillerpreferred - the
         *            preferred size for this fillermaximum - the maximum size
         *            for this filler
         */
        public Filler(java.awt.Dimension minimum, java.awt.Dimension preferred, java.awt.Dimension maximum) {
        // TODO codavaj!!
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

        public boolean isOpaque() {
            // TODO codavaj!!
            return false;
        }

        public void paint(java.awt.Graphics g) {
            // TODO codavaj!!
            return;
        }

        /**
         * Sets whether this component is opaque or not.  An opaque Filler
         * will draw its background.
         *
         * The default is
         * <I>true</I>
         * .
         * @param opaque the new value of opaque for this component
         */
        public void setOpaque(boolean opaque) {
            // TODO codavaj!!
            return;
        }
    }
}
