package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
         Task:
         Create a program that checks if the first character of a given input is a letter.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phrase: ");

        char firstCharacter = input.next().charAt(0); // Get the first character of the input string

        // Check if the first character is a letter (using ASCII values)
        if ((firstCharacter >= 'A' && firstCharacter <= 'Z') || (firstCharacter >= 'a' && firstCharacter <= 'z')) {
            System.out.println("The first character '" + firstCharacter + "' is a letter.");
        } else {
            System.out.println("The first character '" + firstCharacter + "' is not a letter.");
        }

        // Close the Scanner to free up resources
        input.close();
    }
}
