package j12_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // Task: Print the count of elements in an integer array that are greater than the average value of the array.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        int count = 0;
        double sum = 0;

        // Calculate the sum of elements in the array
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average
        double avg = sum / size;
        System.out.println("Average: " + avg);

        // Count elements greater than the average
        for (int num : arr) {
            if (num > avg) {
                count++;
            }
        }

        System.out.println("The number of elements greater than the average: " + count);
    }
}
