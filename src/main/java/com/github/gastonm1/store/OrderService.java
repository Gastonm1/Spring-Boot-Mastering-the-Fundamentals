package com.github.gastonm1.store;

public class OrderService {
    public void placeOrder() {
       var paymentService = new StripePaymentService();
       paymentService.processPayment(10);
    }
}
