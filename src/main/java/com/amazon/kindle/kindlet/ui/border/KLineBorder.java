/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.border;


/**
 * A border consisting of a single line of a supplied color. Additionally the
 * border can have rounded corners and a background color.
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
     * 
     * @param thickness - the line width of the border
     */
    public KLineBorder(int thickness) {
        // TODO codavaj!!
    }

    /**
     * Creates a black line border.
     * 
     * @param thickness - the line width of the borderroundedCorners - true if
     *            the corners should be rounded
     */
    public KLineBorder(int thickness, boolean roundedCorners) {
        // TODO codavaj!!
    }

    /**
     * the vertical diameter of the arc at the four corners if it is a rounded
     * border.
     */
    public int getArcHeight() {
        return 0; // TODO codavaj!!
    }

    /**
     * the horizontal diameter of the arc at the four corners if it is a rounded
     * border.
     */
    public int getArcWidth() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the background color of the border.
     */
    public java.awt.Color getBackgroundColor() {
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
     * Returns the foreground color of the border.
     */
    public java.awt.Color getForegroundColor() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the thickness (line width) of the border.
     */
    public int getThickness() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns whether this border renders rounded corners or not.
     */
    public boolean hasRoundedCorners() {
        return false; // TODO codavaj!!
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

    /**
     * the vertical diameter of the arc at the four corners if it is a rounded
     * border.
     */
    public void setArcHeight(int height) {
        return; // TODO codavaj!!
    }

    /**
     * the horizontal diameter of the arc at the four corners if it is a rounded
     * border.
     */
    public void setArcWidth(int width) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the background color of the border.
     */
    public void setBackgroundColor(java.awt.Color color) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the foreground color of the border.
     */
    public void setForegroundColor(java.awt.Color color) {
        return; // TODO codavaj!!
    }
}
