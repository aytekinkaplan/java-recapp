package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

        /* Create a string.
           Enter your birthday into the console.
           Print the string. */

        // Step 1: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input their birthday
        System.out.println("Enter your birthday: ");

        // Step 3: Capture the input as a String
        String birthday = scanner.nextLine();

        // Step 4: Print the entered birthday
        System.out.println("Your birthday is: " + birthday);

        // Additional Example 1: Asking for a future date (e.g., vacation)
        System.out.println("Enter the date of your next vacation: ");
        String vacationDate = scanner.nextLine();
        System.out.println("Your next vacation is on: " + vacationDate);

        // Additional Example 2: Asking for a specific event date
        System.out.println("Enter the date of your next important event: ");
        String eventDate = scanner.nextLine();
        System.out.println("Your next important event is on: " + eventDate);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
