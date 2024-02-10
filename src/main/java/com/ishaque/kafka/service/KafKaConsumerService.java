
package com.ishaque.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class KafKaConsumerService {
    List<String> messageList= new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(KafKaConsumerService.class);

    @KafkaListener(topics = "#{'${kafka.topic}'.split(',')}",groupId ="ishaque")
    public void consume(String message){
        messageList.add(message);
        LOGGER.info(String.format("Message received -> %s", message));
    }

    public List<String> getMessageList(){
        return messageList;
    }
}
