package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _24_ComparisonOperators_bigger {

    public static void main(String[] args) {

        /*
        This task demonstrates how to check if one integer is greater than another using the '>' (greater than) operator.
        
        Goal:
        - Create two integer values (example: 120 and 158).
        - Verify if the first integer is greater than the second integer using the '>' operator.
        - If the first integer is greater, print `true`. Otherwise, print `false`.
        */

        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first integer value
        System.out.println("Enter first number (example: 120): ");
        int num1 = scan.nextInt();  // Reading the first integer

        // Prompt the user for the second integer value
        System.out.println("Enter second number (example: 158): ");
        int num2 = scan.nextInt();  // Reading the second integer

        // Check if the first number is greater than the second number
        boolean result = num1 > num2;

        // Print the result: true if num1 is greater than num2, false otherwise
        System.out.println(num1 + " is greater than " + num2 + "? " + result);

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}
