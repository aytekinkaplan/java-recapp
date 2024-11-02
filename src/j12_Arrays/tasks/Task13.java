package j12_Arrays.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK:
         Create a Java code to count and print the number of elements in an 8-element array that are divisible by 3.
         (Including negative numbers)
         */

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];  // Fixed size of 8 elements

        System.out.println("Enter 8 elements of the array: ");
        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }

        System.out.println("Number of elements divisible by 3: " + count);
    }
}
