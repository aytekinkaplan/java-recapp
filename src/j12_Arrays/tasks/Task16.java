package j12_Arrays.tasks;

public class Task16 {
    public static void main(String[] args) {
        // Task: Print the product of the last elements of each subarray in MDarr

        int product = 1;
        int[][] MDarr = {{1, 2, 3}, {4, 5, 6, 8}, {7, 8, 9, 0, 2, 3, 2}};

        for (int i = 0; i < MDarr.length; i++) {
            // Access the last element in each subarray
            product *= MDarr[i][MDarr[i].length - 1];
            System.out.println("Last element in MDarr[" + i + "] = " + MDarr[i][MDarr[i].length - 1]);
        }

        System.out.println("Product of last elements: " + product);

        // Example of accessing specific elements (unrelated to the main task)
        System.out.println("MDarr[0][2] = " + MDarr[0][2]); // Access element 3 in the first row
    }
}
