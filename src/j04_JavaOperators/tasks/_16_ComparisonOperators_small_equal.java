package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _16_ComparisonOperators_small_equal {

    public static void main(String[] args) {

        /*
        This task will demonstrate how to compare two integers using the '>=', 
        which checks if one value is greater than or equal to another.

        The goal: 
        - Get two integers from the user.
        - Check if the first integer is greater than or equal to the second integer.
        - Print 'true' if the condition is met, otherwise print 'false'.
        */

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter the first number
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();  // Taking input for the first integer

        // Prompting user to enter the second number
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();  // Taking input for the second integer

        // Comparison: Check if firstNumber is greater than or equal to secondNumber
        boolean result = firstNumber >= secondNumber;  // Store the comparison result in a boolean variable

        // Print the result (true if firstNumber >= secondNumber, otherwise false)
        System.out.println("Is the first number greater than or equal to the second number? " + result);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
