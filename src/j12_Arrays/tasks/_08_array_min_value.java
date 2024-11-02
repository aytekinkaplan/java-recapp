package j12_Arrays.tasks;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        Create an int array with elements: 14, 19, 5, 21
        Print the smallest (minimum) number.
         */

        int[] numbers = {14, 19, 5, 21};
        int min = numbers[0]; // Start by assuming the first element is the minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Minimum value = " + min);
    }
}
