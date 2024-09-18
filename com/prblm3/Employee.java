package com.prblm3;

public abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;
    protected String performance;
   
    public Employee(String name, String address, double salary, String jobTitle, String performance) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.performance = performance;
    }

    public abstract double calculateBonus();

    public abstract void generatePerformanceReport();

    public abstract void manageProject();


}
