package j12_Arrays.tasks;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

        /*
        Given an array, return a new array where all zeros are grouped at the beginning,
        and the order of non-zero numbers does not matter.

        Example:
        Input: {1, 0, 0, 1, 0}
        Output: {0, 0, 0, 1, 1}
         */

        int[] arr = {1, 0, 0, 1, 0};
        int[] result = moveZerosToFront(arr);

        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZerosToFront(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        // Place all zeros at the start of the result array
        for (int num : arr) {
            if (num == 0) {
                result[index++] = 0;
            }
        }

        // Place non-zero elements after the zeros
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
