/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */
package com.amazon.kindle.kindlet.ui;

/**
 * Interface for components to display progress to the user
 * about running activities.
 *
 * <I>Note:</I>
 * The progress indicator is an active display and uses system resources, especially display resources
 * (and battery). Applications should only use the progress indicator when the user experience demands it.
 *
 * This interface was inspired by javax.swing.JProgressBar.
 */
public interface KProgress {

    /**
     * Sets the progress indicator to indeterminate mode.
     *
     * When set to true, this activates the progress indicator and puts it in a mode that indicates an activity of
     * unknown length is underway.
     *
     * When set to false, this reverts the progress indicator to
     * it normal (inactive) state.
     * @param indeterminate true to activate indeterminate progress display,
     *       false to return to normal progress display
     */
    abstract void setIndeterminate(boolean indeterminate);

    /**
     * Sets the value of the progress string, which will be displayed to
     * the user.  This string is only displayed for a limited time after the call is made.
     * A null value is treated as the normal status display behavior, as defined by the
     * implementing progress indicator.  Status strings are typically short.
     *
     * If a progress indicator is not already visible to the user, this will set
     * it to indeterminate mode.
     * @param status the status string to display to the user.
     *                This text may be truncated by the progress indicator
     *                if it is too long and different platforms may allow differing
     *                lengths of status text before truncating.
     * @see {@link com.amazon.kindle.kindlet.ui.KProgress#setIndeterminate(boolean)}
     */
    abstract void setString(java.lang.String status);
}
