package j06_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        // TASK: Create a program that takes the name of a day from the user and prints whether it is a weekday or weekend.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the day:");

        // Convert user input to uppercase to handle case-insensitive matching
        String day = input.nextLine().toUpperCase();
        System.out.println("Day entered: " + day);

        // Determine if the entered day is a weekday or weekend
        switch (day) {
            case "PAZARTESI":
            case "SALI":
            case "CARSAMBA":
            case "PERSEMBE":
            case "CUMA":
                System.out.println("The entered day is a weekday.");
                break;
            case "CUMARTESI":
            case "PAZAR":
                System.out.println("The entered day is a weekend.");
                break;
            default:
                System.out.println("Invalid day entered. Please enter a valid day name.");
                break;
        }

        input.close();
    }
}
