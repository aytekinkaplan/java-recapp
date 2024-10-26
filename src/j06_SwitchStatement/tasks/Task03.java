package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // TASK: Given the number of days from day 1 (Monday), print the corresponding day of the week.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        // Calculate the day of the week by using modulo 7
        int dayOfWeek = days % 7;

        // Display the corresponding day name
        switch (dayOfWeek) {
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
            case 0: // If the remainder is 0, it corresponds to Sunday
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
