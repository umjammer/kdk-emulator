/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Object that provides style properties for the current runtime/device.
 */
public abstract class KindletUIResources {

    public KindletUIResources() {
    // TODO codavaj!!
    }

    /**
     * Return a Color object for the given KColor value. In case a given device
     * does not support all KColors then a default background color will be returned.
     * @param inKColor KColor constant to retrieve a Color instance for.
     * @return A java.awt.Color instance that is set to the device specific best values
     *          for the given KColor constant.
     */
    public abstract java.awt.Color getBackgroundColor(com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName inKColor);

    /**
     * Return a Color object that maps to a background color closest to the provided
     * color name. Unrecognized or unsupported color names will map to a default
     * background color value. This method will always return a color.
     * @param inColorName A color name to get a device optimized Color value for.
     * @return A java.awt.Color instance that is set to the device specific best values
     *          for the given color name or a Color object set to a default background
     *          color if the color name was unrecognized or unsupported.
     */
    public abstract java.awt.Color getBackgroundColor(java.lang.String inColorName);

    /**
     * Returns the default font for a given font-family supported by the system
     * of a size appropriate for rendering larger blocks of text. On some devices
     * this size will be determined by the user's preferences and may change while
     * the application is running. For this reason we suggest you call this method
     * every time you need a body font rather then caching the font returned by
     * any single invocation.
     * @param inFontFamily The font family to get the default font face for.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getBodyFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily);

    /**
     * Returns the default font for a given font-family supported by the system
     * of a size appropriate for rendering larger blocks of text. On some devices
     * this size will be determined by the user's preferences and may change while
     * the application is running. For this reason we suggest you call this method
     * every time you need a body font rather then caching the font returned by
     * any single invocation.
     * @param inFontFamily The font family to get the default font face for.
     * @param inAntiAlias If true and if the system has the capability the
     *                       font returned will be anti-aliased when rendered. If false
     *                       then the font rendering may perform better (the performance around this
     *                       is device dependent) but the text will have ragged edges and have
     *                       a lower quality appearance in general.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getBodyFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, boolean inAntiAlias);

    /**
     * Returns the default font for a given font-family supported by the system
     * of a size appropriate for rendering larger blocks of text. On some devices
     * this size will be determined by the user's preferences and may change while
     * the application is running. For this reason we suggest you call this method
     * every time you need a body font rather then caching the font returned by
     * any single invocation.
     * @param inFontFamily The font family to get the default font face for.
     * @param inStyle The style to prefer for the font. If the style is not
     *                       available a different style may be returned. For example;
     *                       if {@link com.amazon.kindle.kindlet.ui.KindletUIResources$KFontStyle#BOLD_ITALIC} is requested but only
     *                       and italic face is available then the italic face is
     *                       returned. If an italic face is also not available, in
     *                       this scenario, then a plan face will be returned.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getBodyFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle inStyle);

    /**
     * Returns the default font for a given font-family supported by the system
     * of a size appropriate for rendering larger blocks of text. On some devices
     * this size will be determined by the user's preferences and may change while
     * the application is running. For this reason we suggest you call this method
     * every time you need a body font rather then caching the font returned by
     * any single invocation.
     * @param inFontFamily The font family to get the default font face for.
     * @param inStyle The style to prefer for the font. If the style is not
     *                       available a different style may be returned. For example;
     *                       if {@link com.amazon.kindle.kindlet.ui.KindletUIResources$KFontStyle#BOLD_ITALIC} is requested but only
     *                       and italic face is available then the italic face is
     *                       returned. If an italic face is also not available, in
     *                       this scenario, then a plan face will be returned.
     * @param inAntiAlias If true and if the system has the capability the
     *                       font returned will be anti-aliased when rendered. If false
     *                       then the font rendering may perform better (the performance around this
     *                       is device dependent) but the text will have ragged edges and have
     *                       a lower quality appearance in general.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getBodyFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle inStyle, boolean inAntiAlias);

    /**
     * Return a Color object for the given KColor value.
     * @param inKColor KColor constant to retrieve a Color instance for.
     * @return A java.awt.Color instance that is set to the device specific best values
     *          for the given KColor constant.
     */
    public abstract java.awt.Color getColor(com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName inKColor);

