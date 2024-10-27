package j07_StringManipulations.tasks;

public class _17_String_methods13 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "Thank you".
         * - Print the index of the character 'y' in this string.
         */

        String str = "Thank you"; // Define the string
        int indexOfY = str.indexOf('y'); // Find the index of 'y'

        System.out.println("Index of 'y' in 'Thank you': " + indexOfY);

        /*
         * Explanation:
         * - The indexOf() method returns the index of the first occurrence of a specified character.
         * - If the character is found, it returns the zero-based index. If the character is not found, it returns -1.
         * - In "Thank you", the character 'y' is located at index 6, so the output will be 6.
         */
    }
}
