package com.example.hexagonalarchitecturesample.inrastructure.repository;

import com.example.hexagonalarchitecturesample.domain.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, UUID> {}
