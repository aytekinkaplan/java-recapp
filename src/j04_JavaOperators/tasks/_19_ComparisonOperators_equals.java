package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _19_ComparisonOperators_equals {

    public static void main(String[] args) {

        /*
        This task demonstrates how to compare two strings in Java using the `.equals()` method.
        
        Goal:
        - Create two strings.
        - Check if the first string is equal to the second string using the `.equals()` method.
        - Print `true` if they are equal, and print `false` if they are not.
        */

        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.println("Enter first String: ");
        String str1 = scan.next();  // Reading the first string from user

        // Prompt the user for the second string
        System.out.println("Enter second String: ");
        String str2 = scan.next();  // Reading the second string from user

        // Use the .equals() method to compare the two strings
        boolean areStringsEqual = str1.equals(str2);

        // Print the result of the comparison
        System.out.println("Are the two strings equal? " + areStringsEqual);

        // Close the scanner to prevent resource leak
        scan.close();
    }
}
