/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Event interface for text option events. Serialization of this class is not
 * supported in this version.
 */
public class KTextOptionEvent extends java.awt.event.ItemEvent {
    private boolean isVisit;

    /**
     * Creates a new event indicating that a state change on a given item.
     * 
     * @param source the selectable item that caused the evet
     * @param id integer identifying the type of the event
     * @param item the item effected
     * @param stateChange indicates if the item was ItemEvent.SELECTED or
     *            ItemEvent.DESELECTED
     * @param isVisit set to true for visit events
     */
    public KTextOptionEvent(java.awt.ItemSelectable source, int id, java.lang.Object item, int stateChange, boolean isVisit) {
        super(source, id, item, stateChange);
        this.isVisit = isVisit;
    }

    /**
     * @return true if the event is a visit event, false for a select event. A
     *         visit event occurs when the user navigates to an item. A select
     *         event occurs when the user selects an item using the 5-way
     *         button.
     */
    public boolean isVisit() {
        return isVisit;
    }

}
