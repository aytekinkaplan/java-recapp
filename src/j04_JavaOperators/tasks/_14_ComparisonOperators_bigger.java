package j04_JavaOperators.tasks;

public class _14_ComparisonOperators_bigger {

    public static void main(String[] args) {

        /* Task:
           Create two integers, one with the value 13 and another with the value 10.
           Print whether the first integer is greater than the second.
           You should see 'true' in the console.
        */

        // Declare and initialize integers
        int a = 13;
        int b = 10;

        // Perform comparisons
        boolean isAGreater = a > b;
        boolean isALess = a < b;

        // Print the results with descriptive messages
        System.out.println("Is " + a + " greater than " + b + "? " + isAGreater); // true
        System.out.println("Is " + a + " less than " + b + "? " + isALess); // false
    }
}
