package com.example.hexagonalarchitecturesample.application.rest.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class CreateOrderResponse {
  private final UUID id;
}
