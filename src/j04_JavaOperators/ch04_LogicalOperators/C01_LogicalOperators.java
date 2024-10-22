package j04_JavaOperators.ch04_LogicalOperators;

public class C01_LogicalOperators {
    public static void main(String[] args) {
        /*
         Logical operators explained with examples:
         && (AND), || (OR), and ! (NOT) operators with short-circuiting behavior.
        */

        // Declare boolean values
        boolean b1 = true;
        boolean b2 = false;

        // Declare integer values
        int a = 3;
        int b = 5;

        // AND operator (& and &&)
        System.out.println("b1 & (a < b) = " +  (b1 & (a < b)));  // true & true = true
        // Explanation: The single '&' checks both sides. Since both 'b1' is true and 'a < b' (3 < 5) is true, the result is true.

        System.out.println("b2 && (a < b) = " + (b2 && (a < b)));  // false && true = false
        // Explanation: The '&&' operator uses short-circuiting. Since 'b2' is false, Java doesn't evaluate the second condition ('a < b'),
        // because the overall expression will be false regardless of the second condition.

        // OR operator (| and ||)
        System.out.println("b1 || (a < b) = " + (b1 || (a < b)));  // true || true = true
        // Explanation: The '||' operator uses short-circuiting. Since 'b1' is true, Java doesn't evaluate the second condition ('a < b'),
        // because the overall expression is true as soon as one condition is true.

        System.out.println("b2 || (a < b) = " + (b2 || (a < b)));  // false || true = true
        // Explanation: Since 'b2' is false, Java evaluates the second condition ('a < b'), which is true. So the result is true.

        // NOT operator (!)
        System.out.println("!b1 || (a > b) = " + !(b1 || (a > b)));  // !(true || false) = false
        // Explanation: Inside the parentheses, the condition 'b1 || (a > b)' evaluates to true (since b1 is true).
        // The NOT operator (!) inverts this result to false.

        // Additional examples with NOT
        System.out.println("b1 = " + b1);  // true
        System.out.println("!b1 = " + !b1);  // !true = false
        // Explanation: The NOT operator simply inverts the value of b1. Since b1 is true, '!b1' is false.

        // Comparing `a` and `b` with inequality
        System.out.println("a != b = " + (a != b));  // true
        // Explanation: 'a' (3) is not equal to 'b' (5), so this condition is true.

        // Declaring new values for a and b, and additional boolean variables
        a = 10;  // Reassign 'a' to 10
        b = 20;  // Reassign 'b' to 20
        boolean x = true;
        boolean y = false;

        // Complex condition using AND, OR, and NOT
        boolean result = (x || y) && !(a > b) && (a != b);

        // Step by step evaluation:
        // (x || y) --> true (because x is true)
        // !(a > b) --> true (because a (10) is not greater than b (20))
        // (a != b) --> true (because a (10) is not equal to b (20))
        // Final result: true && true && true --> true

        System.out.println("Complex condition result: " + result);  // Output: true
    }
}
