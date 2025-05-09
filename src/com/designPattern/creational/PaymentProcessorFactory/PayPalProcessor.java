package com.designPattern.creational.PaymentProcessorFactory;

public class PayPalProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
