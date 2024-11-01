package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task01 {

    // Method to check if two numbers are equal
    public static String isEqual(int num1, int num2) {
        return num1 == num2 ? "The numbers are equal" : "The numbers are not equal";
    }

    public static void main(String[] args) {
        // Task: Create a method that checks the equality of two numbers entered by the user.

        // Prompt the user for the first number
        System.out.print("Enter first number: ");
        int num1 = new Scanner(System.in).nextInt();

        // Prompt the user for the second number
        System.out.print("Enter second number: ");
        int num2 = new Scanner(System.in).nextInt();

        // Output the result of the equality check
        System.out.println(isEqual(num1, num2));
    }
}
