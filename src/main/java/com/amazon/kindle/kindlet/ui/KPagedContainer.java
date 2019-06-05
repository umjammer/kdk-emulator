/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * A container for laying out components across a series of pages.  By supplying
 * a model of the data to be paged and a page provider numerous pages of components
 * can be automatically built and paged over.
 *
 * The
 * {@link com.amazon.kindle.kindlet.ui.pages.PageModel}
 * supplied does not need to be complete at the time of display
 * and pages are loaded dynamically as needed - the model is responsible for any caching.
 *
 * <I>
 * Note: Since the contents of a KPagedContainer come entirely from the model, the
 * standard add and remove methods do not work for this container.
 * For a simple component with a mutable set of pages, see {@link com.amazon.kindle.kindlet.ui.KPages}.
 * </I>
 *
 * The
 * {@link com.amazon.kindle.kindlet.ui.KPagedContainer}
 * does not model headers, footers or margin rendering.  For
 * those features it is possible to use a
 * {@link java.awt.BorderLayout}
 * and register
 *
 * {@link java.beans.PropertyChangeListener}
 * instances to respond to page changes.
 *
 * Like most AWT components the methods on this class are not thread safe.
 */
public class KPagedContainer extends com.amazon.kindle.kindlet.ui.KPanel {

    /**
     * Default set of key strokes used to change to the next page.
     */
    public static final java.util.Set DEFAULT_NEXT_PAGE_KEYS = null;

    /**
     * Default set of key strokes used to change to the previous page.
     */
    public static final java.util.Set DEFAULT_PREVIOUS_PAGE_KEYS = null;

    /**
     * Disables page turn keys for this container.
     */
    public static final int PAGE_KEYS_DISABLED = 2;

    /**
     * Indicates that page turn keys should be handled globally for this container.
     */
    public static final int PAGE_KEYS_GLOBAL = 1;

    /**
     * Indicates that page turn keys should be handled locally for this container.
     */
    public static final int PAGE_KEYS_LOCAL = 0;

    /**
     * Utility used to maintain and notify PropertyChangeListeners.
     */
    protected java.beans.PropertyChangeSupport propertyChangeSupport;

    /**
     * Create a new container that pages over the supplied model.
     *
     * @param pageModel - the model that contains the items for the
     *            pagespageProvider - instance responsible for build a page
     */
    public KPagedContainer(com.amazon.kindle.kindlet.ui.pages.PageModel pageModel, com.amazon.kindle.kindlet.ui.pages.PageProvider pageProvider) {
    // TODO codavaj!!
    }

    /**
     * Adding components directly to this container is not permitted and will throw
     *
     * {@link java.lang.UnsupportedOperationException}
     * .
     */
    protected void addImpl(java.awt.Component component, java.lang.Object constraints, int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Adds a PropertyChangeListener.  The following properties will trigger notifications:
     *
     * the start location ("pageStartLocation")
     *
     * @param listener the listener to be added.  If null, it is ignored.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        // TODO codavaj!!
        return;
    }

    /**
     * Clears and refills the current page, if necessary.
     * This method uses the current start location and fills either forwards
     * or backwards based on the parameter.
     * @param forward if true fill from the start location (inclusive), if false
     *         fill backwards from the start location (exclusive)
     */
    protected void fillPage(boolean forward) {
        // TODO codavaj!!
        return;
    }

    /**
     * Advance to the first page.
     *
     * This command may cause a completely different flow of pages
     * after it executes.
     */
    public void first() {
        // TODO codavaj!!
        return;
    }

    public java.awt.Dimension getMaximumSize() {
        // TODO codavaj!!
        return null;
    }

