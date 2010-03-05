/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.net;


/**
 * Thrown to indicate that the application's current connectivity status does
 * now allow creation of network connections. Callbacks from
 * Connectivity.submitConnectivityRequest(ConnectivityHandler) provide more
 * details.
 * 
 * @see Connectivity.submitConnectivityRequest(ConnectivityHandler)
 * @see NetworkDisabledDetails
 */
public class ConnectivityStateException extends java.io.IOException {

    /**
     * Constructs a new ConnectivityStateException with no detail message.
     */
    public ConnectivityStateException() {
        super();
    }

    /**
     * Constructs a new ConnectivityStateException with the given detail
     * message.
     * 
     * @param msg - the exception message
     */
    public ConnectivityStateException(java.lang.String msg) {
        super(msg);
    }
}
