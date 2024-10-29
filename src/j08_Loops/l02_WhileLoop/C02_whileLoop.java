package j08_Loops.l02_WhileLoop;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {

        // Task: Given an integer, calculate and print the number of positive divisors of that integer.
        // For example,
        // 20 -> 1, 2, 4, 5, 10, 20: 20 has 6 positive divisors.
        // 30 -> 1, 2, 3, 5, 6, 10, 15, 30: 30 has 8 positive divisors.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        int divisor = 1;  // Start checking divisors from 1
        int divisorCount = 0;  // Counter to track the number of divisors

        // `while` loop to check all numbers from 1 up to `number`
        while (divisor <= number) {
            if (number % divisor == 0) {  // Check if `divisor` is a factor of `number`
                divisorCount++;  // Increment the count if `divisor` divides `number` evenly
            }
            divisor++;  // Increment `divisor` to check the next number
        }

        // Print the total number of divisors
        System.out.println("Number of divisors = " + divisorCount);
    }
}
