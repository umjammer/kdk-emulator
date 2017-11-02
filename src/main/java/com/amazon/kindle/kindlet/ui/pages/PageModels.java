/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.pages;

/**
 * Provides helper methods to create PageModels.ListPageModel instances for
 * common collections.
 */
public final class PageModels {

    public PageModels() {
        // TODO codavaj!!
    }

    /**
     * Creates a new page model backed by the supplied list. The list is copied,
     * so changes to the supplied list will not be reflected.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageModels.ListPageModel getPageModel(java.util.List list) {
        return null; // TODO codavaj!!
    }

    /**
     * A PageModel backed by a mutable list capable of being modified.
     */
    public static class ListPageModel implements com.amazon.kindle.kindlet.ui.pages.PageModel {
        /**
         * Returns the element at the provided location. If no element exists at
         * the location is thrown.
         */
        public java.lang.Object getElementAt(int location) throws java.util.NoSuchElementException {
            return null; // TODO codavaj!!
        }

        /**
         * Returns the smallest valid location or if unknown. All locations
         * returned by the model must be greater than or equal to this value.
         * This method is expected to return quickly.
         */
        public int getFirstLocation() {
            return 0; // TODO codavaj!!
        }

        /**
         * Returns the initial location for this page model. This should be used
         * as the starting point for iterating over the contents if no other
         * value is set. The model must return a valid location unless it is
         * empty. It is common for this to the be the same as
         * PageModel.getFirstLocation(). The first location is the smallest
         * valid location, while the initial location is the logical location to
         * start pagination from. This method is expected to return quickly.
         */
        public int getInitialLocation() {
            return 0; // TODO codavaj!!
        }

        /**
         * Returns the largest valid location or if unknown. All locations
         * returned by the model must be less than or equal to this value. This
         * method is expected to return quickly.
         */
        public int getLastLocation() {
            return 0; // TODO codavaj!!
        }

        /**
         * Obtains the list of pages that backs this model. The list can be
         * modified so that changes are reflected in the model.
         */
        public java.util.List getList() {
            return null; // TODO codavaj!!
        }

        /**
         * Returns an iterator over the elements of this model starting just
         * before the provided location (the element at that location should be
         * the first return value from next). These iterators may logically run
         * forward in the sequence of locations or backward. Invalid locations
         * within the list of elements should behave as if the iterator was
         * "just before" the next in sequence. For instance, if 0, 1 and 4 are
         * valid locations and 2 was supplied, 4 would be the next location
         * return for a forward iterator or 1 for a backward iterator. Note that
         * a backward iterator from 1 would have 0 as its next element.
         */
        public com.amazon.kindle.kindlet.ui.pages.LocationIterator locationIterator(int location, boolean forward) {
            return null; // TODO codavaj!!
        }
    }
}
