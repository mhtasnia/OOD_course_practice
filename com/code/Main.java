package com.code;

public class Main {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount("AB2345", 230);
        BankAccount b = new BankAccount("PQ2345", 230);
        b.deposit(300);
        b.withdraw(400);

        s.deposit(400);
        s.withdraw(600);


    }
}
