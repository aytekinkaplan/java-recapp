package j12_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Task: Create an int array based on user input and print the sum of its elements.

        Scanner input = new Scanner(System.in);

        System.out.print("How many elements do you want in the array? ");
        int size = input.nextInt();

        int[] arr = new int[size]; // Define the array with the specified size
        int sum = 0;

        // Populate the array with user input and calculate the sum
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            arr[i] = input.nextInt(); // Assign user input to each element
            sum += arr[i];            // Add the element value to the sum
        }

        System.out.println("Your array: " + Arrays.toString(arr)); // Display the array
        System.out.println("Sum of elements: " + sum);             // Display the sum
    }
}
