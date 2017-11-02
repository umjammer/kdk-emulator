/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Components that are able to respond to two-dimensional focus movement should
 * inherit from this interface.
 */
public interface Focus2DTraversable {
    /**
     * Constant for the "above" focus traversal key set.
     * 
     * @see Constant Field Values
     */
    static final int ABOVE_TRAVERSAL_KEYS = 0;

    /**
     * Constant for the "below" focus traversal key set.
     * 
     * @see Constant Field Values
     */
    static final int BELOW_TRAVERSAL_KEYS = 1;

    /**
     * Classes implementing this interface must also provide support for the
     * constants defined in this class: ABOVE_TRAVERSAL_KEYS and
     * BELOW_TRAVERSAL_KEYS.
     */
    abstract boolean areFocus2DTraversalKeysSet(int id);

    /**
     * Gets the local point in the Focus2DTraversable at which focus entered if
     * any.
     */
    abstract java.awt.Point getEntryPoint();

    /**
     * Gets the 2d traversal keys for this component. If no set is defined for
     * this component, it will be inherited from its parent.
     */
    abstract java.util.Set getFocus2DTraversalKeys(int id);

    /**
     * Sets the point in the Focus2DTraversable at which focus entered. This
     * point should be local to this object's coordinate space and this object
     * will take ownership of the memory provided (it reserves the right to use
     * the provided reference).
     */
    abstract void setEntryPoint(java.awt.Point inEntry);

    /**
     * Set the 2d traversal keys for the given operation on this Component. To
     * disable 2d focus traversal for a 2d-aware component, use an empty Set
     * (Collections.EMPTY_SET). If null is supplied, the set will be inherited
     * from the components parent. By default the keys are inherited from the
     * component's parent. Note that only KEY_PRESSED and KEY_RELEASED
     * keystrokes are valid.
     */
    abstract void setFocus2DTraversalKeys(int id, java.util.Set keystrokes);

    /**
     * Transfers focus to the component above this component, as though this
     * Component were the focus owner.
     */
    abstract void transferFocusAbove();

    /**
     * Transfers focus to the component below this component, as though this
     * Component were the focus owner.
     */
    abstract void transferFocusBelow();

}
