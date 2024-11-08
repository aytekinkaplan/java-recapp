package j14_ForEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {
        // Task: Print the product of all elements in a multidimensional array using a for-each loop
        int[][] arr = {{2, 5, 6, 8}, {9, 2, 5, 8}, {3, 5, 7, 9}};

        int product = 1;

        // Calculate the product of all elements using a for-each loop
        for (int[] innerArray : arr) {
            for (int element : innerArray) {
                product *= element;
            }
        }

        System.out.println("Product of all elements = " + product); // Expected output: 326592000
    }
}
