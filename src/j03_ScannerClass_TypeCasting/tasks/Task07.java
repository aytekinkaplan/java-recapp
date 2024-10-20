package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        /*
         * Problem Description:
         * Write a program to calculate the time required to cover a distance at a given speed.
         *
         * Example:
         * The distance between Istanbul and Ankara is 400 km.
         * If a vehicle is traveling at an average speed of 120 km/h, how long will it take to reach the destination?
         *
         * Example Output:
         * Enter the distance: 400
         * Enter the speed: 100
         * The time is 4 hours.
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user for the distance
        System.out.println("Please enter the distance (in km): ");
        int distance = scanner.nextInt();

        // Step 3: Ask the user for the speed
        System.out.println("Please enter the speed (in km/h): ");
        int speed = scanner.nextInt();

        // Step 4: Check if the speed is zero to avoid division by zero
        if (speed == 0) {
            System.out.println("Speed cannot be zero. Please enter a valid speed.");
        } else {
            // Step 5: Calculate the time taken (distance / speed)
            double time = (double) distance / speed;

            // Step 6: Print the time taken, formatted to two decimal places
            System.out.printf("The time taken is: %.2f hours.%n", time);
        }

        // Step 7: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
