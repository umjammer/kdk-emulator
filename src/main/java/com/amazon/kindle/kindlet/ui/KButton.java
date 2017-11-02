/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * This class creates a labeled button, in the Kindle style. A button can
 * receive the focus and be pressed by the user - this button press results in
 * the button's ActionListeners being called. Buttons advertise a minimum,
 * preferred and maximum size. Buttons can stretch horizontally naturally, but
 * layouts which ignore the button's maximum height (e.g. BorderLayout or
 * GridLayout) may result in improper rendering of the button. Example Rendering
 * Serialization of this class is not supported in this version.
 * 
 * @see java.awt.Button, javax.swing.JButton, Serialized Form
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
     * Adds the specified action listener to receive action events from the
     * button. Action events occur when the user presses the five way select or
     * enter key while this button has the focus. If listener is null, no
     * exception is thrown and no action is performed.
     */
    public void addActionListener(java.awt.event.ActionListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Returns the command name of the action event initiated by this button. By
     * default this returns the button's label.
     */
    public java.lang.String getActionCommand() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns an array of all the action listeners registered on this button.
     */
    public java.awt.event.ActionListener[] getActionListeners() {
        return null; // TODO codavaj!!
    }

    public java.awt.Color getBackground() {
        return null; // TODO codavaj!!
    }

    public java.awt.Font getFont() {
        return null; // TODO codavaj!!
    }

    public java.awt.Color getForeground() {
        return null; // TODO codavaj!!
    }

    /**
     * Gets the label for this button
     */
    public java.lang.String getLabel() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMaximumSize() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMinimumSize() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getPreferredSize() {
        return null; // TODO codavaj!!
    }

    public boolean hasFocus() {
        return false; // TODO codavaj!!
    }

    public boolean isEnabled() {
        return false; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics graphics) {
        return; // TODO codavaj!!
    }

    protected void processComponentEvent(java.awt.event.ComponentEvent componentEvent) {
        return; // TODO codavaj!!
    }

    protected void processFocusEvent(java.awt.event.FocusEvent focusEvent) {
        return; // TODO codavaj!!
    }

    protected void processKeyEvent(java.awt.event.KeyEvent keyEvent) {
        return; // TODO codavaj!!
    }

    /**
     * Removes the specified action listener so that it no longer received
     * action events from this button. If listener is null, no exception is
     * thrown.
     */
    public void removeActionListener(java.awt.event.ActionListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Sets name of the command for the that is sent when this button is
     * pressed.
     */
    public void setActionCommand(java.lang.String command) {
        return; // TODO codavaj!!
    }

    public void setBackground(java.awt.Color color) {
        return; // TODO codavaj!!
    }

    public void setBounds(int x, int y, int width, int height) {
        return; // TODO codavaj!!
    }

    public void setEnabled(boolean flag) {
        return; // TODO codavaj!!
    }

    public void setFont(java.awt.Font font) {
        return; // TODO codavaj!!
    }

    public void setForeground(java.awt.Color color) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the button's label to the specified string.
     */
    public void setLabel(java.lang.String label) {
        return; // TODO codavaj!!
    }

}
