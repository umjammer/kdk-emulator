/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * Adapters for
 * {@link com.amazon.kindle.kindlet.ui.pages.LocationIterator}
 * instances over standard collections.
 */
public final class LocationIterators {

    public LocationIterators() {
    // TODO codavaj!!
    }

    /**
     * Creates an iterator over the supplied
     * {@link java.util.List}
     * starting just before the index and moving in
     * the indicated direction. The locations are the natural indices of the list elements.
     *
     * This method does not make a copy of the
     * {@link java.util.List}
     * .  Modifying the list while this iterator is in use
     * may not have the intended consequences.  If the underlying List provides fail-fast iterators in the face
     * of concurrent modifications, then this iterator will also be fail fast.
     * @param list the {@link java.util.List} to iterate over
     * @param index the index to start "just before" for a forward iterator, or start "just after" for a reverse
     *    iterator
     * @param forward if true this iterator will advance in increasing value of index, if false it will move
     *    backwards
     * @exception java.lang.IndexOutOfBoundsException if the supplied index is invalid
     */
    public static com.amazon.kindle.kindlet.ui.pages.LocationIterator locationIterator(java.util.List list, int index, boolean forward) {
        // TODO codavaj!!
        return null;
    }
}
