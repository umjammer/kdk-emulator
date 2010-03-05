/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A single level pull down menu deployed from the system title bar. This menu
 * is displayed when the user presses the Menu key (see KindleKeyCodes.VK_MENU).
 * Example Rendering Note: Menus are limited to 10 menu items. Items added after
 * the 10th item may not be displayed. Serialization of this class is not
 * supported in this version.
 */
public class KMenu {
    /**
     * Constructs an empty menu.
     */
    public KMenu() {
        // TODO codavaj!!
    }

    /**
     * Adds a menu item to this menu.
     */
    public com.amazon.kindle.kindlet.ui.KMenuItem add(com.amazon.kindle.kindlet.ui.KMenuItem item) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a new with the supplied label and appends it to this menu.
     */
    public void add(java.lang.String text) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a listener that will be notified when the menu key is pressed. All
     * listeners will be processed prior to kindlet menu processing, so
     * listeners may call setMenu to set or clear the menu to be displayed.
     */
    public void addMenuListener(com.amazon.kindle.kindlet.ui.KMenuListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Appends a separator to the current menu. A separator helps visually
     * separate menu items from one another.
     */
    public void addSeparator() {
        return; // TODO codavaj!!
    }

    /**
     * Gets the menu item at the specified index.
     */
    public com.amazon.kindle.kindlet.ui.KMenuItem getItem(int index) {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the number of menu items currently in this menu.
     */
    public int getItemCount() {
        return 0; // TODO codavaj!!
    }

    /**
     * @return an array of registered listeners.
     */
    public com.amazon.kindle.kindlet.ui.KMenuListener[] getMenuListeners() {
        return null; // TODO codavaj!!
    }

    /**
     * Insets the supplied menu item into this menu at the supplied index. Other
     * items are shifted up, as necessary.
     */
    public void insert(com.amazon.kindle.kindlet.ui.KMenuItem item, int index) {
        return; // TODO codavaj!!
    }

    /**
     * Creates a new with the supplied label and inserts it into the menu at the
     * supplied index.
     */
    public void insert(java.lang.String label, int index) {
        return; // TODO codavaj!!
    }

    /**
     * Inserts a separator into the current menu at the supplied position. A
     * separator helps visually separate menu items from one another.
     */
    public void insertSeparator(int index) {
        return; // TODO codavaj!!
    }

    /**
     * Returns true if the menu is showing on the screen. This is slightly
     * different than component visibility and indicates the menu is actively
     * showing.
     */
    public boolean isVisible() {
        return false; // TODO codavaj!!
    }

    /**
     * Remove the menu item at the supplied index.
     */
    public void remove(int index) {
        return; // TODO codavaj!!
    }

    /**
     * Remove a menu item from the menu.
     */
    public void remove(com.amazon.kindle.kindlet.ui.KMenuItem item) {
        return; // TODO codavaj!!
    }

    /**
     * Removes all of the items from this menu.
     */
    public void removeAll() {
        return; // TODO codavaj!!
    }

    /**
     * Removes a menu listener.
     */
    public void removeMenuListener(com.amazon.kindle.kindlet.ui.KMenuListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the menu's visibility. This is different than component visibility.
     * If a menu is visible, it is showing to the user. If the visibility did
     * not change this method does nothing.
     */
    public void setVisible(boolean display) {
        return; // TODO codavaj!!
    }

}
