package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase_ATM_Project {

    // Simulated database password, representing the user's saved password in the bank
    static String password = "12345"; // The password stored in the bank database

    public static void main(String[] args) {
        /*
            This program simulates an ATM application with the following features:
            - Initial balance is set to 1000 TL.
            - Features include balance inquiry, depositing money, withdrawing money, and exit.
            - Password verification is required to proceed with the ATM operations.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("*********** Welcome to Java Bank ATM ***********");

        // Prompt user for password
        System.out.print("Please enter your password: ");
        String enteredPassword = input.nextLine();

        // Check if the entered password matches the stored password
        if (enteredPassword.equals(password)) {
            System.out.println("Password verified. You can proceed.");

            // Display menu options
            System.out.println("Select an option:\n"
                    + "1 - Balance Inquiry\n"
                    + "2 - Deposit Money\n"
                    + "3 - Withdraw Money\n"
                    + "4 - Exit");

            int choice = input.nextInt();

            // Initial balance
            int balance = 1000;

            switch (choice) {
                case 1: // Balance Inquiry
                    System.out.println("Your current balance is: " + balance + " TL");
                    break;

                case 2: // Deposit Money
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = input.nextInt();
                    balance += depositAmount;
                    System.out.println("You have deposited " + depositAmount + " TL.");
                    System.out.println("Updated balance: " + balance + " TL");
                    break;

                case 3: // Withdraw Money
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawalAmount = input.nextInt();
                    if (withdrawalAmount <= balance) { // Sufficient balance
                        balance -= withdrawalAmount;
                        System.out.println("You have withdrawn " + withdrawalAmount + " TL.");
                        System.out.println("Remaining balance: " + balance + " TL");
                    } else {
                        System.out.println("Insufficient balance. Current balance: " + balance + " TL");
                    }
                    break;

                case 4: // Exit
                    System.out.println("You are exiting. We hope to see you again!");
                    break;

                default: // Invalid Option
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

        } else {
            System.out.println("Incorrect password. You have 2 attempts remaining.");
        }

        input.close();
    }
}
