package com.example.summer.exception;

import java.util.NoSuchElementException;

public class AccommodationNotFoundException extends NoSuchElementException {
    public AccommodationNotFoundException(){
        super("AccommodationNotFoundException");
    }

    public AccommodationNotFoundException(String msg){
        super(msg);
    }

}
