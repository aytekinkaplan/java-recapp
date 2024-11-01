package j12_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // Array copy... copyOf(arr, newLength); -> copies the first 'newLength' elements of the given array

        int[] numbers = {84, 72, 63, 3, 39, 55, 66, 654, 85, 35};

        int newArr[] = Arrays.copyOf(numbers, 15);

        System.out.println("Arrays.toString(newArr) = " +
                Arrays.toString(newArr));  // Arrays.toString(newArr) = [84, 72, 63, 3, 39, 55, 66, 654, 85, 35, 0, 0, 0, 0, 0]

        // copyOfRange creates a new array with elements from index 5 to 15 of the original array
        int rangeArr[] = Arrays.copyOfRange(numbers, 5, 15);
        System.out.println("Arrays.toString(rangeArr) = " +
                Arrays.toString(rangeArr));  // Arrays.toString(rangeArr) = [55, 66, 654, 85, 35, 0, 0, 0, 0, 0]

        // fill method is used to update the array, filling it with the specified value

        Arrays.fill(rangeArr, 5); // Fills the entire array with 5

        System.out.println("Arrays.toString(rangeArr) = " +
                Arrays.toString(rangeArr)); // Arrays.toString(rangeArr) = [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        // fill a range in the array from index 2 to 7 with the value 0
        Arrays.fill(rangeArr, 2, 7, 0);
        System.out.println("Arrays.toString(rangeArr) = " +
                Arrays.toString(rangeArr)); // Arrays.toString(rangeArr) = [5, 5, 0, 0, 0, 0, 0, 5, 5, 5]
    }
}
