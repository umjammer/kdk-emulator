/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Typesafe enumeration specifying focus traversal modes that describe how
 * orthogonal alignments between components affect a focus traversal policy's
 * behavior.
 */
public final class FocusTraversalOrthogonalMode {
    /**
     * Focus traversal will prefer orthogonal alignment but will allow for
     * diagonal traversal.
     */
    public static final com.amazon.kindle.kindlet.ui.FocusTraversalOrthogonalMode LOOSE = null;

    /**
     * Focus traversal policy will completely ignore orthogonal alignment
     * between Components.
     */
    public static final com.amazon.kindle.kindlet.ui.FocusTraversalOrthogonalMode OFF = null;

    /**
     * Focus traversal will only occur between components orthogonally aligned
     * with the focused component in the focus cycle root.
     */
    public static final com.amazon.kindle.kindlet.ui.FocusTraversalOrthogonalMode STRICT = null;

    public boolean equals(java.lang.Object right) {
        return false; // TODO codavaj!!
    }

    public int hashCode() {
        return 0; // TODO codavaj!!
    }

    public java.lang.String toString() {
        return null; // TODO codavaj!!
    }

}
