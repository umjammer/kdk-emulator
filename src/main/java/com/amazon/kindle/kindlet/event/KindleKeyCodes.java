/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.event;


/**
 * Contains constants for the Kindle specific hardware keys. Not all Kindle
 * devices will produce keystrokes with all of these constants. In particular,
 * some Kindle models have substantially different keyboard layouts. When
 * designing a user experience developers should be particularly careful of
 * combinations involving the 'Alt' key. This key is used to activate the
 * numeric keys on the Kindle DX. Example Kindle Keyboard Additionally, the Alt
 * key (KeyEvent.VK_ALT) does not produce any key events on its own - but will
 * still appear as a modifier for other keys. Several keys have special
 * behaviors, depending upon the state of the system. The Menu and Text keys
 * both are only delivered to the application if the application has not
 * registered a respective menu for them. See KindletContext.setMenu(KMenu) and
 * KindletContext.setTextOptionPane(KTextOptionPane) for more details. The Back
 * key is delivered to the application, but if it is not consumed returns the
 * user to the last activity before entering the application. It is recommended
 * that developers do not consume the back key if the application has no logical
 * "back". The Alt-Shift-G key combination is reserved by the system to take
 * screen shots. The volume keys are controlled by the Kindle system and not
 * available to applications. Home is reserved for exiting applications and is
 * not available for use by the application. Since: 1.0 See Also:KeyEvent
 */
public final class KindleKeyCodes {

    /**
     * Key code for the back button. If the back button is not consumed, the
     * Kindle's standard back processing will process the event in during key
     * event post-processing. Applications that want to handle the Back button
     * on their own should use it to move the user back a 'logical' step.
     * Exactly what this means will vary from application to application.
     * However, for the correct user experience it is vital that an application
     * not consume the back events if there is no logical step to move back
     * within the application. This will allow the Kindle system to take the
     * user back to their previous activity.
     * 
     * @see Constant Field Values
     */
    public static final int VK_BACK = 61441;

    /**
     * Key code for pressing down on the five-way controller.
     * 
     * @see Constant Field Values
     */
    public static final int VK_FIVE_WAY_DOWN = 34;

    /**
     * Key code for pressing left on the five-way controller.
     * 
     * @see Constant Field Values
     */
    public static final int VK_FIVE_WAY_LEFT = 37;

    /**
     * Key code for pressing right on the five-way controller.
     * 
     * @see Constant Field Values
     */
    public static final int VK_FIVE_WAY_RIGHT = 39;

    /**
     * Key code pressing in ("select") on the five-way controller.
     * 
     * @see Constant Field Values
     */
    public static final int VK_FIVE_WAY_SELECT = 61451;

    /**
     * Key code for pressing up on the five-way controller.
     * 
     * @see Constant Field Values
     */
    public static final int VK_FIVE_WAY_UP = 33;

    /**
     * Deprecated. Key code for the key, frequently used to control font size
     * and other display properties.
     * 
     * @see VK_TEXT, Constant Field Values
     */
    public static final int VK_FONT_SIZE = 61447;

    /**
     * Key code for the left-side next page button.
     * 
     * @see Constant Field Values
     */
    public static final int VK_LEFT_HAND_SIDE_TURN_PAGE = 61449;

    /**
     * Key code for the menu button.
     * 
     * @see Constant Field Values
     */
    public static final int VK_MENU = 65482;

    /**
     * Key code for the right-side next page button.
     * 
     * @see Constant Field Values
     */
    public static final int VK_RIGHT_HAND_SIDE_TURN_PAGE = 61448;

    /**
     * Key code for the symbol key.
     * 
     * @see Constant Field Values
     */
    public static final int VK_SYMBOL = 61443;

    /**
     * Key code for the key, frequently used to control font size and other
     * display properties.
     * 
     * @see Constant Field Values
     */
    public static final int VK_TEXT = 61447;

    /**
     * Key code for the previous page button.
     * 
     * @see Constant Field Values
     */
    public static final int VK_TURN_PAGE_BACK = 61450;
}
