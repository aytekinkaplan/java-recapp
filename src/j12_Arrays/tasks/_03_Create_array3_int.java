package j12_Arrays.tasks;

public class _03_Create_array3_int {

    public static void main(String[] args) {

        /*
          Create an int array with elements: 25, 30, 30, 35, 100
          Print the sum of the array's elements.
          Expected answer is 220.
         */

        int[] arr = {25, 30, 30, 35, 100};

        // Calculate the sum using a for loop
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum using loop: " + sum);

        // Alternative: Using Java Streams to calculate the sum
        int sumUsingStreams = java.util.Arrays.stream(arr).sum();
        System.out.println("Sum using streams: " + sumUsingStreams);
    }
}
