package j07_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

        /*
         The contains() method checks if a specified sequence of characters exists within a given string.
         It returns a boolean value: true if the sequence is found, otherwise false.
         The contains() method is case-sensitive, so "java" and "Java" would be considered different.
        */

        // Example 1: Basic contains() usage
        String str = "learning Java is fun";
        System.out.println("str = " + str);

        // System.out.println("str.contains('j') = " + str.contains('j')); // Compile-Time Error: parameter must be a String, not char

        System.out.println("str.contains(\"Java\") = " + str.contains("Java")); // true - "Java" exists in str
        System.out.println("str.contains(\"java\") = " + str.contains("java")); // false - case-sensitive comparison
        System.out.println("str.contains(\" \") = " + str.contains(" "));       // true - contains a space character
        System.out.println("str.contains(\"\") = " + str.contains(""));         // true - empty string is technically present in all strings

        // Edge case: Checking empty string length
        System.out.println("\"\".length() = " + "".length()); // 0 - length of an empty string is 0

        // Example 2: Product check with ternary operator
        String refrigerator = "milk, cheese, eggs, butter, yogurt, honey";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a product name to check if it's available:");
        String product = input.nextLine();

        // Using contains() to check if the entered product is in the refrigerator list
        String result = refrigerator.contains(product) ?
                "Yes, this product is available in the refrigerator." :
                "No, this product is not available in the refrigerator.";
        System.out.println("Result: " + result);

        // Example 3: Password check (Demonstration only)
        // Note: Using contains() for password verification is insecure and should be avoided in production code.
        String originalPassword = "securePass123";

        System.out.println("Enter your password:");
        String enteredPassword = input.nextLine();

        // Using if-else for a password match check
        if (enteredPassword.equals(originalPassword)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        // Explanation: Using contains() for password check can result in potential security issues.
        // For instance, if the user enters "secure" or "123", it would be found within the original password
        // because contains() does a partial match. Always use equals() for exact string matching.

        // Using ternary for password check
        String loginMessage = enteredPassword.equals(originalPassword) ?
                "Access granted via ternary." :
                "Access denied via ternary.";
        System.out.println("Login Message: " + loginMessage);

        // Using a switch-case for exact password match check
        switch (enteredPassword) {
            case "securePass123":
                System.out.println("Access granted via switch-case.");
                break;
            default:
                System.out.println("Incorrect password entered.");
                break;
        }

        // Additional Examples:

        // Example 4: Case-insensitive contains check
        String phrase = "Java programming is versatile";
        String keyword = "JAVA";
        // Convert both strings to lowercase for a case-insensitive check
        boolean isContained = phrase.toLowerCase().contains(keyword.toLowerCase());
        System.out.println("Case-insensitive check: " + isContained); // true

        // Example 5: Checking multiple substrings within a string
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean hasQuick = sentence.contains("quick");
        boolean hasDog = sentence.contains("dog");
        boolean hasCat = sentence.contains("cat");
        System.out.println("Contains 'quick': " + hasQuick); // true
        System.out.println("Contains 'dog': " + hasDog);     // true
        System.out.println("Contains 'cat': " + hasCat);     // false

        // Example 6: Using contains() in a loop to find multiple occurrences
        String paragraph = "Java is powerful. Java is versatile. Many use Java for various applications.";
        int index = 0;
        int javaCount = 0;
        while ((index = paragraph.indexOf("Java", index)) != -1) {
            javaCount++;
            index += "Java".length(); // Move index forward to find the next occurrence
        }
        System.out.println("Occurrences of 'Java': " + javaCount); // 3

        // Example 7: Avoiding substring matches for passwords
        String securePassword = "MyStrongPassword123!";
        String userPassword = "Strong";
        // contains() here will return true if the password contains the substring, which is insecure.
        boolean containsInsecure = securePassword.contains(userPassword);
        boolean isEqualSecure = securePassword.equals(userPassword);
        System.out.println("Using contains for password: " + containsInsecure); // Insecure check (false in this case)
        System.out.println("Using equals for password: " + isEqualSecure);      // Secure check (false in this case)

        // Note: Avoid using contains() for sensitive information like passwords; use equals() for exact match verification.

        // Summary:
        // The contains() method is powerful for checking the presence of substrings but should be used carefully,
        // especially in security-sensitive contexts like password verification. For exact string matching, always use equals().
    }
}
