package com.designPattern.creational.PaymentProcessorFactory;

public class CryptoProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Crypto transfer of $" + amount);
    }
}
