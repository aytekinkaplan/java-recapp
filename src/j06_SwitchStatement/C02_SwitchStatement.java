package j06_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchStatement {
    public static void main(String[] args) {
        /*
            The Switch Case statement is very similar to the if statement in function.
            When we use multiple if-else blocks, it can make the program harder to read and understand.
            When we need to compare a variable to multiple constant values, we can use a switch statement.
            This allows the program to execute one of the multiple branches based on the value of the variable.
            We can also combine if statements with a switch statement if necessary.
            Switch performs by comparing the variable to each constant value provided in cases.

            Note: In switch statements, types like long, double, float, and boolean are NOT SUPPORTED.
                  Switch statements can only use int, byte, short, char, and String data types.
                  For three or more conditions, it is generally more efficient to use a switch.

         */

        // TASK: Create a program that takes a single-digit number (0-9) from the user and prints it as a word.
        // Example:
        // Input: 1
        // Output: "one"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single-digit number (0-9): ");
        int digit = input.nextInt();

        System.out.println("*************** Using if-else statements ***************");

        if (digit == 0) {
            System.out.println("zero");
        } else if (digit == 1) {
            System.out.println("one");
        } else if (digit == 2) {
            System.out.println("two");
        } else if (digit == 3) {
            System.out.println("three");
        } else if (digit == 4) {
            System.out.println("four");
        } else if (digit == 5) {
            System.out.println("five");
        } else if (digit == 6) {
            System.out.println("six");
        } else if (digit == 7) {
            System.out.println("seven");
        } else if (digit == 8) {
            System.out.println("eight");
        } else if (digit == 9) {
            System.out.println("nine");
        } else {
            System.out.println("Please enter a number between 0 and 9.");
        }

        System.out.println("*************** Using switch statement ***************");

        switch (digit) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Please enter a number between 0 and 9.");
        }

        // Additional Example 1: Converting a weekday number to its name
        System.out.println("Enter a weekday number (1 for Monday to 7 for Sunday):");
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
                System.out.println("Invalid input. Enter a number from 1 to 7.");
        }

        // Additional Example 2: Identifying seasons based on month
        System.out.println("Enter a month number (1 for January to 12 for December):");
        int month = input.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Please enter a valid month number (1-12).");
        }

        input.close();
    }
}
