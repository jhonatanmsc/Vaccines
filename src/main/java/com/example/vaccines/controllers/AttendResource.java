package com.example.vaccines.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.vaccines.exception.ResourceNotFoundException;
import com.example.vaccines.models.Attend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.vaccines.repositories.Attends;

@RestController
@RequestMapping("/attends")
public class AttendResource {

  @Autowired
  private Attends attends;

  @GetMapping("/{id}")
  public Attend retrieve(@PathVariable Long id) {
    return attends.findById(id)
                  .orElseThrow(() -> new ResourceNotFoundException("Attend not found with id: " + id));
  }

  @GetMapping
  public List<Attend> listAll() {
    return attends.findAll();
  }

  @PostMapping
  public Attend save(@Valid @RequestBody Attend attend, BindingResult bindingResult) {
    return attends.save(attend);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    attends.deleteById(id);
  }

}
