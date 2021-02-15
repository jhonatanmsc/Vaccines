package com.example.vaccines.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="patients")
public class Patient implements Serializable{
  
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  private Long id;

  @Column(unique=true, nullable=false)
  private String email;

  @Column(unique=true, nullable=false)
  private String cpf;

  private String name;
  private Date birthDate;

  private Patient() {
  }

  public Patient(String email, String cpf) {
    this.email = email;
    this.cpf = cpf;
  }

  public Long getId() {
    return this.id;
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
