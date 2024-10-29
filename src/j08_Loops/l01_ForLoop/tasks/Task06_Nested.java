package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Task06_Nested {
    public static void main(String[] args) {
        /*
        Task: Print a triangle pattern based on the user-defined size.

        Example Output for size = 4:

        *
        * *
        * * *
        * * * *
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int size = input.nextInt();

        // Outer loop controls the number of rows
        for (int i = 1; i <= size; i++) {
            // Inner loop controls the number of asterisks per row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
