package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task02 {

    // Method to capitalize the first letter of first and last names
    public static String fullName(String firstName, String lastName) {
        return firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        // Task: Create a method that makes the first letter of the first and last name uppercase, and the others lowercase.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Output the formatted full name
        System.out.println("Your full name: " + fullName(firstName, lastName));
    }
}
