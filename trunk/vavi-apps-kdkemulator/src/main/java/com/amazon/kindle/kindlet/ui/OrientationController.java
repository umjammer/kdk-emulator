/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * Allows a Kindle Application to control the device's orientation. This
 * controller allows applications that only work in a given orientation to lock
 * the screen to that orientation. To allow the user to change the orientation
 * manually please see KTextOptionOrientationMenu. The device's orientation
 * determines the rotation of the graphics on the screen. When the orientation
 * changes the application's root container will be resized and repainted
 * automatically by the system. Additionally the orientation impacts the
 * five-way controller. When pressed in the direction that is "up" in the
 * current orientation, the five-way will generate events for
 * KindleKeyCodes.VK_FIVE_WAY_UP. Normally, the device's orientation is
 * determined automatically on devices that include an accelerometer. On devices
 * without an accelerometer the orientation can only be controlled manually
 * through the Text menu. If an application locks the orientation using this
 * controller, the orientation will be restored to the previous setting when the
 * application exits.
 * 
 * @see KindletContext.getOrientationController()
 * @see KindleOrientation,
 * @see KTextOptionOrientationMenu
 */
public interface OrientationController {

    /**
     * Gets the device's current orientation.
     */
    abstract int getOrientation();

    /**
     * Sets and locks the device to the given orientation.
     */
    abstract void lockOrientation(int orientation);

    /**
     * Unlocks the device Orientation.
     */
    abstract void unlockOrientation();
}
