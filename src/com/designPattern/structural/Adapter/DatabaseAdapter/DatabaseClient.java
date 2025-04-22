package com.designPattern.structural.Adapter.DatabaseAdapter;

public class DatabaseClient {
    public static void main(String[] args) {
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        DatabaseConnector mySQLAdapter = new MySQLAdapter(mySQLDatabase);
        mySQLAdapter.connect();
        mySQLAdapter.executeQuery("SELECT * FROM users");
        mySQLAdapter.disconnect();

        System.out.println(); // Just for separation

        // Using MongoDB
        MongoDBDatabase mongoDBDatabase = new MongoDBDatabase();
        DatabaseConnector mongoDBAdapter = new MongoDBAdapter(mongoDBDatabase);
        mongoDBAdapter.connect();
        mongoDBAdapter.executeQuery("SELECT * FROM users");
        mongoDBAdapter.disconnect();
    }
}
