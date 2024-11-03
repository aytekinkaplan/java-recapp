package j13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        // The `subList(int fromIndex, int toIndex)` method returns a view of the portion of this list
        // between the specified `fromIndex`, inclusive, and `toIndex`, exclusive.

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 1: Extracting a sublist from index 3 to 5
        System.out.println("country.subList(3, 5) = " + country.subList(3, 5));
        // Output: country.subList(3, 5) = [UGANDA, ITALYA]
        // Explanation: `subList(3, 5)` includes elements from index 3 to index 4 (5 is exclusive).

        // Example 2: Creating a new list from a sublist of the original list
        ArrayList<String> yeniList = new ArrayList<>(country.subList(2, 5));
        System.out.println("yeniList = " + yeniList);
        // Output: yeniList = [POLONYA, UGANDA, ITALYA]
        // Explanation: `subList(2, 5)` includes elements from index 2 to index 4, creating a sublist of the original list.

        // Example 3: Attempting to access an out-of-bounds sublist
        // Uncommenting the line below will throw an `IndexOutOfBoundsException` because index 6 is beyond the list's bounds.
        // System.out.println("country.subList(3, 6) = " + country.subList(3, 6));
    }
}
