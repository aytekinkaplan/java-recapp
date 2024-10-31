package j08_Loops.l02_WhileLoop.tasks;

public class Task04 {

	public static void main(String[] args) {
        /*
        Task: Create a code to print all three-digit numbers that are divisible by both 4 and 6,
        in descending order. Also, print how many such numbers there are.
        */

		// Initialize a counter-variable to count numbers meeting the condition
		int count = 0;

		// Initialize 'i' to the largest three-digit number, 999
		int i = 999;

		// Loop to check each number from 999 down to 100
		while (i >= 100) {
			// Check if 'i' is divisible by both 4 and 6
			if (i % 4 == 0 && i % 6 == 0) {
				// Print the number if it meets the condition
				System.out.print(i + " ");

				// Increment the count of numbers that meet the condition
				count++;
			}
			// Decrement 'i' to check the next number
			i--;
		}

		// Print the total count of numbers that met the condition
		System.out.println("\nTotal count: " + count);
	}
}
