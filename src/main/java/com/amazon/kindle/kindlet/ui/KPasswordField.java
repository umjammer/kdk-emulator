/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * KPasswordField is a lightweight component that allows the editing of a single
 * line of text where the view indicates something was typed, but does not show
 * the original characters. You can find further information and examples in How
 * to Use Text Fields, a section in The Java Tutorial. KPasswordField is
 * intended to be source-compatible with KTextField used with echoChar set. It
 * is provided separately to make it easier to safely change the UI for the
 * KTextField without affecting password entries. Serialization of this class is
 * not supported in this version.
 * 
 * @see Serialized Form
 */
public class KPasswordField extends com.amazon.kindle.kindlet.ui.KTextField {
    /**
     * Constructs a new KPasswordField, with a null starting text string, and 0
     * column width.
     */
    public KPasswordField() {
        // TODO codavaj!!
    }

    /**
     * Constructs a new empty KPasswordField with the specified number of
     * columns. The initial string text is set to null.
     * 
     * @param columns - the number of columns >= 0 else throws an
     *            IllegalArgumentException.
     */
    public KPasswordField(int columns) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new KPasswordField initialized with the specified text and
     * the number of columns to 0.
     * 
     * @param text - the text to be displayed, null if none
     */
    public KPasswordField(java.lang.String text) {
        // TODO codavaj!!
    }

    /**
     * Constructs a new text field initialized with the specified text to be
     * displayed, and wide enough to hold the specified number of columns. A
     * column is an approximate average character width that is
     * platform-dependent.
     * 
     * @param text - the text to be displayed. If text is null, the empty string
     *            "" will be displayed.columns - the number of columns. If
     *            columns is less than 0 or more than
     *            java.lang.Integer.MAX_VALUE, an UnsupportedOperationException
     *            is thrown.See Also:TextField
     */
    public KPasswordField(java.lang.String text, int columns) {
        // TODO codavaj!!
    }

    /**
     * Returns true if this KPasswordField has a character set for echoing. A
     * character is considered to be set if the echo character is not 0.
     */
    public boolean echoCharIsSet() {
        return false; // TODO codavaj!!
    }

    /**
     * Returns the character to be used for echoing. The default is '*'.
     */
    public char getEchoChar() {
        return ' '; // TODO codavaj!!
    }

    /**
     * Returns the text contained in this TextField. For stronger security, it
     * is recommended that the returned character array be cleared after use by
     * setting each character to zero.
     */
    public char[] getPassword() {
        return null; // TODO codavaj!!
    }

    /**
     * Deprecated. Returns the text of the Component.
     */
    public java.lang.String getText() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns a string representation of this KPasswordField. This method is
     * intended to be used only for debugging purposes, and the content and
     * format of the returned string may vary between implementations. The
     * returned string may be empty but may not be null.
     */
    protected java.lang.String paramString() {
        return null; // TODO codavaj!!
    }

}
