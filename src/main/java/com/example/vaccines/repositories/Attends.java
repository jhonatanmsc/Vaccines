package com.example.vaccines.repositories;

import com.example.vaccines.models.Attend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Attends extends JpaRepository<Attend, Long>{
  
}
