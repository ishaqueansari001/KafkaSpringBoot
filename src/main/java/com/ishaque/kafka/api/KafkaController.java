package com.ishaque.kafka.api;

import com.ishaque.kafka.service.KafKaConsumerService;
import com.ishaque.kafka.service.KafkaProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/kafka/application")
public class KafkaController {

    public static   Logger LOGGER= LoggerFactory.getLogger(KafkaController.class);
    @Autowired
   KafkaProducerService kafkaService;

    @Autowired
    KafKaConsumerService kafKaConsumerService;

    @PostMapping(value = "/producer")
    public void producer(@RequestBody String message){
        LOGGER.info("recieved message for the producer {}",message);
        kafkaService.sendMessage(message);
    }

    @GetMapping("/test")
    public void print(){
        System.out.println("testing");
    }
    @GetMapping("/getMessage")
    public List<String> messageGet(){
        return  kafKaConsumerService.getMessageList();

    }
}
