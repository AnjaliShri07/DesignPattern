package com.designPattern.creational.abstractFactory.Database;

// Concrete Factory for MySQL
public class MySQLFactory implements DatabaseFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
