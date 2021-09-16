package com.cygnus.app.controller;

import com.cygnus.app.dto.UserDto;
import com.cygnus.app.service.RegistrationService;
import com.cygnus.app.subscriber.UserCreatedSubscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private UserCreatedSubscriber userCreatedSubscriber;

    @PostMapping("/register")
    public void register(@RequestBody UserDto userDto) throws MessagingException {
        registrationService.register(userDto);
    }

}
