package edu.javacourse.studentorder.exception;

/**
 * Created by javaNoob on 20.06.2018.
 */
public class TransportException extends Exception {

    public TransportException(String message) {
        super(message);
    }

    public TransportException(String message, Throwable cause) {
        super(message, cause);
    }
}
