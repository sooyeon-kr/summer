package com.example.summer.users;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UserJoinReq {
    @NotBlank(message="아이디는 필수 입력입니다.")
    String id;

    @NotBlank(message="비밀번호는 필수 입력입니다.")
    String pw;
    String name;
    String email;
}
