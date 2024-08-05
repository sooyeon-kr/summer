package com.example.summer.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users/signup", method= RequestMethod.POST)
    public ResponseEntity<SignCommonUserResponse> signup(@Valid @RequestBody User user) {
        SignCommonUserResponse signupedUser = userService.signup(user);
        return new ResponseEntity<>(signupedUser, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/signin", method= RequestMethod.POST)
    public ResponseEntity<SignCommonUserResponse> signin(@RequestBody SignInUserRequest user) {
        SignCommonUserResponse signinedUser = userService.signin(user);
        return new ResponseEntity<>(signinedUser, HttpStatus.OK);
    }
}
