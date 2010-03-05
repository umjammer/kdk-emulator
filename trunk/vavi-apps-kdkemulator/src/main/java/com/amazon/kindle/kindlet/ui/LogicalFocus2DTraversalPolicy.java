/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * An implementation of Focus2DTraversalPolicy that allows an application to
 * specify a logical grid (ie two dimensional array) which is used like a two
 * dimensional "tab stop index" for focus traversal operations. Users can "span"
 * rows and/or columns by putting a reference to the same Component in multiple
 * times. Additionally "dead spaces" can be added by using null entries in the
 * supplied component array (See setLogicalTraversalGrid(Component[][]) for
 * details on the component array).
 * 
 * @see LayoutFocus2DTraversalPolicy
 */
public class LogicalFocus2DTraversalPolicy extends com.amazon.kindle.kindlet.ui.AbstractFocus2DTraversalPolicy {

    /**
     * Create a new traversal policy that has no effect until is called with a
     * logical grid of components to traverse.
     */
    public LogicalFocus2DTraversalPolicy() {
        // TODO codavaj!!
    }

    /**
     * Create a 2D traversal policy that navigates through a logical grid of
     * components.
     * 
     * @param traversalGrid - Logical grid of Components that this policy
     *            navigates through. See setLogicalTraversalGrid(Component[][])
     *            for full documentation on this argument.
     */
    public LogicalFocus2DTraversalPolicy(java.awt.Component[][] traversalGrid) {
        // TODO codavaj!!
    }

    /**
     * Returns the component that should recieve the focus if the user logically
     * looks above the supplied component. The supplied focusCycleRoot must be a
     * root for the supplied component.
     */
    public java.awt.Component getComponentAbove(java.awt.Container focusCycleRoot, java.awt.Component component) {
        return null; // TODO codavaj!!
    }

    public java.awt.Component getComponentAfter(java.awt.Container focusCycleRoot, java.awt.Component component) {
        return null; // TODO codavaj!!
    }

    public java.awt.Component getComponentBefore(java.awt.Container focusCycleRoot, java.awt.Component component) {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the component that should receive the focus if the user logically
     * looks below the supplied component. The supplied focusCycleRoot must be a
     * root for the supplied component.
     */
    public java.awt.Component getComponentBelow(java.awt.Container focusCycleRoot, java.awt.Component component) {
        return null; // TODO codavaj!!
    }

    public java.awt.Component getDefaultComponent(java.awt.Container container) {
        return null; // TODO codavaj!!
    }

    public java.awt.Component getFirstComponent(java.awt.Container focusCycleRoot) {
        return null; // TODO codavaj!!
    }

    public java.awt.Component getLastComponent(java.awt.Container focusCycleRoot) {
        return null; // TODO codavaj!!
    }

    /**
     * @return a copy of the traversal grid in use by this policy. Note that
     *         this array may have a slightly different structure then the one
     *         passed into this object as any missing columns have been appended
     *         with null entries making the array a perfect 2D table.
     */
    public java.awt.Component[][] getLogicalTraversalGrid() {
        return null; // TODO codavaj!!
    }

    /**
     * Search "forward" through the traversal grid from the specified component
     * and return the next component that is focusable. Forward is defined as
     * iterating through each row and then moving to the first index on the next
     * row until the end of the traversal array is reached. Note that this
     * method will never up-cycle regardless of the edge traversal policy.
     */
    public java.awt.Component getNextAcceptableComponent(java.awt.Container focusCycleRoot, java.awt.Component component) {
        return null; // TODO codavaj!!
    }

    /**
     * Search "backward" through the traversal grid from the specified component
     * and return the previous component that is focusable. Backward is defined
     * as iterating backward through each row and then moving to the last index
     * on the preceeding row until the beginning of the traversal array is
     * reached. Note that this method will never up-cycle regardless of the edge
     * traversal policy.
     */
    public java.awt.Component getPreviousAcceptableComponent(java.awt.Container focusCycleRoot, java.awt.Component component) {
        return null; // TODO codavaj!!
    }

    /**
     * Set the component that this policy should return when asked for its
     * "default component".
     */
    public void setDefaultComponent(java.awt.Component defaultComponent) {
        return; // TODO codavaj!!
    }

    /**
     * Set the component that this policy should return when asked for its
     * "default component".
     */
    public void setDefaultComponent(int x, int y) {
        return; // TODO codavaj!!
    }

    /**
     * Set the logical grid this object will use to perform 2D traversal
     * operations. Up/down input is translated to row traversal and left/right
     * input is translated into column traversal. Rows and columns can be
     * "spanned" by repeating references to the same object in multiple indices.
     * For example; a grid containing a text field above to buttons could be
     * setup as such:
     * 
     * <pre>
     * KTextArea myTextField = new KTextArea();
     * new Component[][] = new Component[][] {
     *     {
     *         myTextField, myTextField
     *     }, {
     *         new KButton(&quot;okay&quot;), new KButton(&quot;cancel&quot;)
     *     }
     * };
     * </pre>
     * 
     * In the preceding example navigation would go up to the text field from
     * the "okay" button, right from the "okay" button to the "cancel" button,
     * and up from the "cancel" button to the text field. Furthermore, this
     * policy "weights" previous navigation steps higher when choosing how to
     * exit a spanned set of Component entries in the traversal grid so
     * navigating up from cancel to the text field would would cause down to go
     * back to the "cancel" button. Inversely navigating up from the "okay"
     * button to the text field would cause down to go back to the "okay"
     * button. null values can be used to create "space" in the grid which the
     * focus traversal policy will always skip over. For example;
     * 
     * <pre>
     * new Component[][] = new Component[][] {
     *     {
     *         new KTextField(), new KTextField(), new KTextField()
     *     }, {
     *         new KButton(&quot;okay&quot;), null, new KButton(&quot;cancel&quot;)
     *     }, {
     *         new KTextField(), new KTextField(), new KTextField()
     *     },
     * };
     * </pre>
     * 
     * , would have "After" (i.e. "Right") navigation go from the "okay" button
     * to the "cancel" button skipping over the grid index at [1][1]. Similarly
     * navigation down from the text field at index [0][1] would move the focus
     * to the text field at index [2][1].
     */
    public void setLogicalTraversalGrid(java.awt.Component[][] logicalTraversalGrid) {
        return; // TODO codavaj!!
    }
}
