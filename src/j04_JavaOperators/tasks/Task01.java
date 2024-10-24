package j04_JavaOperators.tasks;

public class Task01 {
    public static void main(String[] args) {

        // Working with variable 'x'
        int x = 4;  // Initializing x with 4
        x++;        // Post-increment: x becomes 5 (4 + 1)
        x += x;     // x is added to itself: 5 + 5 = 10
        --x;        // Pre-decrement: x becomes 9 (10 - 1)
        x = 7 + x;  // 7 is added to x: 7 + 9 = 16
        x *= x;     // x is multiplied by itself: 16 * 16 = 256
        x -= 3;     // 3 is subtracted from x: 256 - 3 = 253

        // Printing the final value of x
        System.out.println(" x = " + x);  // x = 253

        // Working with variables 'a' and 'd'
        int a = 3;   // Initializing a with 3
        double d = 4.5;  // Initializing d with 4.5
        d += a;     // Adding a to d: 4.5 + 3 = 7.5 (d = 7.5)
        a += d;     // Adding d to a, truncating decimal: 3 + 7.5 = 10 (a = 10, fractional part is ignored)
        d -= a;     // Subtracting a from d: 7.5 - 10 = -2.5 (d = -2.5)
        a -= d;     // Subtracting d from a: 10 - (-2.5) = 12 (a = 12, d = -2.5, subtracting negative is like adding)

        // Increment d by 1 and print its value
        System.out.println(" d = " + ++d);  // Pre-increment: d = -1.5 (d was -2.5, so -2.5 + 1 = -1.5)

        // Print a, then decrement by 1
        System.out.println(" a = " + a--);  // Prints a = 12, but a is decremented to 11 after printing

    }
}
