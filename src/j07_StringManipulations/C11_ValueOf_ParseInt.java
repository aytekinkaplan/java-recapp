package j07_StringManipulations;

public class C11_ValueOf_ParseInt {
    public static void main(String[] args) {

        /*
         * Integer.valueOf() and Integer.parseInt() Methods:
         * - Integer.valueOf(): Converts a numeric string to an Integer object (non-primitive).
         * - Integer.parseInt(): Converts a numeric string to a primitive int.
         *
         * Both methods allow you to perform mathematical operations with strings representing numbers.
         * Note: Both methods will throw a NumberFormatException if the string contains non-numeric characters (e.g., "1500$").
         *
         * Usage:
         * - Use Integer.valueOf() when you need an Integer object.
         * - Use Integer.parseInt() for simpler conversions when an int is sufficient.
         */

        // Example: Donation amounts stored as strings
        String donation1 = " 150000   ".trim(); // Using trim() to remove any leading/trailing spaces
        String donation2 = " 200000   ".trim();
        String donation3 = " 2 000 00   ".replace(" ", ""); // Removing spaces within the string

        // Incorrect usage: Concatenates strings instead of performing addition
        System.out.println("Concatenated donations: " + donation1 + donation2); // Output: 150000200000

        // Correct usage with Integer.valueOf()
        Integer d1 = Integer.valueOf(donation1);
        System.out.println("d1 = " + d1); // Output: d1 = 150000

        int d2 = Integer.valueOf(donation2); // Can also store Integer in int
        System.out.println("d2 = " + d2); // Output: d2 = 200000

        int d3 = Integer.valueOf(donation3); // Handles string with removed spaces
        System.out.println("d3 = " + d3); // Output: d3 = 200000

        // Summing the donations using Integer.valueOf()
        System.out.println("d1 + d2 = " + (d1 + d2)); // Output: d1 + d2 = 350000

        // Alternative Solution Using Integer.parseInt()
        System.out.println("Solution with parseInt:");

        int d11 = Integer.parseInt(donation1); // Converts to int
        System.out.println("d11 = " + d11); // Output: d11 = 150000

        int d22 = Integer.parseInt(donation2);
        System.out.println("d22 = " + d22); // Output: d22 = 200000

        // Summing the donations using Integer.parseInt()
        System.out.println("d11 + d22 = " + (d11 + d22)); // Output: d11 + d22 = 350000

        /*
         * Summary:
         * - Integer.valueOf() returns an Integer object (non-primitive), while Integer.parseInt() returns a primitive int.
         * - Both methods can convert numeric strings into integer values, allowing for mathematical operations.
         * - Use Integer.valueOf() when an Integer object is required (e.g., for certain collection classes).
         * - Use Integer.parseInt() for simplicity when a primitive int is sufficient.
         */
    }
}
