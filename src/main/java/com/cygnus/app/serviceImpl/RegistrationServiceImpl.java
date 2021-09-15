package com.cygnus.app.serviceImpl;

import com.cygnus.app.dto.UserDto;
import com.cygnus.app.service.RegistrationService;
import com.cygnus.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserService userService;

    @Override
    public void register(UserDto userDto) {
        userService.createUser(userDto);
        // TODO send confirmation mail
    }
}
