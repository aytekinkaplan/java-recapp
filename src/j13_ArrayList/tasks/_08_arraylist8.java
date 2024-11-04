package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        Create a method called secondMax().
        The method should take an Integer ArrayList as a parameter.
        The return type should be int.
        Find and return the second-highest value in the ArrayList.

        Example:
        ArrayList --  5,3,4,6,7
        ANSWER: 6
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 3, 4, 6, 7));
        System.out.println("The second maximum value is: " + secondMax(list));
    }

    private static int secondMax(ArrayList<Integer> list) {
        // Sort the list in ascending order
        Collections.sort(list);

        // Get the second-highest value, which is at the second-to-last index after sorting
        int maxSecond = list.get(list.size() - 2);

        return maxSecond;
    }
}
