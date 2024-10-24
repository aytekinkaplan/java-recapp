package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _23_ComparisonOperators_small {

    public static void main(String[] args) {

        /*
        This task demonstrates how to compare two double values using the '<' (less than) operator.
        
        Goal:
        - Create two double values (both with value 14.23 as an example).
        - Verify if the first double is smaller than the second double using the '<' operator.
        - If the first number is smaller, print `true`. Otherwise, print `false`.
        */

        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first double value
        System.out.println("Enter first double number (example: 14.23): ");
        double num1 = scan.nextDouble();  // Reading the first double

        // Prompt the user for the second double value
        System.out.println("Enter second double number (example: 14.23): ");
        double num2 = scan.nextDouble();  // Reading the second double

        // Check if the first number is smaller than the second number
        boolean result = num1 < num2;

        // Print the result: true if num1 is smaller than num2, false otherwise
        System.out.println("Is the first number smaller than the second number? " + result);

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}
