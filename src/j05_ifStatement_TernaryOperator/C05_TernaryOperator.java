package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK -> Check if the entered integer is even. If so, print half of it.
        // Otherwise, print "The entered number is odd, so its half is not an integer."

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(number > 0
                ? (number % 2 == 0
                ? "The number you entered is even and its half is " + (number / 2) + "."
                : "The number you entered is odd, so its half is not an integer.")
                : "The number you entered is negative.");

        scanner.close();
    }
}
