package j12_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /*
       Task: Shift all elements of a given array one position to the left.
       Input: [1, 2, 3]
       Output: [2, 3, 1]
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        // Shift elements one position to the left
        int firstElement = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = firstElement; // Place the first element at the end

        System.out.println("Array after shifting left: " + Arrays.toString(arr));
    }
}
