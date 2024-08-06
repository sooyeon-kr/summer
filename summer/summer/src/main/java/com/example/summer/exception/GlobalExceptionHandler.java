package com.example.summer.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

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

//    @ExceptionHandler(value = MethodArgumentNotValidException.class),ExceptionHandler 파라미터에 넣지않아도 됨
    @ExceptionHandler()
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map<String, String> catchMetodArgumentNotValidException(MethodArgumentNotValidException e){
//        log.error(e.getMessage());
//        BindingResult bindingResult = e.getBindingResult();
//        StringBuilder sb = new StringBuilder();
//        sb.append("ExceptionHandler").append(bindingResult.getFieldError().getDefaultMessage()).append("\n");
//        return sb.toString();
        Map<String, String> errorMessages = new HashMap<>();
        for(FieldError fieldError : e.getFieldErrors()){
            String errorField = fieldError.getField();
            String errorMessage = fieldError.getDefaultMessage();
            errorMessages.put(errorField, errorMessage);
        }
        return errorMessages;
    }

}
