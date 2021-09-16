package com.cygnus.app.service;

import com.cygnus.app.dto.UserDto;

import javax.mail.MessagingException;

public interface EmailService {

    void sendMail(String sendTo, String subject, String message) throws MessagingException;

}
