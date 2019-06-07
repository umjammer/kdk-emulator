/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Option dialog invoked by the text button.  Use the add()
 * methods to add menus to the text option menu.
 *
 * Serialization of this class is not supported in this version.
 */
public class KTextOptionPane {

    public KTextOptionPane() {
    // TODO codavaj!!
    }

    /**
     * Adds a font size menu to the the text option.
     * @param index index at which the specified element is to be inserted
     * @param menu menu to add
     * @throws java.lang.IllegalArgumentException if menu is null
     * @throws java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt; size()).
     */
    public void addFontSizeMenu(int index, com.amazon.kindle.kindlet.ui.KTextOptionFontMenu menu) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a font size menu to the bottom of the text option.
     * @param menu menu to add
     * @throws java.lang.IllegalArgumentException if menu is null
     */
    public void addFontSizeMenu(com.amazon.kindle.kindlet.ui.KTextOptionFontMenu menu) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a user configurable list menu to text option
     * @param index index at which the specified element is to be inserted
     * @param menu menu to add
     * @throws java.lang.IllegalArgumentException if menu is null
     * @throws java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt; size())
     */
    public void addListMenu(int index, com.amazon.kindle.kindlet.ui.KTextOptionListMenu menu) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a user configurable list menu to the bottom of the text option.
     * @param menu menu to add
     * @throws java.lang.IllegalArgumentException if menu is null
     */
    public void addListMenu(com.amazon.kindle.kindlet.ui.KTextOptionListMenu menu) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a orientation menu to the bottom of the text option.
     * @param index index at which the specified element is to be inserted
     * @param menu menu to add
     * @throws java.lang.IllegalArgumentException if menu is null
     * @throws java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt; size()).
     */
    public void addOrientationMenu(int index, com.amazon.kindle.kindlet.ui.KTextOptionOrientationMenu menu) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a orientation menu to the bottom of the text option.
     * @param menu menu to add
     * @throws java.lang.IllegalArgumentException if menu is null
     */
    public void addOrientationMenu(com.amazon.kindle.kindlet.ui.KTextOptionOrientationMenu menu) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns a list of KTextOptionListMenu objects.
     * @return option menus
     */
    public java.util.List get() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Removes a menu at the specified index.
     * @param index index of menu to remove
     * @return menu object removed
     * @throws java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt; size()).
     */
    public com.amazon.kindle.kindlet.ui.KTextOptionMenu remove(int index) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Removes a menu.
     * @param menu menu to remove
     * @return true if the menu was removed
     */
    public boolean remove(com.amazon.kindle.kindlet.ui.KTextOptionListMenu menu) {
        // TODO codavaj!!
        return false;
    }

    /**
     * Returns the number of elements in this option pane
     * @return the number of elements in this option pane
     */
    public int size() {
        // TODO codavaj!!
        return 0;
    }
}
