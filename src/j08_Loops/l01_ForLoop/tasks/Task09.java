package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task: Create a program that reads 5 numbers from the user.
              Calculate and print the sum of the numbers, excluding any that fall between 10 and 20 (inclusive).
         */

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter five numbers
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        System.out.println("Enter fourth number: ");
        int num4 = input.nextInt();

        System.out.println("Enter fifth number: ");
        int num5 = input.nextInt();

        // Initialize sum variable to 0
        int sum = 0;

        // Use ternary operator to add numbers outside the 10-20 range
        sum += (num1 <= 10 || num1 >= 20) ? num1 : 0;
        sum += (num2 <= 10 || num2 >= 20) ? num2 : 0;
        sum += (num3 <= 10 || num3 >= 20) ? num3 : 0;
        sum += (num4 <= 10 || num4 >= 20) ? num4 : 0;
        sum += (num5 <= 10 || num5 >= 20) ? num5 : 0;

        // Print the final result
        System.out.println("Sum of numbers excluding those between 10 and 20: " + sum);
    }
}
