/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A simple opaque area where an application can attach other components. The
 * default layout is a FlowLayout. Serialization of this class is not supported
 * in this version.
 * 
 * @see Serialized Form
 */
public class KPanel extends com.amazon.kindle.kindlet.ui.KComponent {
    /**
     * Creates a new KPanel with a .
     */
    public KPanel() {
        // TODO codavaj!!
    }

    /**
     * Creates a new KPanel with the specified layout manager.
     * 
     * @param layout - the default LayoutManager for this panel
     */
    public KPanel(java.awt.LayoutManager layout) {
        // TODO codavaj!!
    }

    /**
     * KPanel always draws it background by default. Subclasses should call the
     * parent's paint or make sure to draw the background.
     */
    public boolean isOpaque() {
        return false; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics g) {
        return; // TODO codavaj!!
    }

}
