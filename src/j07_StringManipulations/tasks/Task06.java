package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Prompt the user to enter a string.
         * - Remove the last character from the string and print the result.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the string is not empty to avoid errors
        if (str.length() > 0) {
            String result = str.substring(0, str.length() - 1); // Remove the last character
            System.out.println("String after removing last character: " + result);
        } else {
            System.out.println("The entered string is empty.");
        }

        /*
         * Explanation:
         * - str.substring(0, str.length() - 1) creates a substring from the start of the string
         *   up to (but not including) the last character.
         * - This removes the last character from the string.
         * - The code also checks if the string is not empty before attempting to remove the last character.
         */
    }
}
