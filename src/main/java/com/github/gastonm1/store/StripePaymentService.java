package com.github.gastonm1.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// At times there will be conflicts with your classes
// In this case we have two Payment services, PayPal and Stripe
// Since both are services we should use @Service annotation
// However, this will confuse spring because it won't know which one it should use
// There are MORE annotations for cases like this: @Primary & @Qualifier
// @Primary and @Qualifier are both used in Spring for resolving dependency injection conflicts
// @Primary: marks one bean as the default choice if there are multiple beans of the same type
// @Qualifier: gives precise control - you specify exactly which bean you want

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
