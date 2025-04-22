package com.designPattern.behavioral.ChainOfResponsibility;

//Concrete Handler
public class Director extends Approver {
    @Override
    public void processRequest(Request request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Director approved: " + request.getDescription());
        } else if (next != null) {
            next.processRequest(request);
        }
    }
}
