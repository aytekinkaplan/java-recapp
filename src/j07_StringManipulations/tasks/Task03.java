package j07_StringManipulations.tasks;

public class Task03 {
    public static void main(String[] args) {

        /*
         * Task:
         * - Find the index of the second occurrence of the character 'a' in the string "Alamanya".
         */

        String str = "Alamanya";
        char targetChar = 'a';

        int firstIndex = str.indexOf(targetChar); // Find the first occurrence of 'a'
        int secondIndex = str.indexOf(targetChar, firstIndex + 1); // Find the second occurrence of 'a'

        System.out.println("Index of the second 'a': " + (secondIndex != -1 ? secondIndex : "Not found"));

        /*
         * Explanation:
         * - indexOf(targetChar): Finds the first occurrence of 'a' in the string.
         * - indexOf(targetChar, firstIndex + 1): Starts searching for 'a' from the position after the first occurrence.
         * - If the second 'a' exists, it prints its index; otherwise, it indicates that the second 'a' was not found.
         */
    }
}
