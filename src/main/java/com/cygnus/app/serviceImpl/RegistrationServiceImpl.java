package com.cygnus.app.serviceImpl;

import com.cygnus.app.dto.EmailConfirmDto;
import com.cygnus.app.dto.UserDto;
import com.cygnus.app.service.EmailService;
import com.cygnus.app.service.RegistrationMailService;
import com.cygnus.app.service.RegistrationService;
import com.cygnus.app.service.UserService;
import com.cygnus.app.util.EmailConfirmTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserService userService;

    @Autowired
    private RegistrationMailService registrationMailService;

    @Override
    public void register(UserDto userDto) throws MessagingException {
        userService.createUser(userDto);

        EmailConfirmDto emailConfirmDto = new EmailConfirmDto();
        emailConfirmDto.setEmail(userDto.getEmail());
        emailConfirmDto.setToken(EmailConfirmTokenUtil.generate());

        registrationMailService.sendEmailConfirmationMail(emailConfirmDto);
    }
}
