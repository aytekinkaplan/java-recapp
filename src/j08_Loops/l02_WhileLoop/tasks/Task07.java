package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task: Create code to find and print the largest of five entered numbers

        Scanner scanner = new Scanner(System.in);

        // Counter variable 'i' and variable 'max' to store the largest number
        int i = 0;
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        // Loop to get five numbers from the user
        while (i < 5) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the entered number is larger than the current max
            if (number > max) {
                max = number;
            }

            // Increment the counter
            i++;
        }

        // Print the largest number found
        System.out.println("Max number: " + max);

        // Close the scanner
        scanner.close();
    }
}
