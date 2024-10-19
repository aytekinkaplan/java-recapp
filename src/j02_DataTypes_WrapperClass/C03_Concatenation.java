package ch02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        /*
            Note on Characters:
            - In Java, characters (`char`) are internally represented by their ASCII values.
            - When performing arithmetic operations with `char` types, Java uses their corresponding ASCII values.
              For example, the ASCII value of 'A' is 65 and for 'C' it is 67.
            - Hence, when we add two `char` variables, Java adds their ASCII values instead of concatenating them as strings.

            Note on "+" in Java:
            - The `+` symbol in Java has two meanings:
              1) Addition: when used with numeric data types (int, double, etc.)
              2) Concatenation: when used with strings (String).
            - When `+` is encountered, Java first tries to perform addition. If it can’t (for example, with strings), it performs concatenation.
        */

        char ch = 'A';
        char ch2 = 'C';

        // ASCII values of 'A' (65) and 'C' (67) are added.
        System.out.println(ch + ch2);  // Output: 132 (65 + 67)

        // Directly adding ASCII values of 'A' and 'C'
        System.out.println('A' + 'C'); // Output: 132

        // Concatenating two strings. Since they are strings, Java concatenates them instead of adding.
        System.out.println("A" + "B"); // Output: AB

        // Using strings and concatenation
        String name = "Zeynep";
        String lastName = "Fitnat";

        int a = 7;
        int b = 11;

        // Since the first operand is a string, all following `+` operations will perform concatenation.
        System.out.println(name + lastName + a + b);  // Output: ZeynepFitnat711 (string concatenation)
        
        // The first operand is an integer, so Java starts by adding `a` and then concatenates the string.
        System.out.println(a + name + lastName + b);  // Output: 7ZeynepFitnat11

        // Here, Java starts with integer addition because the first operands are integers.
        System.out.println(a + b + name + lastName);  // Output: 18ZeynepFitnat

        // Grouping the addition inside parentheses causes `a + b` to be evaluated first.
        System.out.println(name + lastName + (a + b));  // Output: ZeynepFitnat18

        /*
            Important: 
            - When different data types are mixed in an expression with `+`, Java follows the order of operations.
            - If the first operand is a string, it performs concatenation from left to right.
            - If the first operand is a number, it performs addition first, then concatenates.
        */

        // Performing subtraction inside the parentheses before concatenation.
        System.out.println(name + (a - b) + (a - b));  // Output: Zeynep-4-4

        // Evaluating the full expression inside parentheses.
        System.out.println(name + ((a - b) + (a - b))); // Output: Zeynep-8

        /*
            Char in Operations:
            - A char type can participate in arithmetic operations, and its ASCII value is used.
            - '1' has an ASCII value of 49, so when added to integers, its ASCII value is used.
        */
        
        char num = '1';  // ASCII value of '1' is 49
        System.out.println(name + num);  // Output: Zeynep1 (concatenation)
        
        // Here, Java adds `a` (7) and the ASCII value of '1' (49), then concatenates the result with the string.
        System.out.println(a + num + name);  // Output: 56Zeynep (7 + 49 = 56)

        // Adding the ASCII value of '1' (49) and `b` (11), then concatenating with the string.
        System.out.println(name + (num + b));  // Output: Zeynep60 (49 + 11 = 60)

        // First concatenation with `a`, then adding the ASCII value of '1' (49).
        System.out.println(a + name + num);  // Output: 7Zeynep1
    }
}
