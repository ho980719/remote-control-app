package com.ho.remote.control;

import com.ho.remote.config.RabbitConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class RabbitMqReceiver {

  @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
  public void receiveMessage(String message) {
    log.info("Received message: {}", message);
    // 여기에 메시지 처리 로직 추가
  }
}
