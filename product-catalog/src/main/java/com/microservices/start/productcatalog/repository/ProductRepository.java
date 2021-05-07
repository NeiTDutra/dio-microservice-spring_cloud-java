package com.microservices.start.productcatalog.repository;

import com.microservices.start.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
