package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Ask the user how many hours they sleep per day,
         * then calculate and print how many days they spend sleeping in a month, year, and 40 years.
         *
         * Example:
         * Input : 8 (hours of sleep per day)
         * Output: "You spend 10 days a month, 121 days a year, and 4866 days in 40 years sleeping."
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user how many hours they sleep per day
        System.out.println("How many hours do you sleep on average per day?");

        // Step 3: Capture the number of hours of sleep per day
        int hoursPerDay = scanner.nextInt();

        // Step 4: Calculate how many days are spent sleeping in a month, year, and 40 years
        double daysPerMonth = (hoursPerDay * 30.0) / 24;  // 30 days in a month, 24 hours in a day
        double daysPerYear = (hoursPerDay * 365.0) / 24;  // 365 days in a year
        double daysIn40Years = daysPerYear * 40;  // Multiply by 40 years

        // Step 5: Print the result
        System.out.println("You spend " + String.format("%.2f", daysPerMonth) + " days a month sleeping.");
        System.out.println("You spend " + String.format("%.2f", daysPerYear) + " days a year sleeping.");
        System.out.println("You spend " + String.format("%.2f", daysIn40Years) + " days in 40 years sleeping.");

        // Step 6: Close the scanner
        scanner.close();
    }
}
