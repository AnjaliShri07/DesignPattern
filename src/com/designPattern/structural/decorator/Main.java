package com.designPattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " = $" + myCoffee.getCost());

        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee);
        myCoffee = new WhippedCreamDecorator(myCoffee);

        System.out.println(myCoffee.getDescription() + " = $" + myCoffee.getCost());
    }
}
