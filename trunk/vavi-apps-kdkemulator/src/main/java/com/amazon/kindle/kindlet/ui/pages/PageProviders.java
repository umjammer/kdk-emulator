/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui.pages;


/**
 * This class provides factory methods for a variety of different PageProvider
 * instances - suited for most of the layouts included KDK.
 */
public final class PageProviders {
    public PageProviders() {
        // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . All settings are the defaults for a FlowLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . All settings are the defaults for a FlowLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . Gap settings are the defaults for a FlowLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . Gap settings are the defaults for a FlowLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a .
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment, int hgap, int vgap) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a .
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment, int hgap, int vgap, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where each item in the page model is given a full page
     * regardless of the item or its size. Each full page is a container which
     * places the page element in the center of a BorderLayout. The
     * DefaultComponentProvider is used to generate components.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFullPageProvider() {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where each item in the page model is given a full page
     * regardless of the item or its size. Each full page is a container which
     * places the page element in the center of a BorderLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFullPageProvider(com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . One of rows and columns must be specified. If both are
     * specified, that is the number desired per page. Gaps are the default for
     * a GridLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . One of rows and columns must be specified. If both are
     * specified, that is the number desired per page. Gaps are the default for
     * a GridLayout.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . One of rows and columns must be specified. If both are
     * specified, that is the number desired per page.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns, int hgap, int vgap) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . One of rows and columns must be specified. If both are
     * specified, that is the number desired per page.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns, int hgap, int vgap, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . Each page of items is computed by fitting as many items at their
     * preferred size as possible along the axis. To avoid extraneous
     * whitespace, if extra space exists after giving items their preferred
     * sizes, and it is large than the next item's minimum size, the item can be
     * added to the page.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createKBoxLayoutProvider(int axis) {
        return null; // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel
     * with a . Each page of items is computed by fitting as many items at their
     * preferred size as possible along the axis. To avoid extraneous
     * whitespace, if extra space exists after giving items their preferred
     * sizes, and it is large than the next item's minimum size, the item can be
     * added to the page.
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createKBoxLayoutProvider(int axis, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        return null; // TODO codavaj!!
    }
}
