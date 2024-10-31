package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
        /*
        Task: Create code to print all characters from the first letter of the first name
        to the last letter of the surname, separated by spaces.
        */

		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter their first name
		System.out.println("Enter your name: ");
		String name = scan.nextLine();

		// Prompt the user to enter their surname
		System.out.println("Enter your surname: ");
		String surname = scan.nextLine();

		// Concatenate the first name and surname with a space between them
		String fullName = name + " " + surname;

		// Initialize index 'i' to iterate over each character in 'fullName'
		int i = 0;

		// Loop through each character in the full name string
		while (i < fullName.length()) {
			// Print each character followed by a space
			System.out.print(fullName.charAt(i) + " ");
			i++;
		}

		// Close the scanner to free up resources
		scan.close();
	}
}
