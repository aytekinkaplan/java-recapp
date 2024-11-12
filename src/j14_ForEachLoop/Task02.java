package j14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        /* TASK:
           Create a method that changes the sign of each element in an integer array.
           int [] arr =  { 1, 2, -3, 4, -5, -6 };
           Output: -1, -2, 3, -4, 5, 6
         */

        int[] arr = {1, 2, -3, 4, -5, -6};

        System.out.println("Modified list: " + changeSignList(arr));
        System.out.print("Modified array elements: ");
        printChangedSign(arr);
    }

    // Method to change signs and return a list with modified values
    private static List<Integer> changeSignList(int[] array) {
        List<Integer> modifiedList = new ArrayList<>();
        for (int each : array) {
            modifiedList.add(-each); // Changing the sign
        }
        return modifiedList;
    }

    // Method to print array elements with changed signs
    private static void printChangedSign(int[] array) {
        for (int each : array) {
            System.out.print(-each + " "); // Changing the sign and printing
        }
        System.out.println();
    }
}
