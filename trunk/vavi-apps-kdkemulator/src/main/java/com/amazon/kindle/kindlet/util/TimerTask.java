
package com.amazon.kindle.kindlet.util;


/**
 * Provides a Kindle specific replacement for java.util.TimerTask. This class is
 * generally API compatible with the standard. A task that may be scheduled for
 * execution by Timer.
 * 
 * @see TimerTask
 */
public abstract class TimerTask implements java.lang.Runnable {

    public TimerTask() {
    }

    /**
     * Cancels the next execution of the task. If the task is currently
     * executing, it will run to completion.
     */
    public boolean cancel() {
        return false;
    }

    /**
     * Action performed when this task is executed by Timer.
     */
    public abstract void run();

    /**
     * @return the last scheduled execution time.
     */
    public long scheduledExecutionTime() {
        return 0l; // TODO codavaj!!
    }
}
