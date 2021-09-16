package com.cygnus.app.publisher;

import com.cygnus.app.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserCreatedPublisher {
    public void push(UserDto userDto) {
        // TODO create event
        log.info("PUSH USER CREATION EVENT");
    }
}
