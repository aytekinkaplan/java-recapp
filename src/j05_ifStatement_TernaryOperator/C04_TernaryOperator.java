package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TASK 1: Check if the entered number is positive or negative.
        System.out.print("Enter a number to check if it's positive or negative: ");
        int number = input.nextInt();
        String result = number > 0 ? "The number you entered is positive." : "The number you entered is negative.";
        System.out.println(result);

        // TASK 2: Check if the next-entered number is positive or negative.
        System.out.print("Enter another number to check if it's positive or negative: ");
        int newNumber = input.nextInt();
        System.out.println(newNumber > 0 ? "The number you entered is positive." : "The number you entered is negative.");

        // TASK 3: Find the absolute value of a number.
        System.out.print("Enter a number to find its absolute value: ");
        int absoluteNum = input.nextInt();
        int absoluteValue = absoluteNum > 0 ? absoluteNum : -absoluteNum;
        System.out.println("The absolute value of " + absoluteNum + " is " + absoluteValue);

        input.close();
    }
}
