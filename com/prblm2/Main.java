package com.prblm2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("John", "Doe", "emp123", "Sr. Manager");
        System.out.println("Firstname : " + e.getFirstName());
        System.out.println("Lastname : " + e.getLastName());
        System.out.println("Employee ID : " + e.getEmployeeID());
    }
}
