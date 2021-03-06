package com.homework.quizapp.controller.rest.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLogin {
    private String email;
    private String password;


    public UserLogin toModel() {
        return UserLogin.builder()
                .email(email)
                .password(password)
                .build();
    }


}


