package j12_Arrays.tasks;

public class Task15 {
    public static void main(String[] args) {
        // Task: Print the product of all elements in a multi-dimensional array (MDarr)
        int[][] arrMD = {{1, 2, 3}, {9, 8}};

        int product = 1;

        // Loop through each element in the 2D array and calculate the product
        for (int i = 0; i < arrMD.length; i++) {
            for (int j = 0; j < arrMD[i].length; j++) {
                product *= arrMD[i][j];
            }
        }

        System.out.println("Product of all elements: " + product);
    }
}
