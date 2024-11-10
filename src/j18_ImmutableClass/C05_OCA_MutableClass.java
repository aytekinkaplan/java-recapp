package j18_ImmutableClass;

import java.util.ArrayList;

public class C05_OCA_MutableClass {
    public static void main(String[] args) {

        // Creating a mutable ArrayList of Integers
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("Initial values = " + values); // Expected: []

        // Adding elements to the ArrayList
        values.add(4); // Adding 4 to the list
        values.add(5); // Adding 5 to the list

        // Updating an element in the ArrayList
        values.set(1, 6); // Replacing the element at index 1 (5) with 6

        // Removing an element from the ArrayList
        values.remove(0); // Removing the element at index 0 (4)

        // Using a for-each loop to print each element in the ArrayList
        for (Integer w : values) {
            System.out.println(w);
        }

        // Final state of the ArrayList
        System.out.println("Final values = " + values); // Expected: [6]
    }
}
