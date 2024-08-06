package com.example.summer.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
public class User {
    @Setter
    private String id;
    @NotBlank
    @Min(8)
    private String pw;
    @NotBlank
    private String name;
    @Email
    private String email;

    public User(String id, String pw, String name, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }
    public User() {}

}
