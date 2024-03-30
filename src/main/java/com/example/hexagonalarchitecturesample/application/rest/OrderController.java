package com.example.hexagonalarchitecturesample.application.rest;

import com.example.hexagonalarchitecturesample.application.rest.dto.AddProductRequest;
import com.example.hexagonalarchitecturesample.application.rest.dto.CreateOrderRequest;
import com.example.hexagonalarchitecturesample.application.rest.dto.CreateOrderResponse;
import com.example.hexagonalarchitecturesample.domain.models.Order;
import com.example.hexagonalarchitecturesample.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @PostMapping
  CreateOrderResponse createOrder(@RequestBody CreateOrderRequest request) {
    UUID id = orderService.createOrder(request.getProduct());

    return new CreateOrderResponse(id);
  }

  @PostMapping(value = "/{id}/products")
  void addProduct(@PathVariable UUID id, @RequestBody AddProductRequest request) {
    orderService.addProduct(id, request.getProduct());
  }

  @DeleteMapping(value = "/{id}/products")
  void deleteProduct(@PathVariable UUID id, @RequestParam UUID productId) {
    orderService.deleteProduct(id, productId);
  }

  @PostMapping("/{id}/complete")
  void completeOrder(@PathVariable UUID id) {
    orderService.completeOrder(id);
  }

  @GetMapping
  List<Order> getOrders() {
    return orderService.getOrders();
  }
}
