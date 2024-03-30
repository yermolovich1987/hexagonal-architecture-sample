package com.example.hexagonalarchitecturesample.domain.models;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Order {
  private UUID id;
  private OrderStatus status;
  private List<OrderItem> orderItems;
  private BigDecimal price;

  public Order(UUID id, Product product) {
    this.id = id;
    this.orderItems = new ArrayList<>(List.of(new OrderItem(product)));
    this.status = OrderStatus.CREATED;
    this.price = product.getPrice();
  }

  public void complete() {
    validateState();
    this.status = OrderStatus.COMPLETED;
  }

  public void addOrder(Product product) {
    validateState();
    validateProduct(product);
    orderItems.add(new OrderItem(product));
    price = price.add(product.getPrice());
  }

  public void removeOrder(UUID id) {
    validateState();
    final OrderItem orderItem = getOrderItem(id);
    orderItems.remove(orderItem);

    price = price.subtract(orderItem.getPrice());
  }

  private OrderItem getOrderItem(UUID productId) {
    return orderItems.stream()
        .filter(orderItem -> orderItem.getProductId().equals(productId))
        .findAny()
        .orElseThrow(
            () -> new RuntimeException("Order item with id %s not found".formatted(productId)));
  }

  private void validateState() {
    // TODO Skipped implementation for now.
  }

  private void validateProduct(Product product) {
    // TODO Skipped implementation for now.
  }
}
