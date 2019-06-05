/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Components that are able to respond to two-dimensional focus movement
 * should inherit from this interface.
 */
public interface Focus2DTraversable {

    /**
     * Constant for the "above" focus traversal key set.
     */
    static final int ABOVE_TRAVERSAL_KEYS = 0;

    /**
     * Constant for the "below" focus traversal key set.
     */
    static final int BELOW_TRAVERSAL_KEYS = 1;

    /**
     * Classes implementing this interface must also provide support
     * for the constants defined in this class: ABOVE_TRAVERSAL_KEYS
     * and BELOW_TRAVERSAL_KEYS.
     * @param id one of ABOVE_TRAVERSAL_KEYS or BELOW_TRAVERSAL_KEYS
     * @return true if the keys are explicitly set for this component (not null)
     * @see {@link java.awt.Component#areFocusTraversalKeysSet(int)}
     */
    abstract boolean areFocus2DTraversalKeysSet(int id);

    /**
     * Gets the local point in the Focus2DTraversable at which focus entered if any.
     * @return null if no entry point has been set on this Focus2DTraversable
     *          else returns a Point with the local coordinates at which focus
     *          entered this object.
     */
    abstract java.awt.Point getEntryPoint();

    /**
     * Gets the 2d traversal keys for this component.  If no set is defined for
     * this component, it will be inherited from its parent.
     * @param id one of ABOVE_TRAVERSAL_KEYS or BELOW_TRAVERSAL_KEYS
     * @see {@link java.awt.Component#getFocusTraversalKeys(int)}
     */
    abstract java.util.Set getFocus2DTraversalKeys(int id);

    /**
     * Sets the point in the Focus2DTraversable at which focus entered. This point
     * should be local to this object's coordinate space and this object will take
     * ownership of the memory provided (it reserves the right to use the provided
     * reference).
     * @param inEntry The local point at which focus entered the Focus2DTraversable.
     */
    abstract void setEntryPoint(java.awt.Point inEntry);

    /**
     * Set the 2d traversal keys for the given operation on this Component.
     *
     * To disable 2d focus traversal for a 2d-aware component, use
     * an empty Set (Collections.EMPTY_SET).  If null is supplied, the set
     * will be inherited from the components parent. By default the keys are
     * inherited from the component's parent.
     *
     * Note that only KEY_PRESSED and KEY_RELEASED keystrokes
     * are valid.
     * @param id one of ABOVE_TRAVERSAL_KEYS or BELOW_TRAVERSAL_KEYS
     * @param keystrokes a Set of AWTKeyStroke
     * @see {@link java.awt.Component#setFocusTraversalKeys(int, java.util.Set)}
     */
    abstract void setFocus2DTraversalKeys(int id, java.util.Set keystrokes);

    /**
     * Transfers focus to the component above this component, as though
     * this Component were the focus owner.
     * @see {@link java.awt.Component#transferFocus()}
     */
    abstract void transferFocusAbove();

    /**
     * Transfers focus to the component below this component, as though
     * this Component were the focus owner.
     * @see {@link java.awt.Component#transferFocus()}
     */
    abstract void transferFocusBelow();
}
