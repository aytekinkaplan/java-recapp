package j07_StringManipulations.tasks;

public class _12_String_methods09 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "apple".
         * - Check if the string contains the substring "App" and print the result.
         */

        String str = "apple"; // Define the string
        System.out.println(str.contains("App") ? "apple contains 'App'" : "apple does not contain 'App'");

        /*
         * Explanation:
         * - The contains() method is case-sensitive, so it will return false if the cases do not match exactly.
         * - In this example, since "App" has an uppercase 'A' and "apple" does not, the output will be "apple does not contain 'App'".
         */
    }
}
