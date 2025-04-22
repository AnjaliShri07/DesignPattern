package com.designPattern.structural.Adapter.DatabaseAdapter;

public class MongoDBDatabase {
    public void establishConnection() {
        System.out.println("Connecting to MongoDB database...");
    }

    public void closeConnection() {
        System.out.println("Disconnecting from MongoDB database...");
    }

    public void runQuery(String query) {
        System.out.println("Executing query on MongoDB: " + query);
    }
}
