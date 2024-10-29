package j08_Loops.l02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
        /*
        Task: When the start and end values are known and fixed, use a `for` loop.
              When the number of iterations is unknown and depends on a condition, use a `while` loop.
         */

        // Task 1: Print numbers from 11 to 19 (using both `for` and `while` loops)

        System.out.println("********  Solution with for loop *******");
        for (int i = 11; i < 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("********  Solution with while loop *******");
        int number = 11;  // Initialize starting value
        while (number < 20) {  // Continue while `number` is less than 20
            System.out.print(number + " ");
            number++;  // Increment `number` to avoid an infinite loop
        }
        System.out.println();

        // Task 2: Print "javaCAN" 7 times
        System.out.println("********  Task 2 *******");
        int count = 1;
        while (count <= 7) {
            System.out.println(count + ". javaCAN");
            count++;  // Increment to move toward the loop’s end condition
        }

        // Task 3: Print all two-digit odd numbers (from 11 to 99) on the same line
        System.out.println("********  Task 3 *******");
        int oddNumber = 11;  // Start from the first two-digit odd number
        while (oddNumber < 100) {  // Continue until 99
            if (oddNumber % 2 == 1) {  // Check if `oddNumber` is odd
                System.out.print(oddNumber + " ");
            }
            oddNumber++;  // Increment to move toward 100
        }
        System.out.println();

        // Task 4: Reverse and print a user-input string using a `while` loop
        System.out.println("********  Task 4 *******");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String sentence = input.nextLine();

        int length = sentence.length() - 1;  // Set index to the last character in the string
        while (length >= 0) {
            System.out.print(sentence.charAt(length));  // Print characters in reverse order
            length--;  // Move to the previous character
        }
        System.out.println();

        // Alternative solution with `for` loop
        System.out.println("******** Solution with for loop *******");
        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
        System.out.println();

        // Task 5: Calculate the sum of all numbers from 1 up to a user-provided integer
        System.out.println("********  Task 5 *******");
        System.out.println("Enter a positive integer:");
        int limit = input.nextInt();
        int sum = 0;

        while (limit > 0) {
            sum += limit;  // Add current value of `limit` to `sum`
            limit--;  // Decrement to eventually end the loop
        }
        System.out.println("Total sum = " + sum);

        // Task 6: Calculate and print the factorial of a user-provided integer
        System.out.println("********  Task 6: Factorial *******");
        System.out.println("Enter an integer:");
        int factorialInput = input.nextInt();
        int factorial = 1;

        while (factorialInput > 0) {
            factorial *= factorialInput;  // Multiply by current value
            factorialInput--;  // Decrement to move closer to 1
        }
        System.out.println("Factorial = " + factorial);
    }
}
