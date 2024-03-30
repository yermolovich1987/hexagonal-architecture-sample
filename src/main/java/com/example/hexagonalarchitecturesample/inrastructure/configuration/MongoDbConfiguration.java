package com.example.hexagonalarchitecturesample.inrastructure.configuration;

import com.example.hexagonalarchitecturesample.inrastructure.repository.SpringDataMongoOrderRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDbConfiguration {}
