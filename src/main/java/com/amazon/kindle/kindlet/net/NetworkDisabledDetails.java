/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.net;

/**
 * Provides details about why network access is disabled for the Kindle Application.
 * @see {@link com.amazon.kindle.kindlet.net.ConnectivityHandler#disabled(com.amazon.kindle.kindlet.net.NetworkDisabledDetails)}
 */
public interface NetworkDisabledDetails {

    /**
     * Gets a human readable description of the network disabled reason and details that
     * can be used to inform the user of the situation.
     *
     * Note that the message might not be localized on some devices and KDK versions;
     * applications should still use it however, to ensure they take advantage of
     * localization when available.
     * @return a human readable description of the reason the network is disabled, intended to
     *          inform the user of the situation
     */
    abstract java.lang.String getLocalizedMessage();

    /**
     * Gets the reason the network is disabled.
     * @return the network is disabled
     */
    abstract com.amazon.kindle.kindlet.net.NetworkDisabledReason getReason();
}
