package com.designPattern.creational.PaymentProcessorFactory;

public class BankTransferProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
    }
}
