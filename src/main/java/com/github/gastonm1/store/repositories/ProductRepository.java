package com.github.gastonm1.store.repositories;

import com.github.gastonm1.store.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}