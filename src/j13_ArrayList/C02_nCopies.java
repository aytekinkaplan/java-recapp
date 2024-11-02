package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        // The `nCopies()` method enables duplication of a specified element a given number of times,
        // creating a list with repetitive values.

        // Example 1: Initializing an ArrayList with predefined values using Arrays.asList()
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));
        System.out.println("city = " + city);
        // Output: city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        // Example 2: Initializing an ArrayList using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 3: Using `Collections.nCopies()` to instantiate an ArrayList with repeated elements
        ArrayList<String> repeatedList = new ArrayList<>(Collections.nCopies(7, "NEW ZEALAND"));
        System.out.println("repeatedList = " + repeatedList);
        // Output: repeatedList = [NEW ZEALAND, NEW ZEALAND, NEW ZEALAND, NEW ZEALAND, NEW ZEALAND, NEW ZEALAND, NEW ZEALAND]

        // Example 4: Merging ArrayLists using `addAll()`
        // The `addAll()` method appends all elements from the `country` list to the end of the `city` list.
        city.addAll(country);
        System.out.println("city after addAll = " + city);
        // Output: city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin, MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 5: Using `addAll(index, collection)` to insert elements at a specific position
        // Reinitialize `city` to its original values for clarity in this example
        city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));

        // Insert the elements of `country` starting at index 1, shifting subsequent elements.
        city.addAll(1, country);
        System.out.println("city after inserting at index 1 = " + city);
        // Output: city = [Angara, MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA, erzurum, izmir, konya, bursa, mogadishu, aydin]
    }
}
