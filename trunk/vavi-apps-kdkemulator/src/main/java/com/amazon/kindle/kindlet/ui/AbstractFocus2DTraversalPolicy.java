/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Common implementation usable by most implementations of
 * Focus2DTraversalPolicy.
 */
public abstract class AbstractFocus2DTraversalPolicy extends com.amazon.kindle.kindlet.ui.Focus2DTraversalPolicy {
    /**
     * Constant for the down direction.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_DOWN = 1;

    /**
     * Constant for traversing from the first component.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_FIRST = 4;

    /**
     * Constant for traversing from the last component.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_LAST = 5;

    /**
     * Constant for the left direction.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_LEFT = 2;

    /**
     * Maximum reserved integer for these traversal constants.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_MAX = 5;

    /**
     * Constant for the right direction.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_RIGHT = 3;

    /**
     * Constant for the up direction.
     * 
     * @see {@value}
     */
    protected static final int TRAVERSE_UP = 0;

    public AbstractFocus2DTraversalPolicy() {
        // TODO codavaj!!
    }

    /**
     * Determines if the component is acceptable to receive the focus.
     */
    protected boolean accept(java.awt.Component component) {
        return false; // TODO codavaj!!
    }

    /**
     * Add a Container to this instance that will not be given focus control
     * when performing an implicit up-cycle.
     */
    public final void addImplicitUpCycleExclusion(java.awt.Container exclusion) {
        return; // TODO codavaj!!
    }

    /**
     * Returns the supplied component, unless it is a focus cycle root, in which
     * case it returns the default component for the cycle.
     */
    protected java.awt.Component downCycleIfNecessary(java.awt.Component component, int direction) {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the current "at edge" policy in effect for this traversal policy
     * instance. By default, this class performs implicit up-cycles (i.e. ). See
     * for more details.
     */
    public com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy getEdgePolicy() {
        return null; // TODO codavaj!!
    }

    /**
     * By default, down cycle traversals are implicit. See for more details.
     */
    public boolean getImplicitDownCycleTraversal() {
        return false; // TODO codavaj!!
    }

    /**
     * Returns an array of Container references currently excluded from
     * consideration when performing implicit up-cycling.
     */
    public final java.awt.Container[] getImplicitUpCycleExclusions() {
        return null; // TODO codavaj!!
    }

    /**
     * Remove a Container exclusion previously added to this instance by a call
     * to .
     */
    public final void removeImplicitUpCycleExclusion(java.awt.Container exclusion) {
        return; // TODO codavaj!!
    }

    /**
     * Set the edge policy for this instance. When an edge is reached for the
     * policy looks to the next, valid focus cycle root ancestor and, if found,
     * transfers control to one of it's children based on the current direction
     * of focus navigation.
     */
    public void setEdgePolicy(com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy edgePolicy) {
        return; // TODO codavaj!!
    }

    /**
     * When a focus cycle root is encountered, it has the unique property of
     * existing in both its parent cycle and its cycle. The standard Java focus
     * traversal policies default to automatically entering the child root's
     * focus cycle when it is encountered.
     */
    public void setImplicitDownCycleTraversal(boolean downCycle) {
        return; // TODO codavaj!!
    }

    /**
     * This method will attempt to transfer focus up to an ancestor of the
     * current focusCycleRoot.
     */
    protected java.awt.Component upCycleIfNecessary(java.awt.Container focusCycleRoot, java.awt.Component nextBestChoice, int direction, java.awt.Component basis) {
        return null; // TODO codavaj!!
    }
}
