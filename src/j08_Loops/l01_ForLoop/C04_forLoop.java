package j08_Loops.l01_ForLoop;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {

        /*
         * Interview Question:
         * - For a positive integer less than 100 entered by the user, print all numbers from 1 up to that number.
         * - Apply the following rules:
         *   1. If the number is a multiple of 3, print "Java" instead of the number.
         *   2. If the number is a multiple of 5, print "CAN" instead of the number.
         *   3. If the number is a multiple of both 3 and 5, print "JavaCAN" instead of the number.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number >= 100) { // Check if the number is less than 100
            System.out.println("Please enter a number less than 100.");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) { // Multiple of both 3 and 5
                    System.out.println("JavaCAN");
                } else if (i % 3 == 0) { // Multiple of 3 only
                    System.out.println("Java");
                } else if (i % 5 == 0) { // Multiple of 5 only
                    System.out.println("CAN");
                } else { // Not a multiple of 3 or 5
                    System.out.println(i);
                }
            }
        }

        input.close();

        /*
         * Explanation:
         * - The code first checks if the entered number is less than 100.
         * - The `for` loop then iterates from 1 to the entered number.
         * - Conditions check each number for divisibility by 3, 5, or both:
         *   - If divisible by both 3 and 5, it prints "JavaCAN".
         *   - If divisible by only 3, it prints "Java".
         *   - If divisible by only 5, it prints "CAN".
         *   - Otherwise, it prints the number itself.
         */
    }
}
