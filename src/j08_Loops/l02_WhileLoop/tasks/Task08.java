package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /*
        Task: Ask the user for positive numbers to add to a sum.
        Inform the user that entering 0 will end the process.
        Ignore negative numbers and display a warning when one is entered.
        Once the user enters 0, display:
        - The number of positive values entered
        - The count of negative entries (ignored in sum)
        - The total sum of the positive values entered
        */

        Scanner input = new Scanner(System.in);
        int sumOfPositives = 0;
        int countOfPositives = 0;
        int countOfNegatives = 0;

        while (true) {
            System.out.println("Enter a positive number or 0 to exit:");
            int number = input.nextInt();

            if (number > 0) {
                // Increment positive number count and add to sum
                countOfPositives++;
                sumOfPositives += number;
            } else if (number < 0) {
                // Increment negative number count and notify the user
                countOfNegatives++;
                System.out.println("Negative numbers are not allowed.");
            } else {
                // If the user enters 0, exit the loop and display results
                System.out.println("You have entered " + countOfPositives + " positive number(s).");
                System.out.println("You have entered " + countOfNegatives + " negative number(s) (ignored).");
                System.out.println("The sum of positive numbers is " + sumOfPositives + ".");
                break;
            }
        }

        // Close the scanner
        input.close();
    }
}
