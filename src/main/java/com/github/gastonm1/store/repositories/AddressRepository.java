package com.github.gastonm1.store.repositories;

import com.github.gastonm1.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
