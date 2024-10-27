package j07_StringManipulations;

import java.util.Scanner;

public class C05_StartWith_EndWith {
    public static void main(String[] args) {

        /**
         * startsWith() and endsWith() methods:
         * - startsWith(): Checks if a string begins with a specified prefix, returning a boolean result.
         * - endsWith(): Checks if a string ends with a specified suffix, returning a boolean result.
         * Both methods are case-sensitive.
         */

        String city = "Istanbul";

        // startsWith() Examples
        System.out.println("city.startsWith(\"i\") = " + city.startsWith("i"));       // false - case-sensitive
        System.out.println("city.startsWith(\"Ist\") = " + city.startsWith("Ist"));   // true - starts with "Ist"
        System.out.println("city.startsWith(\"stanbu\") = " + city.startsWith("stanbu")); // false - "stanbu" not at start

        // startsWith() with offset
        System.out.println("city.startsWith(\"t\", 3) = " + city.startsWith("t", 3)); // false - 't' is not at index 3
        System.out.println("city.startsWith(\"t\", 2) = " + city.startsWith("t", 2)); // true - 't' is at index 2
        // The second parameter represents the starting index, checking if the substring starts at that position

        // endsWith() Examples
        System.out.println("city.endsWith(\"l\") = " + city.endsWith("l"));     // true - ends with 'l'
        System.out.println("city.endsWith(\"bul\") = " + city.endsWith("bul")); // true - ends with "bul"

        // Checking end of one string with another string variable
        String str = "asd";
        System.out.println("city.endsWith(str) = " + city.endsWith(str)); // false - "Istanbul" does not end with "asd"

        // Task: Validate an email ending with "@gmail.com"
        // Check if the entered email ends with "@gmail.com" to confirm if it's a valid Gmail account

        String validEmailEnding = "@gmail.com"; // Standard Gmail suffix
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Gmail address:");
        String enteredEmail = input.next();

        // Using endsWith() to verify if the email ends with the specified suffix
        if (enteredEmail.endsWith(validEmailEnding)) {
            System.out.println("Your account has been verified.");
        } else {
            System.out.println("Please enter a valid Gmail account.");
        }

        // Additional Examples:

        // Example 1: Common prefixes and suffixes
        String filePath = "document.pdf";
        System.out.println("Is PDF file: " + filePath.endsWith(".pdf"));       // true - ends with ".pdf"
        System.out.println("Is Word file: " + filePath.endsWith(".docx"));     // false - does not end with ".docx"

        String url = "https://www.example.com";
        System.out.println("Starts with 'https': " + url.startsWith("https")); // true - starts with "https"
        System.out.println("Starts with 'http': " + url.startsWith("http"));   // true - starts with "http"

        // Example 2: Case-sensitive verification for security
        String securePrefix = "secure:";
        String userInput = "secure:12345";
        if (userInput.startsWith(securePrefix)) {
            System.out.println("Valid secure entry.");
        } else {
            System.out.println("Invalid entry. Must start with 'secure:'.");
        }

        // Example 3: Conditional logic based on prefix or suffix
        String text = "HelloWorld.java";
        if (text.endsWith(".java")) {
            System.out.println("It's a Java file.");
        } else if (text.endsWith(".py")) {
            System.out.println("It's a Python file.");
        } else {
            System.out.println("Unknown file type.");
        }

        // Example 4: startsWith() with offset to skip certain characters
        String code = "2023:JavaProgramming";
        System.out.println("code.startsWith(\"Java\", 5): " + code.startsWith("Java", 5)); // true - "Java" starts from index 5

        // Example 5: Validate domain name
        String website = "www.example.com";
        if (website.startsWith("www.")) {
            System.out.println("This is a web address.");
        } else {
            System.out.println("This is not a valid web address.");
        }

        // Example 6: Using startsWith and endsWith together
        String phrase = "The quick brown fox jumps over the lazy dog.";
        if (phrase.startsWith("The") && phrase.endsWith("dog.")) {
            System.out.println("The phrase starts with 'The' and ends with 'dog.'");
        } else {
            System.out.println("The phrase does not match the specified start and end.");
        }

        // Summary:
        // startsWith() and endsWith() methods are powerful for string validation, useful for formats like file extensions,
        // security prefixes, URL validation, and domain checks.
        // These methods simplify conditional checks, ensuring strings match expected patterns or formats.
    }
}
