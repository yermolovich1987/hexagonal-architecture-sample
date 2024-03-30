package com.example.hexagonalarchitecturesample.domain.models;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class OrderItem {
  private UUID productId;
  private BigDecimal price;

  public OrderItem(Product product) {
    this.productId = product.getId();
    this.price = product.getPrice();
  }
}
