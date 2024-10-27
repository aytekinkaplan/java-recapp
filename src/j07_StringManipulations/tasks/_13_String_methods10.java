package j07_StringManipulations.tasks;

public class _13_String_methods10 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "orange".
         * - Check if this string is equal to "Apple" (case-insensitive) and print the result.
         */

        String str1 = "orange";
        String str2 = "Apple";

        System.out.println(str1.equalsIgnoreCase(str2) ? "orange and Apple are equal" : "orange and Apple are not equal");

        /*
         * Explanation:
         * - The equalsIgnoreCase() method compares two strings for equality, ignoring case differences.
         * - It returns true if the strings contain the same characters in any combination of upper and lower case.
         * - From "orange" and "Apple" have different characters, the output will be "orange and Apple are not equal".
         */
    }
}
