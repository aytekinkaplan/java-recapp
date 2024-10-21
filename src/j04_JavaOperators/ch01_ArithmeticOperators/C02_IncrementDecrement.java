package j04_JavaOperators.ch01_ArithmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int number = 7;

        // Pre-increment
        System.out.println(++number);  // Output: 8
        // Explanation: number is incremented first, so it becomes 8, then it's printed.

        System.out.println("number = " + number);  // Output: number = 8
        // Explanation: number is now 8 because it was pre-incremented.

        // Post-increment
        System.out.println(number++);  // Output: 8
        // Explanation: The current value of number (which is 8) is printed first, then it's incremented to 9 after the print statement.

        // After post-increment, the value has been updated to 9
        System.out.println("number = " + number);  // Output: number = 9

        // Combination of post- and pre-increment
        System.out.println(number++ + ++number);  // Output: 20
        // Explanation:
        // number++: number is currently 9. The value of number++ is 9, then number becomes 10.
        // ++number: Now, number is 10. The value of ++number increments it first, making it 11.
        // So, 9 + 11 = 20.

        System.out.println("number = " + number);  // Output: number = 11
        // Explanation: After the previous statement, number is 11.

        // Post-increment used multiple times
        System.out.println(number++ + number++);  // Output: 23
        // Explanation:
        // First number++: number is currently 11, so it's used as 11, then incremented to 12.
        // Second number++: number is now 12, so it's used as 12, then incremented to 13.
        // 11 + 12 = 23.

        System.out.println("number = " + number);  // Output: number = 13
        // Explanation: After the last statement, number has been incremented twice, so it's now 13.

        int x = 5;
        int y = 5;

// Pre-increment example:
        System.out.println(++x);  // Output: 6
        System.out.println("x = " + x);  // Output: x = 6

// Post-increment example:
        System.out.println(y++);  // Output: 5
        System.out.println("y = " + y);  // Output: y = 6

// Pre-decrement example:
        int z = 10;
        System.out.println(--z);  // Output: 9
        System.out.println("z = " + z);  // Output: z = 9

// Post-decrement example:
        int w = 10;
        System.out.println(w--);  // Output: 10
        System.out.println("w = " + w);  // Output: w = 9
        int a = 4;
        int b = 3;
        int result = ++a + b++ + ++b + --a;
// Step by step explanation:
// ++a: a becoming 5, so the value used is 5.
// b++: b is currently 3, so the value used is 3, then b becomes 4.
// ++b: b is incremented to 5 before use, so the value is 5.
// --a: a is decremented back to 4 before use, so the value is 4.
// Result: 5 + 3 + 5 + 4 = 17

        System.out.println("result = " + result);  // Output: result = 17
        System.out.println("a = " + a);  // Output: a = 4
        System.out.println("b = " + b);  // Output: b = 5

        int m = 10;
        int n = 20;

        int output = m++ + --n + ++m + n-- + ++n + --m;
// Step by step explanation:
// m++: The value of m (10) is used, and m becomes 11.
// --n: n is decremented first, so n becomes 19, and 19 is used.
// ++m: m is incremented to 12 before use, so 12 is used.
// n--: n is used as 19, and then decremented to 18.
// ++n: n becomes 19 again before use.
// --m: m is decremented to 11 before use.
// Result: 10 + 19 + 12 + 19 + 19 + 11 = 90

        System.out.println("output = " + output);  // Output: output = 90
        System.out.println("m = " + m);  // Output: m = 11
        System.out.println("n = " + n);  // Output: n = 19

    }
}
