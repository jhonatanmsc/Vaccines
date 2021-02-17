package com.example.vaccines.services;

import com.example.vaccines.models.Patient;
import com.example.vaccines.repositories.Patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
  
  private final Patients patients;

  @Autowired
  public PatientService(Patients patients) {
    this.patients = patients;
  }

  public Patient save(Patient patient) {
    return patients.save(patient);
  }
}