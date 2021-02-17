package com.example.vaccines.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.vaccines.DTOs.AttendDTO;
import com.example.vaccines.DTOs.AttendResponseDTO;
import com.example.vaccines.models.Attend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vaccines.repositories.Attends;
import com.example.vaccines.services.AttendService;

@RestController
@RequestMapping("/attends")
public class AttendResource {

  @Autowired
  private Attends attends;

  @Autowired
  private AttendService attendService;

  @GetMapping("/{id}")
  public Optional<Attend> retrieve(@PathVariable Long id) {
    return attends.findById(id);
  }

  @GetMapping
  public List<Attend> listAll() {
    return attends.findAll();
  }

  @PostMapping
  public ResponseEntity<AttendResponseDTO> save(@Valid @RequestBody AttendDTO dto) {
    Attend attend = attendService.save(dto.transformToObject());
    return new ResponseEntity<>(AttendResponseDTO.transformToDto(attend), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    attends.deleteById(id);
  }

}
