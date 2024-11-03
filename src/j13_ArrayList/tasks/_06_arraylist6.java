package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
        Create a method named `hillNum()` that:
        - Accepts an `ArrayList<Integer>` as a parameter.
        - Returns an `int`.
        - If a number in the list is smaller than the previous number and larger than the next number,
          it prints that number.

        Example:
        Input: [5, 4, 6, 2, 1]
        Explanation: 2 is smaller than 6 and larger than 1.
        Output: 2
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 4, 6, 2, 1));
        System.out.println("Hill number: " + hillNum(list)); // Expected output: 2
    }

    public static int hillNum(ArrayList<Integer> list) {
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i - 1) && list.get(i) > list.get(i + 1)) {
                return list.get(i); // Returns the number that satisfies the condition
            }
        }
        return -1; // Return -1 if no such element exists
    }
}
