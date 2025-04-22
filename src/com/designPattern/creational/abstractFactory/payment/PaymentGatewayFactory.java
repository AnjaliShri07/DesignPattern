package com.designPattern.creational.abstractFactory.payment;

// Abstract Factory
interface PaymentGatewayFactory {
    PaymentAuthorization createAuthorization();
    PaymentProcessor createProcessor();
}
