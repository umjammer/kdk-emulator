/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.net;


/**
 * Provides information about the current network connectivity of the Kindle
 * device via a task submission mechanism. Applications are only permitted to
 * use HTTP and HTTPS to connect to remote servers. Socket connections or other
 * protocols are not supported by the Kindle Development Kit. Developers can use
 * the standard URLConnection, HttpURLConnection, and
 * {@link javax.net.ssl.HttpsURLConnection} classes to perform actual networking. This
 * class provides the application with knowledge of the availability of the
 * actual network to make such connections. The Kindle device is a portable
 * wireless device. To save battery and deal with changing networking
 * conditions, the actual connectivity of the Kindle may vary. The standard
 * pattern for working with the network on a Kindle device is to submit a
 * request to use the network and then, when that request is successful, proceed
 * with the network request. If normal exceptions are thrown during the
 * processing of the request, they may indicate problems with the connection, or
 * they may indicate a change in the state of the connection. The simplest way
 * to handle these exceptions (after informing the user) is to simply submit a
 * new request for connectivity.
 * 
 * <pre>
 * final ConnectivityHandler handler = new ConnectivityHandler() {
 *   public void connected() {
 *     try {
 *       // Perform network activity, handling HTTP status codes as
 *       // expected
 *     } catch (IOException e) {
 *       if (tryAgain) {
 *         connectivity.submitConnectivityRequest(this);
 *       } else { // Let the user know
 *         something went wrong
 *       }
 *     }
 *   }
 *   public void disabled(NetworkDisabledDetails details) {
 *     // Let the user know that the network is not working
 *     // by using
 *     details.getLocalizedMessage()
 *   }
 * }
 * </pre>
 * 
 * Requests for connectivity execute in a separate set of threads than other
 * events. This permits applications to do work, as needed, directly in the
 * handler without blocking the user interface. However, it does mean that any
 * modifications to the user interface need to be dispatched via
 * {@link EventQueue.invokeLater(Runnable)} or {@link EventQueue.invokeAndWait(Runnable)}. Note:
 * All connections are terminated while the Kindlet is shutting down.
 * 
 * @see KindletContext.getConnectivity(), ConnectivityHandler,
 *      ConnectivityStateException, URLConnection
 */
public interface Connectivity {

    /**
     * Cancels all pending connectivity requests.
     */
    abstract void cancelAllConnectivityRequests();

    /**
     * Cancels a specific connectivity request.
     */
    abstract void cancelConnectivityRequest(com.amazon.kindle.kindlet.net.ConnectivityHandler notification);

    /**
     * Hints if the device is, at this moment, connected to a network. When
     * false, this is a good indication that a request for network access will
     * incur some penalty in terms of latency and power usage. However, the
     * result from this function does not guarantee anything. The network state
     * may be in flux at any time. Developer's should not assume that a true
     * here means that latency, etc. won't be experience on a subsequent network
     * access. Developers are strongly encouraged to use
     * {@link #submitConnectivityRequest(ConnectivityHandler)} in all circumstance.
     */
    abstract boolean isConnected();

    /**
     * Requests a one-time notification when the network becomes available
     * again. If the network is already available, the notification will happen
     * as soon as possible. Registering for a notification implies that the
     * application is interested in making a network connection. Registering for
     * this notification may cause the user to be prompted if the network has
     * been deactivated by the user. Note that even after receiving the
     * callback, an error might occur resulting in the network disconnecting
     * before the actual connection can be made. Although it is possible to
     * register several callbacks for notification, each callback will only be
     * called once. A notification can re-register itself during the
     * notification callback.
     */
    abstract void submitConnectivityRequest(com.amazon.kindle.kindlet.net.ConnectivityHandler notification);
}
