package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        // TASK: Create a program that determines the season based on the month number entered by the user.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number (1-12): ");
        int monthNumber = input.nextInt();

        switch (monthNumber) {
            default:
                System.out.println("Please enter a valid month number between 1 and 12.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring season");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer season");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn season");
                break;
        }

        // Note: Shortcut for undoing code changes: Use "Ctrl + Z"
    }
}
