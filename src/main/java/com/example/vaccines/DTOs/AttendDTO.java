package com.example.vaccines.DTOs;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.vaccines.models.Attend;
import com.example.vaccines.models.Patient;

public class AttendDTO {
  
  @NotNull
  @NotEmpty
  private String vaccineName;

  @NotNull
  private Patient patient;

  public Attend transformToObject() {
    return new Attend(vaccineName, patient);
  }

  public String getVaccine() {
    return this.vaccineName;
  }

  public Patient getPatient() {
    return this.patient;
  }
}
