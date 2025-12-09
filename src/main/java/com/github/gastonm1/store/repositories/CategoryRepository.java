package com.github.gastonm1.store.repositories;

import com.github.gastonm1.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}