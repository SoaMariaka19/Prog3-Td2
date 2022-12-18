package com.example.td2.service;

import com.example.td2.model.Team;
import com.example.td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
  private final TeamRepository repository;
  public List<Team> getAll(){
    return repository.findAll();
  }
}
