package j10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {

        /*
        Task: Create a method to check if an input word is a palindrome.
        A palindrome reads the same forward and backward.
        Examples: madam, ada, asa, 121
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine().toLowerCase(); // Convert to lowercase to ignore case

        palindrome(word);
    }

    private static void palindrome(String word) {
        String reverse = ""; // Empty container to store the reverse of the word

        // Loop to build the reverse of the word
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i); // Append each character from the end to the start
        }

        System.out.println("The reverse of the entered word is: " + reverse);

        // Check if the reverse is equal to the original word
        if (reverse.equals(word)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is NOT a palindrome.");
        }
    }
}
