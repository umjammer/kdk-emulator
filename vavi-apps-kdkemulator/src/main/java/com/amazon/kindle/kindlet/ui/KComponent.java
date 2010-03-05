/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * An enhanced version of Component which provides additional features for the
 * Kindle component set. By default a KComponent is aware of 2d focus movements
 * and responds correctly. It is strongly recommended that all custom components
 * on the Kindle derive from KComponent. Components that do not implemented
 * Focus2DTraversable may not behave as expected under the default focus
 * traversal policy. Much like Swing's JComponent, this class extends Container
 * to ensure the class hierarchy makes sense, even though most subclasses will
 * not be containers. Serialization of this class is not supported in this
 * version.
 * 
 * @see Focus2DTraversable
 * @see Focus2DTraversalPolicy
 */
public class KComponent extends java.awt.Container implements com.amazon.kindle.kindlet.ui.Focus2DTraversable {

    /** */
    private java.awt.Point entryPoint;

    /**
     * Creates a new KComponent.
     */
    public KComponent() {
    }

    /**
     * Classes implementing this interface must also provide support for the
     * constants defined in this class: ABOVE_TRAVERSAL_KEYS and
     * BELOW_TRAVERSAL_KEYS.
     */
    public boolean areFocus2DTraversalKeysSet(int id) {
        return super.areFocusTraversalKeysSet(id);
    }

    /**
     * Gets the local point in the Focus2DTraversable at which focus entered if
     * any.
     */
    public java.awt.Point getEntryPoint() {
        return entryPoint;
    }

    /**
     * Gets the 2d traversal keys for this component. If no set is defined for
     * this component, it will be inherited from its parent.
     */
    public java.util.Set getFocus2DTraversalKeys(int id) {
        return super.getFocusTraversalKeys(id);
    }

    /**
     * This method will determine if an is a change from another object using .
     * It is provided to assist in checking for property changes (see ). Unlike
     * equals it also handles null values for its parameters.
     */
    protected boolean isChange(java.lang.Object currentObject, java.lang.Object newObject) {
        return !currentObject.equals(newObject);
    }

    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
    }

    /**
     * Sets the point in the Focus2DTraversable at which focus entered. This
     * point should be local to this object's coordinate space and this object
     * will take ownership of the memory provided (it reserves the right to use
     * the provided reference).
     */
    public void setEntryPoint(java.awt.Point inEntryPoint) {
        this.entryPoint = inEntryPoint;
    }

    /**
     * When this components 2d focus traversal keys are set, it fires a :
     * "aboveFocusTraversalKeys" or "belowFocusTraversalKeys". Set the 2d
     * traversal keys for the given operation on this Component. To disable 2d
     * focus traversal for a 2d-aware component, use an empty Set
     * (Collections.EMPTY_SET). If null is supplied, the set will be inherited
     * from the components parent. By default the keys are inherited from the
     * component's parent. Note that only KEY_PRESSED and KEY_RELEASED
     * keystrokes are valid.
     */
    public void setFocus2DTraversalKeys(int id, java.util.Set keystrokes) {
        super.setFocusTraversalKeys(id, keystrokes);
    }

    /**
     * Transfers focus to the component above this component, as though this
     * Component were the focus owner.
     */
    public void transferFocusAbove() {
        super.transferFocus();
    }

    /**
     * Transfers focus to the component below this component, as though this
     * Component were the focus owner.
     */
    public void transferFocusBelow() {
        super.transferFocusBackward();
    }
}
