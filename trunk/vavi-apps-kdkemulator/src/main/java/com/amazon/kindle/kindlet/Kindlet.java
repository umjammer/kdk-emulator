/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet;


/**
 * Kindle Applications are required to implement this interface to run on the
 * Amazon Kindle. A Kindle Application is a Java program that runs on the Amazon
 * Kindle device. This interface defines the primary steps in the application's
 * life cycle and is the interface applications must implement. The
 * application's life cycle progress through a series of steps between the user
 * launching the application and returning to home. createis the first step in
 * the life cycle. A reference to the application's environment is provided to
 * this method. This method will only be called once during the life of the
 * Kindlet instance. startindicates that the application is about to become
 * active. Upon completion of the start method, the user interface will become
 * visible and the application will start to receive events from the user.
 * Unlike create, start may be called many times during the overall life of the
 * Kindlet instance. For instance, entering and exiting the screensaver results
 * in a stop event followed by a start event. Similar cases exist for USB and
 * other system notifications. stopindicates that the application should stop.
 * The user interface will become invisible shortly after this method completes.
 * Stop will be called on a running application when the Kindle enters USB mode,
 * screensaver or exits the application. When an application is stopped, the
 * file system may disappear. It is important for applications to close
 * resources like files and re-open them on stop / start cycles, respectively.
 * Additionally, any threads that are performing work should either shutdown or
 * sleep. destroyindicates that the Kindlet instance will not be used again.
 * This permits the Kindlet to clean up resources and do any housekeeping that
 * may be necessary on application exit. The device may choose to shutdown an
 * application during screen saver or USB mode to preserve battery life. It is
 * important that life cycle methods execute quickly to ensure a responsive
 * launch. An application is permitted approximately five seconds to complete
 * each life cycle step. More expensive startup (loading files, for instance)
 * should be done asynchronously in a separate thread. Implementors are
 * encouraged to build applications in an event driven manner. If a life cycle
 * exceeds the permitted time, the application will be terminated and the user
 * returns to their previous activity. Life cycle calls are not permitted to
 * throw checked exceptions and are discouraged from explicitly throwing
 * unchecked exceptions. If an exception does occur during a call to a life
 * cycle function, the application will be unloaded and data may be lost - there
 * is no guarantee that stop() or destroy() will be called. The application's
 * life cycle does not execute inside the AWT dispatch thread. It is safe to
 * create user interface components during {@link #create(KindletContext)} and add them
 * to the root container. Once a component has been realized, it is no longer
 * safe to manipulate it from these methods - see
 * {@link EventQueue.invokeLater(Runnable)} and {@link EventQueue.invokeAndWait(Runnable)} for
 * more details on how to execute code inside the dispatch thread. To understand
 * AWT threading in more detail please see the Java documentation. For a clean
 * shutdown of a Kindle application, it is vital that applications respond to
 * requests for interruption. For more details, see Interrupts in the Java
 * Tutorials. There is no life cycle method to indicate when the application's
 * user interface becomes visible. To receive an event when the root container
 * becomes visible please register a ComponentListener with the root container
 * (from {@link KindletContext.getRootContainer()}) and implement
 * {@link ComponentListener.componentShown(java.awt.event.ComponentEvent)}. This
 * technique does not work in general for components, only the root container.
 * 
 * @since 1.0
 * @see AbstractKindlet, KindletContext
 */
public interface Kindlet {
    /**
     * Invoked when the application is created. This method will be invoked
     * exactly once during the application's life cycle. It is safe to create
     * and add user interface components from this method since the user
     * interface has not been realized yet. This method is restricted to five
     * seconds of execution time. Expensive operations should be done
     * asynchronously. The instantiation of the class (including the constructor
     * and any static initializers) counts against this five seconds.
     */
    abstract void create(com.amazon.kindle.kindlet.KindletContext context);

    /**
     * Invoked when the application will not longer be needed. This method will
     * only be invoked once during an application's life. This method is
     * restricted to five seconds of execution time. Expensive operations should
     * be done asynchronously.
     */
    abstract void destroy();

    /**
     * Invoked when the application is about to move to the foreground from a
     * stopped state. This method may be invoked repeatedly during an
     * application's life. The application's root container is made visible
     * after this method executes. This method is restricted to five seconds of
     * execution time. Expensive operations should be done asynchronously.
     */
    abstract void start();

    /**
     * Invoked when the application is about to move to the background from a
     * running state. This method may be invoked repeatedly during an
     * application's life. The application's root container is made invisible
     * after this method executes. Applications must close file handles when
     * stop is called since the file system may become inaccessible while the
     * application is stopped. This method is restricted to five seconds of
     * execution time. Expensive operations should be done asynchronously.
     */
    abstract void stop();
}
