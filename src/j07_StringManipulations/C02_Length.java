package j07_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /*
         The length() method returns the length of a given string,
         which is the number of characters contained in it, including spaces and special characters.
         This method is often used to measure the length of a string for validation, iteration, etc.
        */

        String str = "clarusway with java";
        System.out.println("str.length() = " + str.length()); // str.length() = 18
        // When a method has an empty parentheses, it means the method is parameterless

        int lengthOfStr = str.length();
        System.out.println("lengthOfStr = " + lengthOfStr); // lengthOfStr = 18

        // Examples to demonstrate various cases of string length:

        // Case 1: Empty String
        String str1 = "";
        System.out.println("str1.length() = " + str1.length()); // str1.length() = 0

        // Case 2: String with a single space
        String str2 = " ";
        System.out.println("str2.length() = " + str2.length()); // str2.length() = 1

        // Case 3: Null String
        String str3 = null;
        // Uncommenting the following lines will cause a NullPointerException (NPE)
        // System.out.println("str3.length() = " + str3.length()); // Runtime Error: NullPointerException
        // System.out.println("str3.concat(str2) = " + str3.concat(str2)); // NPE

        // Case 4: String containing the word "null"
        String str4 = "null";
        System.out.println("str4.length() = " + str4.length()); // str4.length() = 4
        System.out.println("str4 = " + str4); // str4 = null

        // Case 5: Uninitialized String variable
        String str5;
        // Uncommenting the line below will cause a compile-time error
        // System.out.println("str5.length() = " + str5.length()); // Compile-Time Error: variable str5 might not have been initialized

        // Additional Examples

        // Example 1: String with special characters and spaces
        String str6 = "Hello, World! 123";
        System.out.println("str6.length() = " + str6.length()); // str6.length() = 16

        // Example 2: String containing Unicode characters (like emojis)
        String str7 = "Hello 🌍!";
        System.out.println("str7.length() = " + str7.length()); // str7.length() = 8

        // Example 3: Using length() in conditional statements
        String password = "P@ssw0rd";
        if (password.length() < 8) {
            System.out.println("Password is too short. Must be at least 8 characters.");
        } else {
            System.out.println("Password length is valid.");
        }

        // Example 4: Looping through a string based on its length
        String word = "iteration";
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Character at index " + i + ": " + word.charAt(i));
        }
    }
}
