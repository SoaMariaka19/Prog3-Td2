package com.example.td2.service;

import com.example.td2.model.Match;
import com.example.td2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
  private final MatchRepository repository;

  public List<Match> getAll(){
    return repository.findAll();
  }
}
