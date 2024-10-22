package j04_JavaOperators.tasks;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /* Task:
           Given two integers (num1, num2),
           Assign the remainder of num1 divided by num2 to the variable 'result' and print the result.
        */

        // Declare and initialize the integers
        int num1 = 10;
        int num2 = 3;

        // Calculate the remainder
        int result = num1 % num2;

        // Print the result with a message
        System.out.println("The remainder when " + num1 + " is divided by " + num2 + " is: " + result);
    }
}
