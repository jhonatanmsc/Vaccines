package com.example.vaccines.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {
  
  @Id
  private Long id;
  private String name;
  @Column(unique=true)
  private String email;
  @Column(unique=true)
  private String cpf;
  private Date birthDate;

  public Patient(String email, String cpf) {
    this.email = email;
    this.cpf = cpf;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return this.cpf;
  } 

  public void setBrithDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public Date getBirhtDate() {
    return this.birthDate;
  } 
}
