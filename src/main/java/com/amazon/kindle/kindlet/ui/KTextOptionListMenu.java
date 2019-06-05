/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A text option menu implementation that contains a title and  a list of
 * selectable items.
 *
 * Serialization of this class is not supported in this version.
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
     * @param index index of item to add
     * @param item menu item to add
     * @exception java.lang.IllegalArgumentException if item is null
     * @exception java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt; size()).
     */
    public void add(int index, com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a KTextOptionMenuItem to the end of the option menu.
     * @param item menu item to add
     * @exception java.lang.IllegalArgumentException if item is null
     */
    public void add(com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        // TODO codavaj!!
        return;
    }

    /**
     * Return the list of menu items
     */
    public java.util.List get() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Return the selected menu item
     * @return selected menu item
     */
    public com.amazon.kindle.kindlet.ui.KTextOptionMenuItem getSelected() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Return the selected menu item index
     * @return selected menu item index, -1 if no selected set
     */
    public int getSelectedIndex() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Return menu title
     * @return menu title
     */
    public java.lang.String getTitle() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Removes a menu item at the specified index.
     * @param index index of menu to remove
     * @return menu item removed
     * @exception java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt; size()).
     */
    public com.amazon.kindle.kindlet.ui.KTextOptionMenuItem remove(int index) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Removes a item.
     * @param item item to remove
     * @return true if the item was removed
     */
    public boolean remove(com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        // TODO codavaj!!
        return false;
    }

    /**
     * Sets the KTextOptionMenuItem as the selected selected value
     * @param item selected menu item
     * @exception java.lang.IllegalArgumentException if item is null or item is not on the menu
     */
    public void setSelected(com.amazon.kindle.kindlet.ui.KTextOptionMenuItem item) {
        // TODO codavaj!!
        return;
    }

    /**
     * Return the selected menu item index.
     * Sets the KTextOptionMenuItem as the selected selected value
     * @param index index of the selected menu item
     * @exception java.lang.IndexOutOfBoundsException if index is out of range (index &lt; 0 || index &gt;= size()).
     */
    public void setSelectedIndex(int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the menu title
     * @param title menu title
     * @exception java.lang.IllegalArgumentException if title is null
     */
    public void setTitle(java.lang.String title) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the number of items in this menu
     * @return the number of items in this menu
     */
    public int size() {
        // TODO codavaj!!
        return 0;
    }
}
