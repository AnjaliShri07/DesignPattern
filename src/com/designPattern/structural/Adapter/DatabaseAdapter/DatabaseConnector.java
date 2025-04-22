package com.designPattern.structural.Adapter.DatabaseAdapter;

// Target interface
public interface DatabaseConnector {
    void connect();
    void disconnect();
    void executeQuery(String query);
}

/*
Structure:
Client: The application that uses the DatabaseConnector interface to interact with the database.
Target Interface (DatabaseConnector): A unified interface for connecting to different databases.
Adaptee: Specific implementations for MySQL and MongoDB connections.
Adapter: Adapters that adapt the specific database implementations to the target interface.*/
