package com.here.example.wire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("suzuki")
public class Maruti implements Car {
  private String name;

  public String getName() {
    return name;
  }
}
