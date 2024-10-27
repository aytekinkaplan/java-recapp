package j07_StringManipulations.tasks;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "apple".
         * - Check if this string is equal to "Apple" (case-insensitive) and print the result.
         * - Case sensitivity should be ignored.
         */

        String str1 = "apple";
        String str2 = "Apple";

        System.out.println(str1.equalsIgnoreCase(str2) ? "apple and Apple are equal" : "apple and Apple are not equal");

        /*
         * Explanation:
         * - The equalsIgnoreCase() method compares two strings for equality, ignoring case differences.
         * - It returns true if the strings contain the same characters in any combination of upper and lower case.
         * - Since "apple" and "Apple" contain the same characters, the output will be "apple and Apple are equal".
         */
    }
}
