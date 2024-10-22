package j04_JavaOperators.ch03_ComparisonOperators;

public class C01_ComparisonOperators {
    public static void main(String[] args) {

        /*
        Comparator: Comparison operations.
        In Java, when the values of two variables are compared, Java returns a boolean result (true or false).

        ==      Equal               x == y
        != Not equal x != y
        > Greater than x > y
        < Less than x < y
        >= Greater than or equal to x >= y
        <= Less than or equal to x <= y

        The exclamation mark (!) is used to denote negation (not).
        */

        // Declare and initialize yas1 to 34 and yas2 to 55
        int yas1 = 34;
        int yas2 = 55;

        // Task: Check if yas1 and yas2 are equal
        System.out.println("yas1 == yas2 = " + (yas1 == yas2));  // Output: false
        // Explanation: This checks if the value of yas1 is equal to yas2.
        // Since yas1 (34) is not equal to yas2 (55), the result will be false.

        // Check if yas1 is not equal to yas2
        System.out.println("yas1 != yas2 = " + (yas1 != yas2));  // Output: true
        // Explanation: This checks if the value of yas1 is not equal to yas2.
        // Since 34 is indeed not equal to 55, this will return true.

        // Check if yas1 is greater than yas2
        System.out.println("yas1 > yas2 = " + (yas1 > yas2));  // Output: false
        // Explanation: Checks if yas1 (34) is greater than yas2 (55).
        // Since it's not, the result is false.

        // Check if yas1 is less than yas2
        System.out.println("yas1 < yas2 = " + (yas1 < yas2));  // Output: true
        // Explanation: This checks if yas1 is less than yas2.
        // Since 34 is indeed less than 55, this will return true.

        // Check if yas1 is greater than or equal to yas2
        System.out.println("yas1 >= yas2 = " + (yas1 >= yas2));  // Output: false
        // Explanation: Checks if yas1 is greater than or equal to yas2.
        // Since 34 is not greater than or equal to 55, this will return false.

        // Check if yas1 is less than or equal to yas2
        System.out.println("yas1 <= yas2 = " + (yas1 <= yas2));  // Output: true
        // Explanation: This checks if yas1 is less than or equal to yas2.
        // Since 34 is less than 55, this will return true.

        // Declare and initialize new values for yas1, yas2, and yas3
        yas1 = 25;
        yas2 = 30;
        int yas3 = 25;

        // Task: Compare multiple values
        System.out.println("yas1 == yas3 = " + (yas1 == yas3));  // Output: true
        // Explanation: Checks if yas1 is equal to yas3.
        // Since both are 25, this will return true.

        System.out.println("yas2 != yas3 = " + (yas2 != yas3));  // Output: true
        // Explanation: Checks if yas2 is not equal to yas3.
        // Since yas2 (30) is not equal to yas3 (25), the result will be true.

        System.out.println("yas2 > yas1 = " + (yas2 > yas1));    // Output: true
        // Explanation: Checks if yas2 is greater than yas1.
        // Since yas2 (30) is greater than yas1 (25), this will return true.

        System.out.println("yas3 <= yas1 = " + (yas3 <= yas1));  // Output: true
        // Explanation: Checks if yas3 is less than or equal to yas1.
        // Since both yas3 and yas1 are 25, this will return true.
    }
}
