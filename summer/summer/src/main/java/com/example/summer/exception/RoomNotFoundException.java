package com.example.summer.exception;

public class RoomNotFoundException extends NotFound404Exception {

    public RoomNotFoundException() {
        super("RoomNotFoundException");
    }

    public RoomNotFoundException(String msg) {
        super(msg);
    }


}
