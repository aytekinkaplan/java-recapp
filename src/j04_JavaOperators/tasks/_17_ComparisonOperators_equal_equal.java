package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*
        This task demonstrates the use of the '==' operator, which checks for equality between two integers.
        
        Goal:
        - Ask the user to input two integers (num1 and num2).
        - Compare these two integers using the equality operator '=='.
        - Print 'true' if the numbers are equal, otherwise print 'false'.
        */

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the first integer
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();  // Reading the first number from the user

        // Prompting the user for the second integer
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();  // Reading the second number from the user

        // Using the '==' operator to check if the two integers are equal
        boolean isEqual = num1 == num2;

        // Printing the result: true if the numbers are equal, false otherwise
        System.out.println("Are the two numbers equal? " + isEqual);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
