package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {

    public static void main(String[] args) {
        // `remove(Object o)` removes the first occurrence of the specified element.
        // `remove(int index)` removes the element at the specified index.
        // `removeAll(Collection<?> c)` removes all elements that exist in the specified collection.

        // Initializing an ArrayList with initial values using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("Original country list = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 1: Attempting to remove a non-existent element
        System.out.println("country.remove(\"Norway\") = " + country.remove("Norway"));
        // Output: country.remove("Norway") = false, as "Norway" is not in the list

        // Example 2: Removing an existing element by value
        System.out.println("country.remove(\"UGANDA\") = " + country.remove("UGANDA"));
        // Output: country.remove("UGANDA") = true, as "UGANDA" is present in the list

        // Example 3: Removing an element by index
        System.out.println("country.remove(0) = " + country.remove(0));
        // Output: country.remove(0) = ALMANYA, the element at index 0 is removed

        System.out.println("Updated country list = " + country);
        // Output: country = [ITALYA, MADAGASKAR, POLONYA]

        // Adding duplicate entries to demonstrate `remove()` behavior
        country.add("Amerika");
        country.add("Hollanda");
        country.add("Ukrayna");
        country.add("Amerika");
        System.out.println("country after adding elements = " + country);
        // Output: country = [ITALYA, MADAGASKAR, POLONYA, Amerika, Hollanda, Ukrayna, Amerika]

        // Example 4: Removing the first occurrence of a duplicate element
        System.out.println("country.remove(\"Amerika\") = " + country.remove("Amerika"));
        // Output: country.remove("Amerika") = true, removes the first "Amerika" only

        System.out.println("Updated country list after removing one 'Amerika' = " + country);
        // Output: country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]

        // Example 5: Adding all elements from another list
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));
        country.addAll(city);
        System.out.println("country after adding city list = " + country);
        // Output: country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika, Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        // Example 6: Removing all elements found in another list with `removeAll()`
        System.out.println("country.removeAll(city) = " + country.removeAll(city));
        // Output: country.removeAll(city) = true, removes all elements from `city` found in `country`

        System.out.println("Final country list after removeAll = " + country);
        // Output: country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]
    }
}
