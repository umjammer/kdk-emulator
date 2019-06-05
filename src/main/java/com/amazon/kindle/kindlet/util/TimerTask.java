package com.amazon.kindle.kindlet.util;

/**
 * Provides a Kindle specific replacement for java.util.TimerTask.  This class is generally
 * API compatible with the standard.
 *
 * A task that may be scheduled for execution by Timer.
 * @see {@link java.util.TimerTask}
 */
public abstract class TimerTask implements java.lang.Runnable {

    public TimerTask() {
    }

    /**
     * Cancels the next execution of the task.  If the task is currently executing,
     * it will run to completion.
     * @return true if a future execution of the task has been cancelled
     * @see {@link java.util.TimerTask#cancel()}
     */
    public boolean cancel() {
        return false;
    }

    /**
     * Action performed when this task is executed by Timer.
     * @see {@link java.util.TimerTask#run()}
     */
    public abstract void run();

    /**
     * Return the last scheduled execution time.
     * @return when the last execution was scheduled to occur, in milliseconds
     *   since the epoch.
     * @see {@link java.util.TimerTask#scheduledExecutionTime()}
     */
    public long scheduledExecutionTime() {
        // TODO codavaj!!
        return 0l;
    }
}
