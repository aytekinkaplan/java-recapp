package j12_Arrays.tasks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        Create an int array with elements: 5, 6, 8, 12, 14, 19
        If the number is even, add it to the sum; if it’s odd, subtract it.
        Example calculation:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Print the final total.
         */

        int[] numbers = {5, 6, 8, 12, 14, 19};
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            } else {
                sum -= number;
            }
        }

        System.out.println("The final total is: " + sum);
    }
}
