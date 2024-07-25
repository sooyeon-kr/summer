package com.example.summer.exception;

public class AccommodationNotFoundException extends NotFound404Exception {
    public AccommodationNotFoundException(){
        super("AccommodationNotFoundException");
    }

    public AccommodationNotFoundException(String msg){
        super(msg);
    }

}
