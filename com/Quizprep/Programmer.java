package com.Quizprep;

public class Programmer extends Employee {

    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus(){
        return getSalary() * .08;
    }
    
    public void manageProject(){
        System.out.println("Programmer is writing and debugging code");
    }

    
}
