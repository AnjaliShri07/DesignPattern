package com.designPattern.structural.Adapter.DatabaseAdapter;

// MySQL Adaptee
public class MySQLDatabase {
    public void establishConnection() {
        System.out.println("Connecting to MySQL database...");
    }

    public void closeConnection() {
        System.out.println("Disconnecting from MySQL database...");
    }

    public void runQuery(String query) {
        System.out.println("Executing query on MySQL: " + query);
    }
}
