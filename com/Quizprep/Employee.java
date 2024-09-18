package com.Quizprep;

public class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateBonus(){
        return salary * 0.1;
    }

    public void generatePerformanceReport(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Job Title: " + jobTitle);
    }

    public void manageProject(){
        System.out.println("Nothing to manageS");
    }
    
}
