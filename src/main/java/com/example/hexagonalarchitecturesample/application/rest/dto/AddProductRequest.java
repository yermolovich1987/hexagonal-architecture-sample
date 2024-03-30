package com.example.hexagonalarchitecturesample.application.rest.dto;

import com.example.hexagonalarchitecturesample.domain.models.Product;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class AddProductRequest {
  @JsonCreator
  public AddProductRequest(@JsonProperty("product") final Product product) {
    this.product = product;
  }

  private final Product product;
}
