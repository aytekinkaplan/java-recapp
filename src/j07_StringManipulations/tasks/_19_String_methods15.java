package j07_StringManipulations.tasks;

public class _19_String_methods15 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "Mouse".
         * - Print the character at the 2nd position (index 1) in this string.
         */

        String mouse = "Mouse"; // Define the string
        System.out.println("Character at index 1: " + mouse.charAt(1)); // Print the character at index 1

        /*
         * Explanation:
         * - The charAt() method returns the character at a specified index (0-based).
         * - In this case, index 1 corresponds to the 2nd character in "Mouse".
         * - The result will be 'o' since it is the character at index 1 in the string.
         */
    }
}
