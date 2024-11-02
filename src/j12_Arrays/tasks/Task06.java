package j12_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // Task: Create a method that sorts a given int array in descending order and returns it.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] sortedArray = sortDescending(arr);
        System.out.println("Array in descending order: " + Arrays.toString(sortedArray));
    }

    private static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);  // Sort in ascending order first
        int[] descendingArr = new int[arr.length];

        // Fill descendingArr with elements in reverse order
        for (int i = 0; i < arr.length; i++) {
            descendingArr[i] = arr[arr.length - 1 - i];
        }

        return descendingArr;  // Return the sorted array in descending order
    }
}
