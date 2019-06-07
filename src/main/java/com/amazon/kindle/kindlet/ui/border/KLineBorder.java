/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.border;

/**
 * A border consisting of a single line of a supplied color.  Additionally the border
 * can have rounded corners and a background color.
 */
public class KLineBorder extends com.amazon.kindle.kindlet.ui.border.KAbstractBorder {

    /**
     * Arc height for rounded borders. It will be zero for rectangular border.
     */
    protected int m_arcHeight;

    /**
     * Arc width for rounded borders. It will be zero for rectangular border.
     */
    protected int m_arcWidth;

    /**
     * Background color for the border.
     */
    protected java.awt.Color m_bgColor;

    /**
     * Foreground color for the border.
     */
    protected java.awt.Color m_fgColor;

    /**
     * Attribute to indicate if border has rounded corners.
     */
    protected boolean m_roundedCorners;

    /**
     * Thickness of the border.
     */
    protected int m_thickness;

    /**
     * Creates a single pixel wide, black border with rounded corners.
     */
    public KLineBorder() {
    // TODO codavaj!!
    }

    /**
     * Creates a black line border of the specified width, with rounded corners.
     * @param thickness the line width of the border
     */
    public KLineBorder(int thickness) {
    // TODO codavaj!!
    }

    /**
     * Creates a black line border.
     * @param thickness the line width of the border
     * @param roundedCorners true if the corners should be rounded
     */
    public KLineBorder(int thickness, boolean roundedCorners) {
    // TODO codavaj!!
    }

    /**
     * the vertical diameter of the arc at the four corners if it is a rounded border.
     * @return arc height for the rounded borders.
     */
    public int getArcHeight() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * the horizontal diameter of the arc at the four corners if it is a rounded border.
     * @return arc width for the rounded borders.
     */
    public int getArcWidth() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the background color of the border.
     * @return background color for the border.
     */
    public java.awt.Color getBackgroundColor() {
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
     * Returns the foreground color of the border.
     * @return foreground color for the border.
     */
    public java.awt.Color getForegroundColor() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the thickness (line width) of the border.
     * @return the line width of the border
     */
    public int getThickness() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns whether this border renders rounded corners or not.
     * @return true if the corners are round
     */
    public boolean hasRoundedCorners() {
        // TODO codavaj!!
        return false;
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

    /**
     * the vertical diameter of the arc at the four corners if it is a rounded border.
     * @param height the vertical diameter of the arc at the four corners.
     */
    public void setArcHeight(int height) {
        // TODO codavaj!!
        return;
    }

    /**
     * the horizontal diameter of the arc at the four corners if it is a rounded border.
     * @param width the horizontal diameter of the arc at the four corners.
     */
    public void setArcWidth(int width) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the background color of the border.
     * @param color background color for the border
     */
    public void setBackgroundColor(java.awt.Color color) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the foreground color of the border.
     * @param color foreground color for the border
     */
    public void setForegroundColor(java.awt.Color color) {
        // TODO codavaj!!
        return;
    }
}
