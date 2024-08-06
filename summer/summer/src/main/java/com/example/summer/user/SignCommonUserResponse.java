package com.example.summer.user;

public class SignCommonUserResponse {
    private String name;

    SignCommonUserResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static SignCommonUserResponse from(User user) {
        return new SignCommonUserResponse(user.getName());
    }
}
