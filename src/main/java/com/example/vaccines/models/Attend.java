package com.example.vaccines.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="attends")
public class Attend {
  
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;
  
  @ManyToOne
  @JoinColumn(nullable = false)
  private Patient patient;

  @Column(nullable = false)
  private String vaccineName;

  private Attend() {
  }

  public Attend(String vaccineName, Patient patient) {
    this.vaccineName = vaccineName;
    this.patient = patient;
  }

  public Long getId() {
    return this.id;
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
