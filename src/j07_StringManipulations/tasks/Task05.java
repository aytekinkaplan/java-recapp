package j07_StringManipulations.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Prompt the user to enter their full name (first name and surname).
         * - Capitalize the first letter of each part of the name (first and surname) and print the result.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name (first and surname): ");
        String nameAndSurname = scanner.nextLine();

        // Validate if both name and surname were provided
        if (!nameAndSurname.contains(" ")) {
            System.out.println("Please enter both your first name and surname correctly.");
        } else {
            // Split the full name into individual words (first name and surname)
            String[] names = nameAndSurname.trim().split(" ");
            ArrayList<String> capitalizedNames = new ArrayList<>();

            for (String name : names) {
                // Capitalize the first letter and make the rest lowercase
                name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
                capitalizedNames.add(name); // Add the formatted name to the list
            }

            // Join the words into a single string and print the result
            System.out.println("Formatted Name and Surname: " + String.join(" ", capitalizedNames));
        }

        /*
         * Explanation:
         * - We first check if there is a space in the input to confirm that both a first name and surname were provided.
         * - If valid, we split the input by spaces, trim any extra spaces, and process each part.
         * - Each word is then capitalized by converting the first letter to uppercase and the rest to lowercase.
         * - Finally, we join the capitalized words into a single formatted string and print it.
         */
    }
}
