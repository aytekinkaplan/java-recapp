package j13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_sort_reverse {
    public static void main(String[] args) {
        // `Collections.sort(List<T>)` sorts the list in natural (ascending) order.
        // `Collections.reverse(List<T>)` reverses the order of elements in the list based on their current positions.

        // Initializing an ArrayList with initial values using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("Original country list = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 1: Sorting the list in natural (alphabetical) order
        Collections.sort(country);
        System.out.println("Sorted country list = " + country);
        // Output: country = [ALMANYA, ITALYA, MADAGASKAR, POLONYA, UGANDA]
        // Explanation: The list is now sorted alphabetically.

        // Example 2: Reversing the list to arrange elements in descending order
        Collections.reverse(country);
        System.out.println("Reversed country list = " + country);
        // Output: country = [UGANDA, POLONYA, MADAGASKAR, ITALYA, ALMANYA]
        // Explanation: The order of elements has been reversed based on the sorted order.
    }
}
