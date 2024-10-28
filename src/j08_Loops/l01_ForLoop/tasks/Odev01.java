package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Odev01 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Print all even numbers between 0 and 100 (inclusive).
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 100 (0 and 100 included): ");
        int number = scanner.nextInt();

        // Validate if the entered number is within range
        if (number >= 0 && number <= 100) {
            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i); // Print even numbers
                }
            }
        } else {
            System.out.println("Please enter a number between 0 and 100.");
        }

        scanner.close();

        /*
         * Explanation:
         * - We check if the entered number is within the range [0, 100].
         * - The loop iterates from 0 to the entered number.
         * - If the number is even (`i % 2 == 0`), it is printed.
         * - The `scanner.close();` closes the scanner to release system resources.
         */
    }
}
