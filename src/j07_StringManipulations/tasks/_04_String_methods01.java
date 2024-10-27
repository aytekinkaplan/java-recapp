package j07_StringManipulations.tasks;

public class _04_String_methods01 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the text "I love java".
         * - Print the total number of characters in this string.
         */

        String str = "I love java"; // Define the string
        System.out.println("Total characters in the string: " + str.length()); // Output the length of the string

        // Explanation:
        // - The length() method returns the total number of characters in the string, including spaces.
        // - In this case, "I love java" has 11 characters (spaces included).
    }
}
