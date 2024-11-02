package j12_Arrays.tasks;

import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        Create an int array (intArr).
        Return true if the array does not contain both 1 and 4.
        Return false if the array contains both 1 and 4.

        Examples:
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        Sample array: 1, 2, 3, 4
        Expected result: false
        If changed to 1, 2, 3, expected result: true.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements for the int array: ");

        int[] intArr = new int[input.nextInt()];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = input.nextInt();
        }

        System.out.println(no14(intArr));
    }

    private static boolean no14(int[] intArr) {
        boolean hasOne = false;
        boolean hasFour = false;

        // Check for the presence of 1 and 4 in the array
        for (int num : intArr) {
            if (num == 1) {
                hasOne = true;
            }
            if (num == 4) {
                hasFour = true;
            }
        }

        // Return true if the array does not contain both 1 and 4 at the same time
        return !(hasOne && hasFour);
    }
}
