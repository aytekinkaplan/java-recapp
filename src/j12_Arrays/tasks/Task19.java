package j12_Arrays.tasks;

public class Task19 {
    public static void main(String[] args) {
        // Task: Print the sum of elements at the same index in each inner array of arr1 and arr2
        int arr1[][] = { {1, 2}, {3, 4, 5}, {6} };
        int arr2[][] = { {7, 8, 9}, {10, 11}, {12} };

        // Iterate through each inner array based on the number of rows in arr1 or arr2
        for (int i = 0; i < arr1.length; i++) {
            int minLength = Math.min(arr1[i].length, arr2[i].length); // Get the smaller length of the inner arrays

            // Sum elements at the same index for both inner arrays
            for (int j = 0; j < minLength; j++) {
                int sum = arr1[i][j] + arr2[i][j];
                System.out.println("Sum of elements at index " + j + " in row " + i + " = " + sum);
            }
        }
    }
}
