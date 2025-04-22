package com.designPattern.creational.PaymentProcessorFactory;

public class PaymentService {
    public static void main(String[] args) {
        PaymentProcessorFactory factory = new PaymentProcessorFactory();

        PaymentProcessor processor = factory.getPaymentProcessor("creditcard");
        processor.processPayment(500.0);

        processor = factory.getPaymentProcessor("paypal");
        processor.processPayment(1000.0);

        processor = factory.getPaymentProcessor("crypto");
        processor.processPayment(5000.0);
    }
}
