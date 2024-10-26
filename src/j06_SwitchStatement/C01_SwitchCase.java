package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        // In Java, conditional operations can be performed using:
        // 1. If-else statements
        // 2. Ternary operators
        // 3. Switch-case statements
        // The switch-case is useful for situations where we are only checking equality against specific values.
        // For example, in a menu system where different cases represent different options.

        // Task 1: Convert a number (0-2) entered by the user into its word representation.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (0 to 2):");
        int number = input.nextInt();

        // Using if-else statements to display the number as a word
        if (number == 0) {
            System.out.println("Zero");
        } else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else {
            System.out.println("You must enter a number between 0 and 2.");
        }

        // Using switch-case statements to achieve the same result
        System.out.println("Using switch-case:");
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("You must enter a number between 0 and 2.");
        }

        // Task 2: Menu system using a switch-case
        System.out.println("Main Menu Options:\n"
                + "A - Go to main menu\n"
                + "B - Show products\n"
                + "C - Add products\n"
                + "Q - Quit");
        System.out.print("Please enter your choice: ");
        String option = input.next().toUpperCase();

        switch (option) {
            case "A":
                System.out.println("Welcome to the main menu.");
                break;
            case "B":
                System.out.println("Displaying available products...");
                break;
            case "C":
                System.out.println("Which product would you like to add?");
                break;
            case "Q":
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please select A, B, C, or Q.");
        }

        // Additional Example 1: Days of the Week
        System.out.println("Enter a day number (1 for Monday, 7 for Sunday):");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a number between 1 and 7.");
        }

        // Additional Example 2: Grading System
        System.out.println("Enter a grade letter (A, B, C, D, F):");
        char grade = input.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
            default:
                System.out.println("Invalid grade. Enter A, B, C, D, or F.");
        }

        // Additional Example 3: Seasons Based on Month
        System.out.println("Enter a month number (1 for January to 12 for December):");
        int month = input.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Please enter a number between 1 and 12.");
        }

        input.close();
    }
}
