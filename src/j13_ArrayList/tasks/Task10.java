package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK:
           Create code that removes duplicate numbers in the given array, keeping only the first occurrence of each number.
           Convert the result into an array with unique numbers.

           INPUT: {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1}
           OUTPUT : [1, 2, 3, 4, 5, 6, 7, 8, 9]
         */

        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));

        // Remove duplicates while keeping the order of first occurrences
        List<Integer> uniqueList = removeDuplicates(list);

        System.out.println("Unique list: " + uniqueList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        // LinkedHashSet maintains insertion order and removes duplicates
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
