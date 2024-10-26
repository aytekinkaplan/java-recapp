package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        // TASK: Create a program that takes the month number entered by the user and prints the name of the month in Turkish.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number (1-12): ");
        int monthNumber = input.nextInt();

        System.out.println("********* Using switch statement to display month *********");

        switch (monthNumber) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Please enter a valid month number between 1 and 12.");
        }

        // Additional Example 1: Display the Season Based on Month
        System.out.println("Enter a month number again (1-12) to determine the season:");
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
                System.out.println("Please enter a valid month number (1-12).");
        }

        // Additional Example 2: Determine the Quarter of the Year
        System.out.println("Enter a month number to find out the quarter (1-12):");
        int monthQuarter = input.nextInt();

        switch (monthQuarter) {
            case 1: case 2: case 3:
                System.out.println("First Quarter");
                break;
            case 4: case 5: case 6:
                System.out.println("Second Quarter");
                break;
            case 7: case 8: case 9:
                System.out.println("Third Quarter");
                break;
            case 10: case 11: case 12:
                System.out.println("Fourth Quarter");
                break;
            default:
                System.out.println("Please enter a valid month number (1-12).");
        }

        input.close();
    }
}
