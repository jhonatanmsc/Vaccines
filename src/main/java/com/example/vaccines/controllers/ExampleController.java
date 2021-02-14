package com.example.vaccines.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 */
@RestController
public class ExampleController {

  @RequestMapping("/")
  public String index() {
    return "Hello world!";
  }
  
}