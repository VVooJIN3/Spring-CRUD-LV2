package com.sparta.blog.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {

    @NotBlank
    @Size(min = 4, max = 10, message= "최소 4자 이상, 10자 이하여야 합니다.")
    @Pattern(regexp = "^[a-z0-9]*$")
    private String username;

    @NotBlank
    @Size(min =8, max = 15,message= "최소 8자 이상, 15자 이하여야 합니다.")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "비밀번호는 알파벳 대소문자(a~z, A~Z), 숫자(0~9)로 구성되어야 합니다.")
    private String password;

//    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotBlank
    @Email
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}