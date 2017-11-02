/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.net;


/**
 * Provides details about why network access is disabled for the Kindle
 * Application.
 * 
 * @see ConnectivityHandler.disabled(NetworkDisabledDetails)
 */
public interface NetworkDisabledDetails {

    /**
     * Gets a human readable description of the network disabled reason and
     * details that can be used to inform the user of the situation. Note that
     * the message might not be localized on some devices and KDK versions;
     * applications should still use it however, to ensure they take advantage
     * of localization when available.
     */
    abstract java.lang.String getLocalizedMessage();

    /**
     * Gets the reason the network is disabled.
     */
    abstract com.amazon.kindle.kindlet.net.NetworkDisabledReason getReason();
}
