package com.example.td2.controller;

import com.example.td2.model.Team;
import com.example.td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("team")
@AllArgsConstructor
public class TeamController {
  private final TeamService service;
  @GetMapping
  public List<Team> findAll(){
    return service.getAll();
  }
}
