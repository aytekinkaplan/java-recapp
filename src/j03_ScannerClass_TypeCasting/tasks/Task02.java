package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Get the user's height in cm and weight in kilograms
         * Calculate the Body Mass Index (BMI).
         * Print the result as both an integer and a decimal number.
         *
         * BMI formula = weight / (height * height)
         * Note: Weight should be in kilograms and height should be in meters.
         *
         * Example:
         * Input : height :180 cm, weight : 80 kg
         * Output: Your BMI is: 24
         *         Your BMI is: 24.691…
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input their height in cm
        System.out.println("Enter your height in cm: ");
        double height = scanner.nextDouble();

        // Step 3: Ask the user to input their weight in kg
        System.out.println("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        // Step 4: Convert height from cm to meters (since BMI uses meters)
        height = height / 100;

        // Step 5: Calculate the BMI (Body Mass Index)
        double bmi = weight / (height * height);

        // Step 6: Print the BMI as an integer
        System.out.println("Your BMI (as an integer) is: " + (int) bmi);

        // Step 7: Print the BMI as a decimal number
        System.out.println("Your BMI (as a decimal) is: " + bmi);

        // Step 8: Close the scanner to prevent memory leaks
        scanner.close();
    }
}
