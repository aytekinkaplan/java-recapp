package j04_JavaOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Take a three-digit number from the user
         * and print its digits as ones (units), tens, and hundreds.
         *
         * Example: Input: 853
         * Output: The ones place of the number you entered: 3
         *         The tens place of the number you entered: 5
         *         The hundreds place of the number you entered: 8
         */

        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a three-digit number
        System.out.println("Enter a three-digit number: ");
        int num = scan.nextInt();

        // Extract the digits
        int onesPlace = num % 10;        // The ones place (last digit)
        int hundredsPlace = num / 100;   // The hundreds place (first digit)
        int tensPlace = (num / 10) % 10; // The tens place (second digit)

        // Print the results
        System.out.println("The ones place of the number you entered: " + onesPlace);
        System.out.println("The tens place of the number you entered: " + tensPlace);
        System.out.println("The hundreds place of the number you entered: " + hundredsPlace);

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}
