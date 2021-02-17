package com.example.vaccines.DTOs;

import java.sql.Date;

import com.example.vaccines.models.Patient;

public class PatientResponseDTO {
  
  private Long id;
  private String email;
  private String cpf;
  private String name;
  private Date birthDate;

  private PatientResponseDTO(Patient patient) {
    this.id = patient.getId();
    this.email = patient.getEmail();
    this.cpf = patient.getCpf();
    this.name = patient.getName();
    this.birthDate = patient.getBirthDate();
  }

  public static PatientResponseDTO transformToDto(Patient patient) {
    return new PatientResponseDTO(patient);
  }

  public Long getId() {
    return id;
  }
  public String getEmail() {
    return email;
  }
  public String getCpf() {
    return cpf;
  }
  public String getName() {
    return name;
  }
  public Date getBirthDate() {
    return birthDate;
  }
}
