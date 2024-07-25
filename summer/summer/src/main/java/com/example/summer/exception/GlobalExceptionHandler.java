package com.example.summer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RoomNotFoundException.class)
    public String catchRoomNotFoundException(RoomNotFoundException e){
        return "No Room";
    }

}
