package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int random = (int) (Math.random() * 100) + 1;

        // Initialize the scanner to read user input
        Scanner scan = new Scanner(System.in);

        // Variables to store the user's guess and the number of attempts
        int guess = 0;
        int count = 0;

        // Loop until the user guesses the correct number
        while (guess != random) {
            // Prompt the user to guess a number
            System.out.println("Guess a number between 1 and 100: ");
            guess = scan.nextInt(); // Read user input

            // Provide feedback based on the user's guess
            if (guess > random) {
                System.out.println("Your guess is too high.");
            } else if (guess < random) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("You guessed it! It took you " + count + " guesses.");
            }

            // Increment the attempt counter
            count++;
        }

        // Close the scanner
        scan.close();
    }
}
