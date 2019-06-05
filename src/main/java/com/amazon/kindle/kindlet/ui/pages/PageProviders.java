/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui.pages;

/**
 * This class provides factory methods for a variety of different
 * {@link com.amazon.kindle.kindlet.ui.pages.PageProvider}
 * instances - suited for most of the layouts included KDK.
 */
public final class PageProviders {

    public PageProviders() {
    // TODO codavaj!!
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.FlowLayout}
     * .
     *
     * All settings are the defaults for a FlowLayout.
     * @return a provider that displays the items flowed in the page
     * @see {@link java.awt.FlowLayout#FlowLayout()}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.FlowLayout}
     * .
     *
     * All settings are the defaults for a FlowLayout.
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays the items flowed in the page
     * @see {@link java.awt.FlowLayout#FlowLayout()}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.FlowLayout}
     * .
     *
     * Gap settings are the defaults for a FlowLayout.
     * @param alignment the alignment of the flow (one of {@link java.awt.FlowLayout#CENTER},
     *         {@link java.awt.FlowLayout#LEFT} or {@link java.awt.FlowLayout#RIGHT}).
     * @return a provider that displays the items flowed in the page
     * @see {@link java.awt.FlowLayout#FlowLayout(int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.FlowLayout}
     * .
     *
     * Gap settings are the defaults for a FlowLayout.
     * @param alignment the alignment of the flow (one of {@link java.awt.FlowLayout#CENTER},
     *         {@link java.awt.FlowLayout#LEFT} or {@link java.awt.FlowLayout#RIGHT}).
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays the items flowed in the page
     * @see {@link java.awt.FlowLayout#FlowLayout(int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.FlowLayout}
     * .
     * @param alignment the alignment of the flow (one of {@link java.awt.FlowLayout#CENTER},
     *         {@link java.awt.FlowLayout#LEFT} or {@link java.awt.FlowLayout#RIGHT}).
     * @param hgap the horizontal gap between components
     * @param vgap the vertical gap between components
     * @return a provider that displays the items flowed in the page
     * @see {@link java.awt.FlowLayout#FlowLayout(int, int, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment, int hgap, int vgap) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.FlowLayout}
     * .
     * @param alignment the alignment of the flow (one of {@link java.awt.FlowLayout#CENTER},
     *         {@link java.awt.FlowLayout#LEFT} or {@link java.awt.FlowLayout#RIGHT}).
     * @param hgap the horizontal gap between components
     * @param vgap the vertical gap between components
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays the items flowed in the page
     * @see {@link java.awt.FlowLayout#FlowLayout(int, int, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFlowLayoutProvider(int alignment, int hgap, int vgap, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where each item in the page model is given a full page regardless
     * of the item or its size.
     *
     * Each full page is a container which places the page element in the center of a
     *
     * {@link java.awt.BorderLayout}
     * .
     *
     * The
     * {@link com.amazon.kindle.kindlet.ui.pages.DefaultComponentProvider}
     * is used to generate components.
     * @return a provider that displays one item per page
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFullPageProvider() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where each item in the page model is given a full page regardless
     * of the item or its size.
     *
     * Each full page is a container which places the page element in the center of a
     *
     * {@link java.awt.BorderLayout}
     * .
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays one item per page
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createFullPageProvider(com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.GridLayout}
     * .
     *
     * One of rows and columns must be specified. If both are specified, that is the number
     * desired per page.
     *
     * Gaps are the default for a GridLayout.
     * @param rows the number of rows for the grid, or 0 for unspecified
     * @param columns the number of columns for the grid, or 0 for unspecified
     * @return a provider that displays the items in a grid
     * @see {@link java.awt.GridLayout#GridLayout(int, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.GridLayout}
     * .
     *
     * One of rows and columns must be specified. If both are specified, that is the number
     * desired per page.
     *
     * Gaps are the default for a GridLayout.
     * @param rows the number of rows for the grid, or 0 for unspecified
     * @param columns the number of columns for the grid, or 0 for unspecified
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays the items in a grid
     * @see {@link java.awt.GridLayout#GridLayout(int, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.GridLayout}
     * .
     *
     * One of rows and columns must be specified. If both are specified, that is the number
     * desired per page.
     * @param rows the number of rows for the grid, or 0 for unspecified
     * @param columns the number of columns for the grid, or 0 for unspecified
     * @param hgap the horizontal gap between columns
     * @param vgap the vertical gap between rows
     * @return a provider that displays the items in a grid
     * @see {@link java.awt.GridLayout#GridLayout(int, int, int, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns, int hgap, int vgap) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link java.awt.GridLayout}
     * .
     *
     * One of rows and columns must be specified. If both are specified, that is the number
     * desired per page.
     * @param rows the number of rows for the grid, or 0 for unspecified
     * @param columns the number of columns for the grid, or 0 for unspecified
     * @param hgap the horizontal gap between columns
     * @param vgap the vertical gap between rows
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays the items in a grid
     * @see {@link java.awt.GridLayout#GridLayout(int, int, int, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createGridLayoutProvider(int rows, int columns, int hgap, int vgap, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link com.amazon.kindle.kindlet.ui.KBoxLayout}
     * .
     *
     * Each page of items is computed by fitting as many items at their preferred size as
     * possible along the axis. To avoid extraneous whitespace, if extra space exists after giving
     * items their preferred sizes, and it is large than the next item's minimum size, the item
     * can be added to the page.
     * @param axis the axis to layout the components along.  See {@link com.amazon.kindle.kindlet.ui.KBoxLayout#X_AXIS},
     *              {@link com.amazon.kindle.kindlet.ui.KBoxLayout#Y_AXIS},
     *              {@link com.amazon.kindle.kindlet.ui.KBoxLayout#PAGE_AXIS}, and
     *              {@link com.amazon.kindle.kindlet.ui.KBoxLayout#LINE_AXIS}.
     * @return a provider that displays the items in a stack
     * @see {@link com.amazon.kindle.kindlet.ui.KBoxLayout#KBoxLayout(java.awt.Container, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createKBoxLayoutProvider(int axis) {
        // TODO codavaj!!
        return null;
    }

    /**
     * Creates a provider where items from the page model are placed in a panel with a
     *
     * {@link com.amazon.kindle.kindlet.ui.KBoxLayout}
     * .
     *
     * Each page of items is computed by fitting as many items at their preferred size as
     * possible along the axis. To avoid extraneous whitespace, if extra space exists after giving
     * items their preferred sizes, and it is large than the next item's minimum size, the item
     * can be added to the page.
     * @param axis the axis to layout the components along.  See {@link com.amazon.kindle.kindlet.ui.KBoxLayout#X_AXIS},
     *              {@link com.amazon.kindle.kindlet.ui.KBoxLayout#Y_AXIS},
     *              {@link com.amazon.kindle.kindlet.ui.KBoxLayout#PAGE_AXIS}, and
     *              {@link com.amazon.kindle.kindlet.ui.KBoxLayout#LINE_AXIS}.
     * @param componentProvider produces components for the items in the page model
     * @return a provider that displays the items in a stack
     * @see {@link com.amazon.kindle.kindlet.ui.KBoxLayout#KBoxLayout(java.awt.Container, int)}
     */
    public static com.amazon.kindle.kindlet.ui.pages.PageProvider createKBoxLayoutProvider(int axis, com.amazon.kindle.kindlet.ui.pages.ComponentProvider componentProvider) {
        // TODO codavaj!!
        return null;
    }
}
