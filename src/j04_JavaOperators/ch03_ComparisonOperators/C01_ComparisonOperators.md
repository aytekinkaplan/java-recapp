Your code explains how **comparison operators** work in Java, which are used to compare two values or variables and return a boolean (`true` or `false`). Let's break down your code and the concepts behind the comparison operators, and I’ll provide additional examples for a deeper understanding.

### Code Explanation:

```java
package j04_JavaOperators.ch03_ComparisonOperators;

public class C01_ComparisonOperators {
    public static void main(String[] args) {

        /*
        Comparator : Comparison operations.
        In Java, when the values of two variables are compared, Java returns a boolean result (true or false).

        ==      Equal               x == y
        !=      Not equal           x != y
        >       Greater than        x > y
        <       Less than           x < y
        >=      Greater than or equal to  x >= y
        <=      Less than or equal to     x <= y

        The exclamation mark (!) is used to denote negation (not).
        */

        int yas1 = 34;  // Declare and initialize yas1 to 34
        int yas2 = 55;  // Declare and initialize yas2 to 55

        // Task: Check if yas1 and yas2 are equal
        System.out.println("yas1 == yas2 = " + (yas1 == yas2));  // Output: false
        // Explanation: Checks if yas1 is equal to yas2. Since 34 is not equal to 55, the result is false.

        // How to perform a not equal comparison
        System.out.println("yas1 != yas2 = " + (yas1 != yas2));  // Output: true
        // Explanation: Checks if yas1 is not equal to yas2. Since 34 is not equal to 55, the result is true.
    }
}
```

### Key Concepts of Comparison Operators:

1. **`==` (Equal):**

   - Compares two values and returns `true` if they are equal.
   - Example: `x == y` checks if `x` is equal to `y`.

2. **`!=` (Not Equal):**

   - Compares two values and returns `true` if they are not equal.
   - Example: `x != y` checks if `x` is not equal to `y`.

3. **`>` (Greater Than):**

   - Returns `true` if the left operand is greater than the right operand.
   - Example: `x > y` checks if `x` is greater than `y`.

4. **`<` (Less Than):**

   - Returns `true` if the left operand is less than the right operand.
   - Example: `x < y` checks if `x` is less than `y`.

5. **`>=` (Greater Than or Equal To):**

   - Returns `true` if the left operand is greater than or equal to the right operand.
   - Example: `x >= y` checks if `x` is greater than or equal to `y`.

6. **`<=` (Less Than or Equal To):**
   - Returns `true` if the left operand is less than or equal to the right operand.
   - Example: `x <= y` checks if `x` is less than or equal to `y`.

### Additional Examples:

Let’s add more comparisons and explain the results:

```java
public class C01_ComparisonOperators {
    public static void main(String[] args) {

        int yas1 = 34;
        int yas2 = 55;

        // Checking if yas1 is greater than yas2
        System.out.println("yas1 > yas2 = " + (yas1 > yas2));  // Output: false
        // Explanation: 34 is not greater than 55, so the result is false.

        // Checking if yas1 is less than yas2
        System.out.println("yas1 < yas2 = " + (yas1 < yas2));  // Output: true
        // Explanation: 34 is less than 55, so the result is true.

        // Checking if yas1 is greater than or equal to yas2
        System.out.println("yas1 >= yas2 = " + (yas1 >= yas2));  // Output: false
        // Explanation: 34 is not greater than or equal to 55, so the result is false.

        // Checking if yas1 is less than or equal to yas2
        System.out.println("yas1 <= yas2 = " + (yas1 <= yas2));  // Output: true
        // Explanation: 34 is less than or equal to 55, so the result is true.
    }
}
```

### Explanation of Output:

- **`yas1 > yas2`**: This checks if 34 is greater than 55. The result is `false` because 34 is less than 55.
- **`yas1 < yas2`**: This checks if 34 is less than 55. The result is `true` because 34 is indeed less than 55.
- **`yas1 >= yas2`**: This checks if 34 is greater than or equal to 55. The result is `false` because 34 is not greater than 55.
- **`yas1 <= yas2`**: This checks if 34 is less than or equal to 55. The result is `true` because 34 is less than 55.

### Advanced Example:

Let's add a more complex example where we compare multiple values:

```java
public class C01_ComparisonOperators {
    public static void main(String[] args) {

        int yas1 = 25;
        int yas2 = 30;
        int yas3 = 25;

        // Compare multiple values
        System.out.println("yas1 == yas3 = " + (yas1 == yas3));  // Output: true
        System.out.println("yas2 != yas3 = " + (yas2 != yas3));  // Output: true
        System.out.println("yas2 > yas1 = " + (yas2 > yas1));    // Output: true
        System.out.println("yas3 <= yas1 = " + (yas3 <= yas1));  // Output: true
    }
}
```

### Explanation:

1. **`yas1 == yas3`**: This checks if `yas1` (25) is equal to `yas3` (25). The result is `true` because they are equal.
2. **`yas2 != yas3`**: This checks if `yas2` (30) is not equal to `yas3` (25). The result is `true` because 30 is not equal to 25.
3. **`yas2 > yas1`**: This checks if `yas2` (30) is greater than `yas1` (25). The result is `true` because 30 is greater than 25.
4. **`yas3 <= yas1`**: This checks if `yas3` (25) is less than or equal to `yas1` (25). The result is `true` because they are equal.

### Final Output:

```
yas1 == yas3 = true
yas2 != yas3 = true
yas2 > yas1 = true
yas3 <= yas1 = true
```

### Conclusion:

- **Comparison operators** are useful for comparing variables and values, returning `true` or `false` based on the result of the comparison.
- Common comparison operators include `==`, `!=`, `>`, `<`, `>=`, and `<=`.
- The comparison operations always result in a boolean value (`true` or `false`).
