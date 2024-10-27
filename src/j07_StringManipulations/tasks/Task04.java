package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Prompt the user to enter two words.
         * - If the first word has an even number of characters, insert the second word in the middle of the first word.
         * - If the first word has an odd number of characters, print "Second word cannot be added to the first word".
         *
         * Example:
         * - Input:
         *   firstWord = "mehmet"
         *   secondWord = "ahmet"
         * - Output: "mehahmetmet"
         */

        Scanner scanner = new Scanner(System.in);

        // Get input for the first and second words
        System.out.print("Enter the first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String secondWord = scanner.nextLine();

        // Check if the first word has an even number of characters
        if (firstWord.length() % 2 == 0) {
            // Insert the second word in the middle of the first word
            int midIndex = firstWord.length() / 2;
            String result = firstWord.substring(0, midIndex) + secondWord + firstWord.substring(midIndex);
            System.out.println("Result: " + result);
        } else {
            // If the first word has an odd number of characters
            System.out.println("Second word cannot be added to the first word");
        }

        /*
         * Explanation:
         * - We check if the length of the first word is even using `firstWord.length() % 2 == 0`.
         * - If true, we divide the length by 2 to find the middle index and use `substring` to split the first word
         *   into two parts.
         * - The second word is inserted between the two parts.
         * - If the length of the first word is odd, we print a message indicating that the second word cannot be added.
         */
    }
}
