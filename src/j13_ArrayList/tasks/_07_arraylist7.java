package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _07_arraylist7 {

    /*
        Create a method called common_values().
        It should take two Integer ArrayLists as parameters.
        The return type should be an Integer ArrayList.
        The method should return all the common values from both ArrayLists.

        Example:
        ArrayList 1: 3, 2, 5, 6
        ArrayList 2: 5, 8, 9
        return should be [5]

        Example:
        ArrayList 1: 8, 7, 9, 6, 7
        ArrayList 2: 6, 7, 12, 3, 1
        return should be [6, 7]
     */

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 2, 5, 6));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(5, 8, 9));

        ArrayList<Integer> commonValues = common_values(list1, list2);
        System.out.println("Common values: " + commonValues);
    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> common = new ArrayList<>();

        for (Integer num : list1) {
            if (list2.contains(num) && !common.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }
}
