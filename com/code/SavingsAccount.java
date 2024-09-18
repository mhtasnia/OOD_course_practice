package com.code;

public class SavingsAccount extends BankAccount{
    private double balance;
    public SavingsAccount(String bankAccountNo, double balance) {
        super(bankAccountNo, balance);
    }

    public void withdraw(double amount){
        if (amount > 0 && amount-balance < 100) {
            balance -= amount;
            System.out.println(amount + "Withdraw successful!!");
        }else{
            System.out.println("Savings fall below 100");
        }
    }
    
    
}
