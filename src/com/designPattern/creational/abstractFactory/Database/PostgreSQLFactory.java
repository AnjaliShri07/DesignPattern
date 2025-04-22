package com.designPattern.creational.abstractFactory.Database;

// Concrete Factory for PostgreSQL
class PostgreSQLFactory implements DatabaseFactory {
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }
    public Query createQuery() {
        return new PostgreSQLQuery();
    }
}
