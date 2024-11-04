package j13_ArrayList.tasks;

import java.util.ArrayList;

public class _09_2dArray_with_arraylist {

    /*
        Create a 2D array with elements [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ]
        Store all the elements in one ArrayList and print the ArrayList.

        Example:
        Input:
        [
         [ 1, 2, 3 ],
         [ 4, 5, 6 ],
         [ 7, 8, 9 ]
        ]
        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
     */

    public static void main(String[] args) {
        // Define a 2D array with integer elements
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Create an ArrayList to store all elements from the 2D array
        ArrayList<Integer> list = new ArrayList<>();

        // Loop through each element in the 2D array and add it to the ArrayList
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }

        // Print the ArrayList containing all elements of the 2D array
        System.out.println(list); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
