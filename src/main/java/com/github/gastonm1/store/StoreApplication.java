package com.github.gastonm1.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {


    // OPEN CLOSED PRINCIPLE
    // A class should be open for extension and closed for modification.

	public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);

        var orderService = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
	}

}
