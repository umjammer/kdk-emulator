/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet;


/**
 * A convenience class which provides empty implementations for each of the life
 * cycle methods required by the Kindlet interface. This class can be extended
 * by developers who do not need to take special actions in various life cycle
 * methods.
 * 
 * @since 1.0
 * @see Kindlet
 */
public abstract class AbstractKindlet implements com.amazon.kindle.kindlet.Kindlet {

    /**
     * Invoked when the application is created. This method will be invoked
     * exactly once during the application's life cycle. It is safe to create
     * and add user interface components from this method since the user
     * interface has not been realized yet. This method is restricted to five
     * seconds of execution time. Expensive operations should be done
     * asynchronously. The instantiation of the class (including the constructor
     * and any static initializers) counts against this five seconds.
     */
    public void create(com.amazon.kindle.kindlet.KindletContext context) {
    }

    /**
     * Invoked when the application will not longer be needed. This method will
     * only be invoked once during an application's life. This method is
     * restricted to five seconds of execution time. Expensive operations should
     * be done asynchronously.
     */
    public void destroy() {
    }

    /**
     * Invoked when the application is about to move to the foreground from a
     * stopped state. This method may be invoked repeatedly during an
     * application's life. The application's root container is made visible
     * after this method executes. This method is restricted to five seconds of
     * execution time. Expensive operations should be done asynchronously.
     */
    public void start() {
    }

    /**
     * Invoked when the application is about to move to the background from a
     * running state. This method may be invoked repeatedly during an
     * application's life. The application's root container is made invisible
     * after this method executes. Applications must close file handles when
     * stop is called since the file system may become inaccessible while the
     * application is stopped. This method is restricted to five seconds of
     * execution time. Expensive operations should be done asynchronously.
     */
    public void stop() {
    }
}
