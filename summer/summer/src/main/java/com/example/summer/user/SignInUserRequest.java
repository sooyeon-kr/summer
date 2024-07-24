package com.example.summer.user;

public class SignInUserRequest {
    private String id;
    private String pw;

    SignInUserRequest(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }
    public String getPw() {
        return pw;
    }

    public User to() {
        return new User(id, pw);
    }
}
