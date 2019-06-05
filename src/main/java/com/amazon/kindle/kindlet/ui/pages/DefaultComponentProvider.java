/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * A simple, standard component provider which handles a variety of common cases.
 *
 * <TABLE>
 * <TR>TypeComponent TypeComment</TR>
 * <TR><TD>{@link java.awt.Component}</TD><TD>{@link java.awt.Component}</TD><TD>Simply returns the supplied object.</TD></TR>
 * <TR><TD>{@link java.awt.Image}</TD><TD>{@link com.amazon.kindle.kindlet.ui.KImage}</TD><TD/></TR>
 * <TR><TD>{@link java.util.Date}</TD><TD>{@link com.amazon.kindle.kindlet.ui.KLabel}</TD><TD>Default formatter in the default locale.</TD></TR>
 * <TR><TD>{@link java.util.Currency}</TD><TD>{@link com.amazon.kindle.kindlet.ui.KLabel}</TD><TD>Default formatter in the default locale.</TD></TR>
 * <TR><TD>{@link java.lang.Number}</TD><TD>{@link com.amazon.kindle.kindlet.ui.KLabel}</TD><TD>Default formatter in the default locale.</TD></TR>
 * <TR><TD><I>anything else</I></TD><TD>{@link com.amazon.kindle.kindlet.ui.KLabel}</TD><TD>Uses {@link java.lang.String#valueOf(java.lang.Object)}</TD></TR>
 * </TABLE>
 */
public class DefaultComponentProvider implements com.amazon.kindle.kindlet.ui.pages.ComponentProvider {

    public DefaultComponentProvider() {
    // TODO codavaj!!
    }

    /**
     * Converts a variety of common class instances to a suitable read-only component.
     * @param object the object to display
     * @return a Component displaying the contents of the object
     */
    public java.awt.Component getComponent(java.lang.Object object) {
        // TODO codavaj!!
        return null;
    }

    /**
     * When the item is a String or converted to String, this method is used to obtain a
     * label for displaying it.
     * @param text the text to display
     * @return a component that displays the text
     */
    protected java.awt.Component getLabel(java.lang.String text) {
        // TODO codavaj!!
        return null;
    }
}
