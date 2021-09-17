package com.cygnus.app.service;

import com.cygnus.app.dto.UserDto;

import javax.mail.MessagingException;

public interface RegistrationService {

    void register(UserDto userDto) throws MessagingException;

    void sendVerificationMail(String email) throws MessagingException;

}
