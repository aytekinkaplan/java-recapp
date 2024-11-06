package j13_ArrayList.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    /* TASK:
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * write a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * Create a method to calculate the sum of sequential array elements.
     */
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int[] resultArray = createSequentialSumArray(array);

        System.out.print("New array with sequential sums: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] createSequentialSumArray(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            // Add a sum to the list when we reach the count for this group
            if ((i + 1) == count * (count + 1) / 2) {
                resultList.add(sum);
                sum = 0;
                count++;
            }
        }

        // Convert resultList to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
