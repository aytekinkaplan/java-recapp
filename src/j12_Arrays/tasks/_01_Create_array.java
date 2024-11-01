package j12_Arrays.tasks;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        Create a String Array.
        Elements: Apple, Orange, Banana, Kiwi
        Print all elements of the array.
         */

        // Code
        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};

        // Print the entire array as a single string
        System.out.println(Arrays.toString(fruits));

        // Print each element individually using a for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Print array length
        System.out.println("Array length: " + fruits.length);

        // Print each element using streams
        Arrays.stream(fruits).forEach(System.out::println);
    }
}
