package com.designPattern.creational.abstractFactory.payment;

// Concrete Product: Stripe Authorization
class StripeAuthorization implements PaymentAuthorization {
    public void authorize(double amount) {
        System.out.println("Authorizing Stripe payment of $" + amount);
    }
}
