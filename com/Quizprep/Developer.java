package com.Quizprep;

public class Developer  extends Employee{

    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus(){
        return getSalary() * 0.12;
    }
    
    public void manageProject(){
        System.out.println("Developer is focusing on developing the software");
    }
}
