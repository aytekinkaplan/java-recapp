package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        /*
        Task: Create a method to check if an email entered by the user is valid.

        Conditions:
        * An email address must contain the "@" character.
        * An email address must contain a "." (dot) character.
        * There must be at least one character before the "@" symbol (e.g., a@gmail.com is valid).

        Examples:
        validateEmail("@gmail.com")
        Output: false

        validateEmail("gmail")
        Output: false

        validateEmail("hello@gmail")
        Output: false

        validateEmail("hello@edabit.com")
        Output: true
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        System.out.println("Is the email valid? " + validateEmail(email));
        scanner.close();
    }

    // Method to validate the email
    private static boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".")
                && email.indexOf("@") > 0
                && email.indexOf("@") < email.lastIndexOf(".");
    }
}
