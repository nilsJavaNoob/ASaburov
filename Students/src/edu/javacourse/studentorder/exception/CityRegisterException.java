package edu.javacourse.studentorder.exception;

/**
 * Created by javaNoob on 06.06.2018.
 */
public class CityRegisterException extends Exception {
    public CityRegisterException() {
    }

    public CityRegisterException(String message) {
        super(message);
    }

    public CityRegisterException(String message, Throwable cause) {
        super(message, cause);
    }
}
