/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * Provides helper methods to create
 * {@link com.amazon.kindle.kindlet.ui.pages.PageModels.ListPageModel}
 * instances for common collections.
 */
public final class PageModels {

    public PageModels() {
    // TODO codavaj!!
    }

    /**
     * Creates a new page model backed by the supplied list.  The list is copied, so
     * changes to the supplied list will not be reflected.
     * @param list the list which should be the basis for the paged model
     * @return a model for the supplied list of items
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageModels.ListPageModel getPageModel(java.util.List list) {
        // TODO codavaj!!
        return null;
    }

    /**
     * A
     * {@link com.amazon.kindle.kindlet.ui.pages.PageModel}
     * backed by a mutable list capable of being modified.
     */
    public static class ListPageModel implements com.amazon.kindle.kindlet.ui.pages.PageModel {

        /**
         * Returns the element at the provided location.  If no element exists at the location
         *
         * {@link java.util.NoSuchElementException}
         * is thrown.
         * @param location a location
         * @return the object at the requested location
         * @throws java.util.NoSuchElementException if the location is invalid
         */
        public java.lang.Object getElementAt(int location) throws java.util.NoSuchElementException {
            // TODO codavaj!!
            return null;
        }

        /**
         * Returns the smallest valid location or
         * {@link java.lang.Integer#MIN_VALUE}
         * if unknown.
         * All locations returned by the model must be greater than or equal to this
         * value.
         *
         * This method is expected to return quickly.
         * @return the first location in this set of pages, or {@link java.lang.Integer#MIN_VALUE}
         *    if unknown
         */
        public int getFirstLocation() {
            // TODO codavaj!!
            return 0;
        }

        /**
         * Returns the initial location for this page model.  This should be used as the starting
         * point for iterating over the contents if no other value is set.  The model must
         * return a valid location unless it is empty.
         *
         * It is common for this to the be the same as
         * {@link com.amazon.kindle.kindlet.ui.pages.PageModel#getFirstLocation()}
         * . The first location is
         * the smallest valid location, while the initial location is the logical location to start pagination
         * from.
         *
         * This method is expected to return quickly.
         * @return the initial location or {@link java.lang.Integer#MIN_VALUE} if the model is empty
         */
        public int getInitialLocation() {
            // TODO codavaj!!
            return 0;
        }

        /**
         * Returns the largest valid location or
         * {@link java.lang.Integer#MAX_VALUE}
         * if unknown.
         * All locations returned by the model must be less than or equal to this
         * value.
         *
         * This method is expected to return quickly.
         * @return the last location in this set of pages, or {@link java.lang.Integer#MAX_VALUE}
         *    if unknown
         */
        public int getLastLocation() {
            // TODO codavaj!!
            return 0;
        }

        /**
         * Obtains the list of pages that backs this model.  The list
         * can be modified so that changes are reflected in the model.
         * @return a mutable list which backs this model
         */
        public java.util.List getList() {
            // TODO codavaj!!
            return null;
        }

        /**
         * Returns an iterator over the elements of this model starting just before the
         * provided location (the element at that location should be the first return value
         * from next).  These iterators may logically run forward in the sequence of locations
         * or backward.
         *
         * Invalid locations within the list of elements should behave as if the iterator
         * was "just before" the next in sequence.  For instance, if 0, 1 and 4 are valid locations
         * and 2 was supplied, 4 would be the next location return for a forward iterator or
         * 1 for a backward iterator.  Note that a backward iterator from 1 would have 0 as its
         * next element.
         * @param location the location to start iteration just before
         * @param forward if true the iteration is in the "forward" (ascending) direction, otherwise
         *     it is in the backward direction (descending)
         * @return a non-null iterator from the specified location in the specified direction
         */
        public com.amazon.kindle.kindlet.ui.pages.LocationIterator locationIterator(int location, boolean forward) {
            // TODO codavaj!!
            return null;
        }
    }
}
