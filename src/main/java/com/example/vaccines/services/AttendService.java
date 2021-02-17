package com.example.vaccines.services;

import com.example.vaccines.models.Attend;
import com.example.vaccines.repositories.Attends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendService {
  
  private final Attends attends;

  @Autowired
  public AttendService(Attends attends) {
    this.attends = attends;
  }

  public Attend save(Attend attend) {
    return attends.save(attend);
  }
}
