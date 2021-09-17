package com.cygnus.app.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class EmailConfirmDto {

    private String email;

    private String token;

    public static EmailConfirmDto create(String email, String token) {
        EmailConfirmDto emailConfirmDto = new EmailConfirmDto();
        emailConfirmDto.setEmail(email);
        emailConfirmDto.setToken(token);
        return emailConfirmDto;
    }

}
