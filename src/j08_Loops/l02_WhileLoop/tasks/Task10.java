package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Task: Create code to print all odd numbers up to a specified number

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the counter variable to start from 1
        int i = 1;

        // Use a while loop to print all odd numbers up to 'number'
        while (i <= number) {
            // Check if 'i' is odd
            if (i % 2 == 1) {
                System.out.println(i);  // Print the odd number
            }
            i++;  // Increment the counter
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
