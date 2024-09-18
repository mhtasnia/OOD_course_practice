package com.prblm3;

public class Programmer extends Employee{

    public Programmer(String name, String address, double salary, String jobTitle, String performance) {
        super(name, address, salary, jobTitle, performance);
    }

    @Override
    public double calculateBonus() {
        return salary * 1.2;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("name: " + name +"\nJob Title: Programmer\nPerformance status: " + performance);
    }

    @Override
    public void manageProject() {
        System.out.println(name + "is writing code for the project");
    }

    
    
}
