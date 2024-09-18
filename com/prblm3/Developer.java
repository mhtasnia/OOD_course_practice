package com.prblm3;

public class Developer extends Employee{
    public Developer(String name, String address, double salary, String jobTitle, String performance) {
        super(name, address, salary, jobTitle, performance);
    }

    @Override
    public double calculateBonus() {
       return salary * 1.30;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("name: " + name +"\nJob Title: Developing\nPerformance status: " + performance);
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is overseeing the developement of the project");
    }
}
