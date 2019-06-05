/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Constants representing the possible orientations of the Kindle device.
 *
 * The basic orientations are portrait and landscape.  In portrait, the
 * height of the screen is larger than the width.  Landscape is a 90 degree
 * clockwise rotation from portrait.  An inverted orientation is a 180
 * degree rotation from the corresponding orientation.
 * @see {@link com.amazon.kindle.kindlet.ui.OrientationController}
 */
public final class KindleOrientation {

    /**
     * A 180 degree rotation of
     * {@link com.amazon.kindle.kindlet.ui.KindleOrientation#LANDSCAPE}
     * .
     */
    public static final int INVERTED_LANDSCAPE = 3;

    /**
     * A 180 degree rotation of
     * {@link com.amazon.kindle.kindlet.ui.KindleOrientation#PORTRAIT}
     * .
     */
    public static final int INVERTED_PORTRAIT = 1;

    /**
     * A 90 degree clockwise rotation of
     * {@link com.amazon.kindle.kindlet.ui.KindleOrientation#PORTRAIT}
     * .
     */
    public static final int LANDSCAPE = 2;

    /**
     * Represents the standard orientation of the device whose screen is
     * taller than it is wide.
     */
    public static final int PORTRAIT = 0;
}
