package com.example.vaccines.DTOs;

import com.example.vaccines.models.Attend;
import com.example.vaccines.models.Patient;

public class AttendResponseDTO {
  
  private Long id;
  private String vaccineName;
  private Patient patient;

  private AttendResponseDTO(Attend attend) {
    this.id = attend.getId();
    this.vaccineName = attend.getVaccineName();
    this.patient = attend.getPatient();
  }

  public static AttendResponseDTO transformToDto(Attend attend) {
    return new AttendResponseDTO(attend);
  }

  public Long getId() {
    return this.id;
  }

  public String getVaccineName() {
    return this.vaccineName;
  }

  public Patient getPatient() {
    return this.patient;
  }


}
