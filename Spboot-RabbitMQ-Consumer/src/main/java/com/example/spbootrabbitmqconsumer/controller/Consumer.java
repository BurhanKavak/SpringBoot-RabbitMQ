package com.example.spbootrabbitmqconsumer.controller;

import com.example.spbootrabbitmqconsumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@Component
public class Consumer {

    @RabbitListener(queues = "queue.A")
    private void receive(@Payload Message message) {
        log.info("Mesaj dinleniyor queue.A -> {}",message);
    }

    @RabbitListener(queues = "queue.B")
    private void receiveFromB(@Payload Message message) {
        log.info("Mesaj dinleniyor queue.B -> {}",message);
    }

    @RabbitListener(queues = "queue.all")
    private void receiveFromAll(@Payload Message message) {
        log.info("Mesaj dinleniyor queue.all -> {}",message);
    }
}
