package j12_Arrays.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Create code that prints the odd elements of a 7-element integer array entered by the user.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");

        // Getting the array elements from the user
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Odd elements of the array: ");

        // Using ternary to print only odd numbers
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] % 2 != 0 ? arr[i] + " is odd" : ""); // Even numbers are skipped
        }

        scanner.close();
    }
}
