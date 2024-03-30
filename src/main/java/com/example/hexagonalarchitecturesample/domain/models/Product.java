package com.example.hexagonalarchitecturesample.domain.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@EqualsAndHashCode
public class Product {
  private final UUID id;
  private final BigDecimal price;
  private final String name;

  // TODO Ideally, this should not be used in real application. Instead, there should be a separate
  // DTO for UI. Left as it is now just for simplicity.
  @JsonCreator
  public Product(
      @JsonProperty("id") final UUID id,
      @JsonProperty("price") final BigDecimal price,
      @JsonProperty("name") final String name) {
    this.id = id;
    this.price = price;
    this.name = name;
  }
}
