package j04_JavaOperators.tasks;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Task:
        Given four integers (num1, num2, num3, num4),
        Subtract the integers in sequence and print the result.
        
        Example:
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Result should be 30.
         */

        // Declare and initialize the integers
        int num1 = 90, num2 = 40, num3 = 10, num4 = 10;

        // Perform subtraction
        int sub = num1 - num2 - num3 - num4;

        // Print the result with a message
        System.out.println("The result of subtracting " + num2 + ", " + num3 + ", and " + num4 + " from " + num1 + " is: " + sub);
    }
}
