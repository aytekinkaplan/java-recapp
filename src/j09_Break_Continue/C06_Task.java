package j09_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        // Task: Sum of 7 integers entered by the user, excluding those between 10 and 20.

        Scanner input = new Scanner(System.in);

        int sum = 0;     // Variable to store the sum of valid numbers
        int count = 0;   // Counter to track the number of inputs

        while (count < 7) {  // Loop until 7 numbers are entered
            System.out.println("Enter a number:");
            int num = input.nextInt();

            // Check if the number is between 10 and 20 (inclusive)
            if (num >= 10 && num <= 20) {
                count++;      // Increment the count to progress towards 7 inputs
                continue;     // Skip adding this number to the sum
            }

            // Add the number to the sum if it's outside the 10-20 range
            sum += num;
            count++;
        }

        // Print the result
        System.out.println("The sum of the entered numbers, excluding those between 10 and 20, is: " + sum);

        // Close the scanner to free up resources
        input.close();
    }
}
