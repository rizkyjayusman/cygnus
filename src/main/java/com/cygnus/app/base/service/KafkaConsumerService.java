package com.cygnus.app.base.service;

import java.io.IOException;

public interface KafkaConsumerService {
    void consume(String message) throws IOException;
}
