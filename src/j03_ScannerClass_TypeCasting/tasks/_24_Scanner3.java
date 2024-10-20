package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

        /* Create a String.
           Enter your favorite fruit into the console.
           Print that fruit. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input their favorite fruit
        System.out.println("Enter your favorite fruit: ");

        // Step 3: Capture the input as a String
        String fruit = scanner.nextLine();

        // Step 4: Print the entered fruit
        System.out.println("The fruit you like is: " + fruit);

        // Additional Example 1: Ask the user for their favorite color
        System.out.println("Enter your favorite color: ");
        String color = scanner.nextLine();
        System.out.println("Your favorite color is: " + color);

        // Additional Example 2: Combining inputs into a sentence
        System.out.println("Enter your favorite drink: ");
        String drink = scanner.nextLine();
        System.out.println("You like " + fruit + " with " + drink + " and your favorite color is " + color + ".");

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
