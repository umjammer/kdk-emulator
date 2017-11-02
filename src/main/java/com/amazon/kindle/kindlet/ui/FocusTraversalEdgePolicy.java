/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Typesafe enumeration of possible types of actions a FocusTraversalPolicy may
 * take when it reaches the "beginning" or "end" of a traversal chain.
 */
public final class FocusTraversalEdgePolicy {
    /**
     * FocusTraversalPolicy will stop when the end of a traversal chain has been
     * reached. For instance, if going "forward" in a container order based
     * traversal policy the "next" key will not cause a focus change if the
     * focus owner is the last Component in said Container.
     */
    public static final com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy EDGE_POLICY_HALT = null;

    /**
     * FocusTraversalPolicy will "up-cycle" when the end of a traversal chain
     * has been reached. For instance, if going "forward" in a container order
     * based traversal policy the "next" key will cause the next ancestor focus
     * root to gain control from the current FocusCycleRoot.
     */
    public static final com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy EDGE_POLICY_UPCYCLE = null;

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
