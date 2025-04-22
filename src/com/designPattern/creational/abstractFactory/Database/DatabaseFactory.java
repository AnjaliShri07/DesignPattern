package com.designPattern.creational.abstractFactory.Database;


// Abstract Factory
public interface DatabaseFactory {
    Connection createConnection();
    Query createQuery();
}
