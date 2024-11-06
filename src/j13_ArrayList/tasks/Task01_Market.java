package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01_Market {
    /*
        TASK:
         * Write a program that shows a grocery store's earnings for 7 days.
         * Write a method to display the average weekly earnings.
         * Write a method to show which days earned above the average.
         * Write a method to show which days earned below the average.

         * Step 1: Create an ArrayList that contains the days of the week.
         * Step 2: Create an ArrayList to hold daily earnings (dailyEarnings).
         * Step 3: Use a for loop to get 7 days of sales input from the user and add it to dailyEarnings.
         * Step 4: Use getAverageEarnings() to calculate and return the average earnings.
         * Step 5: Create getDaysAboveAverageEarnings() to show days with above-average earnings.
         * Step 6: Create getDaysBelowAverageEarnings() to show days with below-average earnings.
     */
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<Integer> dailyEarnings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Step 3: Get user input for daily earnings
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter sales for " + days.get(i) + ": ");
            int sales = scanner.nextInt();
            dailyEarnings.add(sales);
        }

        // Calculate the average earnings
        double average = getAverageEarnings(dailyEarnings);

        // Display days with above-average and below-average earnings
        System.out.println("Days with above-average earnings: " + getDaysAboveAverageEarnings(dailyEarnings, average, days));
        System.out.println("Days with below-average earnings: " + getDaysBelowAverageEarnings(dailyEarnings, average, days));

        scanner.close();
    }

    // Step 4: Method to calculate average earnings
    public static double getAverageEarnings(ArrayList<Integer> dailyEarnings) {
        int total = 0;
        for (int sales : dailyEarnings) {
            total += sales;
        }
        double average = (double) total / dailyEarnings.size();
        System.out.println("Average earnings: " + average);
        return average;
    }

    // Step 5: Method to get days with above-average earnings
    public static ArrayList<String> getDaysAboveAverageEarnings(ArrayList<Integer> dailyEarnings, double average, ArrayList<String> days) {
        ArrayList<String> aboveAverageDays = new ArrayList<>();
        for (int i = 0; i < dailyEarnings.size(); i++) {
            if (dailyEarnings.get(i) > average) {
                aboveAverageDays.add(days.get(i));
            }
        }
        return aboveAverageDays;
    }

    // Step 6: Method to get days with below-average earnings
    public static ArrayList<String> getDaysBelowAverageEarnings(ArrayList<Integer> dailyEarnings, double average, ArrayList<String> days) {
        ArrayList<String> belowAverageDays = new ArrayList<>();
        for (int i = 0; i < dailyEarnings.size(); i++) {
            if (dailyEarnings.get(i) < average) {
                belowAverageDays.add(days.get(i));
            }
        }
        return belowAverageDays;
    }
}
