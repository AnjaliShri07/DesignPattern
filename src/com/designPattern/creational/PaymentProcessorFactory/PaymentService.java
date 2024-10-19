package com.designPattern.creational.PaymentProcessorFactory;

public class PaymentService {
    public static void main(String[] args) {
        PaymentProcessorFactory factory = new PaymentProcessorFactory();

        PaymentProcessor processor = factory.getPaymentProcessor("creditcard");
        processor.processPayment(100.0);

        processor = factory.getPaymentProcessor("paypal");
        processor.processPayment(200.0);
    }
}
