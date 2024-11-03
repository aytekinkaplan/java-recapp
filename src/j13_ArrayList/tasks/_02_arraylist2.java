package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2 {

    /*
        Create a method named `getSum()` that:
        - Accepts an `ArrayList<Integer>` as a parameter.
        - Returns an `int` which is the sum of all numbers in the list.

        Example:
        ArrayList = [1, 2, 3, 4, 5]
        Output: 15 (since 1 + 2 + 3 + 4 + 5 = 15)
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("The sum is: " + getSum(list)); // Expected output: 15
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        // Loop through each element in the list and add it to `sum`
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
