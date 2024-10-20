package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

        /* Create an integer.
           Enter any number from the console.
           Print the number. */

        // Step 1: Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Step 2: Ask the user to input an integer
        System.out.println("Please enter any integer: ");

        // Step 3: Capture the input as an integer
        int number = scan.nextInt();

        // Step 4: Print the entered number
        System.out.println("You entered: " + number);

        // Additional Example 1: Reading a floating-point number (double)
        System.out.println("Enter a floating-point number: ");
        double doubleNumber = scan.nextDouble();
        System.out.println("You entered the floating-point number: " + doubleNumber);

        // Additional Example 2: Adding two integers
        System.out.println("Enter another integer: ");
        int secondNumber = scan.nextInt();
        int sum = number + secondNumber;
        System.out.println("The sum of the two integers is: " + sum);

        // Close the scanner to prevent memory leaks
        scan.close();
    }
}
