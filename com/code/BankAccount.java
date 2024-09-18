package com.code;
public class BankAccount {
    private String bankAccountNo;
    private double balance;
    public BankAccount(String bankAccountNo, double balance) {
        this.bankAccountNo = bankAccountNo;
        this.balance = balance;
    }
    public String getBankAccountNo() {
        return bankAccountNo;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "Deposited!!!");
        }else{
            System.out.println("Amount is less than 0");
        }    
    }
    public void withdraw(double amount){
        if (amount > 0 && amount<balance) {
            balance -= amount;
            System.out.println(amount + "Withdraw successful!!");
        }else{
            System.out.println("Withdrawal amount is greater than balance");
        }
    }

    
}
