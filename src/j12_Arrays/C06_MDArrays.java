package j12_Arrays;

import java.util.Arrays;

public class C06_MDArrays {

    public static void main(String[] args) {
        /*
        Multidimensional Arrays
        Multidimensional arrays are not a default data type in Java and are often referred to as matrices.
        They are defined as two-dimensional arrays and are used to store table-like data in rows and columns.
        While arrays are suitable for list-like data, matrices are more suitable for tabular data.
        To access a specific value in the table, it's enough to specify the row and column numbers.

        * NOTE: In two-dimensional arrays, indexing starts at 0, just like in one-dimensional arrays.
        The data types stored in the array must be the same, and we cannot store different data types in the same matrix.

        * 1- In nested arrays, the outer array is known as the "outer" or "floor" array,
             and the inner arrays are called "inner" or "room" arrays.
        * 2- NOTE: If the sizes of the inner arrays are different,
             the array should be declared by assigning values to all elements.
        * 3- In multidimensional arrays, to access an element,
             you need to specify all the indices from the outermost array down to the desired element.
        */

        // Defining an MD array
        int[] arr = new int[3];

        int[][] arr1 = new int[3][5]; // 3 rows and 5 columns in each row
        // Represents a 3-floor building with 5 rooms on each floor

        System.out.println("Arrays.toString(arr1) = " +
                Arrays.toString(arr1)); // Arrays.toString(arr1) = [[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]

        System.out.println("Arrays.deepToString(arr1) = " +
                Arrays.deepToString(arr1)); // Arrays.deepToString(arr1) = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        int[][][] arr2 = new int[2][3][5];
        // Example: A site with 2 buildings, each with 3 floors, and 5 rooms on each floor
        System.out.println("Arrays.deepToString(arr2) = " +
                Arrays.deepToString(arr2));
        //   Arrays.deepToString(arr2) =
        //   [[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]],
        //   [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]

        // Task: Define an array for a school with 3 classes of 24 students and 5 classes of 21 students
        int class24[][] = new int[3][24];
        int class21[][] = new int[5][21];

        // Adding elements to a multidimensional array
        // int [][] arr1 = new int[3][5]; // 3 rows, 5 columns in each row
        arr1[0][3] = 35; // Added 35 to the 3rd room on the 0th floor

        System.out.println("Arrays.deepToString(arr1) = " +
                Arrays.deepToString(arr1));
        // Arrays.deepToString(arr1) = [[0, 0, 0, 35, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        // Task: Print the value 35 that you just added
        System.out.println("arr1[0][3] = " + arr1[0][3]);  // arr1[0][3] = 35

        // Manually creating an MD array
        int[][] mdArr = { // Outer array
                {1, 2, 3},  // Floor 0   // Inner arrays
                {10, 20},   // Floor 1   // Inner array
                {103}       // Floor 2   // Inner array
        }; // Outer array

        System.out.println("mdArr.length = " + mdArr.length); // mdArr.length = 3

        // Print the last element of the last array in the outer array
        System.out.println("mdArr[mdArr.length-1][mdArr.length-1] = " +
                mdArr[mdArr.length - 1][mdArr[mdArr.length - 1].length - 1]);
        // mdArr[mdArr.length-1][mdArr.length-1] = 103

        System.out.println("mdArr[1] = " + mdArr[1]); // mdArr[1] = [I@26ba2a48

        System.out.println("Arrays.toString(mdArr[1]) = " +
                Arrays.toString(mdArr[1])); // Arrays.toString(mdArr[1]) = [10, 20]
    }
}
