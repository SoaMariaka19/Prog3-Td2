package com.example.td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;


@Builder
@AllArgsConstructor
public class PlayerResponse {
  private Long id;
  private String name;
}
