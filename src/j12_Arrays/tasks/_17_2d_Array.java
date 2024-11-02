package j12_Arrays.tasks;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Create a 2D int array as follows: [{2, 3, 2}, {4, 1, 5}, {7, 2, 5}]
        Replace all occurrences of 2 with 6.
        Print the modified array.
         */

        int[][] arr = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};

        // Loop through each element to replace 2 with 6
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 2) {
                    arr[i][j] = 6;
                }
            }
        }

        // Print the modified 2D array
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
