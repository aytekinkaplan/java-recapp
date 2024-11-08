package j14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_forEachLoop {
    public static void main(String[] args) {
        /*
            The for-each loop is an advanced version of the for loop.
            Advantages:
            1. Clean code and ease of writing.
            2. Improved readability.
            3. Reduced risk of errors.
         */

        List<Integer> numberList = new ArrayList<>(List.of(1, 2, 55, 65, 33, 35, 34, 72));

        System.out.println("***** Task 01 *****");
        // Task 01: Print each element of the list on a separate line.
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }

        // Using for-each loop for the same task
        for (Integer each : numberList) {
            System.out.println(each);
        }

        System.out.println("***** Task 02 *****");
        // Task 02: Print odd elements, excluding the first three elements in the list.
        for (Integer x : numberList.subList(3, numberList.size())) {
            if (x % 2 == 1) {
                System.out.println("Odd number after the first three elements: " + x);
            }
        }

        System.out.println("***** Task 03 *****");
        // Task 03: Calculate and print the sum of elements with indices from 2 to 5 (inclusive).
        int sum = 0;
        for (int element : numberList.subList(2, 6)) { // 6 is exclusive
            sum += element;
        }
        System.out.println("Sum of elements from index 2 to 5: " + sum); // Expected output: 188
    }
}
