package com.example.td2.controller;

import com.example.td2.controller.mapper.PlayerMapper;
import com.example.td2.controller.response.PlayerResponse;
import com.example.td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("player")
@AllArgsConstructor
public class PlayerController {
  private final PlayerService service;
  private final PlayerMapper mapper;
  @GetMapping
  public List<PlayerResponse> findAll(
          @RequestParam int page,
          @RequestParam int pageSize
  ){
    return mapper.toDomain(service.getAll(page, pageSize));
  }
}
