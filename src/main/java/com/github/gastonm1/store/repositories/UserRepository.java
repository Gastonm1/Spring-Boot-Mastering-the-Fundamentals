package com.github.gastonm1.store.repositories;

import com.github.gastonm1.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
