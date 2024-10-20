package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Task:
         * Write a program to calculate the hypotenuse of a right triangle
         * by taking the lengths of the two perpendicular sides as input.
         *
         * Example Output:
         * Input:
         * First side: 12
         * Second side: 5
         * Output:
         * Hypotenuse: 13
         */

        // Step 1: Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input the lengths of the two perpendicular sides
        System.out.println("Please enter the length of the first side: ");
        int firstSide = scanner.nextInt();

        System.out.println("Please enter the length of the second side: ");
        int secondSide = scanner.nextInt();

        // Step 3: Calculate the hypotenuse using the Pythagorean theorem: a² + b² = c²
        double hypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));

        // Step 4: Print the hypotenuse, formatted to two decimal places
        System.out.printf("The hypotenuse is: %.2f%n", hypotenuse);

        // Step 5: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
