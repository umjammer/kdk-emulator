/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A
 * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversalPolicy}
 * which determines focus motion based on the pixel location of the
 * components within the focus cycle root.  No wrapping occurs at the edges.
 *
 * The default component for this policy is simply the first component.  The first component is the component
 * in the upper-left most position, based on its mid-point.  The last component is the component in the
 * lower-right most position, based on its mid-point.  This behavior may change to be Locale aware in the
 * future.
 *
 * When determining what component to select based on a left, right, up or down input the heursitic determines
 * the candidate as follows:
 *
 * Eliminate the current component from consideration.
 * Test the current focus owner's bounds against all eligible children of the focus cycle root recursively (see the
 * accept method for details on eligibility and the ability of subclasses to modify this decision).
 * If the two components intersect use either a point retrieved from the
 * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversable#getEntryPoint()}
 * or a point which is the midpoint on the side of the component farthest from the focus owner and focus candidate respectively.
 * If the two components do not intersect use either a point retrieved from the
 * {@link com.amazon.kindle.kindlet.ui.Focus2DTraversable#getEntryPoint()}
 * or a point which is the midpoint on the side of the component closest to the focus owner and focus candidate respectively.
 * Determine the best candidate among all of the focus cycle root's child to receive focus favoring intersection, orthogonal alignment,
 * and tangental alignment respectively. Within the best of the three "alignment groups" for which a match was found determine the best
 * group member based on shortest distance.
 * Ties are broken by how much of a component is orthogonally aligned with the focus owner then by container order.
 *
 * Like the standard Java focus traversal policy, if a container has children who are focusable
 * and it is focusable it will not be eligible to receive the focus.  If, however, it has no children
 * it can receive the focus.
 *
 * Threading Note :  given the caveat that a Container's tree lock
 * should be acquired prior to performing a focus traversal, this class is generally
 * threadsafe.
 * @see {@link com.amazon.kindle.kindlet.ui.LogicalFocus2DTraversalPolicy}
 */
public class LayoutFocus2DTraversalPolicy extends com.amazon.kindle.kindlet.ui.AbstractFocus2DTraversalPolicy {

    /**
     * Constant for navigation matches that are diagonal.
     */
    protected static final int MATCH_DIAGONAL = 3;

    /**
     * Constant for navigation matches that are between intersecting components.
     */
    protected static final int MATCH_INTERSECTING = 5;

    /**
     * Constant for navigation comparisons that do not match.
     */
    protected static final int MATCH_NOMATCH = 0;

    /**
     * Constant for navigation matches that are orthogonal.
     */
    protected static final int MATCH_ORTHOGONAL = 4;

    /**
     * Constant for navigation matches that are tangental.
     */
    protected static final int MATCH_TANGENTAL = 2;

    public LayoutFocus2DTraversalPolicy() {
    // TODO codavaj!!
    }

    /**
     * Method to allow observation and participation in the match rating process.
     * This "accept" method is called after
     * {@link com.amazon.kindle.kindlet.ui.AbstractFocus2DTraversalPolicy#accept(java.awt.Component)}
     * and will not be called if accept returned false.
     * @param candidate The component to be considered for focus
     *                           traversal.
     * @param distance The distance between the candidate and the
     *                           current focus owner.
     * @param matchType The type of geometric match between the current
     *                           focus owner and the candidate.
     * @return true to allow the focus traversal policy to
     *          consider giving the candidate component focus else fale
     *          to prevent it from getting focus.
     */
    protected boolean acceptMatch(java.awt.Component candidate, java.awt.Point distance, int matchType) {
        // TODO codavaj!!
        return false;
    }

    /**
     * Returns the component that should recieve the focus if the user logically looks above
     * the supplied component.  The supplied focusCycleRoot must be a root for the supplied
     * component.
     * @param focusCycleRoot a focus cycle root of the supplied component
     * @param component a child of the supplied focusCycleRoot or the root itself
     * @return the component to focus, or null if none was found
     */
    public java.awt.Component getComponentAbove(java.awt.Container focusCycleRoot, java.awt.Component component) {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Component getComponentAfter(java.awt.Container focusCycleRoot, java.awt.Component component) {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Component getComponentBefore(java.awt.Container focusCycleRoot, java.awt.Component component) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the component that should receive the focus if the user logically looks below
     * the supplied component.  The supplied focusCycleRoot must be a root for the supplied
     * component.
     * @param focusCycleRoot a focus cycle root of the supplied component
     * @param component a child of the supplied focusCycleRoot or the root itself
     * @return the component to focus, or null if none was found
     */
    public java.awt.Component getComponentBelow(java.awt.Container focusCycleRoot, java.awt.Component component) {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Component getDefaultComponent(java.awt.Container focusCycleRoot) {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Component getFirstComponent(java.awt.Container focusCycleRoot) {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Component getLastComponent(java.awt.Container focusCycleRoot) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Get the current orthogonal mode in use by this 2D traversal policy.
     * @return One of the enumerated values on the OrthogonalMode class.
     */
    public com.amazon.kindle.kindlet.ui.FocusTraversalOrthogonalMode getOrthogonalMode() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Set the orthogonal mode for this 2D traversal policy.
     * @param inMode The new mode to change the traversal policy to use.
     */
    public void setOrthogonalMode(com.amazon.kindle.kindlet.ui.FocusTraversalOrthogonalMode inMode) {
        // TODO codavaj!!
        return;
    }
}
