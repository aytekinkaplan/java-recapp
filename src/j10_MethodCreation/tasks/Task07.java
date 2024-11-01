package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    // Method to find the minimum of three numbers
    public static void findingMinimum(int num1, int num2, int num3) {
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("The smallest number is: " + min);
    }

    public static void main(String[] args) {
        /*
        Task: Create a method that finds the smallest of three numbers.

        Test data:
        Input: 12, 24, 34
        Expected output: 12
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Call the method to find and display the minimum
        findingMinimum(num1, num2, num3);

        scanner.close();
    }
}
