package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _21_ComparisonOperators_not_equal {

    public static void main(String[] args) {

        /*
        This task demonstrates the use of the '!=' (not equal) operator to verify if two double values are not equal.
        
        Goal:
        - Create two double values (14.23 and 19.52).
        - Verify that the two double values are not equal using the '!=' operator.
        - If they are not equal, print `true` or a custom message.
        */

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first double value
        System.out.println("Enter the first double number (example: 14.23): ");
        double num1 = scanner.nextDouble(); // Expected input: 14.23

        // Prompt the user for the second double value
        System.out.println("Enter the second double number (example: 19.52): ");
        double num2 = scanner.nextDouble(); // Expected input: 19.52

        // Check if the two doubles are not equal using the '!=' operator
        boolean result = num1 != num2;

        // Print the result: true if they are not equal, false otherwise
        System.out.println("Are the two numbers not equal? " + result);

        // Alternatively, print custom messages based on comparison
        System.out.println(num1 == num2 ? "These numbers are equal" : "These numbers are not equal");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
