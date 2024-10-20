package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _29_Scanner9 {

    public static void main(String[] args) {

        /* Create a float.
           Enter your height into the console.
           Print the float. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input their height
        System.out.println("Enter your height: ");

        // Step 3: Capture the input as a float
        float height = scanner.nextFloat();

        // Step 4: Print the entered height
        System.out.println("Your height is: " + height);

        // Additional Example 1: Ask for the user's weight and print it
        System.out.println("Enter your weight: ");
        float weight = scanner.nextFloat();
        System.out.println("Your weight is: " + weight);

        // Additional Example 2: Calculate and print BMI (Body Mass Index)
        float bmi = weight / (height * height);
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
