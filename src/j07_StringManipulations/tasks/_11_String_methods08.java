package j07_StringManipulations.tasks;

public class _11_String_methods08 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "apple".
         * - Check if the string contains the substring "app" and print the result.
         */

        System.out.println("apple".contains("app") ? "apple contains 'app'" : "apple does not contain 'app'");

        /*
         * Explanation:
         * - The contains() method checks if a specified sequence of characters exists within the string.
         * - It returns true if the substring is found, and false otherwise.
         * - Since "apple" contains "app" as a substring, the output will be "apple contains 'app'".
         */
    }
}
