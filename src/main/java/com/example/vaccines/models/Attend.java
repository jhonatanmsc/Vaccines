package com.example.vaccines.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="attends")
public class Attend {
  
  @Id
  private Long id;
  private String vaccineName;
  
  @ManyToOne
  private Patient patient;

  public Attend(String vaccineName, Patient patient) {
    this.vaccineName = vaccineName;
    this.patient = patient;
  }

  public void setVaccineName(String vaccineName) {
    this.vaccineName = vaccineName;
  }

  public String getVaccineName() {
    return this.vaccineName;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Patient getPatient() {
    return this.patient;
  }
}
