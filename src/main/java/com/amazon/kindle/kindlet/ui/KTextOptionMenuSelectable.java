/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Base class for text option menus that implement ItemSelectable.
 */
public abstract class KTextOptionMenuSelectable implements java.awt.ItemSelectable, com.amazon.kindle.kindlet.ui.KTextOptionMenu {

    public void addItemListener(java.awt.event.ItemListener l) {
        // TODO codavaj!!
        return;
    }

    public java.lang.Object[] getSelectedObjects() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Notifies all registered listeners of a change event.
     * @param e change event
     */
    public void notifyItemStateChanged(com.amazon.kindle.kindlet.ui.KTextOptionEvent e) {
        // TODO codavaj!!
        return;
    }

    public void removeItemListener(java.awt.event.ItemListener l) {
        // TODO codavaj!!
        return;
    }
}
