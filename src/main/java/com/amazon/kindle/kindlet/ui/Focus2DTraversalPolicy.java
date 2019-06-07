/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A
 * {@link java.awt.FocusTraversalPolicy}
 * capable of supporting two-dimensional focus movement.  This
 * class defines interfaces suitable for use with user interfaces where up, down, left and right
 * are all valid ways to move the focus.  In this policy, getComponentBefore and getComponentAfter
 * are treated as movement along the horizontal axies; getComponentAbove and getComponentBelow are
 * treated as movement along the vertical axis.
 *
 * Components must have special support for 2d traversal, in order for the 2d focus traversal policy
 * to be used.  It is recommended they implement
 * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversable}
 * to ensure they work.
 * If this policy is in use by a container, Components which do not implement Focus2DTraversable
 * will only respond to standard focus keystrokes.  This means that only left-right focus movement will be permitted from those Components.
 */
public abstract class Focus2DTraversalPolicy extends java.awt.FocusTraversalPolicy {

    public Focus2DTraversalPolicy() {
    // TODO codavaj!!
    }

    /**
     * Returns the component that should recieve the focus if the user logically looks above
     * the supplied component.  The supplied focusCycleRoot must be a root for the supplied
     * component.
     * @param focusCycleRoot a focus cycle root of the supplied component
     * @param component a child of the supplied focusCycleRoot or the root itself
     * @return the component to focus, or null if none was found
     * @throws java.lang.IllegalArgumentException if focusCycleRoot is not a root for component, or either
     *  are null
     */
    public abstract java.awt.Component getComponentAbove(java.awt.Container focusCycleRoot, java.awt.Component component);

    /**
     * Returns the component that should receive the focus if the user logically looks below
     * the supplied component.  The supplied focusCycleRoot must be a root for the supplied
     * component.
     * @param focusCycleRoot a focus cycle root of the supplied component
     * @param component a child of the supplied focusCycleRoot or the root itself
     * @return the component to focus, or null if none was found
     * @throws java.lang.IllegalArgumentException if focusCycleRoot is not a root for component, or either
     *  are null
     */
    public abstract java.awt.Component getComponentBelow(java.awt.Container focusCycleRoot, java.awt.Component component);

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
    public abstract com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy getEdgePolicy();

    /**
     * By default, down cycle traversals are implicit.  See
     *
     * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversalPolicy#setImplicitDownCycleTraversal(boolean)}
     * for more details.
     * @return true if an implicit down cycle is executed when a focus cycle root would
     *          receive the focus.
     */
    public abstract boolean getImplicitDownCycleTraversal();

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
     * @throws java.lang.IllegalArgumentException if the edgePolicy value is
     *          not supported.
     */
    public abstract void setEdgePolicy(com.amazon.kindle.kindlet.ui.FocusTraversalEdgePolicy edgePolicy);

    /**
     * When a focus cycle root is encountered, it has the unique property of existing
     * in both its parent cycle and its cycle.  The standard Java focus traversal
     * policies default to automatically entering the child root's focus cycle
     * when it is encountered.
     * @param downCycle true to allow implicit down cycling by this
     *                   policy else false to prevent it.
     */
    public abstract void setImplicitDownCycleTraversal(boolean downCycle);
}
