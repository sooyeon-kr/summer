package com.example.summer.exception;

public class NotFound404Exception extends Client4XXException{
    public NotFound404Exception() {
        super(400, "404 Not Found");
    }

    public NotFound404Exception(String message) {
        super(message);
    }

}
