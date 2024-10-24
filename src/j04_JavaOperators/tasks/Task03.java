package j04_JavaOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Question:
		 * Write a program that takes a three-digit number from the user
		 * and prints the sum of the first and last digits.
		 */
		Scanner scan = new Scanner(System.in);  // Create a Scanner object to get input from the user

		// Prompt the user to enter a three-digit number
		System.out.println("Enter a three-digit number: ");
		int num = scan.nextInt();  // Store the input in the 'num' variable

		// Extract the last digit using the modulo operator (%)
		int lastDigit = num % 10;  // The last digit is the remainder when dividing by 10

		// Extract the first digit by dividing the number by 100
		int firstDigit = num / 100;  // Dividing by 100 gives the first digit for a three-digit number

		// Calculate the sum of the first and last digits
		int sum = lastDigit + firstDigit;

		// Print the result
		System.out.println("The sum of the first and last digits is: " + sum);

		// Close the scanner to prevent resource leaks
		scan.close();
	}
}
