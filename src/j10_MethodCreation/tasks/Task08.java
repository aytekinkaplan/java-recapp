package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task08 {

    // Method to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;  // Divisible by 400 -> leap year
            } else {
                return true;  // Divisible by 4 but not 100 -> leap year
            }
        } else {
            return false;  // Not divisible by 4 -> not a leap year
        }
    }

    public static void main(String[] args) {
        /*
        Task: Create a method to check if a year entered by the user is a leap year.

        Test Data:
        Input: 2017
        Expected Output: false
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Call the method and display the result
        boolean result = isLeapYear(year);
        System.out.println("Is " + year + " a leap year? " + result);

        scanner.close();
    }
}
