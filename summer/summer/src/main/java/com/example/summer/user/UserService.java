package com.example.summer.user;


import ch.qos.logback.classic.pattern.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Converter;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public SignCommonUserResponse signup(User user) {
        return SignCommonUserResponse.from(userRepository.save(user));
    }

    public SignCommonUserResponse signin(SignInUserRequest reqUser) {
        User user = reqUser.to();
        return SignCommonUserResponse.from(userRepository.findById(user.getId(), user.getPw()));
    }
}
