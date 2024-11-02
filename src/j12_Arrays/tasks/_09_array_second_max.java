package j12_Arrays.tasks;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        Create an int array with elements: 15, 25, 22, 18, 30
        Write a program to print the second largest element in the array.
         */

        int[] numbers = {15, 25, 22, 18, 30};
        int max = Integer.MIN_VALUE; // Initialize with the smallest possible integer value
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }

        System.out.println("The second largest value is: " + secondMax);
    }
}
