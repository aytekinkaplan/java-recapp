package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
         Task:
         Prompt the user for a score between 0 and 100.
         Convert the score to a letter grade and print it:
         - Less than 50 -> "D"
         - 50 to 59 -> "C"
         - 60 to 79 -> "B"
         - 80 and above -> "A"
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");

        int score = input.nextInt();

        // Checking for valid score and converting to letter grade
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        } else if (score < 50) {
            System.out.println("Your grade: D");
        } else if (score < 60) {
            System.out.println("Your grade: C");
        } else if (score < 80) {
            System.out.println("Your grade: B");
        } else {
            System.out.println("Your grade: A");
        }

        // Closing the Scanner to free up resources
        input.close();
    }
}
