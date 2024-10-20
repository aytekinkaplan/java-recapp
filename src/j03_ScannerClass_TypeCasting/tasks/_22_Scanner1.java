package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

        /* Create a String.
           Enter your name in the console.
           Print your name. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to enter their name
        System.out.println("Enter your name: ");

        // Step 3: Capture the user's input as a String
        String name = scanner.nextLine();

        // Step 4: Print the name the user entered
        System.out.println("Your name is: " + name);

        // Additional Example 1: Get user's age and print it
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();  // Read integer input for the age
        System.out.println("Your age is: " + age);

        // Additional Example 2: Get user's height and print it
        System.out.println("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();  // Read double input for height
        System.out.println("Your height is: " + height + " meters");

        // Additional Example 3: Concatenating input data
        System.out.println("Enter your city: ");
        scanner.nextLine();  // Clear the buffer after reading a number
        String city = scanner.nextLine();
        System.out.println("You are " + name + ", age " + age + ", from " + city + ", and your height is " + height + " meters.");

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
