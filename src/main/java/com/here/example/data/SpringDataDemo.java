package com.here.example.data;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringDataDemo {

  @Autowired
  private StudentRepository studentRepository;

  public List<Student> getAllStudents() {
    List<Student> studentList = studentRepository.findAll();
    System.out.println(studentList);
    return studentList;
  }

  public Student saveStudent(Student student) {
    Student st = studentRepository.save(student);
    System.out.println(st);
    return st;
  }
}
