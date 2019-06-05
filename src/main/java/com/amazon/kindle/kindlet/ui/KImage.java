/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A component which displays an image. Support for various modes
 * of image scaling and alignment is provided.
 *
 * When creating a KImage or setting an image via
 * {@link com.amazon.kindle.kindlet.ui.KImage#setImage(java.awt.Image)}
 * this component blocks until the image is ready.  Without blocking, layout
 * is very difficult, since the desired width and height are unknown during
 * validation.
 *
 * If the image is scaled, the scaled version is computed asynchronously.
 * If the component is required to paint itself before the scaled version is
 * ready, the available pixels will be drawn.  Later when the full image is
 * ready another repaint will be issued automatically. Developers can override
 *
 * {@link com.amazon.kindle.kindlet.ui.KImage#onImageReady()}
 * to change this behavior.
 *
 * This class is not thread safe - methods should be called from the AWT event thread.
 *
 * Serialization of this class is not supported in this version.
 */
public class KImage extends com.amazon.kindle.kindlet.ui.KComponent implements java.awt.image.ImageObserver {

    /**
     * Constant for aligning images to the bottom side of the component's area.
     */
    public static final com.amazon.kindle.kindlet.ui.KImage.Alignment ALIGN_BOTTOM = null;

    /**
     * Constant for aligning images to the center of the component's area.
     */
    public static final com.amazon.kindle.kindlet.ui.KImage.Alignment ALIGN_CENTER = null;

    /**
     * Constant for aligning images to the left side of the component's area.
     */
    public static final com.amazon.kindle.kindlet.ui.KImage.Alignment ALIGN_LEFT = null;

    /**
     * Constant for aligning images to the right side of the component's area.
     */
    public static final com.amazon.kindle.kindlet.ui.KImage.Alignment ALIGN_RIGHT = null;

    /**
     * Constant for aligning images to the top side of the component's area.
     */
    public static final com.amazon.kindle.kindlet.ui.KImage.Alignment ALIGN_TOP = null;

    /**
     * When provided as the width or height of the image image, the image will be displayed with
     * no scaling along that dimension and the actual value will be taken from the image itself.
     */
    public static final int FROM_IMAGE = 0;

    /**
     * When provided as the desried width or height of the image, the image will be scaled along that
     * dimension to fit the size of the component, but the aspect ratio will be preserved.
     */
    public static final int SCALE_TO_FIT = -2;

    /**
     * When provided as the width or height of the image, the image will be scaled along that
     * dimension to fit the size of the component preserving the aspect ratio.  However,
     * the image will never scale up.
     */
    public static final int SHRINK_TO_FIT = -1;

    /**
     * When provided as the desired width or height of the image, the image will be stretched along that
     * dimension to fit the size of the component.
     */
    public static final int STRETCH_TO_FIT = -3;

    /**
     * Creates a component that displays the image at its natural size, centered
     * in the component.
     *
     * @param image - the image to display, may be null
     */
    public KImage(java.awt.Image image) {
    // TODO codavaj!!
    }

    /**
     * Creates a component that displays the desired image, at the specified
     * size, in the center of the component.
     *
     * @param image - the image to display, may be nullwidth - the desired
     *            width, or one of the scaling constantsheight - the desired
     *            height, or one of the scaling constants Throws:
     *            IllegalArgumentException - if an invalid argument was
     *            suppliedSee Also:setDesiredSize(int, int)
     */
    public KImage(java.awt.Image image, int width, int height) {
    // TODO codavaj!!
    }

    /**
     * Creates a component which displays the supplied image.
     *
     * @param image - the image to display, may be nullwidth - the desired width
     *            in pixels, or one of the scaling constantsheight - the desired
     *            height in pixels, or one of the scaling
     *            constantshorizontalAlignment - the alignment along the
     *            horizontal axisverticalAlignment - the alignment along the
     *            vertical axis Throws: IllegalArgumentException - if an invalid
     *            argument was suppliedSee Also:setDesiredSize(int, int)
     */
    public KImage(java.awt.Image image, int width, int height, com.amazon.kindle.kindlet.ui.KImage.Alignment horizontalAlignment, com.amazon.kindle.kindlet.ui.KImage.Alignment verticalAlignment) {
    // TODO codavaj!!
    }

    /**
     * Creates a component that displays the image at natural size, aligned in
     * the indicated manner in the component.
     *
     * @param image - the image to display, may be nullhorizontalAlignment - the
     *            alignment along the horizontal axisverticalAlignment - the
     *            alignment along the vertical axis Throws:
     *            IllegalArgumentException - if an invalid argument was supplied
     */
    public KImage(java.awt.Image image, com.amazon.kindle.kindlet.ui.KImage.Alignment horizontalAlignment, com.amazon.kindle.kindlet.ui.KImage.Alignment verticalAlignment) {
    // TODO codavaj!!
    }

    /**
     * Returns the desired height of the image.  If positive this is the pixel size
     * desired for the image, otherwise it corresponds to one of the scaling constants.
     * @return the desired height of the image
     * @see {@link com.amazon.kindle.kindlet.ui.KImage#setDesiredSize(int, int)}
     */
    public int getDesiredHeight() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the desired width of the image.  If positive this is the pixel size
     * desired for the image, otherwise it corresponds to one of the scaling constants.
     * @return the desired width of the image
     * @see {@link com.amazon.kindle.kindlet.ui.KImage#setDesiredSize(int, int)}
     */
    public int getDesiredWidth() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the horizontal alignment of the image within this component.
     * @return the horizontal alignment of the image within the component
     * @see {@link com.amazon.kindle.kindlet.ui.KImage#setHorizontalAlignment(com.amazon.kindle.kindlet.ui.KImage.Alignment)}
     */
    public com.amazon.kindle.kindlet.ui.KImage.Alignment getHorizontalAlignment() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the image used by this component, on null if no
     * image is set.
     * @return the image being displayed
     */
    public java.awt.Image getImage() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMaximumSize() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMinimumSize() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getPreferredSize() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the vertical alignment of the image within this component.
     * @return the vertical alignment of the image within the component
     * @see {@link com.amazon.kindle.kindlet.ui.KImage#setVerticalAlignment(com.amazon.kindle.kindlet.ui.KImage.Alignment)}
     */
    public com.amazon.kindle.kindlet.ui.KImage.Alignment getVerticalAlignment() {
        // TODO codavaj!!
        return null;
    }

    public boolean imageUpdate(java.awt.Image image, int flags, int x, int y, int width, int height) {
        // TODO codavaj!!
        return false;
    }

    /**
     * This function returns false for KImage, since it does not render
     * its background by default.  Placing it in a
     * {@link com.amazon.kindle.kindlet.ui.KPanel}
     * can
     * provide an image that renders its background.
     */
    public boolean isOpaque() {
        // TODO codavaj!!
        return false;
    }

    /**
     * This method is called when scaled image has been completely loaded.  By default
     * this method requests a repaint; however, subclasses can customize this
     * behavior.
     */
    protected void onImageReady() {
        // TODO codavaj!!
        return;
    }

    public void paint(java.awt.Graphics g) {
        // TODO codavaj!!
        return;
    }

    public void setBounds(int x, int y, int width, int height) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the desired size of the image.
     *
     * If a positive value is supplied, the image will be stretched to fit that value.
     * There are several special constants which can be used to obtained varied fit behaviors:
     *
     * Preserve the original dimension of the image.
     * Scale this dimension to fit the other, preserving the aspect ratio.  If both are specified scale to fit, the
     * actual dimensions allocated to the component will determine which is the limited dimension.
     * Preserve the original dimension of the image.  Stretch this dimension to fit the component's size. The image may become smaller, larger or stay the same.
     * Preserve the original dimension of the image.  Shrink the image to fit, preserving aspect ratio.  This ensures an image will never be scaled up.
     */
    public void setDesiredSize(int width, int height) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the horizontal alignment of the image within the component, if the component is wider than the image.
     * @param horizontalAlignment the desired horizontal alignment
     * @exception java.lang.IllegalArgumentException if the supplied alignment is not valid
     */
    public void setHorizontalAlignment(com.amazon.kindle.kindlet.ui.KImage.Alignment horizontalAlignment) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the image rendered by this component. This operation invalidates
     * the component.
     * @param image the image to display or null for none
     */
    public void setImage(java.awt.Image image) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the vertical alignment of the image within the component, if the component is taller than the image.
     * @param verticalAlignment the desired vertical alignment
     * @exception java.lang.IllegalArgumentException if the supplied alignment is not valid
     */
    public void setVerticalAlignment(com.amazon.kindle.kindlet.ui.KImage.Alignment verticalAlignment) {
        // TODO codavaj!!
        return;
    }

    /**
     * A type-safe class representing different image alignments.
     */
    public static class Alignment {

        public java.lang.String toString() {
            // TODO codavaj!!
            return null;
        }
    }
}
