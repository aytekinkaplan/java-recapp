package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
        /*
        Task: Create code that prints the multiplication table for an entered integer.

        Example input = 13
        Output:
        13x1=13
        13x2=26
        ...
        13x10=130
        */

		// Initialize a Scanner object to read user input
		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.println("Enter a number");

		// Read and store the integer input in the variable 'num'
		int num = scan.nextInt();

		// Initialize the counter variable 'i' to 1
		int i = 1;

		// Use a while loop to generate and print the multiplication table up to 10
		while (i <= 10) {
			// Print the multiplication result for the current 'i' value
			System.out.println(num + "x" + i + "=" + (num * i));

			// Increment 'i' by 1 to progress to the next multiplication
			i++;
		}
	}
}
