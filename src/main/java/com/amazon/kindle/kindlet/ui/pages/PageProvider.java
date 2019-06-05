/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * A PageProvider is responsible for creating a component which displays
 * a single page of data from a sequence of items. The exact technique for creating the page
 * is entirely up to the specific implementation.
 *
 * A single page provider should not be shared amongst multiple concurrent views -
 * it is permitted to assume that once a new page is requested, the previous page
 * it provided is no longer useful.  For consumers that need to display facing pages
 * or other multi-page situations, use multiple instances of the PageProvider.
 */
public interface PageProvider {

    /**
     * Computes a component representing a page.
     *
     * The iterator is used to obtain data for the page.  This may represent
     * the start of the page (if the iterator is moving forward) or the end
     * of the page (if the iterator is moving backward).
     * This iterator should not be shared.
     * @param source the source data for the page
     * @return a component representing the page. This should never return null.
     */
    abstract java.awt.Component getPage(com.amazon.kindle.kindlet.ui.pages.LocationIterator source);

    /**
     * Obtains the end location for the last page created by
     *
     * {@link com.amazon.kindle.kindlet.ui.pages.PageProvider#getPage(com.amazon.kindle.kindlet.ui.pages.LocationIterator)}
     * .
     * @return the end location of the last page returned
     */
    abstract int getPageEndLocation();

    /**
     * Obtains the start location for the last page created by
     *
     * {@link com.amazon.kindle.kindlet.ui.pages.PageProvider#getPage(com.amazon.kindle.kindlet.ui.pages.LocationIterator)}
     * .
     * @return the start location of the last page returned
     */
    abstract int getPageStartLocation();

    /**
     * Sets the size the page will be given when displayed. This is used by the
     * page provider to determine how to create the page.
     * @param size the size the page is expected to get, not permitted to be null.
     */
    abstract void setPageSize(java.awt.Dimension size);
}
