/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * An enhanced
 * {@link java.util.Iterator}
 * designed to iterate over a series of objects, each
 * with a location.  This iterator is very similar in interface to ListIterator
 * but is not mutable and only operates in one direction at a time.
 *
 * Unless specifically guaranteed by the sub-class, implementations of this interface
 * may not be thread safe.
 *
 * See
 * {@link com.amazon.kindle.kindlet.ui.pages.PageModel}
 * for a more detailed description of a location.
 * @see {@link java.util.ListIterator}
 */
public interface LocationIterator extends java.util.Iterator {

    /**
     * Closes the iteration, indicating that it will not be used again and underlying
     * resources can be released.  The effects of using methods on this iterator after
     * it has been closed are undefined by this interface.
     */
    abstract void close();

    /**
     * True if this iterator has a next element.
     * If this returns false,
     * {@link com.amazon.kindle.kindlet.ui.pages.LocationIterator#next()}
     * must
     * throw a
     * {@link java.util.NoSuchElementException}
     * .
     * @return true if there is a next element, false if not
     */
    abstract boolean hasNext();

    /**
     * Indicates if this iterator is progressing forward in the list of
     * items or backwards.
     * @return true if the iterator is forward, false if not
     */
    abstract boolean isForward();

    /**
     * Returns the next element in the iteration and advances the iteration.  If
     * this will throw a
     * {@link java.util.NoSuchElementException}
     * ,
     * {@link com.amazon.kindle.kindlet.ui.pages.LocationIterator#hasNext()}
     * must
     * return false.
     * @return the next element in the iteration
     * @throws java.util.NoSuchElementException if no more elements exist in the iteration
     */
    abstract java.lang.Object next() throws java.util.NoSuchElementException;

    /**
     * The next location in the valid sequence of locations.  If the iterator is operating
     * over a subset of the valid locations, this must still return the next valid location in the
     * complete set of all valid locations.
     *
     * For forward iterators, if the iteration is at the end of the list, or the next
     * iteration location is unknown this method returns
     * {@link java.lang.Integer#MAX_VALUE}
     * .  For
     * reverse iterators, if the iteration is at the beginning of the list, or the next
     * iteration location is unknown this method return
     * {@link java.lang.Integer#MIN_VALUE}
     * .
     * @return the location of the next element, or {@link java.lang.Integer#MAX_VALUE} / {@link java.lang.Integer#MIN_VALUE}
     */
    abstract int nextLocation();

    /**
     * The previous location in the valid sequence of locations.  If the iterator is operating
     * over a subset of the valid locations, this must still return the previous valid location in the
     * complete set of all valid locations.
     *
     * For reverse iterators, if the iteration is at the end of the list, or the previous
     * iteration location is unknown this method returns
     * {@link java.lang.Integer#MAX_VALUE}
     * .  For
     * forward iterators, if the iteration is at the beginning of the list, or the previous
     * iteration location is unknown this method return
     * {@link java.lang.Integer#MIN_VALUE}
     * .
     * @return the location of the previous element, or {@link java.lang.Integer#MAX_VALUE} / {@link java.lang.Integer#MIN_VALUE}
     */
    abstract int previousLocation();

    /**
     * Mutating the list of elements and locations is not permitted.  The
     * {@link java.util.Iterator}
     * contract indicates this is an optional method.  This contract guarantees it will
     * throw
     * {@link java.lang.UnsupportedOperationException}
     * .
     * @throws java.lang.UnsupportedOperationException always
     */
    abstract void remove() throws java.lang.UnsupportedOperationException;
}
