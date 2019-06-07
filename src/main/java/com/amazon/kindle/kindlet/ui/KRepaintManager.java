/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * KRepaintManager provides Kindlets with more precise control over the
 * repaint logic.  Due to limitations of the eInk display it is often desirable
 * to hand-tune repaints and eInk refreshes.
 *
 * These functions must be called from within the AWT event loop.
 */
public abstract class KRepaintManager {

    public KRepaintManager() {
    // TODO codavaj!!
    }

    /**
     * Adds a specific region of a specific component to the dirty region list
     * for later update by
     * {@link com.amazon.kindle.kindlet.ui.KRepaintManager#paintDirtyRegions(boolean)}
     * .
     *
     * The coordinates supplied should be relative to the component - (0,0) is
     * the upper-left of the component. This method should only be called from inside
     * the event loop thread else throws
     * {@link java.lang.IllegalStateException}
     * .
     * @param component the component to repaint
     * @param x x coordinate of the upper left of the rectangle to be updated
     * @param y y coordinate of the upper left of the rectangle to be updated
     * @param w the width of the rectangle to be updated
     * @param h the height of the rectangle to be updated
     * @throws java.lang.IllegalStateException if this is called outside of the event loop thread.
     */
    public abstract void addDirtyRegion(java.awt.Component component, int x, int y, int w, int h) throws java.lang.IllegalStateException;

    /**
     * Retrieves the repaint manager for the supplied component, or null if the component
     * does not exist in the visible hierachy.
     * @param component the component whose repaint manager is needed
     * @return a repaint manager suitable for the requested component
     */
    public static com.amazon.kindle.kindlet.ui.KRepaintManager currentManager(java.awt.Component component) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Calls
     * {@link com.amazon.kindle.kindlet.ui.KRepaintManager#paintDirtyRegions(boolean)}
     * with false
     * as the argument (no full refresh). This method should only be called from inside
     * the event loop thread else throws
     * {@link java.lang.IllegalStateException}
     * .
     * @throws java.lang.IllegalStateException if this is called outside of the event loop thread.
     */
    public void paintDirtyRegions() throws java.lang.IllegalStateException {
        // TODO codavaj!!
        return;
    }

    /**
     * Paints any regions previously queued to the screen, optionally with a
     * full eInk refresh.
     *
     * eInk technology leaves a small amount of "ghosting" which is visible to end
     * users.  It is possible to minimize the visibility of ghosting by flashing the
     * screen - however, this is slower and noticeable to the end-user so it should be
     * used with care and only when necessary. This method should only be called from inside
     * the event loop thread else throws
     * {@link java.lang.IllegalStateException}
     * .
     * @param fullRefresh requests that the dirty regions be fully refreshed to minimize ghosting.
     * @throws java.lang.IllegalStateException if this is called outside of the event loop thread.
     */
    public abstract void paintDirtyRegions(boolean fullRefresh) throws java.lang.IllegalStateException;

    /**
     * Paints a component via the KRepaintManager immediately and blocks until
     * the paint is complete.  The full component is repainted.
     *
     * If this is called from within the event loop thread, then it paints immediately.  If
     * it is called from outside the event loop thread, it places a request to repaint on
     * the queue and blocks the calling thread until that repaint has executed.
     * @param component the component to paint
     * @param fullRefresh if true flash to minimize ghosting
     * @throws java.lang.InterruptedException if the thread was interrupted while waiting (the paint may still happen)
     * @throws java.lang.reflect.InvocationTargetException if an exception was thrown during the attempt to paint
     */
    public static void paintImmediately(java.awt.Component component, boolean fullRefresh) throws java.lang.InterruptedException, java.lang.reflect.InvocationTargetException {
        // TODO codavaj!!
        return;
    }

    /**
     * Paints a region of a component via the KRepaintManager immediately and blocks until
     * the paint is complete.
     *
     * If this is called from within the event loop thread, then it paints immediately.  If
     * it is called from outside the event loop thread, it places a request to repaint on
     * the queue and blocks the calling thread until that repaint has executed.
     * @param component the component to paint
     * @param region the region of the component to paint
     * @param fullRefresh if true flash to minimize ghosting
     * @throws java.lang.InterruptedException if the thread was interrupted while waiting (the paint may still happen)
     * @throws java.lang.reflect.InvocationTargetException if an exception was thrown during the attempt to paint
     */
    public static void paintImmediately(java.awt.Component component, java.awt.Rectangle region, boolean fullRefresh) throws java.lang.InterruptedException, java.lang.reflect.InvocationTargetException {
        // TODO codavaj!!
        return;
    }
}
