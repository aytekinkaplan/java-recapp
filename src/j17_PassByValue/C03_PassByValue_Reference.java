package j17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue_Reference {
    public static void main(String[] args) {

        /*
        In Java, non-primitive data types (e.g., Class, Array, List) are passed by value,
        but the value is actually a reference to the object.
        This means that if we change the data within the object (e.g., elements in a list),
        the changes are permanent, even outside the method, because the original object is modified.
         */

        // Task: Create a code that updates the elements of the list [24, 20, 87] in two different methods:
        //      1. Method -> using for-each loop 2. Method -> using set(index, value)
        List<Integer> list = new ArrayList<>(Arrays.asList(24, 20, 87));

        System.out.println("List before operations = " + list);  // Expected: [24, 20, 87]

        // First method: Attempt to update elements using a for-each loop
        listUpdate1(list);
        System.out.println("After calling listUpdate1");

        // Second method: Update elements using set(index, value)
        listUpdate2(list);
        System.out.println("After calling listUpdate2");

        System.out.println("List after operations = " + list);  // Expected: [48, 40, 174]
    }

    // Method that attempts to modify list elements with a for-each loop (will not work as expected)
    private static void listUpdate1(List<Integer> list) {
        for (Integer w : list) {
            w += 2; // This changes only the local copy of each element, not the actual list
        }
        System.out.println("Inside listUpdate1 method, list = " + list); // Expected: [24, 20, 87]
    }

    // Method that modifies list elements using set(index, value)
    private static void listUpdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2); // This modifies the actual elements in the list
        }
        System.out.println("Inside listUpdate2 method, list = " + list); // Expected: [48, 40, 174]
    }
}
