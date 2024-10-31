package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
        Task: Create code that counts and sums all numbers entered until 0 is entered
        */

        Scanner scanner = new Scanner(System.in);

        // Initialize variables to store the sum and count of numbers
        int sum = 0;
        int count = 0;

        // Loop continuously until the user enters 0
        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            // Break the loop if the entered number is 0
            if (number == 0) {
                break;
            }

            // Add the number to the sum and increment the count
            sum += number;
            count++;
        }

        // Display the sum and count of entered numbers
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);

        // Close the scanner to free up resources
        scanner.close();
    }
}
