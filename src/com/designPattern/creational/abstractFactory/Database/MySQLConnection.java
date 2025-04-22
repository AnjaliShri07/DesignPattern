package com.designPattern.creational.abstractFactory.Database;

// Concrete Product: MySQL Connection
class MySQLConnection implements Connection {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}
