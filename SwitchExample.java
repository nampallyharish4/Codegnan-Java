

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 50000;
        int pin = 1234;
        int enteredPin;

        // PIN Verification
        System.out.print("Enter your PIN: ");
        enteredPin = scanner.nextInt();
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN");
            return;
        }

        int choice;
        do {
            System.out.println("===================================");
            System.out.println("============ ATM - MENU ===========");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance:" + balance);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    
                    if (withdrawAmount%100!=0) {
                        System.out.println("Please withdraw multiples of 100");
                        
                    } else if (withdrawAmount>balance){
                    	System.out.println("Insufficient Funds");
                    }else
                    {
                        balance -= withdrawAmount;
                        System.out.println("Withdraw Successful");
                        System.out.println("Remaining Balance:" + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit Successful");
                    System.out.println("Updated Balance:" + balance);
                    break;

                case 4:
                    System.out.print("Enter New PIN: ");
                    System.out.print("Enter Confirm PIN: ");
                    pin = scanner.nextInt();
                    System.out.println("PIN Changed Successfully");
                    break;

                case 5:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);

        scanner.close();
    }
}
