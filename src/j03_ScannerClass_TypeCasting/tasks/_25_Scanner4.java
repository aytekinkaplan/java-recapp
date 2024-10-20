package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

        /* Create an integer.
           Enter the number of doors in your car into the console.
           Print this integer. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input the number of doors in their car
        System.out.println("Enter the number of doors in your car: ");

        // Step 3: Capture the input as an integer
        int doorNumber = scanner.nextInt();

        // Step 4: Print the entered number of doors
        System.out.println("The number of doors in your car is: " + doorNumber);

        // Additional Example 1: Ask the user for the number of seats in the car
        System.out.println("Enter the number of seats in your car: ");
        int seatNumber = scanner.nextInt();
        System.out.println("The number of seats in your car is: " + seatNumber);

        // Additional Example 2: Calculate and print the total number of doors and seats
        int total = doorNumber + seatNumber;
        System.out.println("The total number of doors and seats in your car is: " + total);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
