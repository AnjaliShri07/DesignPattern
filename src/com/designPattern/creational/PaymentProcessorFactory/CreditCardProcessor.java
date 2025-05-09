package com.designPattern.creational.PaymentProcessorFactory;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
