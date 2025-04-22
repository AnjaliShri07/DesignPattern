package com.designPattern.structural.Adapter.DatabaseAdapter;

// Adapter for MySQL
public class MySQLAdapter implements DatabaseConnector{
    private MySQLDatabase mySQLDatabase;

    public MySQLAdapter(MySQLDatabase mySQLDatabase) {
        this.mySQLDatabase = mySQLDatabase;
    }

    @Override
    public void connect() {
        mySQLDatabase.establishConnection();
    }

    @Override
    public void disconnect() {
        mySQLDatabase.closeConnection();
    }

    @Override
    public void executeQuery(String query) {
        mySQLDatabase.runQuery(query);
    }
}
