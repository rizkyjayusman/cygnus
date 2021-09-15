package com.cygnus.app.serviceImpl;

import com.cygnus.app.dto.UserDto;
import com.cygnus.app.entity.User;
import com.cygnus.app.repository.UserRepository;
import com.cygnus.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        userRepository.save(user);
    }
}
