package j07_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        /*
         * substring() Method:
         * Allows access to a specific part or the entirety of a string based on given indices. Returns a new substring.
         * - substring(startIndex): Returns a substring from the specified start index to the end of the string.
         * - substring(startIndex, endIndex): Returns a substring from the startIndex to the endIndex (exclusive).
         *   - startIndex is inclusive, meaning it includes the character at that position.
         *   - endIndex is exclusive, meaning it does not include the character at that position.
         */

        String str = "The more I learn, the more I realize I don't know";

        // Example 1: Substring from a range (startIndex, endIndex)
        System.out.println("str.substring(0, 5) = " + str.substring(0, 5)); // Output: "The m"

        // Example 2: Substring from a startIndex to the end
        System.out.println("str.substring(10) = " + str.substring(10)); // Output: "learn, the more I realize I don't know"

        // Task 1: Print the last 12 characters of str
        int lastTwelveIndex = str.length() - 12;
        System.out.println("Last 12 characters: " + str.substring(lastTwelveIndex)); // Output: "I don't know"

        // Task 2: Print the first 10 characters of str
        System.out.println("First 10 characters: " + str.substring(0, 10)); // Output: "The more I"

        // Task 3: Print only the first character of str
        System.out.println("First character: " + str.substring(0, 1)); // Output: "T"

        // Task 4: Reverse a 4-letter word entered by the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-letter word:");

        String word = input.next();

        if (word.length() != 4) {
            System.out.println("Incorrect input. Please enter a 4-letter word.");
        } else {
            System.out.print("Reversed word: ");
            System.out.print(word.substring(3));             // Last character
            System.out.print(word.charAt(2));                // Third character
            System.out.print(word.substring(1, 2));          // Second character
            System.out.println(word.substring(0, 1));        // First character
        }

        // Additional Examples

        // Example 5: Extracting the domain from an email address
        String email = "user@example.com";
        int atIndex = email.indexOf('@');
        String domain = email.substring(atIndex + 1);
        System.out.println("Domain: " + domain); // Output: "example.com"

        // Example 6: Extracting the file name without the extension
        String fileName = "report2023.pdf";
        int dotIndex = fileName.indexOf('.');
        String fileWithoutExtension = fileName.substring(0, dotIndex);
        System.out.println("File without extension: " + fileWithoutExtension); // Output: "report2023"

        // Example 7: Splitting a phrase into words and accessing each word using substring
        String phrase = "Learning Java is fun";
        int firstSpace = phrase.indexOf(" ");
        int secondSpace = phrase.indexOf(" ", firstSpace + 1);
        int thirdSpace = phrase.indexOf(" ", secondSpace + 1);

        String word1 = phrase.substring(0, firstSpace);
        String word2 = phrase.substring(firstSpace + 1, secondSpace);
        String word3 = phrase.substring(secondSpace + 1, thirdSpace);
        String word4 = phrase.substring(thirdSpace + 1);

        System.out.println("Words in phrase:");
        System.out.println("1st Word: " + word1); // Output: "Learning"
        System.out.println("2nd Word: " + word2); // Output: "Java"
        System.out.println("3rd Word: " + word3); // Output: "is"
        System.out.println("4th Word: " + word4); // Output: "fun"

        // Example 8: Extracting specific portions of a text
        String text = "Date: 2023-10-27, Event: Halloween Party";
        int dateStart = text.indexOf("2023");
        int dateEnd = text.indexOf(",", dateStart);
        String date = text.substring(dateStart, dateEnd);

        System.out.println("Extracted Date: " + date); // Output: "2023-10-27"

        // Summary:
        // The substring() method is versatile and can be used to isolate parts of a string, extract specific data,
        // and even reverse text in creative ways. The ability to specify start and end indices gives precise control
        // over the text manipulation process.
    }
}
