package j07_StringManipulations;

public class C08_Equals_EqualsIgnoreCase {

    public static void main(String[] args) {

        /*
         * equals() and equalsIgnoreCase() Methods:
         * - equals(): Compares two strings for equality, case-sensitive.
         *   - Returns true if the content and case of both strings are the same.
         * - equalsIgnoreCase(): Compares two strings for equality, ignoring case.
         *   - Returns true if the content is the same, regardless of case.
         *
         * Additional Methods:
         * - toLowerCase(): Converts the entire string to lowercase.
         * - toUpperCase(): Converts the entire string to uppercase.
         */

        String str1 = "Hello";
        String str2 = "hello";

        // Demonstration of replaceAll() with regex
        System.out.println("str1 before replaceAll: " + str1); // Output: Hello
        System.out.println("str1.replaceAll(\"\\\\w\" , \"*\"): " + str1.replaceAll("\\w", "*")); // Output: *****
        // Note: The regex "\\w" matches any word character (letters, digits, underscore). Only replaceAll() supports regex patterns.

        System.out.println("str1 after replaceAll: " + str1); // Output: Hello (original string is unchanged)

        // Comparing strings using equals() - case-sensitive comparison
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Output: false - different cases
        System.out.println("str2.equals(str1): " + str2.equals(str1)); // Output: false - order doesn't matter

        // Comparing strings using equalsIgnoreCase() - case-insensitive comparison
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // Output: true

        // Updating str2 to have the same case as str1
        str2 = "Hello";

        // Re-checking equality with equals()
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Output: true - exact match

        // String Pool and Reference Comparisons
        String s1 = "john"; // Created in the String Pool
        String s2 = "john"; // Points to the same "john" in the String Pool

        String s3 = new String("doe"); // Created as a new String object in the heap
        String s4 = new String("doe"); // Another new String object in the heap

        // Comparing s1 and s2 using == (checks reference)
        System.out.println("s1 == s2: " + (s1 == s2)); // Output: true - same reference in the String Pool
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // Output: true - same content

        // Comparing s3 and s4 using == and equals()
        System.out.println("s3 == s4: " + (s3 == s4)); // Output: false - different references (new keyword)
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // Output: true - same content

        // Comparing pooled string s1 with a new String object s3
        System.out.println("s1 == s3: " + (s1 == s3)); // Output: false - different references
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // Output: false - different content

        /*
         * Summary of String Comparisons:
         *
         * - Using == compares both reference and value. It checks if the variables point to the same object.
         * - equals() checks only for content equality, regardless of reference location.
         *
         * The String Pool:
         * - The String Pool is a memory area managed by the JVM for efficiently storing string literals.
         * - Identical string literals point to the same object in the String Pool, allowing memory optimization.
         *
         * When to Use Which:
         * - Use == for reference comparison when you want to check if two variables point to the exact same object.
         * - Use equals() for content comparison, regardless of whether the strings are stored in the String Pool or heap.
         *
         * The JVM manages memory economically with the String Pool for literals, so it’s recommended to use
         * string literals (like `String s = "example";`) whenever possible for efficiency.
         */
    }
}
