package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String result;

        // Check if the number is positive or negative
        if (num > 0) {
            if (num % 2 == 0) { // Check if the number is even
                result = (num >= 10) ? "Even number equal to or greater than 10" : "Even number";
            } else { // The number is odd
                result = (num > 10) ? "Odd number greater than 10" : "Odd number";
            }
        } else {
            result = "Negative number";
        }

        // Print the result to the console
        System.out.println(result);

        // Close the Scanner object to free up resources
        input.close();
    }
}
