/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A menu item to be displayed in a menu.
 *
 * When a menu item is selected, an action event is sent to the to the menu item. Any
 * {@link java.awt.event.ActionListener}
 * s
 * registered with the menu item are notified.
 *
 * Serialization of this class is not supported in this version.
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
     * @param l the action listener.  If null the request is ignored.
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#removeActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KMenuItem#getActionListeners()}
     */
    public void addActionListener(java.awt.event.ActionListener l) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the action command sent when this menu it selected. This defaults
     * to the label of the menu item if not set.
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#setActionCommand(java.lang.String)},
     * {@link java.awt.event.ActionEvent}
     */
    public java.lang.String getActionCommand() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Obtain all of the registered action listeners for this menu item.
     * @return all of this menu item's ActionListeners or an empty array if it has no registered listeners
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#addActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KMenuItem#removeActionListener(java.awt.event.ActionListener)}
     */
    public java.awt.event.ActionListener[] getActionListeners() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the font used to render this menu item.
     * @return the font used in this menu component or null (default)
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#setFont(java.awt.Font)}
     */
    public java.awt.Font getFont() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns this menu item's label.
     * @return the label if this is a normal menu item or null if this is a separator
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#setLabel(java.lang.String)},
     * {@link com.amazon.kindle.kindlet.ui.KMenuItem#isSeparator()}
     */
    public java.lang.String getLabel() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns whether or not this item is enabled.  All menu
     * items are enabled by default.
     * @return true if the menu item is enabled, false otherwise
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#setEnabled(boolean)}
     */
    public boolean isEnabled() {
        // TODO codavaj!!
        return false;
    }

    /**
     * Returns true if this menu item is a separator.
     * @return true if item is a separator
     */
    public boolean isSeparator() {
        // TODO codavaj!!
        return false;
    }

    /**
     * Returns an implementation specific string containing this menu item's settings. Do
     * not rely on the format or contents of this string.
     * @return the parameter string of this menu item
     */
    public java.lang.String paramString() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Removes a previously registered listener from this menu item.
     * @param l the action listener.  If null or not registered the
     *   request is ignored.
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#addActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KMenuItem#getActionListeners()}
     */
    public void removeActionListener(java.awt.event.ActionListener l) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the action command sent when this menu item is selected.
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#getActionCommand()},
     * {@link java.awt.event.ActionEvent}
     */
    public void setActionCommand(java.lang.String action) {
        // TODO codavaj!!
        return;
    }

    /**
     * Enables or disables this menu item.  A disable menu item is shown
     * in a distinctive visual style and cannot be selected.
     * @param b enables this item if true, otherwise disables it
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#isEnabled()}
     */
    public void setEnabled(boolean b) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the font used to render this menu item.
     * @param f the font to be set (or null for default)
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#getFont()}
     */
    public void setFont(java.awt.Font f) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets this menu item's label.
     * @param label the new label (null is permitted)
     * @see {@link com.amazon.kindle.kindlet.ui.KMenuItem#getLabel()}
     */
    public void setLabel(java.lang.String label) {
        // TODO codavaj!!
        return;
    }
}
