package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

        /* Create a byte.
           Enter a weight in kilograms into the console.
           Print the byte. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input their weight in kilograms
        System.out.println("Enter your weight in kg: ");

        // Step 3: Capture the input as a byte
        byte weight = scanner.nextByte();

        // Step 4: Print the entered weight
        System.out.println("Your weight is: " + weight);

        // Additional Example 1: Ask the user for their age and print it
        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println("Your age is: " + age);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
