/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * A PageModel provides items which should be arranged and displayed in a series of
 * pages.
 *
 * Each item has a logical location represented by an integer number.  The locations must
 * be arranged in a strictly increasing sequence, but may have gaps.  Locations do
 * no correspond to a page itself, though in any possible paging of the items, each
 * page will start at a specific location and end before another location.
 * This allows consistent indexing into the pages in spite of dynamically changing
 * page sizes.
 *
 * PageModel instances are bounded by machine limitations, but otherwise
 * are not limited.  Values can be computed dynamically or cached at the implementor's
 * preference.  Users of the API should not cache data returned by the model, relying
 * on the model to take care of those details.
 *
 * {@link java.lang.Integer#MAX_VALUE}
 * and
 * {@link java.lang.Integer#MIN_VALUE}
 * are not permitted as actual
 * locations and represent the unknown last and first locations.  If later the first
 * or last locations become known, the model should begin to return the known information.
 * As a result, users of these APIs should not cache this information.
 * @see {@link com.amazon.kindle.kindlet.ui.pages.PageModels}
 */
public interface PageModel {

    /**
     * Returns the element at the provided location.  If no element exists at the location
     *
     * {@link java.util.NoSuchElementException}
     * is thrown.
     * @param location a location
     * @return the object at the requested location
     * @exception java.util.NoSuchElementException if the location is invalid
     */
    abstract java.lang.Object getElementAt(int location) throws java.util.NoSuchElementException;

    /**
     * Returns the smallest valid location or
     * {@link java.lang.Integer#MIN_VALUE}
     * if unknown.
     * All locations returned by the model must be greater than or equal to this
     * value.
     *
     * This method is expected to return quickly.
     * @return the first location in this set of pages, or <A href="http://java.sun.com/javame/reference/apis/jsr217/java/lang/Integer.html#MIN_VALUE">Integer.MIN_VALUE</A>
     *    if unknown
     */
    abstract int getFirstLocation();

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
     * @return the initial location or <A href="http://java.sun.com/javame/reference/apis/jsr217/java/lang/Integer.html#MIN_VALUE">Integer.MIN_VALUE</A> if the model is empty
     */
    abstract int getInitialLocation();

    /**
     * Returns the largest valid location or
     * {@link java.lang.Integer#MAX_VALUE}
     * if unknown.
     * All locations returned by the model must be less than or equal to this
     * value.
     *
     * This method is expected to return quickly.
     * @return the last location in this set of pages, or <A href="http://java.sun.com/javame/reference/apis/jsr217/java/lang/Integer.html#MAX_VALUE">Integer.MAX_VALUE</A>
     *    if unknown
     */
    abstract int getLastLocation();

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
    abstract com.amazon.kindle.kindlet.ui.pages.LocationIterator locationIterator(int location, boolean forward);
}
