package com.designPattern.creational.abstractFactory.payment;

// Concrete Factory for PayPal
class PayPalFactory implements PaymentGatewayFactory {
    public PaymentAuthorization createAuthorization() {
        return new PayPalAuthorization();
    }
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }
}
