package com.korit.board.dto;

import com.korit.board.entity.User;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class SignupReqDto {
    @Email
    @NotBlank
    private String email;
    @NotBlank //빈값인지만 확인
    private String password;
    @NotBlank
    private String name;
    @NotBlank
    private String nickname;

    private String oauth2Id;
    private String profileImg;
    private String provider;

    public User toUserEntity(BCryptPasswordEncoder passwordEncoder) {
        return User.builder()
                .email(email)
                .password(passwordEncoder.encode(password))
                .name(name)
                .nickname(nickname)
                .oauth2Id(oauth2Id)
                .profileUrl(profileImg)
                .provider(provider)
                .build();
    }
}