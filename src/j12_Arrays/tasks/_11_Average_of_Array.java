package j12_Arrays.tasks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        Create an int array with elements: 12, 14, 21, 23, 10, 4
        Calculate the average of the array.
         */

        int[] numbers = {12, 14, 21, 23, 10, 4};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        // Calculate average with decimal accuracy
        double average = (double) sum / numbers.length;
        System.out.println("Average = " + average);
    }
}
