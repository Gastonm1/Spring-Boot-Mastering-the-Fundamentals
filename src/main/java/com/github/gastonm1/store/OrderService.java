package com.github.gastonm1.store;

public class OrderService {
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
       paymentService.processPayment(10);
    }

    // You can inject a dependency via setters but the more common way is using the constructor
    // Here is an example of using the setter
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
