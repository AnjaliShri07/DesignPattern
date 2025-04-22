package com.designPattern.creational.abstractFactory.payment;

// Concrete Product: PayPal Authorization
class PayPalAuthorization implements PaymentAuthorization {
    public void authorize(double amount) {
        System.out.println("Authorizing PayPal payment of $" + amount);
    }
}
