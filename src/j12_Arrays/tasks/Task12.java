package j12_Arrays.tasks;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        /*
         TASK:
         Given an int array, create code to print the squares of each element.
         Example: {2, 6, 4, 5, 8, 9}
         Output: {4, 36, 16, 25, 64, 81}
        */

        int[] arr = {2, 6, 4, 5, 8, 9};
        int[] squaresArray = new int[arr.length]; // Array to store the squares

        for (int i = 0; i < arr.length; i++) {
            squaresArray[i] = arr[i] * arr[i]; // Calculate the square of each element
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Squares of the elements: " + Arrays.toString(squaresArray));
    }
}
