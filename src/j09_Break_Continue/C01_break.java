package j09_Break_Continue;

import java.util.Scanner;

public class C01_break {
    public static void main(String[] args) {

        /*
        Task: Create code that prints all characters in an email address up to the '@' symbol.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");

        // Capture the user input email address
        String mail = input.nextLine();

        // Loop through each character in the email
        for (int i = 0; i < mail.length(); i++) {
            // Check if the character is '@'
            if (mail.charAt(i) == '@') {
                // Break the loop if '@' is encountered
                break;
            }
            // Print each character before '@'
            System.out.print(mail.charAt(i));
        }

        // Close the scanner to free up resources
        input.close();
    }
}
