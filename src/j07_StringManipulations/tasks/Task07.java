package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Prompt the user to enter a string and an index.
         * - Print the character at the specified index if it is within bounds; otherwise, print an error message.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index < 0 || index >= str.length()) {
            System.out.println("Invalid index");
        } else {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        }

        scanner.close();

        /*
         * Explanation:
         * - We check if the index is within the valid range (0 to str.length() - 1).
         * - If the index is out of bounds, we print an error message.
         * - If the index is valid, we use charAt(index) to print the character at that index.
         */
    }
}
