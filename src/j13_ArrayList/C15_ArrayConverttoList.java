package j13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_ArrayConverttoList {
    public static void main(String[] args) {

        // Initializing an array of names
        String[] names = {"Ali", "Zeynep", "Fatih", "Safak", "Derya"};
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        // Output: Arrays.toString(names) = [Ali, Zeynep, Fatih, Safak, Derya]

        // Method 1: Converting array to list with Arrays.asList()
        List<String> namesList = Arrays.asList(names);
        System.out.println("namesList = " + namesList);
        // Output: namesList = [Ali, Zeynep, Fatih, Safak, Derya]
        // Explanation: This creates a fixed-size list backed by the original array.

        // Attempting to add an element to namesList causes a runtime error
        // Uncommenting the line below will throw UnsupportedOperationException
        // namesList.add("Zafer");

        // Incorrect casting approach
        // Uncommenting the line below will throw a ClassCastException
        // ArrayList<String> nameArrayList = (ArrayList<String>) Arrays.asList(names);

        // Method 2: Properly converting to a mutable ArrayList
        ArrayList<String> nameArrayList = new ArrayList<>(Arrays.asList(names));
        System.out.println("nameArrayList = " + nameArrayList);
        // Output: nameArrayList = [Ali, Zeynep, Fatih, Safak, Derya]

        // Sorting the mutable ArrayList
        Collections.sort(nameArrayList);
        System.out.println("Sorted nameArrayList = " + nameArrayList);
        // Output: nameArrayList = [Ali, Derya, Fatih, Safak, Zeynep]
    }
}
