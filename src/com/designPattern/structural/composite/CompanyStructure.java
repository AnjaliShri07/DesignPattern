package com.designPattern.structural.composite;

public class CompanyStructure {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice", "Senior Developer");
        Employee dev2 = new Developer("Bob", "Junior Developer");
        Employee designer = new Designer("Charlie", "UI/UX Designer");

        Manager engManager = new Manager("Diana", "Engineering Manager");
        engManager.add(dev1);
        engManager.add(dev2);

        Manager creativeHead = new Manager("Ethan", "Creative Head");
        creativeHead.add(designer);

        Manager ceo = new Manager("Fiona", "CEO");
        ceo.add(engManager);
        ceo.add(creativeHead);

        // Show full org hierarchy
        ceo.showDetails();
    }
}
