package j15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
           Task: Demonstrate how to use arrays and varargs in methods.
           - Task 1: Create a method that sums elements in a given array.
           - Task 2: Use varargs to create a method that can sum an arbitrary number of integers.
        */

        int[] arr = {1, 2, -3, 4, -5, -6};

        // Sum using a method that takes an array
        sumArray(arr);

        // Sum using varargs
        sumVarargs(arr); // Using an array with varargs
        sumVarargs(22, 55, 66, 33, 99, 88, 77, 44, 555); // Using direct values
        System.out.println("Sum with varargs: " + sumVarargs(22, 55, 66, 33, 99, 88, 77, 44, 555));
    }

    // Method to sum an arbitrary number of integers using varargs
    private static int sumVarargs(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Sum using varargs: " + total);
        return total;
    }

    // Method to sum elements in a given array
    private static void sumArray(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        System.out.println("Sum of array elements: " + total);
    }
}
