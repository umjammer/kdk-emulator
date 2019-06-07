/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.net;

/**
 * Interface to receive a notification when the network has become
 * available or is determined to be unavailable.
 * @see {@link com.amazon.kindle.kindlet.net.Connectivity}
 */
public interface ConnectivityHandler {

    /**
     * Called once (per submission) when the network is available.
     * Note that it is possible that the network becomes unavailable again
     * before this method is actually executed. This will commonly show up as
     * an IOException during the network connection. Applications should
     * respond to errors by issuing a new connectivity request if this happens.
     * @throws java.lang.InterruptedException Implementors of this interface must not
     *          "absorb" InterruptedExceptions thrown from within this
     *          method. Doing so may cause an application to exit abnormally under
     *          some circumstances.
     *          If your application needs to handle these exceptions in some manner
     *          be sure to re-mark the current thread as Interrupted like thus:
     *
     *          public void connected() throws InterruptedException {
     *              try {
     *                  myInterruptableMethod();
     *              } catch (InterruptedException e) {
     *                  // do something with this exception here
     *                  // then re-mark the current Thread as being
     *                  // interrupted...
     *                  Thread.currentThread().interrupt();
     *              }
     *          }
     */
    abstract void connected() throws java.lang.InterruptedException;

    /**
     * Called when network access is disabled.  This can
     * occur in response to cases including but not limited to:
     * a user choosing not to enable the network after being prompted,
     * a user's subscription expiring, an application exceeding its allowed
     * bandwidth, a roaming device not authorized to access the network, etc.
     * See
     * {@link com.amazon.kindle.kindlet.net.NetworkDisabledReason}
     * for more information.
     * @param details details on why network access is disabled
     * @throws java.lang.InterruptedException Implementors of this interface must not
     *          "absorb" InterruptedExceptions thrown from within this
     *          method. Doing so may cause an application to exit abnormally under
     *          some circumstances.
     *          If your application needs to handle these exceptions in some manner
     *          be sure to re-mark the current thread as Interrupted like thus:
     *
     *          public void connected() throws InterruptedException {
     *              try {
     *                  myInterruptableMethod();
     *              } catch (InterruptedException e) {
     *                  // do something with this exception here
     *                  // then re-mark the current Thread as being
     *                  // interrupted...
     *                 Thread.currentThread().interrupt();
     *              }
     *          }
     *
     * @see {@link com.amazon.kindle.kindlet.net.NetworkDisabledDetails}
     */
    abstract void disabled(com.amazon.kindle.kindlet.net.NetworkDisabledDetails details) throws java.lang.InterruptedException;
}
