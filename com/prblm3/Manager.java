package com.prblm3;

public class Manager extends Employee{

    public Manager(String name, String address, double salary, String jobTitle, String performance) {
        super(name, address, salary, jobTitle, performance);
    }

    @Override
    public double calculateBonus() {
       return salary * 1.35;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("name: " + name +"\nJob Title: Manager\nPerformance status: " + performance);
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is managing the developer and programmers under the project");
    }
    
}
