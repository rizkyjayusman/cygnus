package com.cygnus.app.serviceImpl;

import com.cygnus.app.dto.EmailConfirmDto;
import com.cygnus.app.dto.UserDto;
import com.cygnus.app.service.EmailService;
import com.cygnus.app.service.RegistrationMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class RegistrationMailServiceImpl implements RegistrationMailService {

    @Autowired
    private EmailService emailService;

    @Override
    public void sendEmailConfirmationMail(EmailConfirmDto emailConfirmDto) throws MessagingException {
        String subject = "Email Confirmation for " + emailConfirmDto.getEmail();
        String message = "<!doctype html>\n" +
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
                "      xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\"\n" +
                "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Email</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>Welcome <b>" + emailConfirmDto.getEmail() + "</b></div>\n" +
                "\n" +
                "<div>Your token : <b>" + emailConfirmDto.getToken() + "</b></div>\n" +
                "</body>\n" +
                "</html>\n";

        emailService.sendMail(emailConfirmDto.getEmail(), subject, message);
    }

}
