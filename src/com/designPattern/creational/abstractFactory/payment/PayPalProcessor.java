package com.designPattern.creational.abstractFactory.payment;

// Concrete Product: PayPal Processor
class PayPalProcessor implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
