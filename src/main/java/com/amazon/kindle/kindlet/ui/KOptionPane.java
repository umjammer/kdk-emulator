/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * This class provides helper functions to display common modal dialog boxes. Unlike some
 * systems, only a single dialog is permitted to be open at a time on the Kindle. In the event
 * that an application attempts to open a dialog while another is visible, the second opening
 * will fail with a
 * {@link java.lang.IllegalStateException}
 * .  Note that this is a RuntimeException
 * - if it is not caught on the event queue it will simply disappear.
 *
 * Serialization of this class is not supported in this version.
 */
public class KOptionPane {

    /**
     * The value returned when a dialog is closed by the user selecting cancel.
     */
    public static final int CANCEL_OPTION = 2;

    /**
     * Used to indicate a dialog with okay and cancel options.
     */
    public static final int OK_CANCEL_OPTION = 2;

    /**
     * The value returned when a dialog is closed by the user selecting okay.
     */
    public static final int OK_OPTION = 0;

    /**
     * Used to indicate a plain message with no icon.
     */
    public static final int PLAIN_MESSAGE = -1;

    /**
     * Dismisses any active dialog for the supplied component's Kindlet. If no
     * dialogs are active, nothing happens.
     * @param parent the component to dismiss dialogs for
     */
    public static void dismissDialog(java.awt.Component parent) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a confirmation dialog with the supplied message. The message
     * type will be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * and the option type will
     * be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#OK_CANCEL_OPTION}
     * . The title will be
     * "Select an Option". This method blocks the calling thread until the user
     * closes the dialog. If a valid parent component is not supplied
     *
     * {@link java.lang.IllegalArgumentException}
     * will be thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @return the button selected when the user closed the dialog (based on
     *          optionType)
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showConfirmDialog(java.awt.Component, java.lang.String, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message) throws java.lang.InterruptedException {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified. The message type will be to
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * and the option type will be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#OK_CANCEL_OPTION}
     * . The
     * title will be "Select an Option".
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param listener the listener to notify when a selection is made
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a confirmation dialog with the supplied message and title. The
     * message type will be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * and the option
     * type will be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#OK_CANCEL_OPTION}
     * . This method blocks the
     * calling thread until the user closes the dialog. If a valid parent
     * component is not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be
     * thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @return the button selected when the user closed the dialog (based on
     *          optionType)
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showConfirmDialog(java.awt.Component, java.lang.String, java.lang.String, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title) throws java.lang.InterruptedException {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message and
     * title. The message type will be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * . This
     * method blocks the calling thread until the user closes the dialog. If a
     * valid parent component is not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param optionType an option type constant
     * @return the button selected when the user closed the dialog (based on
     *          optionType)
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showConfirmDialog(java.awt.Component, java.lang.String, java.lang.String, int, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType) throws java.lang.InterruptedException {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. This method blocks the calling thread until the
     * user closes the dialog. If a valid parent component is not supplied
     *
     * {@link java.lang.IllegalArgumentException}
     * will be thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param optionType an option type constant
     * @param messageType a message type constant
     * @return the button selected when the user closed the dialog (based on
     *          optionType)
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showConfirmDialog(java.awt.Component, java.lang.String, java.lang.String, int, int, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static int showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType, int messageType) throws java.lang.InterruptedException {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param optionType an option type constant
     * @param messageType a message type constant
     * @param listener the listener to notify when a selection is made
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType, int messageType, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified. The message type will be to
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * .
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param optionType an option type constant
     * @param listener the listener to notify when a selection is made
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int optionType, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a confirmation dialog with the supplied option type, message
     * type, message and title. When this dialog is closed the listener will be
     * notified. The message type will be to
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * and the option type will be
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#OK_CANCEL_OPTION}
     * .
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param listener the listener to notify when a selection is made
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showConfirmDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, com.amazon.kindle.kindlet.ui.KOptionPane.ConfirmDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays an input dialog with the requested title for the user to enter
     * text into. The value entered is returned from this method and will be
     * null if the user canceled the dialog. This method blocks the calling
     * thread until the user closes the dialog. If a valid parent component is
     * not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param title the title to use for the message box
     * @param initialValue the initial value for the input dialog
     * @return the value entered by the user or null if the user canceled the
     *          input
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the input
     *              dialog to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showInputDialog(java.awt.Component, java.lang.String, java.lang.String, com.amazon.kindle.kindlet.ui.KOptionPane.InputDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static java.lang.String showInputDialog(java.awt.Component parent, java.lang.String title, java.lang.String initialValue) throws java.lang.InterruptedException {
        // TODO codavaj!!
        return null;
    }

    /**
     * Displays an input dialog with the requested title for the user to enter
     * text into. When the user closes the dialog the listener is notified. If
     * the user cancels the input, a null will be supplied to the listener as
     * the result of the dialog.
     * @param parent a showing component which is the parent for this dialog
     * @param title the title to use for the input dialog
     * @param initialValue the value to pre-fill in the text field
     * @param listener the listener to notify when the box closes
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showInputDialog(java.awt.Component parent, java.lang.String title, java.lang.String initialValue, com.amazon.kindle.kindlet.ui.KOptionPane.InputDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a message dialog with the title. This method blocks the calling
     * thread until the user closes the dialog. If a valid parent component is
     * not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be thrown. A message
     * type of
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * will be used and a standard title
     * ("Message").
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showMessageDialog(java.awt.Component, java.lang.String, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message) throws java.lang.InterruptedException, java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a message dialog with the indicated parameters, a message type
     * of
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * and a standard title ("Message").
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param listener the listener to notify when the message box is closed
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a message dialog with the message and title. This method blocks
     * the calling thread until the user closes the dialog. If a valid parent
     * component is not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be
     * thrown. A message type of
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * will be used.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showMessageDialog(java.awt.Component, java.lang.String, java.lang.String, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title) throws java.lang.InterruptedException, java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a message dialog with the supplied type, message and title. This
     * method blocks the calling thread until the user closes the dialog. If a
     * valid parent component is not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param messageType a message type constant
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.InterruptedException if the thread was interrupted while waiting for the message
     *              box to close
     * @exception java.lang.IllegalStateException Thrown if called from within the AWT dispatch thread. Use
     *              {@link com.amazon.kindle.kindlet.ui.KOptionPane#showMessageDialog(java.awt.Component, java.lang.String, java.lang.String, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener)}
     *              to avoid this exception.  Also thrown if another dialog is already visible
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int messageType) throws java.lang.InterruptedException, java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a message dialog with the supplied type, message and title. When
     * the user has closed the message dialog the listener will be called. If a
     * valid parent component is not supplied
     * {@link java.lang.IllegalArgumentException}
     * will be thrown.
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param messageType a message type constant
     * @param listener the listener to notify when the message box is closed
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, int messageType, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Displays a message dialog with the indicated parameters and a message
     * type of
     * {@link com.amazon.kindle.kindlet.ui.KOptionPane#PLAIN_MESSAGE}
     * .
     * @param parent a showing component which is the parent for this dialog
     * @param message the message to display to the user
     * @param title the title to use for the message box
     * @param listener the listener to notify when the message box is closed
     * @exception java.lang.IllegalArgumentException if the parent is not a showing child of a Kindlet
     * @exception java.lang.IllegalStateException if another dialog is already visible
     */
    public static void showMessageDialog(java.awt.Component parent, java.lang.String message, java.lang.String title, com.amazon.kindle.kindlet.ui.KOptionPane.MessageDialogListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * A listener that is notified when a confirmation dialog is closed.
     */
    public static interface ConfirmDialogListener {

        /**
         * Called when the confirm dialog is closed.
         * @param option a constant indicating what option the user selected
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
         * @param value the value the user supplied or null if the user canceled
         *             input
         */
        abstract void onClose(java.lang.String value);
    }
}
