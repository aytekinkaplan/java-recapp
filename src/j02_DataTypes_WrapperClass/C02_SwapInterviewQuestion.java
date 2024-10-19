package ch02_DataTypes_WrapperClass;

public class C02_SwapInterviewQuestion {
    public static void main(String[] args) {

        /*
        TASK:
        Given two variables `sayi1` and `sayi2`, swap their values.
        Create a code that prints the result.
        
        a) Using a third variable.
        b) Without using a third variable.

        Example:
        Input: sayi1 = 20, sayi2 = 34
        Output: sayi1 = 34, sayi2 = 20
         */

        // Initializing variables
        int sayi1 = 20;
        int sayi2 = 34;
        int temp;  // Temporary variable for swapping

        // Before the swap (using a third variable)
        System.out.println("Before swap: sayi1 = " + sayi1 + ", sayi2 = " + sayi2);

        // Step 1: Store sayi1 in a temporary variable
        temp = sayi1;

        // Step 2: Assign sayi2's value to sayi1
        sayi1 = sayi2;

        // Step 3: Assign the value in temp (sayi1's original value) to sayi2
        sayi2 = temp;

        // After the swap (using a third variable)
        System.out.println("After swap (with temp variable): sayi1 = " + sayi1 + ", sayi2 = " + sayi2);

        // -------------------------------
        // Swap without using a third variable
        System.out.println("Before swap: sayi1 = " + sayi1 + ", sayi2 = " + sayi2);

        // Step 1: Add sayi1 and sayi2 and store it in sayi1
        sayi1 = sayi1 + sayi2;  // sayi1 now becomes 54

        // Step 2: Subtract sayi2 from the new sayi1 to get the original value of sayi1, and assign it to sayi2
        sayi2 = sayi1 - sayi2;  // sayi2 becomes 20

        // Step 3: Subtract the new sayi2 from the new sayi1 to get the original value of sayi2, and assign it to sayi1
        sayi1 = sayi1 - sayi2;  // sayi1 becomes 34

        // After the swap (without a temp variable)
        System.out.println("After swap (without temp variable): sayi1 = " + sayi1 + ", sayi2 = " + sayi2);
    }
}
