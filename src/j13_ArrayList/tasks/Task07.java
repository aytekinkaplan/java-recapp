package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK:
         * Create a list with 10 elements. Then swap the 3rd and 8th elements.
         *
         * EXAMPLE:
         *
         * INPUT: String[] names = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
         * OUTPUT: String[] names = {"Umit", "Emin", "Furkan", "Kerem", "Taylan", "Orhan", "Sinan", "Kemal", "Ahmet", "Ali"};
         */

        // Initialize the list with the given names
        ArrayList<String> list = new ArrayList<>(List.of("Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"));

        // Swap the elements at index 2 and index 7
        String temp = list.get(2); // Store the 3rd element in a temporary variable
        list.set(2, list.get(7)); // Set the 3rd element to the value of the 8th element
        list.set(7, temp); // Set the 8th element to the value of the original 3rd element

        System.out.println("List after swapping 3rd and 8th elements: " + list);
    }
}
