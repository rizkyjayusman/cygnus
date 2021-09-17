package com.cygnus.app.publisher;

import com.cygnus.app.dto.UserDto;
import com.cygnus.app.base.service.KafkaProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserCreatedPublisher {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public void push(UserDto userDto) {
        kafkaProducerService.sendMessage("user_created", userDto.getEmail());
    }
}
