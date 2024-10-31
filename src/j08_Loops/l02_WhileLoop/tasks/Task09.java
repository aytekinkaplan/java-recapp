package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task: Prompt the user for the number of integers they want to sum
        // Accept that many integers from the user and display their sum

        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to add
        System.out.println("How many numbers do you want to add?");
        int count = scanner.nextInt();

        // Initialize the sum variable to accumulate the sum of the numbers
        int sum = 0;
        int i = 0;

        // Use a while loop to gather and sum the specified number of inputs
        while (i < count) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            sum += num;  // Add the input number to the sum
            i++;         // Increment the counter to progress the loop
        }

        // Display the final sum after the loop ends
        System.out.println("Sum of " + count + " numbers: " + sum);

        // Close the scanner to free up resources
        scanner.close();
    }
}
