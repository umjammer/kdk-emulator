/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.security;


/**
 * SecureStorage provides a convenient way to store and retrieve small amounts
 * of sensitive data. Data are stored as key/value pairs in a private file on
 * the device with both the key and the value encrypted. This interface is
 * thread-safe. Some examples of the types of data the might be stored in
 * SecureStorage: User Password Authentication Cookie Last search term The
 * encryption key is unique to each application and the application code neither
 * has access to this private key nor to the underlying file. The data is
 * durable across updates of the application (its durability is the same as the
 * application's data directory). Unencrypted data is never stored as a String.
 * Users of the data are encouraged to clear the char array once the data is
 * used. The secure store is persisted to disk as needed. Client code should
 * check the return value of putChars(String, char[]) or putBytes(String,
 * byte[]) to ensure the call was successful. The SecureStorage API is intended
 * for storing small amounts of sensitive data - it is not meant as a reliable
 * structured data store. In particular, its performance it not well-suited for
 * such a task. The durability of the SecureStorage API is the same as the
 * underlying file system. In the case of a failure during the store of actual
 * data the putChars(String, char[]) or putBytes(String, byte[]) method will
 * return false. In the rare case of hardware failure that prevents even the
 * original data from being preserved, the error is reported via the unchecked
 * CorruptSecureStorageException. In the remote case that corruption happens
 * outside of the application's life cycle the store will simply respond as if
 * it is empty. (This can also happen if the device is restored to factory
 * settings.) For most use cases, the application should be built to deal
 * gracefully with this. Some examples are presented below: User Name /
 * PasswordRe-request data from the user. Authentication CookieRe-authenticate
 * with the server. Last search termTreat the last search term as unknown. For
 * data that needs more durability developers will need to arrange for storing
 * this data on a remote server.
 * 
 * @since 1.0
 * @see KindletContext.getSecureStorage()
 * @see KindletContext.getHomeDirectory()
 */
public interface SecureStorage {

    /**
     * Remove all entries from the secure store. Once invoked, all data is lost
     * and cannot be retrieved.
     */
    abstract void clear();

    /**
     * Retrieve data previously stored under a specific key. If the given key
     * was not saved using putBytes(String, byte[]), then the output of this
     * method does not guarantee the expected result.
     */
    abstract byte[] getBytes(java.lang.String key);

    /**
     * Retrieve data previously stored under a specific key. If the given key
     * was not saved using putChars(String, char[]), then the output of this
     * method does not guarantee the expected result.
     */
    abstract char[] getChars(java.lang.String key);

    /**
     * Create or update a binary entry in the secure store.
     */
    abstract boolean putBytes(java.lang.String key, byte[] data) throws com.amazon.kindle.kindlet.security.CorruptSecureStorageException;

    /**
     * Create or update a text entry in the secure store.
     */
    abstract boolean putChars(java.lang.String key, char[] data) throws com.amazon.kindle.kindlet.security.CorruptSecureStorageException;

    /**
     * Removes any data associated with the supplied key from the store.
     */
    abstract boolean remove(java.lang.String key) throws com.amazon.kindle.kindlet.security.CorruptSecureStorageException;
}
