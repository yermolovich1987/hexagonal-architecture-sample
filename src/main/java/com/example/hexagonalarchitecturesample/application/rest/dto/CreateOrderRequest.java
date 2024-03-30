package com.example.hexagonalarchitecturesample.application.rest.dto;

import com.example.hexagonalarchitecturesample.domain.models.Product;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
public class CreateOrderRequest {
  @JsonCreator
  public CreateOrderRequest(@JsonProperty("product") @NotNull final Product product) {
    this.product = product;
  }

  private final Product product;
}
