/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Interface for receiving events about the state of the menu. Menus notify this
 * listener before opening and after closing. Note: This event is not in an
 * event package for historical reasons.
 * 
 * @see KMenu.addMenuListener(KMenuListener), javax.swing.MenuListener
 */
public interface KMenuListener extends java.util.EventListener {
    /**
     * Called when the menu is hidden by being canceled.
     */
    abstract void menuCanceled(com.amazon.kindle.kindlet.ui.KMenuEvent e);

    /**
     * Called when the menu is hidden after a selection has been made.
     */
    abstract void menuDeselected(com.amazon.kindle.kindlet.ui.KMenuEvent e);

    /**
     * Called when the menu is about to be opened.
     */
    abstract void menuSelected(com.amazon.kindle.kindlet.ui.KMenuEvent e);

}
