package j07_StringManipulations;

import java.util.Scanner;

public class C07_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        /*
         * indexOf() and lastIndexOf() Methods:
         * - indexOf(): Returns the index of the first occurrence of a specified character or substring within a string.
         *   - If the character or substring is not found, it returns -1.
         * - lastIndexOf(): Similar to indexOf(), but starts searching from the end of the string.
         *   - The index numbering remains the same; only the search direction changes.
         * Both methods return an integer and are case-sensitive.
         */

        String str = "all is well";

        // indexOf() Examples
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a")); // Output: 0 - 'a' is at index 0
        System.out.println("str.indexOf(\"l\") = " + str.indexOf("l")); // Output: 1 - First 'l' at index 1
        System.out.println("str.indexOf(\"L\") = " + str.indexOf("L")); // Output: -1 - 'L' (uppercase) not found
        System.out.println("str.indexOf(\"all\") = " + str.indexOf("all")); // Output: 0 - "all" starts at index 0
        System.out.println("str.indexOf(\"is\") = " + str.indexOf("is"));   // Output: 4 - "is" starts at index 4

        // lastIndexOf() Examples
        String name = "Jack Nicholson";
        System.out.println("name.indexOf(\"o\") = " + name.indexOf("o")); // Output: 9 - First 'o' at index 9
        System.out.println("name.lastIndexOf(\"o\") = " + name.lastIndexOf("o")); // Output: 12 - Last 'o' at index 12
        System.out.println("name.indexOf(\"k\") = " + name.indexOf("k")); // Output: 3 - First and only 'k' at index 3
        System.out.println("name.lastIndexOf(\"k\") = " + name.lastIndexOf("k")); // Output: 3 - Only 'k' at index 3

        /*
         * Task:
         * Check if the entered sentence contains "java" with the following conditions:
         * 1. The sentence does not contain "java".
         * 2. The sentence contains "java" exactly once.
         * 3. The sentence contains "java" more than once.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");

        String sentence = input.nextLine().toLowerCase();

        if (sentence.indexOf("java") == -1) { // Condition 1: "java" is not in the sentence
            System.out.println("The sentence does not contain 'java'.");
        } else if (sentence.indexOf("java") == sentence.lastIndexOf("java")) { // Condition 2: "java" appears only once
            System.out.println("The sentence contains 'java' exactly once.");
        } else { // Condition 3: "java" appears more than once
            System.out.println("The sentence contains 'java' multiple times.");
        }

        // Additional Examples

        // Example 1: Finding the first and last occurrence of a character
        String text = "To be, or not to be, that is the question.";
        System.out.println("First 'b': " + text.indexOf('b')); // Output: 3
        System.out.println("Last 'b': " + text.lastIndexOf('b')); // Output: 19

        // Example 2: Check if a word exists within a string
        String quote = "The quick brown fox jumps over the lazy dog.";
        if (quote.indexOf("fox") != -1) {
            System.out.println("The quote contains the word 'fox'.");
        } else {
            System.out.println("The word 'fox' is not found.");
        }

        // Example 3: Locate the position of a specific substring
        String longText = "Searching for a needle in a haystack.";
        int needleIndex = longText.indexOf("needle");
        if (needleIndex != -1) {
            System.out.println("'needle' found at index: " + needleIndex); // Output: Index of "needle"
        } else {
            System.out.println("'needle' not found.");
        }

        // Example 4: Checking a character's last occurrence in a repetitive string
        String repetitive = "bananas";
        System.out.println("First 'a' position: " + repetitive.indexOf("a")); // Output: 1
        System.out.println("Last 'a' position: " + repetitive.lastIndexOf("a")); // Output: 5

        // Example 5: Check if a sentence contains multiple occurrences of a substring
        String story = "The cat and the dog chased the other cat.";
        int firstCat = story.indexOf("cat");
        int secondCat = story.indexOf("cat", firstCat + 1);
        if (secondCat != -1) {
            System.out.println("The word 'cat' appears multiple times.");
        } else {
            System.out.println("The word 'cat' appears only once.");
        }

        // Example 6: Extracting file extensions from a filename
        String fileName = "document.txt";
        int dotPosition = fileName.lastIndexOf('.');
        if (dotPosition != -1) {
            String extension = fileName.substring(dotPosition + 1);
            System.out.println("File extension: " + extension); // Output: "txt"
        } else {
            System.out.println("No file extension found.");
        }

        // Summary:
        // indexOf() and lastIndexOf() provide powerful search capabilities within strings, enabling:
        // - Finding specific characters or substrings from the start or end of a string.
        // - Checking the presence and frequency of substrings.
        // - Extracting information like file extensions, handling repetitive substrings, and locating text patterns.
    }
}
