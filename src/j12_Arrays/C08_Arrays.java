package j12_Arrays;

public class C08_Arrays {

    public static void main(String[] args) {
        /*
         * Write a method that prints pairs of numbers in the given array whose sums equal a specified target value.
         * int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
         * int targetSum = 9;
         */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int targetSum = 9;

        findPairsWithSum(arr, targetSum);
    }

    private static void findPairsWithSum(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) { // Outer loop
            for (int j = i + 1; j < arr.length; j++) { // Inner loop
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println(arr[i] + " and " + arr[j] + " sum to: " + targetSum);
                }
            }
        }
    }
}
