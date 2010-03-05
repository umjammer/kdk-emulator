/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Common base class for Components that render text in some manner.
 * 
 * @see Serialized Form
 */
public abstract class KTextComponent extends com.amazon.kindle.kindlet.ui.KComponent {
    /**
     * Align with the bottom of an area.
     * 
     * @see Constant Field Values
     */
    public static final int BOTTOM = 3;

    /**
     * Align in the center of an area.
     * 
     * @see Constant Field Values
     */
    public static final int CENTER = 0;

    /**
     * Align with the leading edge of a text area. For left-to-right text this
     * is the "left" and vice-versa for right-to-left text.
     * 
     * @see Constant Field Values
     */
    public static final int LEADING = 2;

    /**
     * Constant used to signal that no maximum number of lines limit a text
     * layout algorithm.
     * 
     * @see Constant Field Values
     */
    public static final int SHOW_ALL_LINES = -1;

    /**
     * Align with the top of an area.
     * 
     * @see Constant Field Values
     */
    public static final int TOP = 4;

    /**
     * Align with the trailing edge of a text area. For left-to-right text this
     * is the "right" and vice-versa for right-to-left text.
     * 
     * @see Constant Field Values
     */
    public static final int TRAILING = 1;

    public KTextComponent() {
        // TODO codavaj!!
    }

    /**
     * Adds the specified action listener to receive action events from this
     * text field component. If l is null, no exception is thrown and no action
     * is performed. Refer to AWT Threading Issues for details on AWT's
     * threading model.
     */
    public void addActionListener(java.awt.event.ActionListener l) {
        return; // TODO codavaj!!
    }

    /**
     * Adds the specified text event listener to receive text events from this
     * text component. If l is null, no exception is thrown and no action is
     * performed.
     */
    public void addTextListener(java.awt.event.TextListener l) {
        return; // TODO codavaj!!
    }

    /**
     * Returns the command name of the action event initiated by this component.
     * If the action command is null , then it is defaulted to the text of the
     * component.
     */
    public java.lang.String getActionCommand() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns an array of all the action listeners registered on this text
     * field component.
     */
    public java.awt.event.ActionListener[] getActionListeners() {
        return null; // TODO codavaj!!
    }

    /**
     * Method searches up the tree from this component to find the first parent
     * that has a non-zero size and returns this size minus the Insets of said
     * parent. This Dimension is useful when servicing getPreferredSize calls
     * from LayoutManagers like FlowLayoutManager where the direct parent will
     * not have a size while it is calculating it's children's preferred sizes.
     */
    protected java.awt.Dimension getAncestorMaxInteriorSize() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the border of this component or null if no border is currently
     * set.
     */
    public com.amazon.kindle.kindlet.ui.border.KBorder getBorder() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the "average width" for a character of the font set for this
     * Component. This is not a very useful measurement for variable width fonts
     * and is only useful as an estimation tool or when using fixed width fonts
     * for some special purpose.
     */
    protected int getColumnWidth() {
        return 0; // TODO codavaj!!
    }

    public java.awt.Insets getInsets() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns that are the distance in pixels between the inside of a border
     * and the outside of the interior text.
     */
    public java.awt.Insets getMargin() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMinimumSize() {
        return null; // TODO codavaj!!
    }

    /**
     * Helper method for KTextComponents that wish to use a set number of
     * characters and rows as a minimum size.
     */
    protected java.awt.Dimension getMinimumSize(int rows, int columns) {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the height for a row of text given this component's current Font.
     */
    protected int getRowHeight() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the text of the Component.
     */
    public abstract java.lang.String getText();

    /**
     * Returns an array of all the text listeners registered on this text
     * component.
     */
    public java.awt.event.TextListener[] getTextListeners() {
        return null; // TODO codavaj!!
    }

    public void invalidate() {
        return; // TODO codavaj!!
    }

    /**
     * Returns the boolean indicating whether this KTextArea is editable or not.
     */
    public abstract boolean isEditable();

    /**
     * Processes action events occurring on this text component by dispatching
     * them to any registered ActionListener objects.
     */
    protected void processActionEvent(java.awt.event.ActionEvent e) {
        return; // TODO codavaj!!
    }

    protected void processEvent(java.awt.AWTEvent e) {
        return; // TODO codavaj!!
    }

    /**
     * Processes text events occurring on this text component by dispatching
     * them to any registered TextListener objects.
     */
    protected void processTextEvent(java.awt.event.TextEvent e) {
        return; // TODO codavaj!!
    }

    /**
     * Removes the specified action listener so it no longer receives action
     * events from this text field component. If l is null, no exception is
     * thrown and no action is performed. Refer to AWT Threading Issues for
     * details on AWT's threading model.
     */
    public void removeActionListener(java.awt.event.ActionListener l) {
        return; // TODO codavaj!!
    }

    /**
     * Removes the specified text event listener so that it no longer receives
     * text events from this text component If l is null, no exception is thrown
     * and no action is performed.
     */
    public void removeTextListener(java.awt.event.TextListener l) {
        return; // TODO codavaj!!
    }

    /**
     * Sets name of the command name for the action event that results from this
     * component.
     */
    public void setActionCommand(java.lang.String command) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the border of this component. The KBorder object is responsible for
     * defining the insets for the component (overriding any insets set directly
     * on the component) and for optionally rendering any border decorations
     * within the bounds of those insets. KBorders should be used (rather than
     * insets) for creating both decorative and non-decorative (such as margins
     * and padding) regions for a Kindlet component. This is a bound property.
     */
    public void setBorder(com.amazon.kindle.kindlet.ui.border.KBorder border) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the boolean to indicate whether or not this KTextArea should be
     * editable.
     */
    public abstract void setEditable(boolean b);

    /**
     * Sets the width in pixels between the inside of a border and the outside
     * of interior text.
     */
    public void setMargin(java.awt.Insets margins) {
        return; // TODO codavaj!!
    }

    /**
     * Set the text of the Component.
     */
    public abstract void setText(java.lang.String text);

}
