package CodsoftInternship;

import java.util.Scanner;

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome! What would you like to do today?");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = s.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");
                    double withdrawalAmount = s.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Have a great day!");
                    return;
                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }
}
