/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A KPagedContainer which provides internal storage for pages, displays items
 * one per page (by default), and allows easy addition/removal of items in the
 * page.
 * 
 * @see Serialized Form
 */
public class KPages extends com.amazon.kindle.kindlet.ui.KPagedContainer {
    /**
     * Creates a new set of pages. Each item in the page receives a full-page.
     */
    public KPages() {
        super(null, null); // TODO codavaj!!
    }

    /**
     * Creates a new set of pages.
     * 
     * @param pageProvider - the provider of pages
     */
    public KPages(com.amazon.kindle.kindlet.ui.pages.PageProvider pageProvider) {
        super(null, pageProvider); // TODO codavaj!!
    }

    /**
     * Adds a full-page item to this container at the end.
     */
    public void addItem(java.lang.Object item) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a full-page item to this container at the supplied index.
     */
    public void addItem(java.lang.Object item, int index) {
        return; // TODO codavaj!!
    }

    /**
     * Removes all items from this container.
     */
    public void removeAllItems() {
        return; // TODO codavaj!!
    }

    /**
     * Removes an item from this container by index.
     */
    public void removeItem(int index) {
        return; // TODO codavaj!!
    }

    /**
     * Removes an item from this container.
     */
    public void removeItem(java.lang.Object item) {
        return; // TODO codavaj!!
    }

}
