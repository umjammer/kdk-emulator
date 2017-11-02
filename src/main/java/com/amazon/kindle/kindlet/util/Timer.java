/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.util;


/**
 * Provides a Kindle specific replacement for java.util.Timer. This class is
 * generally API compatible with the standard. Timer is a method for scheduling
 * tasks to execute in the future. Tasks may be executed regularly or once. A
 * Timer executes tasks sequentially in a single thread. This may result in an
 * executing task delaying other tasks (or a repeat execution of a tasks
 * scheduled to execute at regular intervals) or causing a task execution
 * backlog. This class is thread safe and a single Timer may be shared among
 * multiple threads. A timer is effectively terminated if a task terminates the
 * thread executing the task. All scheduled tasks will be canceled, and
 * subsequent attempts to schedule tasks will result in an IllegalStateException
 * being thrown. Timer threads are not intended to prolong the life an
 * application.
 * 
 * @see Timer, TimerTask
 */
public class Timer {

    private java.util.Timer timer;

    /**
     * Construct a new Timer. Kindle developers must use this class instead of
     * java.util.Timer.
     * 
     * @see Timer.Timer()
     */
    public Timer() {
        timer = new java.util.Timer();
    }

    /**
     * Construct a new Timer.
     * 
     * @param isDaemon ignored since all Kindle Timer's are treated as deamons
     * @see Timer.Timer(boolean)
     */
    public Timer(boolean isDaemon) {
        timer = new java.util.Timer(isDaemon);
    }

    /**
     * Terminates the timer. All scheduled tasks are discarded. Tasks already
     * executing are allowed to complete.
     */
    public void cancel() {
        timer.cancel();
    }

    /**
     * Schedules the task to execute at a specific time.
     */
    public void schedule(com.amazon.kindle.kindlet.util.TimerTask task, java.util.Date time) {
    }

    /**
     * Schedules a task for fixed-delay execution. Repeated executions of the
     * task occur approximately period milliseconds after the task execution
     * completes.
     */
    public void schedule(com.amazon.kindle.kindlet.util.TimerTask task, java.util.Date firstTime, long period) {
        return; // TODO codavaj!!
    }

    /**
     * Executes the task after a specific delay.
     */
    public void schedule(com.amazon.kindle.kindlet.util.TimerTask task, long delay) {
        return; // TODO codavaj!!
    }

    /**
     * Schedules a task for fixed-delay execution. Repeated executions of the
     * task occur approximately period milliseconds after the task execution
     * completes.
     */
    public void schedule(com.amazon.kindle.kindlet.util.TimerTask task, long delay, long period) {
        return; // TODO codavaj!!
    }

    /**
     * Schedules a task for fixed-rate execution. Repeated executions of the
     * task occur approximately period milliseconds apart.
     */
    public void scheduleAtFixedRate(com.amazon.kindle.kindlet.util.TimerTask task, java.util.Date firstTime, long period) {
        return; // TODO codavaj!!
    }

    /**
     * Schedules a task for fixed-rate execution. Repeated executions of the
     * task occur approximately period milliseconds apart.
     */
    public void scheduleAtFixedRate(com.amazon.kindle.kindlet.util.TimerTask task, long delay, long period) {
        return; // TODO codavaj!!
    }
}
