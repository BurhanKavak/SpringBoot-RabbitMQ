package com.example.spbootrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpbootRabbitMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootRabbitMqConsumerApplication.class, args);
	}

}
