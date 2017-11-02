/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.pages;


/**
 * Adapters for LocationIterator instances over standard collections.
 */
public final class LocationIterators {

    public LocationIterators() {
        // TODO codavaj!!
    }

    /**
     * Creates an iterator over the supplied starting just before the index and
     * moving in the indicated direction. The locations are the natural indices
     * of the list elements. This method does not make a copy of the List.
     * Modifying the list while this iterator is in use may not have the
     * intended consequences. If the underlying List provides fail-fast
     * iterators in the face of concurrent modifications, then this iterator
     * will also be fail fast.
     */
    public static com.amazon.kindle.kindlet.ui.pages.LocationIterator locationIterator(java.util.List list, int index, boolean forward) {
        return null; // TODO codavaj!!
    }
}
