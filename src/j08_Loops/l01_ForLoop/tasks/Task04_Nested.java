package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Task04_Nested {
    public static void main(String[] args) {
        /*
        This code prints a square matrix with 1s on the main diagonal and 0s elsewhere.

        Example:
        Input: 5
        Output:
        1 0 0 0 0
        0 1 0 0 0
        0 0 1 0 0
        0 0 0 1 0
        0 0 0 0 1
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to create a square matrix: ");
        int size = input.nextInt();

        // Loop to generate the square matrix
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
