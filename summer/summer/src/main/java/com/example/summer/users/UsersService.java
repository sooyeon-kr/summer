package com.example.summer.users;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

@Service
public class UsersService {
    public String traceError(BindingResult bindingResult) {
        return bindingResult.getFieldError().getDefaultMessage();
    }

    public void handleErrors(Errors errors) {
        for(FieldError fieldError : errors.getFieldErrors()){
            String errorField = fieldError.getField();
            System.out.println("errorField : " + errorField);
        }
    }
}
