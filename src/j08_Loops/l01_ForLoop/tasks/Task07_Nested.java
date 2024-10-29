package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Task07_Nested {

    public static void main(String[] args) {
        /*
        Task: Create a program that counts the occurrences of a specified character
              in a given sentence entered by the user.

              Example:
              Input Sentence: "hello Java developers"
              Character to Count: "a"
              Output: "The character 'a' appears 3 times in the sentence."
         */

        // Initialize Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();  // Store the user's sentence

        // Ask the user for the character they want to count
        System.out.println("Enter the character you want to count:");

        // Approach 1 (Using char):
        // Read the character as `char` type to simplify the comparison with each character in the sentence.
        // Char characterToCount = input.next().charAt(0);

        // Initialize a counter to zero. This counter will keep track of occurrences of the specified character.
        int count = 0;

        // Using the first approach (looping through each character with `char`):
        // for (int i = 0; i < sentence.length(); i++) {
        //     if (sentence.charAt(i) == characterToCount) {  // Check if current character matches
        //         count++;  // Increment count if there's a match
        //     }
        // }

        // Print the result for the first approach
        // System.out.println("The character '" + characterToCount + "' appears " + count + " times in the sentence.");

        // Approach 2 (Using String):
        // Read the character as a `String` to allow for a flexible approach to comparisons
        String characterToCountString = input.next();  // Store the character to count as a string

        // Reset count to zero for a new calculation
        count = 0;

        // Loop through each character in the sentence using its index.
        for (int i = 0; i < sentence.length(); i++) {
            // Extract each character as a substring of length 1 and compare it with the target character string.
            if (sentence.substring(i, i + 1).equals(characterToCountString)) {
                count++;  // Increment count if the character matches
            }
        }

        // Display the final count of the specified character in the given sentence
        System.out.println("The character '" + characterToCountString + "' appears " + count + " times in the sentence.");
    }
}
