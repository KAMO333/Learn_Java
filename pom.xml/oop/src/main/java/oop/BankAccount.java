package oop;

//Encapsulation

public class BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        if(amount > 50) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
