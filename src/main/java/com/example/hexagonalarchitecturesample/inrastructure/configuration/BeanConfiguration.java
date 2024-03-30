package com.example.hexagonalarchitecturesample.inrastructure.configuration;

import com.example.hexagonalarchitecturesample.domain.ports.OrderRepository;
import com.example.hexagonalarchitecturesample.domain.service.DomainOrderService;
import com.example.hexagonalarchitecturesample.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  OrderService orderService(OrderRepository orderRepository) {
    return new DomainOrderService(orderRepository);
  }
}
