package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // TASK: Create a program that takes a month number from the user and prints the number of days in that month.
        // Consider leap year rules for February (29 days in a leap year).
        // Use break statements to ensure proper case flow control.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number (1-12): ");
        int monthNumber = input.nextInt();

        switch (monthNumber) {
            default:
                System.out.println("Please enter a valid month number between 1 and 12.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month has 30 days.");
                break;
            case 2: // February requires additional handling due to leap years
                System.out.println("Enter the year: ");
                int year = input.nextInt();

                // Leap year check
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("February has 29 days in the year " + year + ".");
                } else {
                    System.out.println("February has 28 days.");
                }
                break;
        }
    }
}
