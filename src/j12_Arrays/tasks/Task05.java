package j12_Arrays.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        // Task: Print the reverse of a given integer.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int temp = num;
        int reverse = 0;

        // Loop to reverse the integer
        while (temp > 0) {
            int digit = temp % 10;           // Extract the last digit
            reverse = reverse * 10 + digit;   // Append it to the reversed number
            temp /= 10;                      // Remove the last digit from temp
        }

        System.out.println("Reversed integer: " + reverse);
    }
}
