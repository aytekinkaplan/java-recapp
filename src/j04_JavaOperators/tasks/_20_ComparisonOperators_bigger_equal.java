package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*
        This task will compare two float values using the '>=' operator to check if the first float is 
        greater than or equal to the second float.
        
        Goal:
        - Create two floats: the first float should be 14, and the second float should be 17.
        - Verify if the first float is greater than or equal to the second float.
        - Print the result (true or false).
        */

        // Create a Scanner object to take input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user to enter the first float
        System.out.println("Enter first float number: ");
        float firstNumber = inputScanner.nextFloat();  // Reading the first float

        // Prompt the user to enter the second float
        System.out.println("Enter second float number: ");
        float secondNumber = inputScanner.nextFloat();  // Reading the second float

        // Comparison: Check if firstNumber is greater than or equal to secondNumber
        boolean result = firstNumber >= secondNumber;  // Store the comparison result in a boolean variable

        // Print the result (true if firstNumber >= secondNumber, otherwise false)
        System.out.println(result);

        // Close the scanner to prevent resource leak
        inputScanner.close();
    }
}
