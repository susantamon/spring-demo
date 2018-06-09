package com.here.example.com.here.example.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class RestfulHello {

  @RequestMapping("hello")
  public @ResponseBody ResponseEntity<Employee> sayHello() {
    final HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    return new ResponseEntity<>(new Employee(), httpHeaders, HttpStatus.OK);
  }

  @RequestMapping(value = "hi", method = RequestMethod.POST)
  public @ResponseBody ResponseEntity<Employee> sayHi(@RequestBody Employee employee) {
    employee.title = "hi " + employee.title;
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }

  @RequestMapping(value = "bye/{id}", method = RequestMethod.POST)
  public @ResponseBody ResponseEntity<Employee> sayBye(@PathVariable int id, @RequestParam(value = "name", defaultValue = "Susanta") String name, @RequestBody Employee employee) {
    employee.id = id;
    employee.name = name;
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }
}