package com.designPattern.creational.abstractFactory.payment;

// Concrete Factory for Stripe
class StripeFactory implements PaymentGatewayFactory {
    public PaymentAuthorization createAuthorization() {
        return new StripeAuthorization();
    }
    public PaymentProcessor createProcessor() {
        return new StripeProcessor();
    }
}
