package com.example.vaccines.DTOs;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.vaccines.models.Patient;

public class PatientDTO {
  
  @NotNull
  @NotEmpty
  @Email
  private String email;

  @NotNull
  @NotEmpty
  private String cpf;
  private String name;
  private Date birthDate;

  public Patient transformToObject() {
    Patient patient = new Patient(email, cpf);
    patient.setName(name);
    patient.setBirthDate(birthDate);
    return patient;
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
