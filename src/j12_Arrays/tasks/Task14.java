package j12_Arrays.tasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK:
        Write a method which accepts a string as a parameter and prints the sum of digits
        present in the given string.
        input: "ade1r4d3"
        output: 8
        trick : Use --> Character.isDigit()
                    --> Character.getNumericValue()
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (e.g., ade1r4d3): ");
        String str = scanner.nextLine();
        sumOfDigits(str);
        scanner.close();
    }

    public static void sumOfDigits(String str) {
        int sum = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) { // Check if the character is a digit
                sum += Character.getNumericValue(ch); // Get the numeric value of the digit
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}
