package com.cygnus.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class UserDto {

    private Long id;

    private String email;

    private Date createdDate;

}
