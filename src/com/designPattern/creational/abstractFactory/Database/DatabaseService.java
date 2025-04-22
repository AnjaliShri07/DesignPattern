package com.designPattern.creational.abstractFactory.Database;

public class DatabaseService {
    public static void main(String[] args) {
        DatabaseFactory factory;

        // Runtime decision for database type
        String dbType = "MySQL"; // This could be dynamically determined
        if (dbType.equalsIgnoreCase("MySQL")) {
            factory = new MySQLFactory();
        } else {
            factory = new PostgreSQLFactory();
        }

        // Create database components
        Connection connection = factory.createConnection();
        Query query = factory.createQuery();

        // Use components
        connection.connect();
        query.execute();
    }
}
