package com.here.example.wire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Profile("dev")
public class Toyota implements Car {

  @Value("${toyota.name}")
  private String name;

  public Toyota() {
  }

  public Toyota(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
