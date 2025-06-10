package com.ho.remote.enums;

public enum TemperatureCommand {
  UP, DOWN;

  public static final String ROUTING_KEY = "remote/temperature";
}
