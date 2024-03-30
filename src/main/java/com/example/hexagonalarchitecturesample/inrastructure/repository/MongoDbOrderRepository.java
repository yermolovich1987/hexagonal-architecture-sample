package com.example.hexagonalarchitecturesample.inrastructure.repository;

import com.example.hexagonalarchitecturesample.domain.models.Order;
import com.example.hexagonalarchitecturesample.domain.ports.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class MongoDbOrderRepository implements OrderRepository {

  private final SpringDataMongoOrderRepository orderRepository;

  @Override
  public Optional<Order> findById(UUID id) {
    return orderRepository.findById(id);
  }

  @Override
  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  @Override
  public void save(Order order) {
    orderRepository.save(order);
  }
}
