package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {
        // The `get(int index)` method retrieves the element at the specified index in the ArrayList.
        // This is equivalent to accessing an array element using array[index].

        // Initializing an ArrayList with initial values using Arrays.asList()
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara", "erzurum", "izmir", "konya", "bursa", "mogadishu", "aydin"));
        System.out.println("city = " + city);
        // Output: city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        // Example 1: Using `get()` to retrieve an element at a valid index
        System.out.println("city.get(1) = " + city.get(1));
        // Output: city.get(1) = erzurum (retrieves the element at index 1)

        // Example 2: Attempting to access an index that is out of bounds
        // Uncommenting the line below would throw an IndexOutOfBoundsException because index 20 is outside the bounds of the list.
        // System.out.println("city.get(20) = " + city.get(20));
        // Throws: java.lang.IndexOutOfBoundsException

        // Example 3: Using `get()` in a loop to access and print each element
        for (int i = 0; i < city.size(); i++) {
            System.out.println("city.get(" + i + ") = " + city.get(i));
        }
        // This prints each element in the list by index, demonstrating sequential access with `get()`.
    }
}