    public java.awt.Dimension getMinimumSize() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Obtains a read-only set of the keystrokes that are handled
     * by turning to the next page.
     * @return a read-only set of <A href="http://java.sun.com/javame/reference/apis/jsr217/java/awt/AWTKeyStroke.html">AWTKeyStroke</A>
     * @see {@link com.amazon.kindle.kindlet.ui.KPagedContainer#setPageKeyPolicy(int)},
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#setNextPageKeyStrokes(java.util.Set)}
     */
    public java.util.Set getNextPageKeyStrokes() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the end location of the current page, if known.
     * @return the end location of the currnt page, or <A href="http://java.sun.com/javame/reference/apis/jsr217/java/lang/Integer.html#MAX_VALUE">Integer.MAX_VALUE</A>
     */
    public int getPageEndLocation() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the current page turn key policy for this container.
     * @return the page turn policy
     * @see {@link com.amazon.kindle.kindlet.ui.KPagedContainer#setPageKeyPolicy(int)}
     */
    public int getPageKeyPolicy() {
        // TODO codavaj!!
        return 0;
    }

    /**
     * Returns the model used by this container.
     * @return the page model
     */
    public com.amazon.kindle.kindlet.ui.pages.PageModel getPageModel() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Return the PageProvider used by this container.
     * @return the page provider
     */
    public com.amazon.kindle.kindlet.ui.pages.PageProvider getPageProvider() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the start location of the current page.
     * @return the start location of the current page
     */
    public int getPageStartLocation() {
        // TODO codavaj!!
        return 0;
    }

    public java.awt.Dimension getPreferredSize() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Obtains a read-only set of the keystrokes that are handled
     * by turning to the previous page.
     * @return a read-only set of <A href="http://java.sun.com/javame/reference/apis/jsr217/java/awt/AWTKeyStroke.html">AWTKeyStroke</A>
     * @see {@link com.amazon.kindle.kindlet.ui.KPagedContainer#setPageKeyPolicy(int)},
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#setPreviousPageKeyStrokes(java.util.Set)}
     */
    public java.util.Set getPreviousPageKeyStrokes() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Returns the currently registered list of PropertyChangeListener instances.
     * @return the listeners, or an empty array if none exist
     */
    public java.beans.PropertyChangeListener[] getPropertyChangeListeners() {
        // TODO codavaj!!
        return null;
    }

    /**
     * Advance to the last page.
     *
     * This command may cause a completely different flow of pages
     * after it executes.
     */
    public void last() {
        // TODO codavaj!!
        return;
    }

    /**
     * Advance to the next page, if possible.  This re-validates
     * and refills the page, but does not issue a repaint.
     * @return true if a page changed, false otherwise
     */
    public boolean next() {
        // TODO codavaj!!
        return false;
    }

    /**
     * Advance to the previous page, if possible.  This re-validates
     * and refills the page, but does not issue a repaint.
     * @return true if a page changed, false otherwise
     */
    public boolean previous() {
        // TODO codavaj!!
        return false;
    }

    /**
     * Recreates the current page. This method can be used when the contents
     * of the current page have changed in a way that might impact their
     * pagination or the contents of the page model have changed.
     *
     * This operation maintains the current start location if possible. See
     *
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#setLocation(int)}
     * for changing the current location.
     *
     * <I>Note:</I>
     * This is an expensive operation and does not collapse,
     * so be sure that the page needs to be recomputed before calling this.
     */
    public void relayoutPage() {
        // TODO codavaj!!
        return;
    }

    /**
     * Removing components directly from this container is not permitted and will throw
     *
     * {@link java.lang.UnsupportedOperationException}
     * .
     */
    public void remove(int index) {
        // TODO codavaj!!
        return;
    }

    /**
     * Removes a PropertyChangeListener.
     * @param listener the listener to be removed.  If null, it is ignored.
     */
    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
        // TODO codavaj!!
        return;
    }

    public void setBounds(int x, int y, int width, int height) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the alignment of the first page within a
     * {@link java.awt.BorderLayout}
     * .  This
     * allows under full first pages to render without filling the whole page. For
     * this change to take effect the page must be refreshed (see
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#relayoutPage()}
     * ).
     *
     * If a page is both the first and the last page, it is considered neither.
     *
     * By default this is
     * {@link java.awt.BorderLayout#SOUTH}
     * .
     * @param alignment the new alignment in the BorderLayout
     */
    public void setFirstPageAlignment(java.lang.String alignment) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the alignment of the last page within a
     * {@link java.awt.BorderLayout}
     * .  This
     * allows an under full last page to render without filling the whole page. For
     * this change to take effect the page must be refreshed (see
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#relayoutPage()}
     * ).
     *
     * If a page is both the first and the last page, it is considered neither.
     *
     * By default this is
     * {@link java.awt.BorderLayout#NORTH}
     * .
     * @param alignment the new alignment in the BorderLayout
     */
    public void setLastPageAlignment(java.lang.String alignment) {
        // TODO codavaj!!
        return;
    }

    /**
     * Advance to the page that starts with the given location.
     *
     * This command may cause a completely different flow of pages
     * after it executes - the provided location will be the first
     * element of the current page after return.
     * @param location the new location for the start of the current page
     */
    public void setLocation(int location) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the maximum size of this container.
     * @param size the new maximum size
     */
    public void setMaximumSize(java.awt.Dimension size) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the minimum size of this container.
     * @param size the new minimum size
     */
    public void setMinimumSize(java.awt.Dimension size) {
        // TODO codavaj!!
        return;
    }

    /**
     * The set of
     * {@link java.awt.AWTKeyStroke}
     * s that indicate a next
     * page should be shown.  The default value is
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#DEFAULT_NEXT_PAGE_KEYS}
     * .
     * If there is overlap between the previous and next page keystrokes, one
     * will win - but the winner is undefined.
     * @param keyStrokes a Set of {@link java.awt.AWTKeyStroke}s
     * @exception java.lang.IllegalArgumentException if Set contains invalid objects
     */
    public void setNextPageKeyStrokes(java.util.Set keyStrokes) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sets the policy for how page turn keys are handled for this container.
     * There are three defined policies:
     *
     * <TABLE>
     * <TR>{@link com.amazon.kindle.kindlet.ui.KPagedContainer#PAGE_KEYS_LOCAL}<TD><I>Default.</I> Page turns keys are handled
     * only if this container, or a direct descendant, has the focus.  Page turns are
     * handled as a post-processor and only if the key has not already been consumed.
     * </TD></TR>
     * <TR>{@link com.amazon.kindle.kindlet.ui.KPagedContainer#PAGE_KEYS_GLOBAL}<TD>Page turn keys are handled globally as
     * a post-processor if the key has not already been consumed.  It is an error to
     * register multiple KPagedContainer instances for global key handling if
     * the key sets overlap.  This behavior is undefined - do not rely on it.
     * </TD></TR>
     * <TR>{@link com.amazon.kindle.kindlet.ui.KPagedContainer#PAGE_KEYS_DISABLED}<TD>The page turn keys for this container
     * are disabled.  All page turns must be initiated programmatically.
     * </TD></TR>
     * </TABLE>
     *
     * Like most GUI methods, this method is not synchronized and must be called
     * from the dispatch thread.
     * @param policy a page key policy
     */
    public void setPageKeyPolicy(int policy) {
        // TODO codavaj!!
        return;
    }

    /**
     * Sests the current PageProvider for this container.  This
     * method also refreshes the current page, but does not repaint the
     * component.
     * @param provider the new page provider
     * @exception java.lang.IllegalArgumentException if the provider is null
     */
    public void setPageProvider(com.amazon.kindle.kindlet.ui.pages.PageProvider provider) {
        // TODO codavaj!!
        return;
    }

    /**
     * Set the preferred size of this container.
     * @param size the new preferred size
     */
    public void setPreferredSize(java.awt.Dimension size) {
        // TODO codavaj!!
        return;
    }

    /**
     * The set of
     * {@link java.awt.AWTKeyStroke}
     * s that indicate a previous
     * page should be shown.  The default value is
     * {@link com.amazon.kindle.kindlet.ui.KPagedContainer#DEFAULT_PREVIOUS_PAGE_KEYS}
     * .
     * If there is overlap between the previous and next page keystrokes, one
     * will win - but the winner is undefined.
     * @param keyStrokes a Set of {@link java.awt.AWTKeyStroke}s
     * @exception java.lang.IllegalArgumentException if Set contains invalid objects
     */
    public void setPreviousPageKeyStrokes(java.util.Set keyStrokes) {
        // TODO codavaj!!
        return;
    }

    /**
     * This method is called when the page has changed and used to have the
     * focus.  By default it moves the focus into the new page via the following
     * rules:
     *
     * If the previous component appears on the new page, maintain the focus.
     * If the new page is a focus cycle root, then ask its
     * {@link java.awt.FocusTraversalPolicy}
     * for the first (when moving forward) or last (when moving backward) component.
     * If the new page is not a focus cycle root, but is a Container give the focus
     * to the first (when moving forward) or last (when moving backward) component.  This is
     * done using standard logic.  If the focus traversal policy has been customized, it may
     * be necessary to modify this behavior.
     * If the new page is not a Container, then give the new page the focus.
     *
     * Developers may override this behavior for custom paging scenarios.  This method
     * is only called if the page had the focus originally.
     * @param forward true if the page motion was in the forward direction
     */
    protected void updateFocus(java.awt.Component page, java.awt.Component originalFocusOwner, boolean forward) {
        // TODO codavaj!!
        return;
    }
}
