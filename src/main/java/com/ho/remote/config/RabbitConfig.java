package com.ho.remote.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
  public static final String QUEUE_NAME = "aircon.control.queue";

  @Bean
  public Queue airconQueue() {
    return new Queue(QUEUE_NAME, false);
  }
}
