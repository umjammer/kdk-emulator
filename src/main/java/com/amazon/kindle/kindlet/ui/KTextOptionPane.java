/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Option dialog invoked by the text button. Use the add() methods to add menus
 * to the text option menu. Serialization of this class is not supported in this
 * version.
 */
public class KTextOptionPane {
    public KTextOptionPane() {
        // TODO codavaj!!
    }

    /**
     * Adds a font size menu to the the text option.
     */
    public void addFontSizeMenu(int index, com.amazon.kindle.kindlet.ui.KTextOptionFontMenu menu) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a font size menu to the bottom of the text option.
     */
    public void addFontSizeMenu(com.amazon.kindle.kindlet.ui.KTextOptionFontMenu menu) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a user configurable list menu to text option
     */
    public void addListMenu(int index, com.amazon.kindle.kindlet.ui.KTextOptionListMenu menu) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a user configurable list menu to the bottom of the text option.
     */
    public void addListMenu(com.amazon.kindle.kindlet.ui.KTextOptionListMenu menu) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a orientation menu to the bottom of the text option.
     */
    public void addOrientationMenu(int index, com.amazon.kindle.kindlet.ui.KTextOptionOrientationMenu menu) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a orientation menu to the bottom of the text option.
     */
    public void addOrientationMenu(com.amazon.kindle.kindlet.ui.KTextOptionOrientationMenu menu) {
        return; // TODO codavaj!!
    }

    /**
     * Returns a list of KTextOptionListMenu objects.
     */
    public java.util.List get() {
        return null; // TODO codavaj!!
    }

    /**
     * Removes a menu at the specified index.
     */
    public com.amazon.kindle.kindlet.ui.KTextOptionMenu remove(int index) {
        return null; // TODO codavaj!!
    }

    /**
     * Removes a menu.
     */
    public boolean remove(com.amazon.kindle.kindlet.ui.KTextOptionListMenu menu) {
        return false; // TODO codavaj!!
    }

    /**
     * Returns the number of elements in this option pane
     */
    public int size() {
        return 0; // TODO codavaj!!
    }
}
