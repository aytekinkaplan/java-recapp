package j10_MethodCreation.tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task: Create a method that counts the number of digits in a given String.
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();

		int count = countDigits(word); // Call method to count digits
		System.out.println("The number of digits in the word: " + count);
	}

	// Method to count the number of digits in the input string
	private static int countDigits(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			// Check if each character is a digit
			if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
				count++;
			}
		}
		return count;
	}
}
