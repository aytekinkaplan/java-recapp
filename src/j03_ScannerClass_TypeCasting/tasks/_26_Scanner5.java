package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

        /* Create a String.
           Enter the city you lived in 10 years ago into the console.
           Print this String. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input the city they lived in 10 years ago
        System.out.println("Enter the city you lived in 10 years ago: ");

        // Step 3: Capture the input as a String
        String city = scanner.nextLine();

        // Step 4: Print the entered city
        System.out.println("The city you lived in 10 years ago: " + city);

        // Additional Example 1: Ask the user where they live now
        System.out.println("Enter the city you live in now: ");
        String currentCity = scanner.nextLine();
        System.out.println("You live in: " + currentCity);

        // Additional Example 2: Ask the user for their favorite city
        System.out.println("Enter your favorite city: ");
        String favoriteCity = scanner.nextLine();
        System.out.println("Your favorite city is: " + favoriteCity);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
