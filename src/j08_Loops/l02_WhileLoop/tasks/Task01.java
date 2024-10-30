package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         * Task: Create a program that continuously takes integer inputs from the user,
         * and calculates their cumulative sum. The program should stop once the total sum
         * exceeds 333 and then display both the count of numbers entered and the final sum.
         */

        // Initialize a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the cumulative sum of user-entered numbers
        int sum = 0;

        // Counter variable to keep track of the number of inputs entered by the user
        int count = 0;

        // Begin a loop that will continue until the cumulative sum exceeds 333
        while (sum <= 333) {
            System.out.print("Enter a number: "); // Prompt user to input a number
            int number = scanner.nextInt(); // Capture the user’s input as an integer

            sum += number; // Add the entered number to the cumulative sum
            count++; // Increment the counter to keep track of the number of inputs
        }

        // Display the number of entries made and the final cumulative sum after exiting the loop
        System.out.println("Total count of numbers entered: " + count);
        System.out.println("Final sum of entered numbers: " + sum);

        // Close the Scanner object to release resources
        scanner.close();
    }
}
