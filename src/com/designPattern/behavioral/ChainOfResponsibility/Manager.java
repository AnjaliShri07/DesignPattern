package com.designPattern.behavioral.ChainOfResponsibility;

//Concrete Handler
public class Manager extends Approver {
    @Override
    public void processRequest(Request request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Manager approved: " + request.getDescription());
        } else if (next != null) {
            next.processRequest(request);
        }
    }
}
