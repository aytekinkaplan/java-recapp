package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * Task: Create a program that takes two integers as input from the user and
         * prints all the integers between them (inclusive).
         * Implement both a while loop and a for loop solution.
         */

        // Initialize a Scanner object to capture user inputs
        Scanner input = new Scanner(System.in);

        // Prompt user for the first integer
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();

        // Prompt user for the second integer
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        // Ensure num1 is less than or equal to num2 for correct order in the loop
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Solution 1: Using a while loop to print numbers from num1 to num2
        System.out.println("\nNumbers between the entered values using while loop:");
        int currentNum = num1;
        while (currentNum <= num2) {
            System.out.print(currentNum + " ");
            currentNum++;
        }

        System.out.println("\n");

        // Solution 2: Using a for loop to print numbers from num1 to num2
        System.out.println("Numbers between the entered values using for loop:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }

        // Close Scanner object to release resources
        input.close();
    }
}
