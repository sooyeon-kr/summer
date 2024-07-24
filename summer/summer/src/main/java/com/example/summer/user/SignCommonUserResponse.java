package com.example.summer.user;

public class SignCommonUserResponse {
    private String nickname;

    SignCommonUserResponse(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public static SignCommonUserResponse from(User user) {
        return new SignCommonUserResponse(user.getNickname());
    }
}
