package j08_Loops.l03_DoWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        // Task: Prompt the user to enter a number.
        // If the number is less than 17, print "kazandınız" (you win).
        // Otherwise, keep prompting for a new number.

        Scanner input = new Scanner(System.in);
        int sayi;

        // Use a do-while loop to ensure at least one input attempt
        do {
            System.out.println("Enter a number:");
            sayi = input.nextInt();

        } while (sayi >= 17); // Continue the loop if the number is 17 or greater

        // Print the success message once the user enters a number less than 17
        System.out.println("kazandınız");

        // Close the scanner to free up resources
        input.close();
    }
}
