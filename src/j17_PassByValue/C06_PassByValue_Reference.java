package j17_PassByValue;

public class C06_PassByValue_Reference {
    public static void main(String[] args) {

        int x = 10;

        // Pass-by-value example with primitive type
        incrementInt(x);
        System.out.println("Value of x after method call = " + x); // Expected: 10

        // Pass-by-reference-like example with array (reference type)
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array reference = " + arr); // Reference memory address

        System.out.println("Value of arr[0] before method call = " + arr[0]); // Expected: 1
        incrementArr(arr);
        System.out.println("Value of arr[0] after method call = " + arr[0]); // Expected: 2
    }

    // Method to increment the first element of the array
    private static void incrementArr(int[] arr) {
        arr[0] = arr[0] + 1;
        System.out.println("Inside method, arr[0] = " + arr[0]); // Expected: 2
    }

    // Method to increment an integer (primitive type)
    private static void incrementInt(int x) {
        x += 1;
        System.out.println("Inside method, x = " + x); // Expected: 11
    }
}
