package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _10_arraylist12 {

    /*
        Create a method called rangeBtw().
        It should take an ArrayList and two separate integers as parameters.
        The return type should be int.

        Count how many values in the ArrayList are between the two integers (inclusive).
        Return the count.

        Example:
        ArrayList: 1, 5, 22, 10, 20, 14, 8, 25, 30, 28
        min = 20
        max = 30
        return = 5 (20, 22, 25, 28, 30)
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
        int min = 20;
        int max = 30;
        System.out.println("Count of elements between " + min + " and " + max + " (inclusive): " + rangeBtw(list, min, max));
    }

    private static int rangeBtw(ArrayList<Integer> list, int min, int max) {
        int count = 0;
        for (int num : list) {
            if (num >= min && num <= max) {
                count++;
            }
        }
        return count;
    }
}
