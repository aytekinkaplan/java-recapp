package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TASK: Ask the user which letter's meaning they want to know in the acronym "VIP" (Very Important Person)
		// and print the explanation for the entered letter.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a letter from 'VIP' to know its meaning: ");
		char letter = scanner.next().toUpperCase().charAt(0);

		// Using switch to display the meaning of each letter in VIP
		switch (letter) {
			case 'V':
				System.out.println("V stands for 'Very'.");
				break;
			case 'I':
				System.out.println("I stands for 'Important'.");
				break;
			case 'P':
				System.out.println("P stands for 'Person'.");
				break;
			default:
				System.out.println("Invalid entry. Please enter a letter from 'VIP'.");
				break;
		}

		scanner.close();
	}
}
