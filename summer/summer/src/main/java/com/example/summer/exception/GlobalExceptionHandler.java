package com.example.summer.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GlobalExceptionHandler {

//    로거를 새성할 수 있는 곳이 팩토리
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = RoomNotFoundException.class)
    public String catchRoomNotFoundException(RoomNotFoundException e){
        logger.error("exception class: {}", e.getClass());
        logger.error("exception class: " , e);
        return "No Room";
    }

}
