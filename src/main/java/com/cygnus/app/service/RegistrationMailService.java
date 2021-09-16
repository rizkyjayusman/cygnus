package com.cygnus.app.service;

import com.cygnus.app.dto.EmailConfirmDto;
import com.cygnus.app.dto.UserDto;

import javax.mail.MessagingException;

public interface RegistrationMailService {

    void sendEmailConfirmationMail(EmailConfirmDto emailConfirmDto) throws MessagingException;

}
