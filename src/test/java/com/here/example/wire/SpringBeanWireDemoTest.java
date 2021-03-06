package com.here.example.wire;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringBeanWireDemo.class)
@ActiveProfiles("dev")
public class SpringBeanWireDemoTest {

  @Autowired
  private SpringBeanWireDemo springBeanWireDemo;

  @Test
  public void test() {
    System.out.println(springBeanWireDemo.getCars());
  }
}