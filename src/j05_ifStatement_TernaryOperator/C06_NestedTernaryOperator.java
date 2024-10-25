package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
        TASK:
       Prompt the user to enter a number.
       If the number is greater than or equal to 0,
       check if it is less than 10.

       - If it is less than 10, print "Single Digit".
       - Otherwise, print "Positive Number".

       If the number is less than 0, print "Negative Number".
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = number >= 0
                ? (number < 10 ? "Single Digit" : "Positive Number")
                : "Negative Number";

        System.out.println("Result: " + result);

        // Close the Scanner to free up resources
        input.close();
    }
}
