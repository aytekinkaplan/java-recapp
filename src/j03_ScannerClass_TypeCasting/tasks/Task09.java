package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        /*
         * Problem Description:
         * Read the values of a, b, and c from the user. Then, subtract the square of b from the square of a,
         * and divide the result by three times the value of c.
         *
         * Example Output:
         * Enter the value of a: 5
         * Enter the value of b: 3
         * Enter the value of c: 1
         * Result: 5.333333333333333
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input the values of a, b, and c
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.println("Enter the value of c: ");
        int c = scanner.nextInt();

        // Step 3: Calculate the result using the formula: (a^2 - b^2) / (3 * c)
        double result = (Math.pow(a, 2) - Math.pow(b, 2)) / (3 * c);

        // Step 4: Print the result
        System.out.println("Result: " + result);

        // Step 5: Close the scanner
        scanner.close();
    }
}
