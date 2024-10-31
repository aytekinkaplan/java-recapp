package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
        /*
         Task: Create code to print the count of letters, digits, and special characters in a given input string.
         Use a do-while loop.
        */

		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.println("Enter a string:");
		String input = scan.nextLine();

		// Initialize counters for letters, digits, and special characters
		int letterCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		// Initialize an index to iterate over each character in the string
		int i = 0;

		// Use a do-while loop to process each character
		do {
			char ch = input.charAt(i);

			// Check if the character is a letter
			if (Character.isLetter(ch)) {
				letterCount++;
			}
			// Check if the character is a digit
			else if (Character.isDigit(ch)) {
				digitCount++;
			}
			// If it's neither a letter nor a digit, it’s a special character
			else {
				specialCharCount++;
			}

			// Increment index to move to the next character
			i++;
		} while (i < input.length());  // Continue until the end of the string

		// Print the results
		System.out.println("Letters: " + letterCount);
		System.out.println("Digits: " + digitCount);
		System.out.println("Special characters: " + specialCharCount);

		// Close the scanner to free up resources
		scan.close();
	}
}
