/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Common base class for Components that render text in some manner.
 */
public abstract class KTextComponent extends com.amazon.kindle.kindlet.ui.KComponent {

    /**
     * Align with the bottom of an area.
     */
    public static final int BOTTOM = 3;

    /**
     * Align in the center of an area.
     */
    public static final int CENTER = 0;

    /**
     * Align with the leading edge of a text area. For left-to-right text this
     * is the "left" and vice-versa for right-to-left text.
     */
    public static final int LEADING = 2;

    /**
     * Constant used to signal that no maximum number of lines limit a text
     * layout algorithm.
     */
    public static final int SHOW_ALL_LINES = -1;

    /**
     * Align with the top of an area.
     */
    public static final int TOP = 4;

    /**
     * Align with the trailing edge of a text area. For left-to-right text this
     * is the "right" and vice-versa for right-to-left text.
     */
    public static final int TRAILING = 1;

    public KTextComponent() {
    // TODO codavaj!!
    }

    /**
     * Adds the specified action listener to receive action events from this text field component. If l is null, no exception is
     * thrown and no action is performed. Refer to AWT Threading Issues for details on AWT's threading model.
     * @param l the action listener.
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#removeActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#getActionListeners()}
     */
    public void addActionListener(java.awt.event.ActionListener l) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds the specified text event listener to receive text events from this text component. If l is
     * null, no exception is thrown and no action is performed.
     * @param l the text event listener
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#removeTextListener(java.awt.event.TextListener)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#getTextListeners()},
     * {@link java.awt.event.TextListener}
     */
    public void addTextListener(java.awt.event.TextListener l) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the command name of the action event initiated by this component. If the action command is  null , then
     * it is defaulted to the text of the component.
     * @return the action command for this component.
     */
    public java.lang.String getActionCommand() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns an array of all the action listeners registered on this text field component.
     * @return all of this menu item's ActionListeners or an empty array if no action listeners are currently registered
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#addActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#removeActionListener(java.awt.event.ActionListener)}
     */
    public java.awt.event.ActionListener[] getActionListeners() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Method searches up the tree from this component to find the first parent
     * that has a non-zero size and returns this size minus the Insets of said parent.
     * This Dimension is useful when servicing getPreferredSize calls from LayoutManagers
     * like FlowLayoutManager where the direct parent will not have a size while
     * it is calculating it's children's preferred sizes.
     * @return The best size to use as a maximum, interior dimension or the screen
     *          size if the component was completely unparented or no ancestor had
     *          non-zero dimensions. This method does not return negative values
     *          for a Dimension's width or height.
     */
    protected java.awt.Dimension getAncestorMaxInteriorSize() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the border of this component or null if no border is currently set.
     * @return the border object for this component
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#setBorder(com.amazon.kindle.kindlet.ui.border.KBorder)}
     */
    public com.amazon.kindle.kindlet.ui.border.KBorder getBorder() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the "average width" for a character of the font set for this Component.
     * This is not a very useful measurement for variable width fonts and is only
     * useful as an estimation tool or when using fixed width fonts for some
     * special purpose.
     * @return Estimated width of a "column" of characters.
     */
    protected int getColumnWidth() {
        // TODO codavaj!!
        return 0;
    }

