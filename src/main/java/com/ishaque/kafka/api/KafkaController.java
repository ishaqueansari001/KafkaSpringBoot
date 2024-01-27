package com.ishaque.kafka.api;

import com.ishaque.kafka.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka/application")
public class KafkaController {

    public static   Logger LOGGER= LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    KafkaProducerService kafkaService;

    @PostMapping(value = "/producer")
    public void producer(@RequestBody String message){
        LOGGER.info("recieved message for the producer {}",message);
        kafkaService.sendMessage(message);
    }

}
