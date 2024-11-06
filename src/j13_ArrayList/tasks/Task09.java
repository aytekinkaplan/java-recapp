package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    public static void main(String[] args) {
        /* TASK:
           Create an integer list and find the sum of squares of all numbers in this list.
        */

        ArrayList<Integer> list = new ArrayList<>(List.of(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));

        // Call the method to calculate and print the sum of squares
        int sumOfSquares = calculateSumOfSquares(list);
        System.out.println("Sum of squares: " + sumOfSquares);
    }

    // Method to calculate the sum of squares
    public static int calculateSumOfSquares(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num * num;
        }
        return sum;
    }
}
