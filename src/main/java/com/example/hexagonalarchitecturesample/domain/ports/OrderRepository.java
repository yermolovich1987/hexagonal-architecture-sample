package com.example.hexagonalarchitecturesample.domain.ports;

import com.example.hexagonalarchitecturesample.domain.models.Order;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
  Optional<Order> findById(UUID id);

  // Naive dummy implementation for POC. In real application we should use pagination and limit
  // returned size.
  List<Order> findAll();

  void save(Order order);
}
