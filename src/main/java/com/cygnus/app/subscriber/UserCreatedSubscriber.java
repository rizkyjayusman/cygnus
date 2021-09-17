package com.cygnus.app.subscriber;

import com.cygnus.app.base.service.KafkaConsumerService;
import com.cygnus.app.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Slf4j
@Component
public class UserCreatedSubscriber {

    @Autowired
    private KafkaConsumerService kafkaConsumerService;

    @Autowired
    private RegistrationService registrationService;

    @KafkaListener(topics = "user_created", groupId = "group_id")
    public void listenUserCreated(String email) throws MessagingException {
        registrationService.sendVerificationMail(email);
    }

}
