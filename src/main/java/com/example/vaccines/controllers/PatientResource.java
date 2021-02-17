package com.example.vaccines.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.vaccines.DTOs.PatientDTO;
import com.example.vaccines.DTOs.PatientResponseDTO;
import com.example.vaccines.models.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vaccines.repositories.Patients;
import com.example.vaccines.services.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientResource {

  @Autowired
  private Patients patients;

  @Autowired
  private PatientService patientService;

  @GetMapping("/{id}")
  public Optional<Patient> retrieve(@PathVariable Long id) {
    return patients.findById(id);
  }

  @GetMapping
  public List<Patient> listAll() {
    return patients.findAll();
  }

  @PostMapping
  public ResponseEntity<PatientResponseDTO> save(@Valid @RequestBody PatientDTO dto) {
    Patient patient = patientService.save(dto.transformToObject());
    return new ResponseEntity<>(PatientResponseDTO.transformToDto(patient), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    patients.deleteById(id);
  }
}
