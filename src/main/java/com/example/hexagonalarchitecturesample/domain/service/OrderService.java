package com.example.hexagonalarchitecturesample.domain.service;

import com.example.hexagonalarchitecturesample.domain.models.Order;
import com.example.hexagonalarchitecturesample.domain.models.Product;

import java.util.List;
import java.util.UUID;

public interface OrderService {
  UUID createOrder(Product product);

  void addProduct(UUID id, Product product);

  void completeOrder(UUID id);

  void deleteProduct(UUID id, UUID productId);

  // TODO replace with DTO
  List<Order> getOrders();

  Order getOrder(UUID id);
}