    /**
     * Return a Color object that maps to a color closest to the provided
     * color name. Unrecognized or unsupported color names will map to a default
     * foreground color value. This method will always return a color.
     * @param inColorName A color name to get a device optimized Color value for.
     * @return A java.awt.Color instance that is set to the device specific best values
     *          for the given color name or a Color object set to a default foreground
     *          color if the color name was unrecognized or unsupported.
     */
    public abstract java.awt.Color getColor(java.lang.String inColorName);

    /**
     * Returns the default font for a given font-family supported by the system.
     * @param inFontFamily The font family to get the default font face for.
     * @param inSize The size of the font to return. Please note that the font
     *                       returned will map to available sizes and may not be the
     *                       exact value specified.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, int inSize);

    /**
     * Returns the default font for a given font-family supported by the system.
     * @param inFontFamily The font family to get the default font face for.
     * @param inSize The size of the font to return. Please note that the font
     *                       returned will map to available sizes and may not be the
     *                       exact value specified.
     * @param inAntiAlias If true and if the system has the capability the
     *                       font returned will be anti-aliased when rendered. If false
     *                       then the font rendering may perform better (the performance around this
     *                       is device dependent) but the text will have ragged edges and have
     *                       a lower quality appearance in general.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, int inSize, boolean inAntiAlias);

    /**
     * Returns the default font for a given font-family supported by the system.
     * @param inFontFamily The font family to get the default font face for.
     * @param inSize The size of the font to return. Please note that the font
     *                       returned will map to available sizes and may not be the
     *                       exact value specified.
     * @param inStyle The style to prefer for the font. If the style is not
     *                       available a different style may be returned. For example;
     *                       if {@link com.amazon.kindle.kindlet.ui.KindletUIResources$KFontStyle#BOLD_ITALIC} is requested but only
     *                       and italic face is available then the italic face is
     *                       returned. If an italic face is also not available, in
     *                       this scenario, then a plan face will be returned.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, int inSize, com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle inStyle);

    /**
     * Returns the default font for a given font-family supported by the system.
     * @param inFontFamily The font family to get the default font face for.
     * @param inSize The size of the font to return. Please note that the font
     *                       returned will map to available sizes and may not be the
     *                       exact value specified.
     * @param inStyle The style to prefer for the font. If the style is not
     *                       available a different style may be returned. For example;
     *                       if {@link com.amazon.kindle.kindlet.ui.KindletUIResources$KFontStyle#BOLD_ITALIC} is requested but only
     *                       and italic face is available then the italic face is
     *                       returned. If an italic face is also not available, in
     *                       this scenario, then a plan face will be returned.
     * @param inAntiAlias If true and if the system has the capability the
     *                       font returned will be anti-aliased when rendered. If false
     *                       then the font rendering may perform better (the performance around this
     *                       is device dependent) but the text will have ragged edges and have
     *                       a lower quality appearance in general.
     * @return A java.awt.Font set to a Font available on this device.
     */
    public abstract java.awt.Font getFont(com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName inFontFamily, int inSize, com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle inStyle, boolean inAntiAlias);

    /**
     * Statically retrieve's a reference to a Kindlet's KindletUIResources object.
     * This object is the same returned from
     * {@link com.amazon.kindle.kindlet.KindletContext#getUIResources()}
     * .
     * @return Global KindletUIResources object.
     */
    public static com.amazon.kindle.kindlet.ui.KindletUIResources getInstance() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Typesafe enumeration of font family names supported by the kindle KDK.
     */
    public static final class KFontFamilyName {

        /**
         * Classifier for font faces for which each glyph (character) is of a fixed
         * width.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName MONOSPACE = null;

        /**
         * Classifier for font faces in latin based languages that lack small
         * decorations at the end of their strokes (serifs). These fonts tend to
         * look more "modern" and work well for larger point sizes as found in
         * titles and headings.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName SANS_SERIF = null;

        /**
         * Classifier for font faces in latin based languages that are more like
         * traditional printed characters with small decorations (serifs) at the
         * end of their strokes. These fonts are preferred for larger blocks of
         * text and smaller point sizes as the serifs aid the eye in moving
         * through lines within blocks of smaller text.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontFamilyName SERIF = null;

        public boolean equals(java.lang.Object inRight) {
            // TODO codavaj!!
            return false;
        }

        public int hashCode() {
            // TODO codavaj!!
            return 0;
        }

        public java.lang.String toString() {
            // TODO codavaj!!
            return null;
        }
    }

    /**
     * Typesafe enumeration of font styles supported by this interface's getFont()
     * methods.
     */
    public static final class KFontStyle {

