package com.designPattern.creational.abstractFactory.payment;

// Client Code
public class Main {
    public static void main(String[] args) {
        PaymentGatewayFactory factory;

        // Runtime decision for payment gateway
        String gateway = "PayPal"; // Example value; could be dynamically determined
        if (gateway.equalsIgnoreCase("PayPal")) {
            factory = new PayPalFactory();
        } else {
            factory = new StripeFactory();
        }

        // Create payment components
        PaymentAuthorization authorization = factory.createAuthorization();
        PaymentProcessor processor = factory.createProcessor();

        // Use components
        authorization.authorize(100.0);
        processor.process(100.0);
    }
}


/*
Explanation:
        - At runtime, the client code decides which payment gateway factory to use based on the selected gateway.
        - The factory creates gateway-specific authorization and processing objects,
             ensuring that the client code remains independent of the concrete implementations.*/
