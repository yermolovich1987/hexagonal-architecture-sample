package com.example.hexagonalarchitecturesample.domain.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class Product {
  private final UUID id;
  private final BigDecimal price;
}
