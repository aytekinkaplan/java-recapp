package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

    // formula: C = (F - 32) * 5/9

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to enter the temperature in Fahrenheit
        System.out.println("Please enter the temperature in Fahrenheit: ");
        double f = scanner.nextDouble();  // Use double to handle floating-point input

        // Step 3: Convert Fahrenheit to Celsius using the formula
        double c = (f - 32) * 5 / 9;

        // Step 4: Print the result
        System.out.printf("The temperature in Celsius is: %.2f%n", c);  // Formatted output with 2 decimal places

        // Step 5: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
