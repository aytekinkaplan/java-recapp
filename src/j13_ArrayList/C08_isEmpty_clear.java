package j13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {
        // `isEmpty()` checks if the list contains any elements, returning true if it's empty, false otherwise.
        // `clear()` removes all elements from the list, effectively emptying it.

        // Initializing an ArrayList with initial values using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 1: Checking if the list is empty using `isEmpty()`
        System.out.println("country.isEmpty() = " + country.isEmpty());
        // Output: country.isEmpty() = false, since the list contains elements

        // Example 2: Clearing all elements from the list using `clear()`
        country.clear();
        System.out.println("country after clear() = " + country);
        // Output: country = [], showing the list is now empty after `clear()`

        // Example 3: Verifying that the list is empty after `clear()` using `isEmpty()`
        System.out.println("country.isEmpty() = " + country.isEmpty());
        // Output: country.isEmpty() = true, confirming the list is empty after clearing
    }
}
