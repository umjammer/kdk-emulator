/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;

/**
 * Base class for text option menus that implement ItemSelectable.
 */
public abstract class KTextOptionMenuSelectable implements java.awt.ItemSelectable, com.amazon.kindle.kindlet.ui.KTextOptionMenu {

    public void addItemListener(java.awt.event.ItemListener l) {
        return; // TODO codavaj!!
    }

    public java.lang.Object[] getSelectedObjects() {
        return null; // TODO codavaj!!
    }

    /**
     * Notifies all registered listeners of a change event.
     */
    public void notifyItemStateChanged(com.amazon.kindle.kindlet.ui.KTextOptionEvent e) {
        return; // TODO codavaj!!
    }

    public void removeItemListener(java.awt.event.ItemListener l) {
        return; // TODO codavaj!!
    }
}
