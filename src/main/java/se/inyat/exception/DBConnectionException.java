package se.inyat.exception;

public class DBConnectionException extends RuntimeException {

    public DBConnectionException(String message) {
        super(message);
    }
    public DBConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}