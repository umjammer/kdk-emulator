/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Event sent to KMenuListener when a menu is opened (selected) or closed
 * (deselected). The source of this event is the KMenu which changed. Note: This
 * event is not in an event package for historical reasons.
 * 
 * @see {@link #KMenuListener}
 */
public class KMenuEvent extends java.util.EventObject {
    /**
     * Create a menu event for the given menu source.
     * 
     * @param source - menu creating the event
     */
    public KMenuEvent(java.lang.Object source) {
        super(source);
    }

}
