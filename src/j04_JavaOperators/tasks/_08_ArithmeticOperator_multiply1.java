package j04_JavaOperators.tasks;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Task:
           Given three double values (num1, num2, num3),
           Multiply them together, assign the result to a variable, and print the result.
        */

        // Declare and initialize the doubles
        double num1 = 10.5;
        double num2 = 4.0;
        double num3 = 5.5;

        // Perform multiplication
        double result = num1 * num2 * num3;

        // Print the result with a message
        System.out.println("The result of multiplying " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
    }
}
