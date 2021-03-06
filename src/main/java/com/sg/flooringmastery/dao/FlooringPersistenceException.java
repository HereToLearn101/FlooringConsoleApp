/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

/**
 *
 * @author tedis
 */
public class FlooringPersistenceException extends Exception {

    // This first constructor will be used in cases where something is wrong
    // in our application but it isn't causeed by another exception.
    public FlooringPersistenceException(String message) {
        // 'super' calls the matchin constructor on the Exception class.
        // We do this because, we want FlooringPersistenceException to act just like
        // Exception, so we let the base class constructors do all the hard work
        // of initializing our object.
        super(message);
    }

    // We will use this second constructor in cases where something is wrong in our
    // application that is caused by another exception in the underlying implementation.
    // In these cases, we catch the implementation-specific exception (for example
    // 'FileNotFoundException').
    public FlooringPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}