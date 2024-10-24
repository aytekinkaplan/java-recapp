package j04_JavaOperators.tasks;

public class _15_ComparisonOperators_smaller {

    public static void main(String[] args) {

        /* 
        In this task, we will explore comparison operators in Java.
        Comparison operators are used to compare two values, and they return a boolean result (true or false).
        
        The operators we'll focus on are:
        - <  : less than
        - >  : greater than
        - <= : less than or equal to
        - >= : greater than or equal to
        - == : equal to
        - != : not equal to
        */

        // First example with < and >
        int firstNumber = 17;
        int secondNumber = 20;

        // Checking if firstNumber is less than secondNumber
        System.out.println("Is firstNumber < secondNumber? : " + (firstNumber < secondNumber)); // Expected: true

        // Checking if firstNumber is greater than secondNumber
        System.out.println("Is firstNumber > secondNumber? : " + (firstNumber > secondNumber)); // Expected: false


        // Adding more examples

        // Example with <= (less than or equal to)
        int thirdNumber = 20;
        System.out.println("Is secondNumber <= thirdNumber? : " + (secondNumber <= thirdNumber)); // Expected: true (because 20 is equal to 20)

        // Example with >= (greater than or equal to)
        int fourthNumber = 15;
        System.out.println("Is firstNumber >= fourthNumber? : " + (firstNumber >= fourthNumber)); // Expected: true (because 17 is greater than 15)

        // Example with == (equal to)
        System.out.println("Is secondNumber == thirdNumber? : " + (secondNumber == thirdNumber)); // Expected: true (because 20 equals 20)

        // Example with != (not equal to)
        System.out.println("Is firstNumber != secondNumber? : " + (firstNumber != secondNumber)); // Expected: true (because 17 is not equal to 20)

        /* 
        These comparison operators are crucial when dealing with decision-making statements 
        like `if`, `while`, or `for` loops, where we need to compare values to determine the flow of the program.
        */
    }
}
