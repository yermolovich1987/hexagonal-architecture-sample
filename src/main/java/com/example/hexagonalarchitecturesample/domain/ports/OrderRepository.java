package com.example.hexagonalarchitecturesample.domain.ports;

import com.example.hexagonalarchitecturesample.domain.models.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
  Optional<Order> findById(UUID id);

  void save(Order order);
}
