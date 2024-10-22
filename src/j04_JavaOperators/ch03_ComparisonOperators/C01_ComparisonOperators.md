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
