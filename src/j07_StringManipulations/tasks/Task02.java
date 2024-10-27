package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Create a code to validate a password with the following conditions:
         *   a) The first character must be an uppercase letter.
         *   b) The last character must be a digit.
         *   c) The password must be at least 6 characters long.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Checking each condition
        char firstChar = password.charAt(0);
        char lastChar = password.charAt(password.length() - 1);

        boolean isUpper = Character.isUpperCase(firstChar); // Condition a: First character uppercase
        boolean isNumber = Character.isDigit(lastChar); // Condition b: Last character digit
        boolean isLong = password.length() >= 6; // Condition c: Length at least 6 characters

        // Check if all conditions are met
        boolean isValid = isUpper && isNumber && isLong;

        // Output the result
        System.out.println(isValid ? "Valid password" : "Invalid password");

        /*
         * Explanation:
         * - Character.isUpperCase(firstChar): Checks if the first character is uppercase.
         * - Character.isDigit(lastChar): Checks if the last character is a digit.
         * - password.length() >= 6: Ensures the password length is at least 6 characters.
         * - The isValid variable combines all conditions. If all are true, the password is valid.
         */

    }
}
