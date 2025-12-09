package com.github.gastonm1.store;

import com.github.gastonm1.store.entities.User;
import com.github.gastonm1.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);

//        var user = repository.findById(1L).orElseThrow();
//        System.out.println(user.getEmail());
        repository.deleteById(1L);


	}
}
