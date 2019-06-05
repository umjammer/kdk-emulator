/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A
 * {@link com.amazon.kindle.kindlet.ui.KPagedContainer}
 * which provides internal storage for pages,
 * displays items one per page (by default), and allows easy addition/removal
 * of items in the page.
 */
public class KPages extends com.amazon.kindle.kindlet.ui.KPagedContainer {

    /**
     * Creates a new set of pages. Each item in the page receives a full-page.
     */
    public KPages() {
        // TODO codavaj!!
        super(null, null);
    }

    /**
     * Creates a new set of pages.
     *
     * @param pageProvider - the provider of pages
     */
    public KPages(com.amazon.kindle.kindlet.ui.pages.PageProvider pageProvider) {
        // TODO codavaj!!
        super(null, pageProvider);
    }

    /**
     * Adds a full-page item to this container at the end.
     * @param item the item to add
     */
    public void addItem(java.lang.Object item) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a full-page item to this container at the supplied index.
     * @param item the item to add
     * @param index the index to add the item at
     */
    public void addItem(java.lang.Object item, int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes all items from this container.
     */
    public void removeAllItems() {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes an item from this container by index.
     * @param index the index of the item to remove
     */
    public void removeItem(int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes an item from this container.
     * @param item the item to remove
     */
    public void removeItem(java.lang.Object item) {
        // TODO codavaj!!
        return;
    }
}
