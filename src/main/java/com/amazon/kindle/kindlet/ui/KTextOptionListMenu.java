/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;

/**
 * A text option menu implementation that contains a title and a list of
 * selectable items. Serialization of this class is not supported in this
 * version.
 */
public class KTextOptionListMenu extends com.amazon.kindle.kindlet.ui.KTextOptionMenuSelectable {

    /**
     * Construct an empty menu with the given title
     * 
     * @param title menu title
     */
    public KTextOptionListMenu(java.lang.String title) {
        // TODO codavaj!!
    }

    /**
     * Construct an empty menu with the given title
     * 
     * @param title menu title
     * @param elements array of items to add to the menu. If an item is a
     *            KTextOptionMenuItem it is added, otherwise the item is added
     *            by wrapping with a KTextOptionMenuItem
     * @throws IllegalArgumentException if items array is null or an element of
     *             items is null
     */
    public KTextOptionListMenu(java.lang.String title, java.lang.Object[] elements) {
        // TODO codavaj!!
    }

    /**
     * Adds a KTextOptionMenuItem to the end of the option menu.
     */
    public void add(int index, com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a KTextOptionMenuItem to the end of the option menu.
     */
    public void add(com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        return; // TODO codavaj!!
    }

    /**
     * @return the list of menu items
     */
    public java.util.List get() {
        return null; // TODO codavaj!!
    }

    /**
     * @return the selected menu item
     */
    public com.amazon.kindle.kindlet.ui.KTextOptionMenuItem getSelected() {
        return null; // TODO codavaj!!
    }

    /**
     * @return the selected menu item index
     */
    public int getSelectedIndex() {
        return 0; // TODO codavaj!!
    }

    /**
     * @return menu title
     */
    public java.lang.String getTitle() {
        return null; // TODO codavaj!!
    }

    /**
     * Removes a menu item at the specified index.
     */
    public com.amazon.kindle.kindlet.ui.KTextOptionMenuItem remove(int index) {
        return null; // TODO codavaj!!
    }

    /**
     * Removes a item.
     */
    public boolean remove(com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        return false; // TODO codavaj!!
    }

    /**
     * Sets the KTextOptionMenuItem as the selected selected value
     */
    public void setSelected(com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the KTextOptionMenuItem as the selected selected value
     * 
     * @return the selected menu item index.
     */
    public void setSelectedIndex(int index) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the menu title
     */
    public void setTitle(java.lang.String title) {
        return; // TODO codavaj!!
    }

    /**
     * Returns the number of items in this menu
     */
    public int size() {
        return 0; // TODO codavaj!!
    }
}
