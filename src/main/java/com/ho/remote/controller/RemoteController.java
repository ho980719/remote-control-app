package com.ho.remote.controller;

import com.ho.remote.control.RabbitMqSender;
import com.ho.remote.enums.PowerCommand;
import com.ho.remote.enums.TemperatureCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/remote")
public class RemoteController {
  private final RabbitMqSender sender;

  @PostMapping("/power")
  public String powerControl(@RequestParam PowerCommand command) {
    sender.send(PowerCommand.ROUTING_KEY, command.toString());
    return "Command: " + command;
  }

  @PostMapping("/temperature")
  public String temperatureControl(@RequestParam TemperatureCommand command) {
    sender.send(TemperatureCommand.ROUTING_KEY, command.toString());
    return "Command: " + command;
  }
}
