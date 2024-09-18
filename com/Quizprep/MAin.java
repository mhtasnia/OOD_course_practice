package com.Quizprep;

public interface MAin {
    public static void main(String[] args) {
        Employee manager = new Manager("John Doe", "123 south street", 200000, "QA Mnager");
        Employee developer = new Developer("janice", "237 north road", 120000, "Fullstack Developer");
        Employee  programmer= new Programmer("Alice", "145 Pallmall", 80000, "python programmer");

        manager.generatePerformanceReport();
        manager.manageProject();
        System.out.println("Bonus: " + manager.calculateBonus());

        System.out.println("");

        developer.generatePerformanceReport();
        developer.manageProject();
        System.out.println("Bonus: " +developer.calculateBonus());

        System.out.println("");

        programmer.generatePerformanceReport();
        programmer.manageProject();
        System.out.println("Bonus: " +programmer.calculateBonus());
    }
}
