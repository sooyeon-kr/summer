package com.example.summer.user;

public class User {
    private String id;
    private String pw;
    private String nickname;
    private String email;

    public User(String id, String pw, String nickname, String email) {
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
        this.email = email;
    }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw(){
        return pw;
    }

    public String getNickname(){
        return nickname;
    }

}
