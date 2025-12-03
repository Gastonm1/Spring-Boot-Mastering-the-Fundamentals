package com.github.gastonm1.store;

public class PayPalPaymentService  implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
