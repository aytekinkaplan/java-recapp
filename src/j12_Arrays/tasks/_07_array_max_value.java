package j12_Arrays.tasks;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            Create an int array with elements: 12, 2, 5, 15, 8
            Print the maximum value.
         */

        int[] numbers = {12, 2, 5, 15, 8};
        int max = numbers[0]; // Start by assuming the first element is the max

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value = " + max);
    }
}
