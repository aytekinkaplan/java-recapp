package j04_JavaOperators.tasks;

import java.util.Scanner;

public class _22_ComparisonOperators_not_equal2 {

    public static void main(String[] args) {

        /*
        This task demonstrates how to verify if two strings are not equal in Java.
        
        Important Note:
        - In Java, you should not use the `!=` operator to compare the **values** of two strings.
        - The `!=` operator checks if two string **references** point to different memory locations.
        - To compare the **contents** of two strings, use the `.equals()` method or `!str1.equals(str2)` for not equal.
        
        Goal:
        - Create two strings.
        - Check if the first string is not equal to the second string using the `.equals()` method.
        - Print `true` if they are not equal, and `false` if they are equal.
        */

        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter first String: ");
        String str1 = scan.nextLine();  // Using nextLine to read the entire string including spaces

        // Prompt the user to enter the second string
        System.out.println("Enter second String: ");
        String str2 = scan.nextLine();  // Using nextLine to read the entire string including spaces

        // Use the .equals() method to compare the two strings for equality and invert it with '!'
        boolean notEqual = !str1.equals(str2);

        // Print the result: true if the strings are not equal, false otherwise
        System.out.println("Are the two strings not equal? " + notEqual);

        // Close the scanner to prevent resource leaks
        scan.close();
    }
}
