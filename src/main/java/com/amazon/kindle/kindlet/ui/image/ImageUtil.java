/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.image;

import java.awt.image.BufferedImage;

/**
 * Utility functions useful for working with images on the Kindle.
 *
 * This class also provides some methods missing in the Personal Basis
 * Profile by providing alternate implementations.
 */
public final class ImageUtil {

    /**
     * Creates an offscreen images with the desired width and height using
     * the Kindle's default
     * {@link java.awt.ColorModel}
     * with the desired
     * support for transparency. These images are created for the default screen
     * device (see
     * {@link java.awt.GraphicsEnvironment#getDefaultScreenDevice()}
     * ) and
     * a suitable configuration (normally the default, see
     *
     * {@link java.awt.GraphicsDevice#getDefaultConfiguration()}
     * ).
     *
     * In Java SE this is part of
     * {@link java.awt.GraphicsConfiguration}
     * , but
     * the Personal Basis Profile does not provide it, so it is recommended
     * developers use this method instead.
     *
     * <I>Note:</I>
     * Requests for
     * {@link java.awt.Transparency#BITMASK}
     * may return
     * an image supporting
     * {@link java.awt.Transparency#TRANSLUCENT}
     * .  This behavior
     * may change in the future and developers should not rely on it.
     * @param width the width of the image
     * @param height the height of the image
     * @param transparency one of {@link java.awt.Transparency#OPAQUE}, {@link java.awt.Transparency#BITMASK}, or
     *   {@link java.awt.Transparency#TRANSLUCENT}
     * @return a new image of the desired size
     * @exception java.lang.OutOfMemoryError if there is no memory left to create the image
     * @exception java.lang.IllegalArgumentException if the value of transparency is invalid
     */
    public static java.awt.image.BufferedImage createCompatibleImage(int width, int height, int transparency) {
        // TODO transparency
        return new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
    }
}
