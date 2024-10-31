package j09_Break_Continue;

import java.util.Scanner;

public class C07_Task {
    public static void main(String[] args) {

        // Task: Create code to count occurrences of 'a' in a string up to the first 'c' character.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");

        String ifade = input.nextLine();
        int count = 0;  // Counter to keep track of 'a' occurrences

        // Loop through each character in the string
        for (int i = 0; i < ifade.length(); i++) {
            if (ifade.charAt(i) == 'a') {
                count++;  // Increment count for each 'a'
            }
            if (ifade.charAt(i) == 'c') {
                break;  // Stop the loop if 'c' is encountered
            }
        }
        // Print the result
        System.out.println("Number of 'a' characters before 'c': " + count);

        // Close the scanner to free up resources
        input.close();
    }
}
