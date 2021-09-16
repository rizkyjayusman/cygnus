package com.cygnus.app.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class EmailConfirmDto {

    private String email;

    private String token;

}
