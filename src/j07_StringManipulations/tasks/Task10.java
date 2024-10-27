package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK:
         * Ask the user for a name that must be exactly 3 letters long.
         * Use a ternary to check if all letters are unique.
         * E.g.: ala => Not Unique, ali => Unique
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        name = name.toLowerCase();

        // Check if the name is exactly 3 letters
        boolean isThreeLetters = name.length() == 3;

        // Check if all letters are unique
        boolean isUnique = name.charAt(0) != name.charAt(1) &&
                name.charAt(1) != name.charAt(2) &&
                name.charAt(0) != name.charAt(2);

        // Use ternary to print the result
        System.out.println(isThreeLetters ? (isUnique ? "Unique" : "Not Unique") : "Please enter a 3-letter name");
    }
}
