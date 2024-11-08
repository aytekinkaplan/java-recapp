package j15_Varargs;

import java.util.Arrays;

public class C01_Varargs {

    public static void main(String[] args) {
        /*
        VARARGS allows handling a variable number of arguments, useful when the argument count is unknown.
        Syntax:
        methodName(parameter1, parameter2, dataType... dataName) {
            // method body
        }

        - When using multiple parameters, `varargs` should be the last.
        - Only one `varargs` parameter is allowed in the parameter list.

        */

        // Task: Create methods to print the sum of two, three, or multiple numbers

        int number1 = 99;
        int number2 = 15;
        int number3 = 55;
        int number4 = 35;

        // Methods for specific number of arguments
        sum(number1, number2);
        sum(number3, number4);
        sum(number3, number4, number1);

        // Using varargs for flexible argument count
        System.out.println(" *** Using varargs ***");
        sumVarargs(number1, number2, number4, 33);
        sumVarargs(number1, number2, number4, 33, 35);
        sumVarargs(number1, number2, number4, 33, number3, number1, 22);

        // Task: Print the string with the maximum length
        String str1 = "java";
        String str2 = "react";
        String str3 = "spring";
        String str4 = "next.js";
        String str5 = "aws";

        longestString(str1, str5);
        longestString(str1, str2, str3);
        longestString(str1, str5, str4, str3, str2);
        longestString(str1, str4, str3, str2);
    }

    // Method to find the string with the most characters
    private static void longestString(String... str) {
        String longest = "";
        for (String s : str) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("Longest string = " + longest);
    }

    // Method using varargs to calculate the sum of multiple integers
    private static void sumVarargs(int... numbers) {
        System.out.println("Numbers: " + Arrays.toString(numbers));

        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Sum of numbers using varargs = " + total);
    }

    // Method to sum exactly three integers
    private static void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers = " + (a + b + c));
    }

    // Method to sum exactly two integers
    private static void sum(int a, int b) {
        System.out.println("Sum of two numbers = " + (a + b));
    }
}
