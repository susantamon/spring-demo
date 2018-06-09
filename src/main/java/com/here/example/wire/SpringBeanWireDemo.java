package com.here.example.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@Component
@PropertySource("classpath:app.properties")
@ImportResource("classpath:demo-bean.xml")
public class SpringBeanWireDemo {

  @Bean
  public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Autowired
  private Environment env;

  @Autowired
  @Qualifier("toyota")
  private Car car1;

  @Autowired
  @Qualifier("toyota")
  private Car car2;

  @Autowired
  @Qualifier("honda")
  private Car car3;

  public String getCars() {
    return car1.getName() + " " + car2.getName() + " " + car3.getName() + " " + env.getProperty("toyota.name");
  }
}
