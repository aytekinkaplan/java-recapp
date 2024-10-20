package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /* Create a boolean.
           Ask the user, "Do you have a bank account?"
           If the user responds with "yes", set the boolean to true.
           If the user responds with "no", set the boolean to false.
           Print the boolean. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Initialize variables for input validation and storing the user's response
        boolean isValidInput = false;  // This will be used to check if the input is valid
        boolean isThereBankAccount = false;  // This will store the final value based on the user's response

        // Step 3: Ask the user if they have a bank account and validate the input
        while (!isValidInput) {
            try {
                // Step 4: Prompt the user with the question
                System.out.println("Do you have a bank account? (yes/no): ");
                String userResponse = scanner.nextLine().trim().toLowerCase();  // Normalize the input

                // Step 5: Validate the input and set the boolean value
                if (userResponse.equals("yes")) {
                    isThereBankAccount = true;  // Set to true if the user has a bank account
                    isValidInput = true;  // Exit the loop since the input is valid
                } else if (userResponse.equals("no")) {
                    isThereBankAccount = false;  // Set to false if the user does not have a bank account
                    isValidInput = true;  // Exit the loop since the input is valid
                } else {
                    // If the input is invalid, throw an exception
                    throw new IllegalArgumentException("Invalid input. Please enter 'yes' or 'no'.");
                }

            } catch (IllegalArgumentException e) {
                // Step 6: Handle invalid input by showing an error message
                System.out.println(e.getMessage());
            }
        }

        // Step 7: Print the result based on the boolean value
        System.out.println("User's bank account status: " + (isThereBankAccount ? "Has a bank account" : "No bank account"));

        // Step 8: Close the scanner to prevent memory leaks
        scanner.close();
    }
}
