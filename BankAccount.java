package CodsoftInternship;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Your new balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful! Your new balance is: " + balance);
        } else {
            System.out.println("Oops! You don't have enough balance for this withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}



