package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        Task: Create a square multiplication table of a given size, as defined by the user's input.

        Example Output:
        If the user enters 5, the output should be:

        1   2   3   4   5
        2   4   6   8   10
        3   6   9   12  15
        4   8   12  16  20
        5   10  15  20  25

        Explanation:
        Each row represents the multiples of the row index, with each column incrementing by the row index.
         */

        // Create a Scanner object to read user input for the size of the table
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square multiplication table: ");
        int size = scanner.nextInt();  // Store the input size for the table

        // Outer loop to iterate through each row of the table
        for (int i = 1; i <= size; i++) {
            // Inner loop to iterate through each column of the table
            for (int j = 1; j <= size; j++) {
                // Print the product of the row index (i) and column index (j)
                // Use "\t" for tab spacing to align columns properly
                System.out.print((i * j) + "\t");
            }
            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
