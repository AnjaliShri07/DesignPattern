package com.designPattern.behavioral.ChainOfResponsibility;

public class Request {
    private final String description;
    private final double amount;

    public Request(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
