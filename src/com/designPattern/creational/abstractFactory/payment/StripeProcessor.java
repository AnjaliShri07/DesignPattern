package com.designPattern.creational.abstractFactory.payment;

// Concrete Product: Stripe Processor
class StripeProcessor implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}
