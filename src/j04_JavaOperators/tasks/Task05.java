package j04_JavaOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Write a program that converts the entered time (hours, minutes, and seconds) into total seconds.
     * Example: 1 hour 10 minutes 50 seconds -> 4250 seconds
     * 1 hour = 3600 seconds
     * 1 minute = 60 seconds
     */

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the number of hours
        System.out.print("Enter hours: ");
        int hours = scan.nextInt();  // Store the number of hours

        // Prompt the user to enter the number of minutes
        System.out.print("Enter minutes: ");
        int minutes = scan.nextInt();  // Store the number of minutes

        // Prompt the user to enter the number of seconds
        System.out.println("Enter seconds: ");
        int seconds = scan.nextInt();  // Store the number of seconds

        // Convert the entered time to total seconds
        // 1 hour = 3600 seconds, 1 minute = 60 seconds
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Print the total number of seconds
        System.out.println("Total seconds: " + totalSeconds);

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}
