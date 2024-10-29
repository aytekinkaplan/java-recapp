package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

        /* Ask the user to enter an integer greater than 1.
           Calculate the sum of squares of all numbers from 1 to the entered number.

           Example Output:
           Entered number = 4
           Sum of squares = 30
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer greater than 1: ");
        int number = scanner.nextInt();

        int sum = 0;  // Initialize the sum to store the sum of squares

        if (number > 1) {
            // Loop from 1 up to the entered number, squaring each number and adding it to the sum
            for (int i = 1; i <= number; i++) {
                sum += i * i;
            }
            System.out.println("The sum of squares from 1 to " + number + " is: " + sum);
        } else {
            System.out.println("Please enter a number greater than 1.");
        }
    }
}
