package com.designPattern.behavioral.ChainOfResponsibility;

// Handler (Abstract Approver)
public abstract class Approver {
    protected Approver next;

    public void setNext(Approver next) {
        this.next = next;
    }

    public abstract void processRequest(Request request);
}
