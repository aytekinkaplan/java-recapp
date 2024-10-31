package j09_Break_Continue;

import java.util.Scanner;

public class C02_continue {
    public static void main(String[] args) {
        /*
        Task: Create code that handles spaces in an email address, skipping them when printing.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");

        // Capture the user's email input
        String mail = input.nextLine();
        System.out.println("Your entered email is: " + mail);

        // Loop through each character in the email
        for (int i = 0; i < mail.length(); i++) {
            char ch = mail.charAt(i);

            // Check if the character is a space
            if (ch == ' ') {
                // Skip this iteration if a space is found
                continue;
            }
            // Print each character except spaces
            System.out.print(ch);
        }

        // Close the scanner to free up resources
        input.close();
    }
}
