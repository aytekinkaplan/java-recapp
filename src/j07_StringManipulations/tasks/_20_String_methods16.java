package j07_StringManipulations.tasks;

public class _20_String_methods16 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "    Chocolade     ".
         * - Remove any leading and trailing whitespace from this string.
         * - Print the trimmed version of the string.
         */

        String s1 = "    Chocolade     "; // Define the string with extra spaces
        System.out.println("Trimmed string: '" + s1.trim() + "'"); // Trim and print the result

        /*
         * Explanation:
         * - The trim() method removes leading and trailing spaces from the string.
         * - This is useful for cleaning up input or formatting text consistently.
         * - In this case, "Chocolade" will be printed without spaces on either side.
         */
    }
}
