/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.pages;


/**
 * A simple, standard component provider which handles a variety of common
 * cases. TypeComponent TypeComment ComponentComponentSimply returns the
 * supplied object. ImageKImage DateKLabelDefault formatter in the default
 * locale. CurrencyKLabelDefault formatter in the default locale.
 * NumberKLabelDefault formatter in the default locale. anything elseKLabelUses
 * String.valueOf(Object)
 */
public class DefaultComponentProvider implements com.amazon.kindle.kindlet.ui.pages.ComponentProvider {

    public DefaultComponentProvider() {
        // TODO codavaj!!
    }

    /**
     * Converts a variety of common class instances to a suitable read-only
     * component.
     */
    public java.awt.Component getComponent(java.lang.Object object) {
        return null; // TODO codavaj!!
    }

    /**
     * When the item is a String or converted to String, this method is used to
     * obtain a label for displaying it.
     */
    protected java.awt.Component getLabel(java.lang.String text) {
        return null; // TODO codavaj!!
    }
}
