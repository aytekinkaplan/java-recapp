package j12_Arrays.tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task: Prompt the user to enter 5 numbers, then print them in reverse order.

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        // Collecting 5 numbers from the user
        System.out.println("Please enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Printing the numbers in reverse order
        System.out.print("Numbers in reverse order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
