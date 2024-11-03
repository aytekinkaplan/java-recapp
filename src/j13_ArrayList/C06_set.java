package j13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set { // `set()` is commonly used for updating elements in ArrayLists (crUd - Update)

    public static void main(String[] args) {

        // Initializing an ArrayList with initial values using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        System.out.println("country.size() = " + country.size());
        // Output: country.size() = 5, showing the list has 5 elements

        // Example 1: Using `set()` to update an element at a specific index
        System.out.println("country.set(0, \"AMERIKA\") = " + country.set(0, "AMERIKA"));
        // Output: country.set(0, "AMERIKA") = MADAGASKAR
        // Explanation: `set()` returns the element previously at the specified index, in this case, "MADAGASKAR".

        System.out.println("country = " + country);
        // Output: country = [AMERIKA, ALMANYA, POLONYA, UGANDA, ITALYA], showing the list after the update

        System.out.println("country.size() = " + country.size());
        // Output: country.size() = 5, confirming that `set()` only replaces the element, without altering the list size
    }
}
