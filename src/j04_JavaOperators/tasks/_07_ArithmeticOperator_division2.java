package j04_JavaOperators.tasks;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Task 1:
           Given two floating-point numbers (num1, num2),
           Divide the first number by the second and print the result.
        */

        // Declare and initialize floating-point numbers
        double num1_f = 10.5;
        double num2_f = 4.0;

        // Perform division
        double div_f = num1_f / num2_f;

        // Print the result with a message
        System.out.println("The result of dividing " + num1_f + " by " + num2_f + " is: " + div_f);

        /* Task 2:
           Given two integers (num1, num2),
           Check if num2 is not zero, then divide num1 by num2 and print the result.
        */

        // Declare and initialize the integers
        int num1_i = 20;
        int num2_i = 0;  // Change this to a non-zero value to perform division

        // Check if the denominator is zero
        if (num2_i != 0) {
            // Perform division
            int div_i = num1_i / num2_i;
            System.out.println("The result of dividing " + num1_i + " by " + num2_i + " is: " + div_i);
        } else {
            // Print error message
            System.out.println("Error: Cannot divide by zero!");
        }

        /* Task 3:
           Given two integers (num1, num2),
           Print the result of dividing num1 by num2 and also the remainder.
        */

        // Declare and initialize the integers
        int num1_r = 22;
        int num2_r = 7;

        // Perform division and find a remainder
        int div_r = num1_r / num2_r;
        int remainder_r = num1_r % num2_r;

        // Print the result and the remainder
        System.out.println("The result of dividing " + num1_r + " by " + num2_r + " is: " + div_r);
        System.out.println("The remainder of " + num1_r + " divided by " + num2_r + " is: " + remainder_r);

        /* Task 4:
           Given two floating-point numbers (num1, num2),
           Perform division and print the result with two decimal places.
        */

        // Declare and initialize floating-point numbers
        double num1_fp = 15.75;
        double num2_fp = 4.25;

        // Perform division
        double div_fp = num1_fp / num2_fp;

        // Print the result formatted to two decimal places
        System.out.printf("The result of dividing %.2f by %.2f is: %.2f%n", num1_fp, num2_fp, div_fp);
    }
}
