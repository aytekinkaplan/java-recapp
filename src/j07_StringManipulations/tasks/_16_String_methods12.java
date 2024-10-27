package j07_StringManipulations.tasks;

public class _16_String_methods12 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "Florida".
         * - Find and print the index of each character in this string.
         */

        String str = "Florida";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at index i
            System.out.println("Character '" + currentChar + "' is at index: " + i);
        }

        /*
         * Explanation:
         * - The for loop iterates through each character in the string from index 0 to the last index (str.length() - 1).
         * - charAt(i) retrieves the character at the current index i, which is then printed along with its index.
         * - This way, each character's index is displayed in sequence.
         */
    }
}
