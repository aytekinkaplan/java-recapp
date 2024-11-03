package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        // `Collections.replaceAll(List<T> list, T oldVal, T newVal)` replaces all occurrences of `oldVal` with `newVal` in the list.
        // `Collections.fill(List<T> list, T obj)` sets all elements in the list to the specified object.

        ArrayList<Integer> listNumber = new ArrayList<>(Arrays.asList(1, 2, 1, 5, 1, 4, 3, 66, 99, 55, 88, 35, 34));
        System.out.println("Original listNumber = " + listNumber);
        // Output: listNumber = [1, 2, 1, 5, 1, 4, 3, 66, 99, 55, 88, 35, 34]

        // Example 1: Using `replaceAll` to replace all occurrences of 1 with 111
        System.out.println("Collections.replaceAll(listNumber, 1, 111) = " + Collections.replaceAll(listNumber, 1, 111));
        // Output: Collections.replaceAll(listNumber, 1, 111) = true, since replacements were made

        System.out.println("Updated listNumber after replaceAll = " + listNumber);
        // Output: listNumber = [111, 2, 111, 5, 111, 4, 3, 66, 99, 55, 88, 35, 34]

        // Example 2: Using `fill` to set all elements to a single value
        Collections.fill(listNumber, 33);
        System.out.println("Updated listNumber after fill = " + listNumber);
        // Output: listNumber = [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]
        // Explanation: All elements are replaced with 33
    }
}
