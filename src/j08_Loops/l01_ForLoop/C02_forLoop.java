package j08_Loops.l01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {

        /*
         * Task:
         * - Prompt the user to enter a positive integer.
         * - Print all multiples of 4 from the entered number up to 100.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input number is positive
        if (number < 0) {
            System.out.println("You must enter a positive number.");
        } else {
            // Loop from the entered number to 100
            for (int i = number; i <= 100; i++) {
                if (i % 4 == 0) { // Check if i is a multiple of 4
                    System.out.print(i + " ");
                }
            }
        }

        input.close();

        /*
         * Explanation:
         * - The initial `if` statement checks if the entered number is positive.
         * - The `for` loop iterates from the entered number up to 100.
         * - Inside the loop, we check if `i % 4 == 0`, which confirms if `i` is a multiple of 4.
         * - Only numbers that meet this condition are printed.
         */
    }
}
