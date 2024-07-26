package com.example.summer.exception;

public class Client4XXException extends RuntimeException {
    private int httpStatusCode;

    public Client4XXException(){
        super();
    }

    public Client4XXException(String message) {
        super(message);
    }

    public Client4XXException(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
    public Client4XXException(int httpStatusCode, String message) {
        super(message);
        this.httpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }


}
