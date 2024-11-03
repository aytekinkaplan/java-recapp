package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _03_arraylist3 {

    /*
        Create a method named `getLength()` that:
        - Accepts an `ArrayList<String>` as a parameter.
        - Returns an `ArrayList<Integer>` containing the length of each string in the input list.

        Example:
        Input: ["New Jersey", "New York", "Ohio", "Florida", "Boston"]
        Output: [10, 8, 4, 7, 6]
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("New Jersey", "New York", "Ohio", "Florida", "Boston"));
        System.out.println("Lengths of strings: " + getLength(list)); // Expected output: [10, 8, 4, 7, 6]
    }

    public static ArrayList<Integer> getLength(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<>();
        // Loop through each string in the list and calculate its length
        for (String str : list) {
            lengths.add(str.length()); // Add each length to the `lengths` list
        }
        return lengths;
    }
}