    public java.awt.Insets getInsets() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns
     * {@link java.awt.Insets}
     * that are the distance in pixels between the inside
     * of a border and the outside of the interior text.
     * @return Width of margins for this text component or null if
     *          no margins have been set for this component.
     */
    public java.awt.Insets getMargin() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMinimumSize() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Helper method for KTextComponents that wish to use a set number
     * of characters and rows as a minimum size.
     * @param rows The number of rows of text to use to measure a minimum size.
     * @param columns The number of columns of text to use to measure a minimum
     *                   size. As is the Java standard this width will be determined
     *                   using {@link java.awt.FontMetrics#charWidth(char)} given the ascii
     *                   character 'm'.
     * @return Either a cached minimum size from the last time this method was
     *          called or the size of the rows and columns using the current
     *          Font set on this Component. To invalidate
     *          the cached value and recalculate the minimum size call
     *          <A href="http://java.sun.com/javame/reference/apis/jsr217/java/awt/Component.html#invalidate()">Component.invalidate()</A>.
     */
    protected java.awt.Dimension getMinimumSize(int rows, int columns) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the height for a row of text given this component's current Font.
     * @return Height in pixels of a single row of text.
     */
    protected int getRowHeight() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the text of the Component.
     * @return the Components text. null is not
     *          returned. "no text" set on the Component will cause
     *          the empty String "" to be returned.
     */
    public abstract java.lang.String getText();

    /**
     * Returns an array of all the text listeners registered on this text component.
     * @return all of this text component's TextListeners or an empty array if no text listeners are currently
     *          registered
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#addTextListener(java.awt.event.TextListener)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#removeTextListener(java.awt.event.TextListener)}
     */
    public java.awt.event.TextListener[] getTextListeners() {
        // TODO codavaj!!
        return null;
    }

    public void invalidate() {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the boolean indicating whether this KTextArea is editable or not.
     * @return the boolean value
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#setEditable(boolean)}
     */
    public abstract boolean isEditable();

    /**
     * Processes action events occurring on this text component by
     * dispatching them to any registered ActionListener
     * objects.
     * @param e the text event
     * @see {@link java.awt.Component#enableEvents(long)}
     */
    protected void processActionEvent(java.awt.event.ActionEvent e) {
        // TODO codavaj!!
        return;
    }

    protected void processEvent(java.awt.AWTEvent e) {
        // TODO codavaj!!
        return;
    }

    /**
     * Processes text events occurring on this text component by dispatching them to any registered TextListener
     * objects.
     * @param e the text event
     * @see {@link java.awt.Component#enableEvents(long)}
     */
    protected void processTextEvent(java.awt.event.TextEvent e) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes the specified action listener so it no longer receives action events from this text field component. If l is null, no
     * exception is thrown and no action is performed. Refer to AWT Threading Issues for details on AWT's threading model.
     * @param l the action listener.
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#addActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#getActionListeners()}
     */
    public void removeActionListener(java.awt.event.ActionListener l) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes the specified text event listener so that it no longer receives text events from this text component If
     * l is null, no exception is thrown and no action is performed.
     * @param l the text listener
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#addTextListener(java.awt.event.TextListener)},
     * {@link com.amazon.kindle.kindlet.ui.KTextComponent#getTextListeners()},
     * {@link java.awt.event.TextListener}
     */
    public void removeTextListener(java.awt.event.TextListener l) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets name of the command name for the action event that results from this component.
     * @param command string used to set this component's action command.
     * @see {@link java.awt.event.ActionEvent}
     */
    public void setActionCommand(java.lang.String command) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the border of this component. The KBorder object is responsible for defining the insets for the component
     * (overriding any insets set directly on the component) and for optionally rendering any border decorations within the bounds
     * of those insets. KBorders should be used (rather than insets) for creating both decorative and non-decorative (such as
     * margins and padding) regions for a Kindlet component.
     *
     * This is a bound property.
     * @param border the border to be rendered for this component.
     */
    public void setBorder(com.amazon.kindle.kindlet.ui.border.KBorder border) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the boolean to indicate whether or not this KTextArea should be editable.
     * @param b the boolean to be set
     * @see {@link com.amazon.kindle.kindlet.ui.KTextComponent#isEditable()}
     */
    public abstract void setEditable(boolean b);

    /**
     * Sets the width in pixels between the inside of a border and the outside
     * of interior text.
     * @param margins The margins for the text component.
     */
    public void setMargin(java.awt.Insets margins) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the text of the Component.
     * @param text to display in the Component. null is
     *             converted into "".
     */
    public abstract void setText(java.lang.String text);
}
