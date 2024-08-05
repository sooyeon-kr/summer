package com.example.summer.users;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UsersController {

    UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
;
    @PostMapping
    public ResponseEntity<?> join(@RequestBody @Valid UserJoinReq userJoinReq, Errors errors){

        if(errors.hasErrors()){
            Map<String, String> errorMessages = usersService.handleErrors(errors);
            return ResponseEntity.badRequest().body(errorMessages);
        }

        return ResponseEntity.ok().body(userJoinReq);
    }

    @PostMapping(value = "/join2")
    public UserJoinReq join2(@RequestBody @Valid UserJoinReq userJoinReq){
        return userJoinReq;
    }
}
