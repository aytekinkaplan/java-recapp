package j12_Arrays.tasks;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Create a 2D int array as follows:  [{5, 2, 1}, {10, 2, 3, 6}, {1, 2}]
        Sum all elements in the 2D array.
        Print the total sum.
        Expected result: 32
         */

        int[][] arr = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int sum = 0;

        // Loop through each element in the 2D array and add to sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        // Print the total sum
        System.out.println("Total sum: " + sum);
    }
}
