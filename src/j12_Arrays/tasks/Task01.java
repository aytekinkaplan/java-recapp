package j12_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task: Create an int array based on values provided by the user and print it in descending order.

        Scanner input = new Scanner(System.in);

        System.out.print("How many elements do you want in the array? ");
        int size = input.nextInt();

        int[] arr = new int[size]; // The array is created with the specified size.

        // Populate the array with user inputs
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(arr));

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array in descending order
        System.out.print("Array in descending order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
