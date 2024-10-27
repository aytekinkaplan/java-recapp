package j07_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
         The charAt() method returns the character at the specified index.
         The index value starts at 0 for the first character of the string.
        */

        String city = "Istanbul";

        // Task 1: Find and print the first character of the city variable
        System.out.println("city.charAt(0) = " + city.charAt(0)); // city.charAt(0) = I

        // Task 2: Find and print the character at index 1 of the city variable
        System.out.println("city.charAt(1) = " + city.charAt(1)); // city.charAt(1) = s
        char cityFirstIndexChar = city.charAt(1);
        System.out.println("cityFirstIndexChar = " + cityFirstIndexChar); // cityFirstIndexChar = s

        // Task 3: Find and print the last character by calculating the index of the last character
        int lastCharIndex = city.length() - 1;
        System.out.println("lastCharIndex = " + lastCharIndex); // lastCharIndex = 7
        System.out.println("city.charAt(lastCharIndex) = " + city.charAt(lastCharIndex)); // city.charAt(lastCharIndex) = l

        // Assign the last character to a variable and print it
        char lastChar = city.charAt(lastCharIndex);
        System.out.println("lastChar = " + lastChar); // lastChar = l

        // Uncommenting the following line will cause an error, as the index is out of bounds
        // System.out.println("city.charAt(21) = " + city.charAt(21));
        // Runtime Error: java.lang.StringIndexOutOfBoundsException: String index out of range: 21

        // Task 4: Print the middle character of a user-input city name
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a city name:");
        String city2 = input.nextLine();

        if (city2.length() % 2 == 0) { // Even number of characters means no single middle character
            System.out.println("Your city has no middle character.");
        } else { // Odd number of characters means a middle character exists
            int middleIndex = city2.length() / 2;
            System.out.println("Middle character of your city: " +
                    city2.charAt(middleIndex));
        }

        // Additional Examples

        // Example 1: Getting the first and last characters of a string
        String word = "Programming";
        System.out.println("First character: " + word.charAt(0)); // First character: P
        System.out.println("Last character: " + word.charAt(word.length() - 1)); // Last character: g

        // Example 2: Using charAt() in a loop to print each character of the string
        System.out.println("Characters in the word:");
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " "); // Prints each character separated by a space
        }
        System.out.println(); // For a newline after the loop output

        // Example 3: Converting characters to uppercase and checking vowels
        System.out.println("Vowels in the word:");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) { // Checking if character is a vowel
                System.out.print(Character.toUpperCase(ch) + " ");
            }
        }
        System.out.println();

        // Example 4: Finding the position of a character in a string
        String sentence = "Learning Java is fun!";
        char searchChar = 'J';
        int position = sentence.indexOf(searchChar);
        if (position != -1) {
            System.out.println("The character '" + searchChar + "' is at index: " + position);
        } else {
            System.out.println("The character '" + searchChar + "' is not in the sentence.");
        }
    }
}
