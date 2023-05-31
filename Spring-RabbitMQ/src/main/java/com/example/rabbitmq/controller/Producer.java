package com.example.rabbitmq.controller;

import com.example.rabbitmq.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Producer {

    private final RabbitTemplate rabbitTemplate;
    // private final DirectExchange exchange;
    //private final FanoutExchange exchange;
    private final TopicExchange exchange;

    @PostMapping("/post")
    public String send(@RequestBody Message message) {
        rabbitTemplate.convertAndSend(exchange.getName(), "routing.A", message);
        return "Mesaj basarili";
    }


}
