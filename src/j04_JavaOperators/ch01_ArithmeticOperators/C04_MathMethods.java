package j04_JavaOperators.ch01_ArithmeticOperators;

public class C04_MathMethods {

    public static void main(String[] args) {

        /*
         * Math.abs(a) 
         *   - Returns the absolute value of the input.
         *
         * Math.max(a, b) 
         *   - Returns the larger of the two inputs.
         *
         * Math.min(a, b) 
         *   - Returns the smaller of the two inputs.
         *
         * Math.round(a) 
         *   - Rounds the input value to the nearest integer.
         *
         * Math.sqrt(a) 
         *   - Returns the square root of the input.
         *
         * Math.pow(a, b) 
         *   - Returns a raised to the power of b.
         *
         * Math.ceil(a) 
         *   - Rounds up the input value to the nearest integer.
         *
         * Math.floor(a) 
         *   - Rounds down the input value to the nearest integer.
         */

        int a = 9;

        // Calculate and print a raised to the power of 2 (a^2)
        System.out.println("Math.pow(a, 2) = " + Math.pow(a, 2));  // Output: 81.0

        // Calculate and print the square root of a
        System.out.println("Math.sqrt(a) = " + Math.sqrt(a));  // Output: 3.0

        // Additional Examples
        System.out.println("Math.abs(-5) = " + Math.abs(-5));  // Absolute value of -5 => 5
        System.out.println("Math.max(3, 7) = " + Math.max(3, 7));  // Maximum of 3 and 7 => 7
        System.out.println("Math.min(3, 7) = " + Math.min(3, 7));  // Minimum of 3 and 7 => 3
        System.out.println("Math.round(3.6) = " + Math.round(3.6));  // Rounds 3.6 to the nearest integer => 4
        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1));  // Ceil of 3.1 => 4
        System.out.println("Math.floor(3.7) = " + Math.floor(3.7));  // Floor of 3.7 => 3

        // Explanation: You can access a method from the `Math` class either directly (as it's a static class) or by creating an instance (but that's unnecessary since all methods are static).
    }
}
