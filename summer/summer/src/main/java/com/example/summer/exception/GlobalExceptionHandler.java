package com.example.summer.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Slf4j
public class GlobalExceptionHandler {

//    로거를 새성할 수 있는 곳이 팩토리
//    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = NotFound404Exception.class)
    public String catchRoomNotFoundException(NotFound404Exception e){
//        logger.error("exception class: {}", e.getClass());
//        logger.error("exception class: " , e);
        log.error(e.getMessage());
        return "No Room";
    }

}
