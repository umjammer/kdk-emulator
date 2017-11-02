/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.image;

import java.awt.image.BufferedImage;


/**
 * Utility functions useful for working with images on the Kindle. This class
 * also provides some methods missing in the Personal Basis Profile by providing
 * alternate implementations.
 */
public final class ImageUtil {

    /**
     * Creates an offscreen images with the desired width and height using the
     * Kindle's default with the desired support for transparency. These images
     * are created for the default screen device (see ) and a suitable
     * configuration (normally the default, see ). In Java SE this is part of
     * GraphicsConfiguration, but the Personal Basis Profile does not provide
     * it, so it is recommended developers use this method instead. Note:
     * Requests for {@link #Transparency.BITMASK} may return an image supporting
     * {@link #Transparency.TRANSLUCENT}. This behavior may change in the future and
     * developers should not rely on it.
     */
    public static java.awt.image.BufferedImage createCompatibleImage(int width, int height, int transparency) {
        return new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY); // TODO transparency
    }
}
