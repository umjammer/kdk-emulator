/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A simple container that uses KBoxLayout to layout its children. This class
 * also provides a number of helper methods to create components of fixed or
 * variable size. Glue components do not want to take up any space, but will
 * expand to fill as much as possible. Struts desire a certain amount of fixed
 * space along a single axis. A rigid area is like a strut in both directions.
 * This class is intended to be API compatible with javax.swing.Box.
 * 
 * @see KBoxLayout, javax.swing.Box, Serialized Form
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
     * Creates a component that expands as necessary along the both axises, but
     * desires no space.
     */
    public static java.awt.Component createGlue() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a box along the horizontal axis.
     */
    public static com.amazon.kindle.kindlet.ui.KBox createHorizontalBox() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a component that expands as necessary along the horizontal axis,
     * but desires no space.
     */
    public static java.awt.Component createHorizontalGlue() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a component of fixed size along the horizontal axis, but expands
     * as necessary along the vertical.
     */
    public static java.awt.Component createHorizontalStrut(int width) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a component that is a fixed size.
     */
    public static java.awt.Component createRigidArea(java.awt.Dimension size) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a box along a vertical axis.
     */
    public static com.amazon.kindle.kindlet.ui.KBox createVerticalBox() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a component that expands as necessary along the vertical axis,
     * but desires no space.
     */
    public static java.awt.Component createVerticalGlue() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a component of fixed size along the vertical axis, but expands as
     * necessary along the horizontal.
     */
    public static java.awt.Component createVerticalStrut(int height) {
        return null; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

    /**
     * KBox does not permit alternate layouts. This method always throws an
     * exception.
     */
    public void setLayout(java.awt.LayoutManager layout) {
        return; // TODO codavaj!!
    }

    /**
     * A helper component which implements a simple component with fixed size
     * requests. The JavaDoc for javax.swing.Box was unclear on if this is
     * invisible space or not. This component draws its background if isOpaque()
     * is true. The opacity can be changed via setOpaque(boolean).
     * 
     * @see Serialized Form
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
            return null; // TODO codavaj!!
        }

        public java.awt.Dimension getMinimumSize() {
            return null; // TODO codavaj!!
        }

        public java.awt.Dimension getPreferredSize() {
            return null; // TODO codavaj!!
        }

        public boolean isOpaque() {
            return false; // TODO codavaj!!
        }

        public void paint(java.awt.Graphics g) {
            return; // TODO codavaj!!
        }

        /**
         * Sets whether this component is opaque or not. An opaque Filler will
         * draw its background. The default is true.
         */
        public void setOpaque(boolean opaque) {
            return; // TODO codavaj!!
        }

    }
}
