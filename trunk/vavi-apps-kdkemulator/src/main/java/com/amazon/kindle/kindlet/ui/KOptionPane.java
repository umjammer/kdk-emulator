/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * This class provides helper functions to display common modal dialog boxes.
 * Unlike some systems, only a single dialog is permitted to be open at a time
 * on the Kindle. In the event that an application attempts to open a dialog
 * while another is visible, the second opening will fail with a
 * IllegalStateException. Note that this is a RuntimeException - if it is not
 * caught on the event queue it will simply disappear. Serialization of this
 * class is not supported in this version.
 */
public class KOptionPane {
    /**
     * The value returned when a dialog is closed by the user selecting cancel.
     * 
     * @see Constant Field Values
     */
    public static final int CANCEL_OPTION = 2;

    /**
     * Used to indicate a dialog with okay and cancel options.
     * 
     * @see Constant Field Values
     */
    public static final int OK_CANCEL_OPTION = 2;

    /**
     * The value returned when a dialog is closed by the user selecting okay.
     * 
     * @see Constant Field Values
     */
    public static final int OK_OPTION = 0;

    /**
     * Used to indicate a plain message with no icon.
     * 
     * @see Constant Field Values
     */
    public static final int PLAIN_MESSAGE = -1;

    /**
     * Dismisses any active dialog for the supplied component's Kindlet. If no
     * dialogs are active, nothing happens.
     */
    public static void dismissDialog(java.awt.Component parent) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied message. The message
     * type will be and the option type will be . The title will be
     * "Select an Option". This method blocks the calling thread until the user
     * closes the dialog. If a valid parent component is not supplied will be
     * thrown.
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message) throws java.lang.InterruptedException {
        return 0; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified. The message type will be to and the option type will be . The
     * title will be "Select an Option".
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied message and title. The
     * message type will be and the option type will be . This method blocks the
     * calling thread until the user closes the dialog. If a valid parent
     * component is not supplied will be thrown.
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title) throws java.lang.InterruptedException {
        return 0; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message and
     * title. The message type will be . This method blocks the calling thread
     * until the user closes the dialog. If a valid parent component is not
     * supplied will be thrown.
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType) throws java.lang.InterruptedException {
        return 0; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. This method blocks the calling thread until the
     * user closes the dialog. If a valid parent component is not supplied will
     * be thrown.
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType, int messageType) throws java.lang.InterruptedException {
        return 0; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified.
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType, int messageType, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified. The message type will be to .
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified. The message type will be to and the option type will be .
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays an input dialog with the requested title for the user to enter
     * text into. The value entered is returned from this method and will be
     * null if the user canceled the dialog. This method blocks the calling
     * thread until the user closes the dialog. If a valid parent component is
     * not supplied will be thrown.
     */
    public static java.lang.String showInputDialog(java.awt.Component parent, java.lang.String title, java.lang.String initialValue) throws java.lang.InterruptedException {
        return null; // TODO codavaj!!
    }

    /**
     * Displays an input dialog with the requested title for the user to enter
     * text into. When the user closes the dialog the listener is notified. If
     * the user cancels the input, a null will be supplied to the listener as
     * the result of the dialog.
     */
    public static void showInputDialog(java.awt.Component parent, java.lang.String title, java.lang.String initialValue, com.amazon.kindle.kindlet.ui.KOptionPane.InputDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a message dialog with the title. This method blocks the calling
     * thread until the user closes the dialog. If a valid parent component is
     * not supplied will be thrown. A message type of will be used and a
     * standard title ("Message").
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message) throws java.lang.InterruptedException, java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        return; // TODO codavaj!!
    }

    /**
     * Displays a message dialog with the indicated parameters, a message type
     * of and a standard title ("Message").
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a message dialog with the message and title. This method blocks
     * the calling thread until the user closes the dialog. If a valid parent
     * component is not supplied will be thrown. A message type of will be used.
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title) throws java.lang.InterruptedException, java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        return; // TODO codavaj!!
    }

    /**
     * Displays a message dialog with the supplied type, message and title. This
     * method blocks the calling thread until the user closes the dialog. If a
     * valid parent component is not supplied will be thrown.
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int messageType) throws java.lang.InterruptedException, java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        return; // TODO codavaj!!
    }

    /**
     * Displays a message dialog with the supplied type, message and title. When
     * the user has closed the message dialog the listener will be called. If a
     * valid parent component is not supplied will be thrown.
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int messageType, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Displays a message dialog with the indicated parameters and a message
     * type of .
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * A listener that is notified when a confirmation dialog is closed.
     */
    public static interface ConfirmDialogListener {
        /**
         * Called when the confirm dialog is closed.
         */
        abstract void onClose(int option);

    }

    /**
     * A listener that is notified when a message dialog is closed.
     */
    public static interface MessageDialogListener {
        /**
         * Called when the message dialog is closed.
         */
        abstract void onClose();

    }

    /**
     * A listener that is notified when an input dialog is closed.
     */
    public static interface InputDialogListener {
        /**
         * Called when the input dialog is closed.
         */
        abstract void onClose(java.lang.String value);

    }
}
