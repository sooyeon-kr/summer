package com.example.summer.users;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsersService {
    public String traceError(BindingResult bindingResult) {
        return bindingResult.getFieldError().getDefaultMessage();
    }

    public Map<String, String> handleErrors(Errors errors) {
        Map<String, String> errorMessages = new HashMap<>();
        for(FieldError fieldError : errors.getFieldErrors()){
            String errorField = fieldError.getField();
            String errorMessage = fieldError.getDefaultMessage();
            errorMessages.put(errorField, errorMessage);
        }
        return errorMessages;
    }
}
