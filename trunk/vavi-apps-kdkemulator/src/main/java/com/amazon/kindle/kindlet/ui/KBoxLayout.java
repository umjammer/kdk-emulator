/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * An layout manager which arranges items into a sequence of boxes along either
 * the x or y axis. Based on the available space, the layout attempts to get
 * components as close to their preferred size as possible, while honoring
 * minimums and maximums. If there is extra space, it is allocated relative to
 * the maximum amount each component can consume. Similarly, if there is too
 * little space, it is removed relative to the maximum amount each component can
 * lose. For example, if there are two components each with a preferred size of
 * 10, but with maximums of 20 and 30, an extra space of 10 pixels would result
 * in an allocation of 13 and 17 respectively. Along the other axis, components
 * are granted as much space as the largest component or as much space is
 * available, honoring any minimums and maximums. If the component is smaller
 * than the space available it is aligned to the middle based on its component
 * alignment in the relevant direction. (See Component.getAlignmentX() and
 * Component.getAlignmentY()). Example Since extra space is allotted based on
 * the maximum sizes of each component, the distribution can sometimes seem
 * counter-intuitive. Always check the advertised size of the children
 * components when attempting to debug a layout issue. The example to the right
 * contains four simple components and is aligned along the Y_AXIS. As can be
 * seen, each component is aligned based to the common center line based on its
 * x alignment. AA component with a fixed height but unlimited width. BA
 * component with a maximum size smaller than the container i and an x alignment
 * of 0.5f CA component with a maximum size smaller than the container i and an
 * x alignment of 0.0f DA glue component. (See KBox.createGlue().) A KBoxLayout
 * layout instance may not be shared among more than one container. This
 * implementation is intended to be compatible with javax.swing.BoxLayout.
 * (Except that it may not replicate some bugs found in the various versions of
 * Swing.)
 * 
 * @see KBox, javax.swing.BoxLayout
 */
public class KBoxLayout implements java.awt.LayoutManager2 {
    /**
     * Constant to indicate layout along the axis of a line. The PBP does not
     * support Component orientation, so in this release of the KDK this is the
     * same as the x axis.
     * 
     * @see Constant Field Values
     */
    public static final int LINE_AXIS = 2;

    /**
     * Constant to indicate layout along the axis of a line. The PBP does not
     * support Component orientation, so in this release of the KDK this is the
     * same as the y axis.
     * 
     * @see Constant Field Values
     */
    public static final int PAGE_AXIS = 3;

    /**
     * Constant to indicate horizontal layout (along the x axis).
     * 
     * @see Constant Field Values
     */
    public static final int X_AXIS = 0;

    /**
     * Constant to indicate vertical layout (along the y axis).
     * 
     * @see Constant Field Values
     */
    public static final int Y_AXIS = 1;

    /**
     * Creates a new box-style layout for the supplied container along the
     * specified axis. This layout is specific to the container and can not be
     * shared.
     * 
     * @param container - the container to layoutaxis - the axis to lay out
     *            components along. This must be one of X_AXIS, Y_AXIS,
     *            LINE_AXIS or PAGE_AXIS. Throws: AWTError - if an invalid value
     *            is supplied
     */
    public KBoxLayout(java.awt.Container container, int axis) {
        // TODO codavaj!!
    }

    public void addLayoutComponent(java.awt.Component component, java.lang.Object constraints) {
        return; // TODO codavaj!!
    }

    public void addLayoutComponent(java.lang.String name, java.awt.Component component) {
        return; // TODO codavaj!!
    }

    /**
     * Returns the axis along which components are being arranged.
     */
    public final int getAxis() {
        return 0; // TODO codavaj!!
    }

    public float getLayoutAlignmentX(java.awt.Container container) {
        return 0.0f; // TODO codavaj!!
    }

    public float getLayoutAlignmentY(java.awt.Container container) {
        return 0.0f; // TODO codavaj!!
    }

    /**
     * Returns the container this layout is responsible for.
     */
    public final java.awt.Container getTarget() {
        return null; // TODO codavaj!!
    }

    public void invalidateLayout(java.awt.Container container) {
        return; // TODO codavaj!!
    }

    public void layoutContainer(java.awt.Container container) {
        return; // TODO codavaj!!
    }

    public java.awt.Dimension maximumLayoutSize(java.awt.Container container) {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension minimumLayoutSize(java.awt.Container container) {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension preferredLayoutSize(java.awt.Container container) {
        return null; // TODO codavaj!!
    }

    public void removeLayoutComponent(java.awt.Component component) {
        return; // TODO codavaj!!
    }

}