        /**
         * Bold version of the font.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle BOLD = null;

        /**
         * Bold-italic version of the font.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle BOLD_ITALIC = null;

        /**
         * Italic version of the font.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle ITALIC = null;

        /**
         * Plain or "normal" font face.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KFontStyle PLAIN = null;

        public boolean equals(java.lang.Object inRight) {
            // TODO codavaj!!
            return false;
        }

        /**
         * Retrieve the equivalent Font style value as consumed by java API's.
         * @return Integer that is the equivalent Java Font style as is used
         *          in java Font APIs.
         */
        public int getJavaFontStyle() {
            // TODO codavaj!!
            return 0;
        }

        public int hashCode() {
            // TODO codavaj!!
            return 0;
        }

        public java.lang.String toString() {
            // TODO codavaj!!
            return null;
        }
    }

    /**
     * Typesafe enumeration of color names supported by the Kindle Development Kit. These colors
     * are optimized for the kindle device and will ensure the greatest consistency
     * in rendering shades as well as drawing performance.
     */
    public static final class KColorName {

        /**
         * Darkest shade available on the device.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName BLACK = null;

        /**
         * Shade guaranteed to be visually distinct from white, black, and lightgray on all devices.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName DARK_GRAY = null;

        /**
         * Lightest of the 14 shades of gray supported by the KDK.
         * The developer should take note that while there are 14 shades listed
         * in this enumeration a device may return the same Color value for any
         * two GRAY_NN value. A platform will make the best effort
         * to return visually distinct values but if the hardware cannot support
         * 14 shades of gray plus "black" and "white" then some of the grays will
         * be combined. For adjacent pixels that require visually distinct colors
         * it is recommended that the named colors "white, lightgray, darkgray" and
         * "white" be used. These four values are guaranteed to be
         * visually distinct on all platforms.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_01 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_01 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_01.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_02 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_02 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_02.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_03 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_03 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_03.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_04 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_04 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_04.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_05 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_05 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_05.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_06 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_06 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_06.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_07 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_07 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_07.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_08 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_08 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_08.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_09 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_09 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_09.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_10 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_10 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_10.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_11 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_11 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_11.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_12 = null;

        /**
         * One of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_12 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_12.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_13 = null;

        /**
         * Darkest of the 14 shades of gray supported by the KDK. Most often darker
         * then GRAY_13 but on some platforms it is the same.
         * This shade will never be lighter then GRAY_13.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName GRAY_14 = null;

        /**
         * Lighter shade guaranteed to be visually distinct from white, black,
         * and darkgray on all devices.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName LIGHT_GRAY = null;

        /**
         * Lightest shade available on the device.
         */
        public static final com.amazon.kindle.kindlet.ui.KindletUIResources.KColorName WHITE = null;

        public boolean equals(java.lang.Object inRight) {
            // TODO codavaj!!
            return false;
        }

        /**
         * Operator to test a KColorName instance's equivalence to another object.
         * Unlike
         * {@link java.lang.Object#equals(java.lang.Object)}
         * this "operator" is not
         * symmetric (i.e. a.equivalent(b) does not guarantee that b.equals(a))
         * or transitive. It is reflexive, consistent and null reference values
         * do cause false to be returned.
         * @param inRight The Object to test equivalence against.
         * @return true if the provided object is equivalent to the
         *          KColorName instance else false if it is not.
         */
        public boolean equivalent(java.lang.Object inRight) {
            // TODO codavaj!!
            return false;
        }

        /**
         * Returns this color value's plain name. Plain names are case insensitive
         * English equivalents for a given KColorName value. Note that
         * this class's
         * {@link com.amazon.kindle.kindlet.ui.KindletUIResources$KColorName#toString()}
         * method does not return
         * the color name's plain value. The
         * {@link com.amazon.kindle.kindlet.ui.KindletUIResources$KColorName#equivalent(java.lang.Object)}
         * method
         * will successfully compare plain names with their respective KColorName
         * values however. Developers are encouraged to use the plain name when
         * specifying colors as strings as the toString representation
         * of a given KColorName value may change in future releases
         * of the KDK and should be treated as opaque.
         * @return This KColorName's plain name.
         */
        public java.lang.String getPlainName() {
            // TODO codavaj!!
            return null;
        }

        public int hashCode() {
            // TODO codavaj!!
            return 0;
        }

        public java.lang.String toString() {
            // TODO codavaj!!
            return null;
        }
    }
}
