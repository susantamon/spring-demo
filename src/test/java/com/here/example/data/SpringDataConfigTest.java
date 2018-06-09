package com.here.example.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringDataConfig.class)
public class SpringDataConfigTest {

  @Autowired
  private SpringDataDemo springDataDemo;

  @Test
  public void studentCrud() {
    Student s = new Student();
    s.id = 1L;
    s.name = "Susanta";
    s.age = 30;
    Assert.assertNotNull(springDataDemo.saveStudent(s));
    Assert.assertEquals(1, springDataDemo.getAllStudents().size());
  }
}