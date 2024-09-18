package com.Quizprep;

public class Manager extends Employee {

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus(){
        return getSalary()*.15;
    }

    public void manageProject(){
        System.out.println("Manager is managing the project");
    }

    
    
}
