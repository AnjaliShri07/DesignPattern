package com.designPattern.creational.abstractFactory.Database;

// Concrete Product: PostgreSQL Connection
class PostgreSQLConnection implements Connection {
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}
