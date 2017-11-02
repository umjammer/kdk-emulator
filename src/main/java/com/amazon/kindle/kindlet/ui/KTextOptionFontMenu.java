/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Standard font option menu Serialization of this class is not supported in
 * this version.
 */
public class KTextOptionFontMenu extends com.amazon.kindle.kindlet.ui.KTextOptionMenuSelectable {
    /**
     * Construct a font size change listener. The default Kindle font size and
     * font size array will be used.
     */
    public KTextOptionFontMenu() {
        // TODO codavaj!!
    }

    /**
     * Construct a font size change listener. The default Kindle font size array
     * will be used.
     * 
     * @param selectedFontSize selected font size. This font size is used to set
     *            the initial selected value on the font size selection dialog
     *            when it first appears.
     * @throws IllegalArgumentException if the selectedFontSize is <= 0
     */
    public KTextOptionFontMenu(int selectedFontSize) {
        // TODO codavaj!!
    }

    /**
     * Construct a font size change listener.
     * 
     * @param selectedFontSize selected font size. This font size is used to set
     *            the initial selected value on the font size selection dialog
     *            when it first appears.
     * @param fontSizes the list of available fonts sizes. If null, uses the
     *            Kindle default font size list
     * @throws IllegalArgumentException if the fontSizes array is non-null and
     *             either larger than 6 elements or smaller than 2 elements, or
     *             if the selectedFontSize is <= 0
     */
    public KTextOptionFontMenu(int selectedFontSize, int[] fontSizes) {
        // TODO codavaj!!
    }

    /**
     * Returns an array of user defined font sizes, or null if the system font
     * size array is to be used when displaying the font size menu.
     */
    public int[] getFontSizes() {
        return null; // TODO codavaj!!
    }

    public int getSelectedFontSize() {
        return 0; // TODO codavaj!!
    }

    /**
     * Sets the selected font size
     */
    public void setSelected(int selectedFontSize) {
        return; // TODO codavaj!!
    }
}
