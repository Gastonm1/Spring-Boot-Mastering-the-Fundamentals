package com.github.gastonm1.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

// Spring IoC Container
// One of the core features of the Spring framework is the ability to create objects and inject them into our classes
// IOC Container: This container is responsible for managing the objects in our application
// In Spring Terminology: These managed objects are known as "Beans"
// So a "Bean" is just a regular Java object that is managed by Spring
// Spring takes care of creating it, injecting its dependencies, and managing its life cycle.
// IOC: Inversional of Control
// Inverts the control of creating objects and managing dependencies.

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
	}
}
