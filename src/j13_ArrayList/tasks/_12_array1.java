package j13_ArrayList.tasks;

import java.util.HashSet;

public class _12_array1 {

    /*
        Create a method called duplicate().
        The parameter should be an int array.
        The return type should be boolean.

        If there are duplicates in the array, the method should return true.
        If there are no duplicates, the method should return false.

        Example 1:
        Input: [1, 2, 3, 1]
        Output: true

        Example 2:
        Input: [1, 2, 3, 4]
        Output: false
    */

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1};
        int[] array2 = {1, 2, 3, 4};

        System.out.println("Array1 has duplicates: " + duplicate(array1)); // Output: true
        System.out.println("Array2 has duplicates: " + duplicate(array2)); // Output: false
    }

    private static boolean duplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) { // If add() returns false, a duplicate is found
                return true;
            }
        }
        return false;
    }
}
