/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.pages;

/**
 * An enhanced Iterator designed to iterate over a series of objects, each with
 * a location. This iterator is very similar in interface to ListIterator but is
 * not mutable and only operates in one direction at a time. Unless specifically
 * guaranteed by the sub-class, implementations of this interface may not be
 * thread safe. See PageModel for a more detailed description of a location.
 * 
 * @see ListIterator
 */
public interface LocationIterator extends java.util.Iterator {

    /**
     * Closes the iteration, indicating that it will not be used again and
     * underlying resources can be released. The effects of using methods on
     * this iterator after it has been closed are undefined by this interface.
     */
    abstract void close();

    /**
     * True if this iterator has a next element. If this returns false, must
     * throw a .
     */
    abstract boolean hasNext();

    /**
     * Indicates if this iterator is progressing forward in the list of items or
     * backwards.
     */
    abstract boolean isForward();

    /**
     * Returns the next element in the iteration and advances the iteration. If
     * this will throw a , must return false.
     */
    abstract java.lang.Object next() throws java.util.NoSuchElementException;

    /**
     * The next location in the valid sequence of locations. If the iterator is
     * operating over a subset of the valid locations, this must still return
     * the next valid location in the complete set of all valid locations. For
     * forward iterators, if the iteration is at the end of the list, or the
     * next iteration location is unknown this method returns Integer.MAX_VALUE.
     * For reverse iterators, if the iteration is at the beginning of the list,
     * or the next iteration location is unknown this method return
     * Integer.MIN_VALUE.
     */
    abstract int nextLocation();

    /**
     * The previous location in the valid sequence of locations. If the iterator
     * is operating over a subset of the valid locations, this must still return
     * the previous valid location in the complete set of all valid locations.
     * For reverse iterators, if the iteration is at the end of the list, or the
     * previous iteration location is unknown this method returns
     * Integer.MAX_VALUE. For forward iterators, if the iteration is at the
     * beginning of the list, or the previous iteration location is unknown this
     * method return Integer.MIN_VALUE.
     */
    abstract int previousLocation();

    /**
     * Mutating the list of elements and locations is not permitted. The
     * contract indicates this is an optional method. This contract guarantees
     * it will throw .
     */
    abstract void remove() throws java.lang.UnsupportedOperationException;
}
