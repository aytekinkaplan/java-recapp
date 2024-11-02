package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        // The `indexOf()` method returns the index of the first occurrence of the specified element in the list.
        // If the element is not found, it returns -1.

        // Initializing an ArrayList with initial values using Arrays.asList()
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));
        System.out.println("city = " + city);
        // Output: city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        // Initializing another ArrayList with initial values using List.of()
        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR", "ALMANYA", "POLONYA", "UGANDA", "ITALYA"));
        System.out.println("country = " + country);
        // Output: country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        // Example 1: Finding the index of an element that does not exist
        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun"));
        // Output: city.indexOf("samsun") = -1, since "samsun" is not present in the list

        // Example 2: Finding the index of an existing element
        System.out.println("city.indexOf(\"Angara\") = " + city.indexOf("Angara"));
        // Output: city.indexOf("Angara") = 0, as "Angara" is at index 0

        // Adding new elements to `country`
        country.add("Ingiltere");
        System.out.println("country.indexOf(\"Ingiltere\") = " + country.indexOf("Ingiltere"));
        // Output: country.indexOf("Ingiltere") = 5, as "Ingiltere" is now at index 5

        // Adding duplicate elements and demonstrating `lastIndexOf()`
        country.add("ALMANYA");
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.indexOf("ALMANYA"));
        // Output: country.indexOf("ALMANYA") = 1, the first occurrence of "ALMANYA" is at index 1
        System.out.println("country.lastIndexOf(\"ALMANYA\") = " + country.lastIndexOf("ALMANYA"));
        // Output: country.lastIndexOf("ALMANYA") = 6, as the last occurrence is at index 6

        System.out.println("country = " + country);
        // Final output of `country` list with all added elements
    }
}
