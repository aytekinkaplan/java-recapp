package j18_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C04_OCA_MutableClass {
    public static void main(String[] args) {

        // Creating a mutable List of Strings
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("7"); // Adding "7" as a String, not an integer

        // list.add(7); // Compile-Time Error: The list is of type String, so we cannot add an integer

        // Using for-each loop to print each element in the list
        for (String w : list) {
            System.out.println("w = " + w);
        }
    }
}
