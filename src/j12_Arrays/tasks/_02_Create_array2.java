package j12_Arrays.tasks;

import java.util.Arrays;

public class _02_Create_array2 {

    public static void main(String[] args) {

        /*
           Create an int array.
           Elements: 13, 15, 14, 16, 16
           Print the elements of the array.
         */

        int[] numbers = {13, 15, 14, 16, 16};

        // First method: Print each element directly by index
        System.out.println("First method: ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // Second method: Using a for loop to iterate through the array
        System.out.println("\nSecond method: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Third method: Using streams to print each element
        System.out.println("\nThird method: ");
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
