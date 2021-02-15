package com.example.vaccines.controllers;

import java.util.List;
import java.util.Optional;

import com.example.vaccines.models.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vaccines.repositories.Patients;

@RestController
@RequestMapping("/patients")
public class PatientResource {

  @Autowired
  private Patients patients;

  @GetMapping("/{id}")
  public Optional<Patient> retrieve(@PathVariable Long id) {
    return patients.findById(id);
  }

  @GetMapping
  public List<Patient> listAll() {
    return patients.findAll();
  }

  @PostMapping
  public Patient save(@RequestBody Patient patient) {
    return patients.save(patient);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    patients.deleteById(id);
  }
}
