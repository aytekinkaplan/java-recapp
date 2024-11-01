package j10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // Task: Create a method that prints the sum of the digits of a given integer.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");

        int number = input.nextInt();

        // Call the method and print the result
        System.out.println("The sum of the digits is: " + sumOfDigits(number));

        input.close(); // Close the scanner to free up resources
    }

    // Method to calculate the sum of the digits of an integer
    public static int sumOfDigits(int x) {
        int digitSum = 0;

        // Loop through each digit of the number
        while (x > 0) { // Continue until there are no more digits left
            digitSum += x % 10; // Add the last digit to the sum
            x /= 10; // Remove the last digit by dividing by 10
        }
        return digitSum; // Return the total sum of digits
    }
}
