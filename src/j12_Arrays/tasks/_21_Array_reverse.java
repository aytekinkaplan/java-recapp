package j12_Arrays.tasks;

import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Reverse the digits of an entered integer, such as 123.
        Example:
        Input: 123
        Output: 321
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse = 0;

        // Loop to reverse the digits
        while (number > 0) {
            int lastDigit = number % 10;       // Extract the last digit
            reverse = reverse * 10 + lastDigit; // Append it to the reversed number
            number /= 10;                      // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reverse);
    }
}
