package j13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        // `contains(Object o)` checks if the specified element is in the list.
        // Returns `true` if found, otherwise `false`.

        // Initializing an ArrayList with initial values using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 1: Checking for an element with a different case
        System.out.println("country.contains(\"almanya\") = " + country.contains("almanya"));
        // Output: country.contains("almanya") = false
        // Explanation: `contains()` is case-sensitive, so "almanya" is not recognized as "ALMANYA".

        // Example 2: Checking for an element that exists in the list
        System.out.println("country.contains(\"UGANDA\") = " + country.contains("UGANDA"));
        // Output: country.contains("UGANDA") = true, because "UGANDA" is present in `country`
    }
}
