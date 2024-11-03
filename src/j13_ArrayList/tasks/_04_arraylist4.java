package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _04_arraylist4 {

    /*
        Create a method named `changeInArraylist()` that:
        - Accepts an `ArrayList<String>`, and two `String` parameters, `s1` and `s2`.
        - Replaces all occurrences of `s1` in the ArrayList with `s2`.

        Example:
        Input: ArrayList = ["yellow", "red", "blue", "red", "blue"], s1 = "blue", s2 = "yellow"
        Output: ["yellow", "red", "yellow", "red", "yellow"]
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        System.out.println("Original list: " + list);

        ArrayList<String> updatedList = changeInArraylist(list, "blue", "yellow");
        System.out.println("Updated list: " + updatedList);
    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> list, String s1, String s2) {
        // Loop through each element in the list and replace occurrences of `s1` with `s2`
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s1)) {
                list.set(i, s2);
            }
        }
        return list;
    }
}
