package j10_MethodCreation;

import java.util.Scanner;

public class C06_RecursiveMethod {
    public static void main(String[] args) {

        /*
        Recursive calls can add extra load to the program at runtime. Every time a recursive function calls itself,
        it creates a new entry in the stack, consuming memory.
        Recursive calculations can be slower and less efficient than loops.
        However, recursion is sometimes more elegant and simpler for solving complex problems.
        */

        // Task: Create a method to calculate the factorial of a number entered by the user

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println("factorial(number) = " + factorial(number));
    }

    // Recursive method to calculate the factorial of a number
    public static int factorial(int number) {
        if (number >= 1) {
            return number * factorial(number - 1); // Recursive call
            // For example, 5! = 5 * 4 * 3 * 2 * 1
        } else {
            return 1; // Factorial of 0 is defined as 1
        }
    }
}
