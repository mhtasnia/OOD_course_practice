package com.prblm3;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("John", "123 south street,London", 2000, "Manager", "Average");
        Developer e = new Developer("Jane", "456 north street,London", 1500, "Fullstack developer", "Excellent");
        Programmer p = new Programmer("Alice key", "891 east park, London", 800, "python programmer", "below average");

        m.generatePerformanceReport();
        System.out.println("Salary: " + m.calculateBonus());
        m.manageProject();
        
        e.generatePerformanceReport();
        System.out.println("Salary: " + e.calculateBonus());
        e.manageProject();

        p.generatePerformanceReport();
        System.out.println("Salary: " + p.calculateBonus());
        p.manageProject();
    }
}
