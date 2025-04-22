package com.designPattern.structural.Adapter.DatabaseAdapter;

// Adapter for MongoDB
public class MongoDBAdapter implements DatabaseConnector{

    private MongoDBDatabase mongoDBDatabase;

    public MongoDBAdapter(MongoDBDatabase mongoDBDatabase) {
        this.mongoDBDatabase = mongoDBDatabase;
    }

    @Override
    public void connect() {
        mongoDBDatabase.establishConnection();
    }

    @Override
    public void disconnect() {
        mongoDBDatabase.closeConnection();
    }

    @Override
    public void executeQuery(String query) {
        mongoDBDatabase.runQuery(query);
    }
}
