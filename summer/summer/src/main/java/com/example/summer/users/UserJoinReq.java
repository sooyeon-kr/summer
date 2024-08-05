package com.example.summer.users;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UserJoinReq {
    @NotBlank(message="id is required")
    String id;

    @NotBlank(message="pw is required")
    String pw;
    String name;
    String email;

    UserJoinReq(String id, String pw, String name, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }
    UserJoinReq(){}
}
