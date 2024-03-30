package com.example.hexagonalarchitecturesample.domain.service;

import com.example.hexagonalarchitecturesample.domain.models.Order;
import com.example.hexagonalarchitecturesample.domain.models.Product;
import com.example.hexagonalarchitecturesample.domain.ports.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class DomainOrderService implements OrderService {
  private final OrderRepository orderRepository;

  @Override
  public UUID createOrder(Product product) {
    Order order = new Order(UUID.randomUUID(), product);
    orderRepository.save(order);

    return order.getId();
  }

  @Override
  public void addProduct(UUID id, Product product) {
    Order order = getOrder(id);
    order.addOrder(product);

    orderRepository.save(order);
  }

  @Override
  public void completeOrder(UUID id) {
    Order order = getOrder(id);
    order.complete();

    orderRepository.save(order);
  }

  @Override
  public void deleteProduct(UUID id, UUID productId) {
    Order order = getOrder(id);
    order.removeOrder(productId);

    orderRepository.save(order);
  }

  @Override
  public List<Order> getOrders() {
    return orderRepository.findAll();
  }

  public Order getOrder(UUID id) {
    return orderRepository.findById(id).orElseThrow(RuntimeException::new);
  }
}
