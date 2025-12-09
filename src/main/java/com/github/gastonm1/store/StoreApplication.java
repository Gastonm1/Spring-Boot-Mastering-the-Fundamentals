package com.github.gastonm1.store;

import com.github.gastonm1.store.entities.User;
import com.github.gastonm1.store.repositories.UserRepository;
import com.github.gastonm1.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var service = context.getBean(UserService.class);
        service.deleteRelated();
	}
}
