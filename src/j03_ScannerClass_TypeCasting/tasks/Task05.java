package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        // Task: Get 2 integers from the user and print the result of the four basic arithmetic operations.

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input two integers
        System.out.println("Please enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int number2 = scanner.nextInt();

        // Step 3: Perform basic arithmetic operations
        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;

        // Handle division and avoid division by zero
        double quotient;
        if (number2 == 0) {
            System.out.println("Division by zero is not possible.");
            quotient = 0;  // You can decide whether to handle this case differently, like returning an error message or default value
        } else {
            quotient = (double) number1 / number2;  // Cast to double to handle decimal results
        }

        // Step 4: Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);

        // Step 5: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
