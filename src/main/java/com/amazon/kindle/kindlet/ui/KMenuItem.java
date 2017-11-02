/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A menu item to be displayed in a menu. When a menu item is selected, an
 * action event is sent to the to the menu item. Any ActionListeners registered
 * with the menu item are notified. Serialization of this class is not supported
 * in this version.
 */
public class KMenuItem {
    /**
     * Creates a new menu item with no label (""). This is not the same as a
     * separator.
     * 
     * @see KMenu.addSeparator()
     */
    public KMenuItem() {
        // TODO codavaj!!
    }

    /**
     * Creates a new menu with the supplied label.
     * 
     * @param label - the label for this menu item
     */
    public KMenuItem(java.lang.String label) {
        // TODO codavaj!!
    }

    /**
     * Adds a listener for selections of this menu item.
     */
    public void addActionListener(java.awt.event.ActionListener l) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the action command sent when this menu it selected. This defaults to
     * the label of the menu item if not set.
     */
    public java.lang.String getActionCommand() {
        return null; // TODO codavaj!!
    }

    /**
     * Obtain all of the registered action listeners for this menu item.
     */
    public java.awt.event.ActionListener[] getActionListeners() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the font used to render this menu item.
     */
    public java.awt.Font getFont() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns this menu item's label.
     */
    public java.lang.String getLabel() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns whether or not this item is enabled. All menu items are enabled
     * by default.
     */
    public boolean isEnabled() {
        return false; // TODO codavaj!!
    }

    /**
     * Returns true if this menu item is a separator.
     */
    public boolean isSeparator() {
        return false; // TODO codavaj!!
    }

    /**
     * Returns an implementation specific string containing this menu item's
     * settings. Do not rely on the format or contents of this string.
     */
    public java.lang.String paramString() {
        return null; // TODO codavaj!!
    }

    /**
     * Removes a previously registered listener from this menu item.
     */
    public void removeActionListener(java.awt.event.ActionListener l) {
        return; // TODO codavaj!!
    }

    /**
     * Returns the action command sent when this menu item is selected.
     */
    public void setActionCommand(java.lang.String action) {
        return; // TODO codavaj!!
    }

    /**
     * Enables or disables this menu item. A disable menu item is shown in a
     * distinctive visual style and cannot be selected.
     */
    public void setEnabled(boolean b) {
        return; // TODO codavaj!!
    }

    /**
     * Set the font used to render this menu item.
     */
    public void setFont(java.awt.Font f) {
        return; // TODO codavaj!!
    }

    /**
     * Sets this menu item's label.
     */
    public void setLabel(java.lang.String label) {
        return; // TODO codavaj!!
    }

}
