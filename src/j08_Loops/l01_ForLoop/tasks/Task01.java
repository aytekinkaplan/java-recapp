package j08_Loops.l01_ForLoop.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        Code to print even numbers between two entered numbers in ascending order.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Determine the start and end of the range based on the input
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        // Loop through the range and print even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
