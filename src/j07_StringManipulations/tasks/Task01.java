package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Prompt the user to enter a string.
         * - Check if the string contains a space character and print the result.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine(); // Read the user's input

        // Check if the string contains a space and print the result
        System.out.println(str.contains(" ") ? "String contains a space character" : "String does not contain a space character");

        /*
         * Explanation:
         * - The contains() method checks if the specified substring (in this case, " ") is present in the string.
         * - If a space is found, contains() returns true; otherwise, it returns false.
         * - The result is displayed based on whether the string has a space character or not.
         */
    }
}
