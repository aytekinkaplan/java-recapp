package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        /* TASK:
           Write a method that takes a 2D array as input, copies all elements into a list,
           and then prints the list sorted alphabetically.
           Example: Input : {{Ali, Veli, Ayse}, {Hasan, Can}, {Suzan}}
                    Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String[][] namesArray = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        List<String> sortedList = copyAndSort(namesArray);
        System.out.println(sortedList); // Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]
    }

    // Method to copy elements from 2D array to a list and sort alphabetically
    public static List<String> copyAndSort(String[][] array) {
        List<String> list = new ArrayList<>();

        // Loop through each element in the 2D array and add it to the list
        for (String[] innerArray : array) {
            list.addAll(Arrays.asList(innerArray));
        }

        // Sort the list alphabetically
        Collections.sort(list);

        return list;
    }
}
