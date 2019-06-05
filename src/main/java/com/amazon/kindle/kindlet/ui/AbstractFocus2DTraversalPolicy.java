/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Common implementation usable by most implementations of Focus2DTraversalPolicy.
 */
public abstract class AbstractFocus2DTraversalPolicy extends com.amazon.kindle.kindlet.ui.Focus2DTraversalPolicy {

    /**
     * Constant for the down direction.
     */
    protected static final int TRAVERSE_DOWN = 1;

    /**
     * Constant for traversing from the first component.
     */
    protected static final int TRAVERSE_FIRST = 4;

    /**
     * Constant for traversing from the last component.
     */
    protected static final int TRAVERSE_LAST = 5;

    /**
     * Constant for the left direction.
     */
    protected static final int TRAVERSE_LEFT = 2;

    /**
     * Maximum reserved integer for these traversal constants.
     */
    protected static final int TRAVERSE_MAX = 5;

    /**
     * Constant for the right direction.
     */
    protected static final int TRAVERSE_RIGHT = 3;

    /**
     * Constant for the up direction.
     */
    protected static final int TRAVERSE_UP = 0;

    public AbstractFocus2DTraversalPolicy() {
    // TODO codavaj!!
    }

    /**
     * Determines if the component is acceptable to receive the focus.
     * @param component the component to be checked
     * @return true if its acceptable, false otherwise
     */
    protected boolean accept(java.awt.Component component) {
        // TODO codavaj!!
        return false;
    }

    /**
     * Add a Container to this instance that will not be
     * given focus control when performing an implicit up-cycle.
     * @param exclusion The Container to prevent from becoming
     *                       the current focus cycle root when performing an implicit
     *                       up-cycle. Duplicate calls with this reference are
     *                       discarded quietly.
     * @exception java.lang.IllegalArgumentException if the exclusion argument is
     *          null.
     */
    public final void addImplicitUpCycleExclusion(java.awt.Container exclusion) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the supplied component, unless it is a focus cycle root, in which
     * case it returns the default component for the cycle.
     * @param component A component to check
     * @return The component argument, or its default component if
     *          it is a focus cycle root
     */
    protected java.awt.Component downCycleIfNecessary(java.awt.Component component, int direction) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the current "at edge" policy in effect for this traversal policy
     * instance. By default, this class performs implicit up-cycles (i.e.
     * {@link com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy#EDGE_POLICY_UPCYCLE}
     * ).
     * See
     * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversalPolicy#setEdgePolicy(com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy)}
     * for more details.
     * @return FocusTraversalEdgePolicy in effect for this instance.
     */
    public com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy getEdgePolicy() {
        // TODO codavaj!!
        return null;
    }

    /**
     * By default, down cycle traversals are implicit.  See
     *
     * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversalPolicy#setImplicitDownCycleTraversal(boolean)}
     * for more details.
     * @return true if an implicit down cycle is executed when a focus cycle root would
     *          receive the focus.
     */
    public boolean getImplicitDownCycleTraversal() {
        // TODO codavaj!!
        return false;
    }

    /**
     * Returns an array of Container references currently excluded
     * from consideration when performing implicit up-cycling.
     * @return Copy/Snapshot of the internally held collection of Containers that
     *          will not be considered when performing an implicit up-cycle.
     */
    public final java.awt.Container[] getImplicitUpCycleExclusions() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Remove a Container exclusion previously added to this
     * instance by a call to
     * {@link com.amazon.kindle.kindlet.ui.AbstractFocus2DTraversalPolicy#addImplicitUpCycleExclusion(java.awt.Container)}
     * .
     * @param exclusion The container to again consider when performing implicit
     *                       up-cycles. If this reference was not previously added
     *                       the call will have no effect.
     */
    public final void removeImplicitUpCycleExclusion(java.awt.Container exclusion) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the edge policy for this
     * {@link java.awt.FocusTraversalPolicy}
     * instance. When
     * an edge is reached for
     * {@link com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy#EDGE_POLICY_UPCYCLE}
     * the policy looks to the next, valid focus cycle root ancestor and, if found,
     * transfers control to one of it's children based on the current direction
     * of focus navigation.
     * @param edgePolicy The edge policy to set for this instance.
     */
    public void setEdgePolicy(com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy edgePolicy) {
        // TODO codavaj!!
        return;
    }

    /**
     * When a focus cycle root is encountered, it has the unique property of existing
     * in both its parent cycle and its cycle.  The standard Java focus traversal
     * policies default to automatically entering the child root's focus cycle
     * when it is encountered.
     * @param downCycle true to allow implicit down cycling by this
     *                   policy else false to prevent it.
     */
    public void setImplicitDownCycleTraversal(boolean downCycle) {
        // TODO codavaj!!
        return;
    }

    /**
     * This method will attempt to transfer focus up to an ancestor of the current
     * focusCycleRoot.
     * @param focusCycleRoot The current focus cycle root to try and traverse
     *                           upwards from.
     * @param nextBestChoice The Component reference to return if we don't
     *                           do a upward focus cycle shift.
     * @param direction The current direction of focus navigation.
     * @param basis The object that currently has focus.
     * @return true if the focus was cycled up else false
     */
    protected java.awt.Component upCycleIfNecessary(java.awt.Container focusCycleRoot, java.awt.Component nextBestChoice, int direction, java.awt.Component basis) {
        // TODO codavaj!!
        return null;
    }
}
