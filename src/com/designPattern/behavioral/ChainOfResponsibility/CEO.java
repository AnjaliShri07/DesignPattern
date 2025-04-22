package com.designPattern.behavioral.ChainOfResponsibility;

//Concrete Handler
public class CEO extends Approver {
    @Override
    public void processRequest(Request request) {
        if (request.getAmount() > 10000) {
            System.out.println("CEO approved: " + request.getDescription());
        }
    }
}

