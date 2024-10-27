package j07_StringManipulations.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/* TASK:
		   Given a string, print the first half of the string.
	       EXAMPLE:
		   INPUT : istanbul
		   OUTPUT: ista
	    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Using substring to get the first half of the string
        String result = str.substring(0, str.length() / 2);

        // Printing the result
        System.out.println("First half of the string: " + result);
    }
}
