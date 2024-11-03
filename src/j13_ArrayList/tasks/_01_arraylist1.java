package j13_ArrayList.tasks;

import java.util.ArrayList;

public class _01_arraylist1 {

    /*
        Create a method named `getCount()` that:
        - Accepts an `ArrayList<String>` and a `String` as parameters.
        - Returns an `int` indicating the number of times the specified string occurs in the list.

        Example:
        ArrayList = [Orange, Kiwi, Peach, Banana, Orange]
        String = "Orange"
        Output: 2 (since "Orange" appears twice in the list)
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Kiwi");
        list.add("Peach");
        list.add("Banana");
        list.add("Orange");

        System.out.println(getCount(list, "Orange")); // Output: 2
        System.out.println(getCount(list, "Kiwi"));   // Output: 1
        System.out.println(getCount(list, "Peach"));  // Output: 1
        System.out.println(getCount(list, "Banana")); // Output: 1
        System.out.println(getCount(list, "Apple"));  // Output: 0
    }

    public static int getCount(ArrayList<String> list, String str) {
        int count = 0;
        // Loop through each element in the list and check for matches with `str`
        for (String element : list) {
            if (element.equals(str)) {
                count++;
            }
        }
        return count;
    }
}
