package com.github.gastonm1.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Annotations: A Java annotation is a special kind of metadata you attach to classes, methods, fields, parameters, or even other annotations.
// Think of it as a label or instruction tag that adds extra meaning or behavior to your code without being part of the business logic itself
// A few types of annotations are @Component, @Service, @Repository, @Controller, etc.
// @Component: A general purpose annotation
// @Service: classes that contain business logic
// @Repository: Classes that interact with a database
// @Controller: Used for marking classes as controllers for handling web requests
// @Override: Helps compiler validate method overriding
// @Deprecated: Mark API as outdated
// @NotNull: validator frameworks enforce this
// @Autowired: Spring injects dependencies
// @Entitiy: Marks class as DB entity


@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
       paymentService.processPayment(10);
    }
}
