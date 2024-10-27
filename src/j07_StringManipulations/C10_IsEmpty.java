package j07_StringManipulations;

import java.util.Scanner;

public class C10_IsEmpty {
    public static void main(String[] args) {

        /*
         * isEmpty() Method:
         * - Checks if a string is empty, meaning it contains no characters at all.
         * - Returns true if the string length is 0, false otherwise.
         * - Instead of using length() == 0, it's recommended to use isEmpty() for readability and clarity.
         *
         * isBlank() Method (Java 11+):
         * - Checks if a string is empty or contains only whitespace characters.
         * - Returns true if the string is empty or has only whitespace.
         */

        String hi = "hello";
        System.out.println("Is 'hi' empty? " + hi.isEmpty()); // Output: false - string has content

        // Task: Check if the user has entered a name
        // If not, prompt the user to try again

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        // Using isEmpty() to check if the user has entered anything
        if (name.isEmpty()) {
            System.out.println("You cannot proceed without entering your name.");
        } else {
            System.out.println("Welcome, " + name + "!");
        }

        // Using isBlank() (for Java 11+) to check if the user entered only whitespace
        if (name.isBlank()) {
            System.out.println("You cannot proceed without entering a valid name (isBlank check).");
        } else {
            System.out.println("Welcome with isBlank check, " + name + "!");
        }

        /*
         * Explanation of isEmpty() vs. isBlank():
         * - isEmpty() only returns true if the string has absolutely no characters, so " " (a space) would return false.
         * - isBlank() is more comprehensive; it returns true for empty strings or strings with only whitespace, such as "   ".
         * - Use isEmpty() for strict checks if you only want to confirm that the string has no characters.
         * - Use isBlank() when you want to account for cases where users might enter only whitespace.
         */

    }
}
