package j15_Varargs;

public class Task02 {
    public static void main(String[] args) {

        /*
        Task:
        Create a method that sums all numbers in an array except the first one,
        then multiplies the sum by the first number.
         */

        int[] arr = {2, 55, 66, 88, 5, 2, 4, 5, 6, 3, 8, 55, 33, 34, 35};

        System.out.println("Result of toplaCarp(arr) = " + toplaCarp(arr));
    }

    public static int toplaCarp(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i]; // Sum all elements except the first
        }

        int result = sum * numbers[0]; // Multiply the sum by the first element
        return result;
    }
}
