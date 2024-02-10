package com.ishaque.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@SpringBootApplication
public class KafkaProducerConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerConsumerApplication.class,args);
    }

}
