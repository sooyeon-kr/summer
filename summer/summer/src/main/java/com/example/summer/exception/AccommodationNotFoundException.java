package com.example.summer.exception;

public class AccommodationNotFoundException extends NotFound404Exception {
    public AccommodationNotFoundException(){
        super("AccommodationNotFoundException : Room not found");
    }

    public AccommodationNotFoundException(String msg){
        super(msg);
    }

}
