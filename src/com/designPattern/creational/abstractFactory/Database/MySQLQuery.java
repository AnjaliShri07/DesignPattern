package com.designPattern.creational.abstractFactory.Database;

// Concrete Product: MySQL Query
class MySQLQuery implements Query {
    public void execute() {
        System.out.println("Executing MySQL query...");
    }
}
