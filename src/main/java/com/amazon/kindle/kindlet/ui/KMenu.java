/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A single level pull down menu deployed from the system title bar. This menu
 * is displayed when the user presses the
 * <I>Menu</I>
 * key (see
 *
 * {@link com.amazon.kindle.kindlet.event.KindleKeyCodes#VK_MENU}
 * ).
 *
 * Example Rendering
 *
 * Note: Menus are limited to 10 menu items.  Items added after the 10th
 * item may not be displayed.
 *
 * Serialization of this class is not supported in this version.
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
     * @param item the item to be add
     * @return the menu item
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#insert(java.lang.String, int)},
     * {@link com.amazon.kindle.kindlet.ui.KMenu#insert(com.amazon.kindle.kindlet.ui.KMenuItem, int)}
     */
    public com.amazon.kindle.kindlet.ui.KMenuItem add(com.amazon.kindle.kindlet.ui.KMenuItem item) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a new
     * {@link com.amazon.kindle.kindlet.ui.KMenuItem}
     * with the supplied label and appends it
     * to this menu.
     * @param text the label for the menu item
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#insert(java.lang.String, int)},
     * {@link com.amazon.kindle.kindlet.ui.KMenu#insert(com.amazon.kindle.kindlet.ui.KMenuItem, int)}
     */
    public void add(java.lang.String text) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a listener that will be notified when the menu key is pressed.  All listeners will be
     * processed prior to kindlet menu processing, so listeners may call setMenu to set or
     * clear the menu to be displayed.
     * @param listener listener to add
     */
    public void addMenuListener(com.amazon.kindle.kindlet.ui.KMenuListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Appends a separator to the current menu.  A separator helps visually separate
     * menu items from one another.
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#insertSeparator(int)}
     */
    public void addSeparator() {
        // TODO codavaj!!
        return;
    }

    /**
     * Gets the menu item at the specified index.
     * @param index the position of the item (0-based).
     * @return the menu item located at the index.
     * @throws java.lang.IllegalArgumentException if the index is outside the
     *  permissible bounds
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#add(com.amazon.kindle.kindlet.ui.KMenuItem)},
     * {@link com.amazon.kindle.kindlet.ui.KMenu#getItemCount()}
     */
    public com.amazon.kindle.kindlet.ui.KMenuItem getItem(int index) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the number of menu items currently in this menu.
     * @return the number of items currently in this menu.
     */
    public int getItemCount() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Return an array of registered listeners.
     * @return KMenuListener array of listeners (empty if no registered listeners)
     */
    public com.amazon.kindle.kindlet.ui.KMenuListener[] getMenuListeners() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Insets the supplied menu item into this menu at the supplied index. Other items
     * are shifted up, as necessary.
     * @param item the item to insert.
     * @param index the position to insert.
     * @throws java.lang.IllegalArgumentException if the index is outside of the valid range
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#add(java.lang.String)},
     * {@link com.amazon.kindle.kindlet.ui.KMenu#add(com.amazon.kindle.kindlet.ui.KMenuItem)}
     */
    public void insert(com.amazon.kindle.kindlet.ui.KMenuItem item, int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Creates a new
     * {@link com.amazon.kindle.kindlet.ui.KMenuItem}
     * with the supplied label and inserts it into the menu
     * at the supplied index.
     * @param label the label for the new item
     * @param index the position to insert.
     * @throws java.lang.IllegalArgumentException if the index is outside of the valid range
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#add(java.lang.String)},
     * {@link com.amazon.kindle.kindlet.ui.KMenu#add(com.amazon.kindle.kindlet.ui.KMenuItem)},
     * {@link com.amazon.kindle.kindlet.ui.KMenu#insert(com.amazon.kindle.kindlet.ui.KMenuItem, int)}
     */
    public void insert(java.lang.String label, int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Inserts a separator into the current menu at the supplied position.  A separator helps
     * visually separate menu items from one another.
     * @param index where to insert the separator
     * @throws java.lang.IllegalArgumentException if the index is outside of the valid range.
     * @see {@link com.amazon.kindle.kindlet.ui.KMenu#addSeparator()}
     */
    public void insertSeparator(int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns true if the menu is showing on the screen.  This is slightly different
     * than component visibility and indicates the menu is actively showing.
     * @return true if the menu is showing on the screen
     */
    public boolean isVisible() {
        // TODO codavaj!!
        return false;
    }

    /**
     * Remove the menu item at the supplied index.
     * @param index the index of the item to be removed.
     */
    public void remove(int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Remove a menu item from the menu.
     * @param item the item to remove.  If null or not present, this call is ignored.
     */
    public void remove(com.amazon.kindle.kindlet.ui.KMenuItem item) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes all of the items from this menu.
     */
    public void removeAll() {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes a menu listener.
     * @param listener listener to remove
     */
    public void removeMenuListener(com.amazon.kindle.kindlet.ui.KMenuListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the menu's visibility. This is different than component visibility. If
     * a menu is visible, it is showing to the user. If the visibility did not change
     * this method does nothing.
     * @param display true if the menu should be displayed, false to hide it. If the
     *                 menu is closed in this manner, it is treated like it was canceled.
     */
    public void setVisible(boolean display) {
        // TODO codavaj!!
        return;
    }
}
