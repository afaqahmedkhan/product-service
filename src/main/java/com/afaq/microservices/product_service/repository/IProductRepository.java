package com.afaq.microservices.product_service.repository;

import com.afaq.microservices.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository  extends MongoRepository<Product, String> {
}
