package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class _05_arraylist5 {

    /*
        Create a method named `rotateList()` that:
        - Accepts an `ArrayList<String>` as a parameter.
        - Reverses the order of the elements in the list.
        - Returns the reversed list.

        Example:
        Input: ["New jersey", "New York", "Atlanta", "Florida", "Ohio"]
        Output: ["Ohio", "Florida", "Atlanta", "New York", "New jersey"]
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("New Jersey", "New York", "Atlanta", "Florida", "Ohio"));
        ArrayList<String> reversedList = rotateList(list);
        System.out.println("Reversed list: " + reversedList);
    }

    public static ArrayList<String> rotateList(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<>();
        // Loop backwards through the original list to build the reversed list
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
