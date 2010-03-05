/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;


/**
 * A container for laying out components across a series of pages. By supplying
 * a model of the data to be paged and a page provider numerous pages of
 * components can be automatically built and paged over. The PageModel supplied
 * does not need to be complete at the time of display and pages are loaded
 * dynamically as needed - the model is responsible for any caching. Note: Since
 * the contents of a KPagedContainer come entirely from the model, the standard
 * add and remove methods do not work for this container. For a simple component
 * with a mutable set of pages, see KPages. The KPagedContainer does not model
 * headers, footers or margin rendering. For those features it is possible to
 * use a BorderLayout and register PropertyChangeListener instances to respond
 * to page changes. Like most AWT components the methods on this class are not
 * thread safe.
 * 
 * @see Serialized Form
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
     * 
     * @see setPageKeyPolicy(int), Constant Field Values
     */
    public static final int PAGE_KEYS_DISABLED = 2;

    /**
     * Indicates that page turn keys should be handled globally for this
     * container.
     * 
     * @see setPageKeyPolicy(int), Constant Field Values
     */
    public static final int PAGE_KEYS_GLOBAL = 1;

    /**
     * Indicates that page turn keys should be handled locally for this
     * container.
     * 
     * @see setPageKeyPolicy(int), Constant Field Values
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
     * Adding components directly to this container is not permitted and will
     * throw .
     */
    protected void addImpl(java.awt.Component component, java.lang.Object constraints, int index) {
        return; // TODO codavaj!!
    }

    /**
     * Adds a PropertyChangeListener. The following properties will trigger
     * notifications: the start location ("pageStartLocation")
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        return; // TODO codavaj!!
    }

    /**
     * Clears and refills the current page, if necessary. This method uses the
     * current start location and fills either forwards or backwards based on
     * the parameter.
     */
    protected void fillPage(boolean forward) {
        return; // TODO codavaj!!
    }

    /**
     * Advance to the first page. This command may cause a completely different
     * flow of pages after it executes.
     */
    public void first() {
        return; // TODO codavaj!!
    }

    public java.awt.Dimension getMaximumSize() {
        return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMinimumSize() {
        return null; // TODO codavaj!!
    }

    /**
     * Obtains a read-only set of the keystrokes that are handled by turning to
     * the next page.
     */
    public java.util.Set getNextPageKeyStrokes() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the end location of the current page, if known.
     */
    public int getPageEndLocation() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the current page turn key policy for this container.
     */
    public int getPageKeyPolicy() {
        return 0; // TODO codavaj!!
    }

    /**
     * Returns the model used by this container.
     */
    public com.amazon.kindle.kindlet.ui.pages.PageModel getPageModel() {
        return null; // TODO codavaj!!
    }

    /**
     * @return the PageProvider used by this container.
     */
    public com.amazon.kindle.kindlet.ui.pages.PageProvider getPageProvider() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the start location of the current page.
     */
    public int getPageStartLocation() {
        return 0; // TODO codavaj!!
    }

    public java.awt.Dimension getPreferredSize() {
        return null; // TODO codavaj!!
    }

    /**
     * Obtains a read-only set of the keystrokes that are handled by turning to
     * the previous page.
     */
    public java.util.Set getPreviousPageKeyStrokes() {
        return null; // TODO codavaj!!
    }

    /**
     * Returns the currently registered list of PropertyChangeListener
     * instances.
     */
    public java.beans.PropertyChangeListener[] getPropertyChangeListeners() {
        return null; // TODO codavaj!!
    }

    /**
     * Advance to the last page. This command may cause a completely different
     * flow of pages after it executes.
     */
    public void last() {
        return; // TODO codavaj!!
    }

    /**
     * Advance to the next page, if possible. This re-validates and refills the
     * page, but does not issue a repaint.
     */
    public boolean next() {
        return false; // TODO codavaj!!
    }

    /**
     * Advance to the previous page, if possible. This re-validates and refills
     * the page, but does not issue a repaint.
     */
    public boolean previous() {
        return false; // TODO codavaj!!
    }

    /**
     * Recreates the current page. This method can be used when the contents of
     * the current page have changed in a way that might impact their pagination
     * or the contents of the page model have changed. This operation maintains
     * the current start location if possible. See setLocation(int) for changing
     * the current location. Note: This is an expensive operation and does not
     * collapse, so be sure that the page needs to be recomputed before calling
     * this.
     */
    public void relayoutPage() {
        return; // TODO codavaj!!
    }

    /**
     * Removing components directly from this container is not permitted and
     * will throw .
     */
    public void remove(int index) {
        return; // TODO codavaj!!
    }

    /**
     * Removes a PropertyChangeListener.
     */
    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
        return; // TODO codavaj!!
    }

    public void setBounds(int x, int y, int width, int height) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the alignment of the first page within a . This allows under full
     * first pages to render without filling the whole page. For this change to
     * take effect the page must be refreshed (see ). If a page is both the
     * first and the last page, it is considered neither. By default this is
     * BorderLayout.SOUTH.
     */
    public void setFirstPageAlignment(java.lang.String alignment) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the alignment of the last page within a . This allows an under full
     * last page to render without filling the whole page. For this change to
     * take effect the page must be refreshed (see ). If a page is both the
     * first and the last page, it is considered neither. By default this is
     * BorderLayout.NORTH.
     */
    public void setLastPageAlignment(java.lang.String alignment) {
        return; // TODO codavaj!!
    }

    /**
     * Advance to the page that starts with the given location. This command may
     * cause a completely different flow of pages after it executes - the
     * provided location will be the first element of the current page after
     * return.
     */
    public void setLocation(int location) {
        return; // TODO codavaj!!
    }

    /**
     * Set the maximum size of this container.
     */
    public void setMaximumSize(java.awt.Dimension size) {
        return; // TODO codavaj!!
    }

    /**
     * Set the minimum size of this container.
     */
    public void setMinimumSize(java.awt.Dimension size) {
        return; // TODO codavaj!!
    }

    /**
     * The set of s that indicate a next page should be shown. The default value
     * is . If there is overlap between the previous and next page keystrokes,
     * one will win - but the winner is undefined.
     */
    public void setNextPageKeyStrokes(java.util.Set keyStrokes) {
        return; // TODO codavaj!!
    }

    /**
     * Sets the policy for how page turn keys are handled for this container.
     * There are three defined policies: Like most GUI methods, this method is
     * not synchronized and must be called from the dispatch thread.
     */
    public void setPageKeyPolicy(int policy) {
        return; // TODO codavaj!!
    }

    /**
     * Sests the current PageProvider for this container. This method also
     * refreshes the current page, but does not repaint the component.
     */
    public void setPageProvider(com.amazon.kindle.kindlet.ui.pages.PageProvider provider) {
        return; // TODO codavaj!!
    }

    /**
     * Set the preferred size of this container.
     */
    public void setPreferredSize(java.awt.Dimension size) {
        return; // TODO codavaj!!
    }

    /**
     * The set of s that indicate a previous page should be shown. The default
     * value is . If there is overlap between the previous and next page
     * keystrokes, one will win - but the winner is undefined.
     */
    public void setPreviousPageKeyStrokes(java.util.Set keyStrokes) {
        return; // TODO codavaj!!
    }

    /**
     * This method is called when the page has changed and used to have the
     * focus. By default it moves the focus into the new page via the following
     * rules: If the previous component appears on the new page, maintain the
     * focus. If the new page is a focus cycle root, then ask its for the first
     * (when moving forward) or last (when moving backward) component. If the
     * new page is not a focus cycle root, but is a Container give the focus to
     * the first (when moving forward) or last (when moving backward) component.
     * This is done using standard logic. If the focus traversal policy has been
     * customized, it may be necessary to modify this behavior. If the new page
     * is not a Container, then give the new page the focus. Developers may
     * override this behavior for custom paging scenarios. This method is only
     * called if the page had the focus originally.
     */
    protected void updateFocus(java.awt.Component page, java.awt.Component originalFocusOwner, boolean forward) {
        return; // TODO codavaj!!
    }

}
