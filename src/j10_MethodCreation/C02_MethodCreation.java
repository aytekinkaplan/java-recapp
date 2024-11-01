package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // Task: Create a method to calculate the average of three grades entered by the user.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first grade:");
        double grade1 = input.nextDouble();

        System.out.println("Enter the second grade:");
        double grade2 = input.nextDouble();

        System.out.println("Enter the third grade:");
        double grade3 = input.nextDouble();

        // Call the method to calculate and print the average of the three grades
        System.out.println("The average grade is: " + calculateAverage(grade1, grade2, grade3));

        input.close(); // Close the scanner to free up resources
    }

    // Method to calculate the average of three double values
    private static double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }
}
