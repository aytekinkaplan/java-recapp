package ch02_DataTypes_WrapperClass;

public class CH03_Concatenation {
    public static void main(String[] args) {

        /*
            Key Concept: 
            1. In Java, characters (`char`) have associated **ASCII values**.
               When performing arithmetic operations with `char` variables, Java uses their ASCII values.
               For example, 'A' has an ASCII value of 65 and 'C' has an ASCII value of 67. So, 'A' + 'C' results in 132 (65 + 67).
               
            2. The `+` operator in Java serves two main purposes:
               i) **Addition**: When used with numbers (int, double, etc.).
               ii) **Concatenation**: When used with strings (String).
               If a string is encountered in an expression, Java performs concatenation.
        */

        char ch = 'A';
        char ch2 = 'C';

        // Arithmetic operation with char values; Java adds their ASCII values.
        System.out.println(ch + ch2);  // Output: 132 (65 + 67)

        // Directly adding character literals results in ASCII addition.
        System.out.println('A' + 'C');  // Output: 132

        // Concatenating two string literals
        System.out.println("A" + "B");  // Output: AB

        // Working with strings and integers in concatenation
        String name = "Zeynep";
        String lastName = "Fitnat";

        int a = 7;
        int b = 11;

        // Since the first operand is a string, Java performs concatenation.
        System.out.println(name + lastName + a + b);  // Output: ZeynepFitnat711

        // Starts with an integer, so Java performs addition first, then concatenates the string.
        System.out.println(a + name + lastName + b);  // Output: 7ZeynepFitnat11

        // Java performs addition first because both operands are integers, then concatenates the string.
        System.out.println(a + b + name + lastName);  // Output: 18ZeynepFitnat

        // Parentheses force the addition of `a` and `b` first.
        System.out.println(name + lastName + (a + b));  // Output: ZeynepFitnat18

        /*
            Important:
            - When combining different data types in a single expression using `+`, Java evaluates the expression based on the type of the first operand.
            - If the first operand is a string, Java will treat all subsequent operands as strings and concatenate them.
            - If the first operand is a number, Java will perform arithmetic until it encounters a string, after which it concatenates.
        */

        // Arithmetic operations followed by concatenation with strings
        System.out.println(name + (a - b) + (a - b));  // Output: Zeynep-4-4

        // More complex arithmetic inside parentheses
        System.out.println(name + ((a - b) + (a - b)));  // Output: Zeynep-8

        /*
            Char Arithmetic:
            - Characters can participate in arithmetic operations based on their ASCII values.
            - The ASCII value of '1' is 49, so adding it to an integer results in arithmetic.
        */
        
        char num = '1';  // ASCII value of '1' is 49
        System.out.println(name + num);  // Output: Zeynep1 (Concatenation)

        // Java adds `a` (7) and the ASCII value of '1' (49), resulting in 56, then concatenates the string.
        System.out.println(a + num + name);  // Output: 56Zeynep

        // Adding ASCII value of '1' (49) to `b` (11), then concatenating the result with the string.
        System.out.println(name + (num + b));  // Output: Zeynep60

        // Concatenation follows once a string is encountered.
        System.out.println(a + name + num);  // Output: 7Zeynep1
    }
}
