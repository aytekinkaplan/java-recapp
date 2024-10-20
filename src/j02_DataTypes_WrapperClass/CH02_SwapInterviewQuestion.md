Here’s the improved and fully explained version of the code with an English explanation of how it works, focusing on the **swap** process with and without using a third variable.

### **Java Code: Swap Two Numbers**

```java
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
```

### **Explanation:**

1. **Swap Using a Third Variable (Temporary Variable):**

   - **Step 1**: A temporary variable (`temp`) is created to store the value of `sayi1`.
   - **Step 2**: The value of `sayi2` is assigned to `sayi1`, effectively replacing its original value.
   - **Step 3**: The value of `temp` (which holds the original value of `sayi1`) is assigned to `sayi2`. This successfully swaps the values of `sayi1` and `sayi2`.

   This method is straightforward and easy to understand but uses extra memory for the temporary variable.

   **Example Output**:

   ```text
   Before swap: sayi1 = 20, sayi2 = 34
   After swap (with temp variable): sayi1 = 34, sayi2 = 20
   ```

2. **Swap Without Using a Third Variable:**

   - **Step 1**: Add the values of `sayi1` and `sayi2` and store the sum in `sayi1`. At this point, `sayi1` holds the sum of the two original values.
   - **Step 2**: Subtract the value of `sayi2` from the new `sayi1` (which is the sum) to get the original value of `sayi1`. This is now assigned to `sayi2`, effectively swapping its value.
   - **Step 3**: Subtract the value of the new `sayi2` (which holds the original `sayi1`) from the sum in `sayi1` to get the original value of `sayi2`. This is now assigned to `sayi1`, completing the swap.

   This method is more efficient in terms of memory usage, as it doesn't require an extra variable. However, it is slightly more complex to understand.

   **Example Output**:

   ```text
   Before swap: sayi1 = 34, sayi2 = 20
   After swap (without temp variable): sayi1 = 34, sayi2 = 20
   ```

### **Concept Summary:**

- **Swapping with a Third Variable**:
  - Easy to implement and understand.
  - Requires additional memory for the temporary variable.
- **Swapping without a Third Variable**:
  - Memory efficient as it uses only the original two variables.
  - Uses mathematical operations (addition and subtraction) to perform the swap.

Both approaches are commonly asked in programming interviews and provide an essential understanding of how data manipulation works with variables.
