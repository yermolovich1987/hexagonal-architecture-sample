package com.example.hexagonalarchitecturesample.domain.service;

import com.example.hexagonalarchitecturesample.domain.models.Order;
import com.example.hexagonalarchitecturesample.domain.models.Product;
import com.example.hexagonalarchitecturesample.domain.ports.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DomainOrderServiceUnitTest {

  private OrderRepository orderRepository;
  private DomainOrderService tested;

  @BeforeEach
  void setUp() {
    orderRepository = mock(OrderRepository.class);
    tested = new DomainOrderService(orderRepository);
  }

  @Test
  void shouldCreateOrder_thenSaveIt() {
    final Product product = new Product(UUID.randomUUID(), BigDecimal.TEN, "productName");

    final UUID id = tested.createOrder(product);

    verify(orderRepository).save(any(Order.class));
    assertNotNull(id);
  }
}
