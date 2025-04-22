package com.designPattern.behavioral.ChainOfResponsibility;

public class ChainApp {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        // Setting up the chain
        manager.setNext(director);
        director.setNext(ceo);

        Request req1 = new Request("Purchase Office Supplies", 500);
        Request req2 = new Request("Buy New Laptops", 5000);
        Request req3 = new Request("Open New Office", 20000);

        manager.processRequest(req1);
        manager.processRequest(req2);
        manager.processRequest(req3);
    }
}

