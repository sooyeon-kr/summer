package com.example.summer.exception;

import java.util.NoSuchElementException;

public class RoomNotFoundException extends NoSuchElementException {

    public RoomNotFoundException() {
        super("RoomNotFoundException");
    }

    public RoomNotFoundException(String msg) {
        super(msg);
    }


}
