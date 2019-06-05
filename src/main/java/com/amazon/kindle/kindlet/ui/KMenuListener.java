/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Interface for receiving events about the state of the menu.  Menus notify this
 * listener before opening and after closing.
 *
 * <I>Note:</I>
 * This event is not in an event package for historical reasons.
 * @see {@link com.amazon.kindle.kindlet.ui.KMenu#addMenuListener(com.amazon.kindle.kindlet.ui.KMenuListener)},
 * <A href="http://java.sun.com/j2se/1.4.2/docs/api/javax/swing/event/MenuListener.html">javax.swing.MenuListener</A>
 */
public interface KMenuListener extends java.util.EventListener {

    /**
     * Called when the menu is hidden by being canceled.
     * @param e a menu event
     */
    abstract void menuCanceled(com.amazon.kindle.kindlet.ui.KMenuEvent e);

    /**
     * Called when the menu is hidden after a selection has been made.
     * @param e a menu event
     */
    abstract void menuDeselected(com.amazon.kindle.kindlet.ui.KMenuEvent e);

    /**
     * Called when the menu is about to be opened.
     * @param e a menu event
     */
    abstract void menuSelected(com.amazon.kindle.kindlet.ui.KMenuEvent e);
}
