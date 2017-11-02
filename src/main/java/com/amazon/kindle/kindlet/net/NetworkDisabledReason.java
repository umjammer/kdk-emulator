/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.net;


/**
 * Represents a reason for why access to the network is disabled. Disabled is a
 * separate concept from "not working" or "unstable". When an application
 * determines that the network is disabled, it is unlikely that the network will
 * become available again during the life of the application. It is recommended
 * that, once disabled, developers only attempt to initiate a new network
 * connection when explicitly asked by the user. Note: This class is implemented
 * as a type-safe set of constants. New reasons may be introduced in the future,
 * so applications should always handle the case where none of these reasons
 * match.
 * 
 * @see NetworkDisabledDetails
 * @see ConnectivityHandler.disabled(NetworkDisabledDetails)
 */
public class NetworkDisabledReason {

    /**
     * The current application has been blocked from accessing the network.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason APPLICATION_BLOCKED = null;

    /**
     * This device has currently been blocked from accessing the network.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason DEVICE_BLOCKED = null;

    /**
     * The device is currently roaming and network connectivity is not available
     * for this application in this location.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason DEVICE_ROAMING = null;

    /**
     * The Kindle device is not registered with Amazon.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason DEVICE_UNREGISTERED = null;

    /**
     * This application, on this device, has exceeded its network usage quota.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason QUOTA_EXCEEDED = null;

    /**
     * The network is currently unavailable due to a temporary service
     * interruption.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason SERVICE_UNAVAILABLE = null;

    /**
     * An unknown network error has resulted in the network being disabled. In
     * the future additional reason codes may be introduced, so software should
     * be prepared to handle reasons that don't make any of the codes listed.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason UNKNOWN_ERROR = null;

    /**
     * The network is disabled at the user's request.
     */
    public static final com.amazon.kindle.kindlet.net.NetworkDisabledReason USER_DISABLED = null;

    /**
     * This method should only be use for informational purposes. This method
     * will not produce a consistent result over different versions of the KDK,
     * so no application should build logic based on it. For communicating with
     * the user, please use the localized reasons.
     */
    public java.lang.String toString() {
        return null; // TODO codavaj!!
    }
}
