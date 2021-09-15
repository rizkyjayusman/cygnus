package com.cygnus.app.controller;

import com.cygnus.app.dto.UserDto;
import com.cygnus.app.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public void register(@RequestBody UserDto userDto) {
        registrationService.register(userDto);
    }

}
