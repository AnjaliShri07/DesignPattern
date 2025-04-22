package com.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Manager as composite node (can contain other employees)
public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
        for (Employee e : subordinates) {
            System.out.print("   -> ");
            e.showDetails();
        }
    }
}
