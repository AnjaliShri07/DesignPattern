package com.designPattern.creational.abstractFactory.Database;

// Concrete Product: PostgreSQL Query
class PostgreSQLQuery implements Query {
    public void execute() {
        System.out.println("Executing PostgreSQL query...");
    }
}
