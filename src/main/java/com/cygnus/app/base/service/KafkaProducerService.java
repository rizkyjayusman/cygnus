package com.cygnus.app.base.service;

public interface KafkaProducerService {
    void sendMessage(String topic, String message);
}
