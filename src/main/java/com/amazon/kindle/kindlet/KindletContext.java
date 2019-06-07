/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet;

/**
 * Represents the Kindle application's environment for a
 * {@link com.amazon.kindle.kindlet.Kindlet}
 * . The context
 * provides access to the Kindlet's user interface, filesystem space, network connectivity
 * and more.
 *
 * It is safe for a Kindlet to maintain a reference to the KindletContext for it's
 * entire lifetime.
 * @since 1.0
 * @see {@link com.amazon.kindle.kindlet.Kindlet}
 */
public interface KindletContext {

    /**
     * Returns access to network connectivity. All applications using the network should
     * use the Connectivity API to request that the device connect to the
     * network.
     * @return a reference which can be used to inquire about network connectivity
     * @throws java.lang.SecurityException if the Kindlet is not approved for network access
     */
    abstract com.amazon.kindle.kindlet.net.Connectivity getConnectivity();

    /**
     * Returns the home directory for an application's data. This is the directory where the application may read
     * and write files.  This directory exists on a file system that may be readable by host computers when
     * the Kindle is connected via USB cable; thus, sensitive data stored in this directory (passwords, user
     * preferences) should be encrypted (see
     * {@link com.amazon.kindle.kindlet.KindletContext#getSecureStorage()}
     * ).
     *
     * Data in this directory is deleted when the user removes the application from the device, but is preserved
     * across upgrades of the application. Applications that need stronger durability should arrange to store
     * data off the device.
     * @return the application's home directory
     * @see {@link com.amazon.kindle.kindlet.security.SecureStorage}
     */
    abstract java.io.File getHomeDirectory();

    /**
     * Gets an object that provides access to the device's current orientation and allows
     * manipulation of the current orientation.
     * @return an orientation controller
     */
    abstract com.amazon.kindle.kindlet.ui.OrientationController getOrientationController();

    /**
     * Returns a progress indicator for communicating that the application is busy or working
     * on a long running task.
     * @return an progress indicator to provide the user with feedback
     */
    abstract com.amazon.kindle.kindlet.ui.KProgress getProgressIndicator();

    /**
     * Obtains the Container which serves as the root of the application's user
     * interface.  This container will fill the available screen space and has a
     *
     * {@link java.awt.BorderLayout}
     * by default.
     *
     * A Kindle application does not have access to a Window or Frame.
     * Much like a JApplet all components, layouts, etc. should be added to this
     * container.
     * @return a Container for the application's user interface
     */
    abstract java.awt.Container getRootContainer();

    /**
     * Returns a secure area to store small amounts of private data.
     * @return an structured storage instance that stores private data securely
     */
    abstract com.amazon.kindle.kindlet.security.SecureStorage getSecureStorage();

    /**
     * Returns an object that provides access to common user interface resources. This
     * includes supported Color and Font instances for the device.
     *
     * These resources can also be referenced via
     * {@link com.amazon.kindle.kindlet.ui.KindletUIResources#getInstance()}
     * .
     * @return the user interface resources for this device
     */
    abstract com.amazon.kindle.kindlet.ui.KindletUIResources getUIResources();

    /**
     * Registers a menu for the application.  This menu is activated when the
     * user presses the
     * <I>Menu</I>
     * key.
     * @param menu menu to display to user, or null to remove the menu
     */
    abstract void setMenu(com.amazon.kindle.kindlet.ui.KMenu menu);

    /**
     * Sets the subtitle of this application for display in the status bar at the top of the screen.
     * The name of the Kindlet is always displayed first.
     * @param subtitle the subtitle
     */
    abstract void setSubTitle(java.lang.String subtitle);

    /**
     * Registers a configuration menu to show when the Kindle's
     * <I>Text</I>
     * key is pressed.
     * Commonly used to adjust font size, orientation and other display properties. The
     * KTextOptionPane can be used for any manner of small, easy to access
     * configuration properties.
     * @param option the configuration menu, or null to remove the menu
     */
    abstract void setTextOptionPane(com.amazon.kindle.kindlet.ui.KTextOptionPane option);
}
