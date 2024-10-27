package j07_StringManipulations.tasks;

public class _18_String_methods14 {

    public static void main(String[] args) {

        /*
         * Task:
         * - Create a string with the value "      Techno Study          ".
         * - Remove any leading and trailing whitespace from this string.
         * - Print the trimmed version of the string.
         */

        String s1 = "      Techno Study          "; // Define the string with leading and trailing spaces
        System.out.println("Trimmed string: '" + s1.trim() + "'"); // Trim and print the result

        /*
         * Explanation:
         * - The trim() method removes any leading (beginning) and trailing (end) whitespace from the string.
         * - This is useful for cleaning up input or ensuring consistent formatting by eliminating unwanted spaces.
         * - In this case, "Techno Study" will be printed without spaces on either side.
         */
    }
}
