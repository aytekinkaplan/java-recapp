package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class CH02_TypeCasting {
    public static void main(String[] args) {

        /*
         Type Casting: Converting one numeric data type to another.
         byte < short < int < long < float < double

         Auto Widening Casting -> Java automatically converts smaller data types to larger data types.

         Explicit Narrowing Casting -> You manually convert larger data types to smaller data types.
         */

        // Example of Auto Widening (small to large data type conversion)
        double d = 17;  // 17 (int) is automatically widened to 17.0 (double)
        System.out.println("d = " + d);  // Output: 17.0

        // Example of integer division
        int num1 = 33;
        int num2 = 4;
        System.out.println("num1 / num2 = " + (num1 / num2));  // Output: 8
        // Even though the result should be 8.25, Java truncates the decimal part because both are integers.

        // Example of storing byte in an int (Auto Widening)
        byte by = 127;
        int largerContainer = by;  // No need for casting, byte is widened to int.
        System.out.println("largerContainer = " + largerContainer);  // Output: 127

        // Example of Explicit Narrowing (large to small data type conversion)
        double db1 = 14.66;
        int i = (int) db1;  // The decimal part is truncated when narrowing from double to int.
        System.out.println("i = " + i);  // Output: 14

        // Example of Narrowing Casting leading to unexpected results
        int num3 = 150;
        byte by1 = (byte) num3;  // The value exceeds byte's limit, causing overflow.
        System.out.println("by1 = " + by1);  // Output: -106
        // Explanation: Byte ranges from -128 to 127. Since 150 is out of range, it wraps around to -106.

        /*
         TASK 1: Convert a character to its ASCII value
         Ask the user for a character and print the ASCII value of that character.
         Example:
         Input: 'a'
         Output: ASCII value of 'a' is 97
         */

        // Step 1: Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Step 2: Ask the user for a character
        System.out.println("Please enter a character:");

        // Step 3: Capture the first character from the user's input
        char ch = input.nextLine().charAt(0);  // Taking the first character

        // Step 4: Print the character and its ASCII value
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + (int) ch);  // Casting char to int to get the ASCII value

        // Extra Example: Using a string to find ASCII value with hashCode()
        String str = "a";
        System.out.println("The ASCII value using hashCode() = " + str.hashCode());  // Output: 97

        /*
         TASK 2: More Type Casting Examples
         */

        // Example 1: Double division
        double d1 = 14;
        int num = 123;
        double result = d1 / num;  // Division results in a double value
        System.out.println("Result of double/int division = " + result);  // Output: 0.11382113821138211

        // Example 2: Type Casting from double to int (Explicit Narrowing)
        double doubleValue = 9.75;
        int intValue = (int) doubleValue;  // Casting double to int (truncates decimal part)
        System.out.println("Double value: " + doubleValue);  // Output: 9.75
        System.out.println("Int value after casting: " + intValue);  // Output: 9

        /*
         TASK 3: Numeric Data Types and their Ranges
         Demonstrate the ranges of various numeric data types by casting between them.
         */

        // Casting between byte and int
        byte smallNumber = 100;
        int largerNumber = smallNumber;  // Auto Widening
        System.out.println("Larger number: " + largerNumber);  // Output: 100

        // Trying to store a large int in a byte (Explicit Narrowing)
        int largeInt = 300;
        byte smallByte = (byte) largeInt;  // Explicit Narrowing causes overflow
        System.out.println("Narrowed byte value: " + smallByte);  // Output: 44 (due to overflow)
        // Explanation: Byte range is -128 to 127. 300 exceeds this range, so it wraps around.

        input.close();  // Closing the scanner
    }
}
