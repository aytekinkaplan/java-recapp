package j05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TASK 1: Check if the entered number is positive or negative.
        System.out.print("Enter a number to check if it's positive or negative: ");
        int number = scanner.nextInt();
        String result = number > 0 ? "The number you entered is positive." : "The number you entered is negative.";
        System.out.println(result);

        // TASK 2: Check if the next-entered number is positive or negative.
        System.out.print("Enter another number to check if it's positive or negative: ");
        int newNumber = scanner.nextInt();
        System.out.println(newNumber > 0 ? "The number you entered is positive." : "The number you entered is negative.");

        // TASK 3: Find the absolute value of a number.
        System.out.print("Enter a number to find its absolute value: ");
        int absoluteNum = scanner.nextInt();
        int absoluteValue = absoluteNum > 0 ? absoluteNum : -absoluteNum;
        System.out.println("The absolute value of " + absoluteNum + " is " + absoluteValue);

        // TASK 4: Check if two numbers are of the same sign. If they are, multiply them; if not, indicate they can't be multiplied.
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        String sameSignResult = ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0))
                ? "The numbers are the same sign. Their product is " + (num1 * num2)
                : "The numbers are not the same sign. They can't be multiplied.";
        System.out.println(sameSignResult);

        // TASK 5: Check if the entered number is odd or even.
        System.out.print("Enter a number to check if it's odd or even: ");
        int numToCheckOddEven = scanner.nextInt();
        String oddOrEven = (numToCheckOddEven % 2 == 0) ? "The number you entered is even." : "The number you entered is odd.";
        System.out.println(oddOrEven);

        scanner.close();
    }
}
