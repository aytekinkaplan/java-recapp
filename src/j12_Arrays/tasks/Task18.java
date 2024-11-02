package j12_Arrays.tasks;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // Task: Create a new array that contains the sum of each inner array in "sayi"
        // input: int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        // output: int yeniArr[] = {6, 11, -7}

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        // Initialize a new array to store the sums of each inner array
        int[] yeniArr = new int[sayi.length];

        // Loop through each inner array to calculate the sums
        for (int i = 0; i < sayi.length; i++) {
            int sum = 0;
            for (int j = 0; j < sayi[i].length; j++) {
                sum += sayi[i][j]; // Add each element in the inner array
            }
            yeniArr[i] = sum; // Store the sum in the new array
        }

        System.out.println("Sum of each inner array: " + Arrays.toString(yeniArr));
    }
}
