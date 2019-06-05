/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * This class creates a labeled button, in the Kindle style. A button
 * can receive the focus and be pressed by the user - this button press
 * results in the button's
 * {@link java.awt.event.ActionListener}
 * s being called.
 *
 * Buttons advertise a minimum, preferred and maximum size. Buttons
 * can stretch horizontally naturally, but layouts which ignore the
 * button's maximum height (e.g.
 * {@link java.awt.BorderLayout}
 * or
 *
 * {@link java.awt.GridLayout}
 * ) may result in improper rendering of
 * the button.
 *
 * Example Rendering
 *
 * Serialization of this class is not supported in this version.
 */
public class KButton extends com.amazon.kindle.kindlet.ui.KComponent {

    /**
     * Constructs a new button with no label.
     */
    public KButton() {
    // TODO codavaj!!
    }

    /**
     * Constructs a new button with the given label.
     *
     * @param label - label to appear on the button, or null for no label
     */
    public KButton(java.lang.String label) {
    // TODO codavaj!!
    }

    /**
     * Adds the specified action listener to receive action events from the button. Action events occur
     * when the user presses the five way select or enter key while this button has the focus.
     *
     * If listener is null, no exception is thrown and no action is performed.
     * @param listener the action listener
     * @see {@link com.amazon.kindle.kindlet.ui.KButton#removeActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KButton#getActionListeners()},
     * {@link java.awt.event.ActionListener}
     */
    public void addActionListener(java.awt.event.ActionListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Returns the command name of the action event
     * initiated by this button. By default this
     * returns the button's label.
     * @return the command corresponding this this button.
     * @see {@link com.amazon.kindle.kindlet.ui.KButton#setActionCommand(java.lang.String)}
     */
    public java.lang.String getActionCommand() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns an array of all the action listeners registered on this button.
     * @return all of this button's ActionsListeners or an
     *  empty array if no action listeners are currently registered.
     */
    public java.awt.event.ActionListener[] getActionListeners() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Color getBackground() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Font getFont() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Color getForeground() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Gets the label for this button
     * @return the button's label, or null if the
     *  button has no label.
     * @see {@link com.amazon.kindle.kindlet.ui.KButton#setLabel(java.lang.String)}
     */
    public java.lang.String getLabel() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMaximumSize() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMinimumSize() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getPreferredSize() {
        // TODO codavaj!!
        return null;
    }

    public boolean hasFocus() {
        // TODO codavaj!!
        return false;
    }

    public boolean isEnabled() {
        // TODO codavaj!!
        return false;
    }

    public void paint(java.awt.Graphics graphics) {
        // TODO codavaj!!
        return;
    }

    protected void processComponentEvent(java.awt.event.ComponentEvent componentEvent) {
        // TODO codavaj!!
        return;
    }

    protected void processFocusEvent(java.awt.event.FocusEvent focusEvent) {
        // TODO codavaj!!
        return;
    }

    protected void processKeyEvent(java.awt.event.KeyEvent keyEvent) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes the specified action listener so that it no longer received action events
     * from this button.
     *
     * If listener is null, no exception is thrown.
     * @param listener the action listener
     * @see {@link com.amazon.kindle.kindlet.ui.KButton#addActionListener(java.awt.event.ActionListener)},
     * {@link com.amazon.kindle.kindlet.ui.KButton#getActionListeners()},
     * {@link java.awt.event.ActionListener}
     */
    public void removeActionListener(java.awt.event.ActionListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets name of the command for the
     * {@link java.awt.event.ActionEvent}
     *
     * that is sent when this button is pressed.
     * @param command the button's action command, or null
     *         to use the button's label
     * @see {@link java.awt.event.ActionEvent}
     */
    public void setActionCommand(java.lang.String command) {
        // TODO codavaj!!
        return;
    }

    public void setBackground(java.awt.Color color) {
        // TODO codavaj!!
        return;
    }

    public void setBounds(int x, int y, int width, int height) {
        // TODO codavaj!!
        return;
    }

    public void setEnabled(boolean flag) {
        // TODO codavaj!!
        return;
    }

    public void setFont(java.awt.Font font) {
        // TODO codavaj!!
        return;
    }

    public void setForeground(java.awt.Color color) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the button's label to the specified string.
     * @param label the label for the button, or null if the button has no label.
     * @see {@link com.amazon.kindle.kindlet.ui.KButton#getLabel()}
     */
    public void setLabel(java.lang.String label) {
        // TODO codavaj!!
        return;
    }
}
