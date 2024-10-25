package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        TASK:
        - If the entered positive integer is a 4-digit number, print "4 digits".
        - If it is not a 4-digit number, check if it is even or odd.
            - If it is even, print "Non-4-digit even number".
            - If it is odd, print "Non-4-digit odd number".
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Nested ternary operator to evaluate the number
        String result = (number >= 1000 && number <= 9999)
                ? "4 digits"
                : (number % 2 == 0 ? "Non-4-digit even number" : "Non-4-digit odd number");

        System.out.println(result);

        scanner.close();
    }
}
