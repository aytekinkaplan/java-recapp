package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // TASK: Calculate the day of the week 100 days after the entered day.
        // 1 represents Monday, 2 represents Tuesday, etc.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current day as a number (1 for Monday, 7 for Sunday): ");
        int currentDay = scanner.nextInt();

        // Check for valid input
        if (currentDay < 1 || currentDay > 7) {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        } else {
            // Calculate the day of the week 100 days later
            int futureDay = (currentDay + 100) % 7;
            if (futureDay == 0) {
                futureDay = 7; // Adjust to make Sunday = 7
            }

            // Display the result
            switch (futureDay) {
                case 1:
                    System.out.println("100 days from now will be a Monday.");
                    break;
                case 2:
                    System.out.println("100 days from now will be a Tuesday.");
                    break;
                case 3:
                    System.out.println("100 days from now will be a Wednesday.");
                    break;
                case 4:
                    System.out.println("100 days from now will be a Thursday.");
                    break;
                case 5:
                    System.out.println("100 days from now will be a Friday.");
                    break;
                case 6:
                    System.out.println("100 days from now will be a Saturday.");
                    break;
                case 7:
                    System.out.println("100 days from now will be a Sunday.");
                    break;
            }
        }

        scanner.close();
    }
}
