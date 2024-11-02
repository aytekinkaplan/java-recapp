package j12_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        Create a method that changes the sign of each element in an int array.
        Example:
        input : 1, 2, -3, 4, -5, -6
        output: -1, -2, 3, -4, 5, 6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        // Call the method to change signs and print the result
        int[] changedArray = changeSigns(arr);
        System.out.println("Array with signs changed: " + Arrays.toString(changedArray));
    }

    // Method to change the sign of each element in the array
    private static int[] changeSigns(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i]; // Negates each element, flipping its sign
        }
        return arr;
    }
}
