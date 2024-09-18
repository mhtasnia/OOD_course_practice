package com.prblm2;

public class Employee extends Person {
    private String employeeID;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeID, String jobTitle) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getLastName() {
        return lastName + "(" + jobTitle + ")";
    }

    
}
