package com.designPattern.creational.VehicleFactory;


/*The Factory Pattern is a creational design pattern that provides an interface for creating objects but allows
subclasses or implementing classes to decide which class to instantiate. It encapsulates the object creation logic
within a separate factory class, providing a common interface for creating objects without exposing the instantiation
logic to the client.*/
public class VehicleFactory {
    public Vehicle createVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        }else if(type.equalsIgnoreCase("motorcycle")){
            return new Motorcycle();
        }

        //Handle unknown vehicle types or return a default vehicle
        return new Car();
    }

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.createVehicle("car");
        car.drive();
        Vehicle motorcycle = factory.createVehicle("motorcycle");
        motorcycle.drive();
    }
}
