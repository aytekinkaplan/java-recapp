package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {
        // `equals()` checks if two lists have the same elements in the same order and positions.
        // Returns true if both lists are identical in terms of size, elements, and element order, otherwise false.

        // Initializing ArrayLists with initial values for comparison
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b")); // [a, b]
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "b")); // [A, b]
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("a", "b")); // [a, b]
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("b", "a")); // [b, a]

        // Example 1: Comparing lists with different cases and order
        System.out.println("list1.equals(list2) = " + list1.equals(list2));
        // Output: list1.equals(list2) = false, because "a" in list1 is different from "A" in list2

        // Example 2: Comparing lists with identical elements and order
        System.out.println("list1.equals(list3) = " + list1.equals(list3));
        // Output: list1.equals(list3) = true, as both lists have identical elements in the same order

        // Example 3: Comparing lists with identical elements but different order
        System.out.println("list1.equals(list4) = " + list1.equals(list4));
        // Output: list1.equals(list4) = false, because although the elements are the same, the order differs
    }
}
