package j08_Loops.l02_WhileLoop.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        Task: Create code that continuously prints "javaCAN" until the character 'x' is entered.
        When 'x' is entered, print "jAVATAR" and end the program.
        */

        Scanner scanner = new Scanner(System.in);
        String str = "javaCAN";
        String exitMessage = "jAVATAR";
        char input;

        do {
            // Print "javaCAN"
            System.out.println(str);

            // Prompt the user to enter a character
            System.out.println("Enter a character (enter 'x' to stop): ");
            input = scanner.next().charAt(0);

        } while (input != 'x');  // Continue looping until 'x' is entered

        // When 'x' is entered, print "jAVATAR"
        System.out.println(exitMessage);

        // Close the scanner to free up resources
        scanner.close();
    }
}
