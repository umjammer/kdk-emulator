/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.security;


/**
 * Thrown when secure storage is corrupt and unable to execute any successful
 * future operation on the store with stability. In the normal operation of the
 * device, this exception should not occur. Its occurrence indicates a hardware
 * level failure. Once this exception has been thrown it is highly unlikely that
 * the data in the store will be recoverable. Developers can use
 * SecureStorage.clear() to re-initialize the store.
 * 
 * @since 1.0
 * @see SecureStorage
 */
public class CorruptSecureStorageException extends java.lang.RuntimeException {

    /**
     * Constructs a new exception with the specified detail message.
     * 
     * @param msg - the detail message.
     */
    public CorruptSecureStorageException(java.lang.String msg) {
        super(msg);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * Note that the detail message associated with cause is not automatically
     * incorporated in this exception's detail message.
     * 
     * @param msg the detail message
     * @param ex the cause. (A null value is permitted, and indicates that the
     *            cause is nonexistent or unknown.)
     */
    public CorruptSecureStorageException(java.lang.String msg, java.lang.Throwable ex) {
        super(msg, ex);
    }
}
