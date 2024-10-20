package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
         * TASK ->
         * For the Clarusway gym, ask the user for their name, surname, age, weight, height,
         * and the number of months they plan to attend the gym.
         * Calculate their Body Mass Index (BMI) and print whether they need the gym or not.
         * Also, calculate the total cost based on $20 per month and print the total.
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user for personal information
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();  // Age input added for better personal information gathering

        System.out.println("Please enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Step 3: Convert height from cm to meters for BMI calculation
        double heightInMeters = heightInCm / 100;

        // Step 4: Calculate the BMI (Body Mass Index)
        double BMI = weight / (heightInMeters * heightInMeters);

        // Step 5: Print the BMI result and advice based on BMI category
        System.out.printf("Your BMI is: %.2f%n", BMI);  // Display BMI with two decimal precision

        if (BMI < 18.5) {
            System.out.println("You are underweight and may not need the gym.");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("You have a normal weight and may not need the gym.");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("You are overweight and might benefit from the gym.");
        } else if (BMI >= 30) {
            System.out.println("You are obese and may need the gym for health improvement.");
        }

        // Step 6: Ask how many months the user wants to attend the gym
        System.out.println("How many months do you plan to attend the gym?");
        int months = scanner.nextInt();

        // Step 7: Calculate the total cost at $20 per month
        double monthlyCost = 20.0;
        double totalCost = monthlyCost * months;

        // Step 8: Print the total cost
        System.out.println("The total amount you need to pay for " + months + " months is: $" + totalCost);

        // Step 9: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
