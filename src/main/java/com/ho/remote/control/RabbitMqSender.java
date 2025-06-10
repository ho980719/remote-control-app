package com.ho.remote.control;

import com.ho.remote.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqSender {

  private final RabbitTemplate rabbitTemplate;

  public RabbitMqSender(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  public void send(String routingKey, String message) {
    rabbitTemplate.convertAndSend("amq.topic", routingKey, message);
  }
}

