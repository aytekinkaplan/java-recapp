package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
         Task 01:
         Create a program that checks if the entered number is positive, negative, or zero.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Using nested ternary operator to check the sign of the number
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        // Printing the result
        System.out.println("The entered number is: " + result);

        // Closing the Scanner to free up resources
        input.close();
    }
}
