package com.example.hexagonalarchitecturesample.domain.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class OrderItem {
  private UUID productId;
  private BigDecimal price;

  public OrderItem(Product product) {
    this.productId = product.getId();
    this.price = product.getPrice();
  }
}
