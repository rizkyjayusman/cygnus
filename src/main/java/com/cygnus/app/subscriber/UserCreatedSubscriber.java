package com.cygnus.app.subscriber;

import com.cygnus.app.dto.EmailConfirmDto;
import com.cygnus.app.dto.UserDto;
import com.cygnus.app.service.RegistrationMailService;
import com.cygnus.app.util.EmailConfirmTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Slf4j
@Component
public class UserCreatedSubscriber {

    @Autowired
    private RegistrationMailService registrationMailService;

    public void listen(String email) throws MessagingException {
        // TODO listen user creation
        UserDto userDto = new UserDto();
        userDto.setEmail(email);

        log.info("RETRIEVE USER CREATION EVENT");

        EmailConfirmDto emailConfirmDto = new EmailConfirmDto();
        emailConfirmDto.setEmail(userDto.getEmail());
        emailConfirmDto.setToken(EmailConfirmTokenUtil.generate());

        registrationMailService.sendEmailConfirmationMail(emailConfirmDto);
    }

}
