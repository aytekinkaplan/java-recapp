package j12_Arrays.tasks;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

        /*
        Create an int array, and return a new array of length 2 containing the first and last elements
        of the original array.

        Example input array = [1, 2, 3, 4]
        Expected output = [1, 4]
        */

        int[] originalArray = {1, 2, 3, 4};

        // Check if the array has at least two elements
        if (originalArray.length >= 2) {
            int[] newArray = {originalArray[0], originalArray[originalArray.length - 1]};
            System.out.println("Result: " + Arrays.toString(newArray));
        } else {
            System.out.println("Array must have at least two elements.");
        }
    }
}
