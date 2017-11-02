/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.pages;


/**
 * A class that converts an Object into a suitable Component for display and
 * possible manipulation. Conceptually, this class is similar to cell renderers
 * in Swing, except that the components are not just used for rendering and are
 * actually added to a container, so the provider must ensure that if the same
 * component is returned that it won't result in that component being added to
 * the page multiple times.
 */
public interface ComponentProvider {

    /**
     * Returns a Component that can be used to display the supplied object. If
     * this provider can not process the supplied object it should return null.
     */
    abstract java.awt.Component getComponent(java.lang.Object object);
}
