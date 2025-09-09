package com.javavote;
import java.util.*;

public class AtmExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 50000;
        int pin = 1234;
        int enteredPin;

        // Transaction History
        List<String> transactions = new ArrayList<>();

        // Daily withdrawal limit
        double dailyLimit = 25000;
        double withdrawnToday = 0;

        // PIN Verification
        System.out.print("Enter your PIN: ");
        enteredPin = scanner.nextInt();
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN");
            return;
        }

        int choice;
        do {
            System.out.println("\n===================================");
            System.out.println("============ ATM - MENU ===========");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Transfer Money");
            System.out.println("7. Interest Calculator");
            System.out.println("8. Exit");
            System.out.println("===================================");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Balance
                    System.out.println("Your Balance: " + balance);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount % 100 != 0) {
                        System.out.println("Please withdraw multiples of 100");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient Funds");
                    } else if (withdrawnToday + withdrawAmount > dailyLimit) {
                        System.out.println("Daily withdrawal limit exceeded (₹25,000)");
                    } else {
                        balance -= withdrawAmount;
                        withdrawnToday += withdrawAmount;
                        transactions.add("Withdraw: -" + withdrawAmount);
                        System.out.println("Withdraw Successful");
                        System.out.println("Remaining Balance: " + balance);
                    }
                    break;

                case 3: // Deposit
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    transactions.add("Deposit: +" + depositAmount);
                    System.out.println("Deposit Successful");
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 4: // Change PIN
                    System.out.print("Enter Old PIN: ");
                    int oldPin = scanner.nextInt();
                    if (oldPin == pin) {
                        System.out.print("Enter New PIN: ");
                        pin = scanner.nextInt();
                        System.out.println("PIN Changed Successfully");
                    } else {
                        System.out.println("Incorrect Old PIN");
                    }
                    break;

                case 5: // Mini Statement
                    System.out.println("===== Mini Statement =====");
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        int start = Math.max(0, transactions.size() - 5);
                        for (int i = start; i < transactions.size(); i++) {
                            System.out.println(transactions.get(i));
                        }
                    }
                    break;

                case 6: // Transfer Money
                    System.out.print("Enter Receiver Account Number: ");
                    String accNo = scanner.next();
                    System.out.print("Enter Transfer Amount: ");
                    double transferAmount = scanner.nextDouble();

                    if (transferAmount > balance) {
                        System.out.println("Insufficient Funds");
                    } else {
                        balance -= transferAmount;
                        transactions.add("Transfer to " + accNo + ": -" + transferAmount);
                        System.out.println("Transfer Successful to A/C: " + accNo);
                        System.out.println("Remaining Balance: " + balance);
                    }
                    break;

                case 7: // Interest Calculator
                    double interestRate = 3.5; // 3.5% per year
                    double interest = (balance * interestRate) / 100;
                    System.out.println("Annual Interest (at 3.5%): " + interest);
                    break;

                case 8: // Exit
                    System.out.print("Logging out");
                    for (int i = 0; i < 3; i++) {
                        try { Thread.sleep(500); } catch (InterruptedException e) {}
                        System.out.print(".");
                    }
                    System.out.println("\nThank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 8);

        scanner.close();
    }
}
