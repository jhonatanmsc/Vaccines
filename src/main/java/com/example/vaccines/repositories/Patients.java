package com.example.vaccines.repositories;

import com.example.vaccines.models.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Patients extends JpaRepository<Patient, Long>{
  
}